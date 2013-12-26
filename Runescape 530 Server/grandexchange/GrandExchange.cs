using System;
using System.Runtime.Serialization;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RunescapeServer.events;
using RunescapeServer.model;
using RunescapeServer.player;
using RunescapeServer.npc;
using System.Threading;
using System.Xml.Serialization;
using System.IO;
using RunescapeServer.util;
using Community.CsharpSqlite;
using System.Data;
using System.Collections.Specialized;
using System.Collections;


namespace RunescapeServer.grandexchange
{
    class GrandExchange
    {
        /*
          1109: item id
          1110: amount
          1111: price per item
          1112: id of the buy/sell screen  (-1 is main screen)
          1113: main screen -1 / buy 0 / sell 1
          1114: min price
          1115: normal price
          1116: max price
  
          progress
          0 = nothing (dosent show the item..used when removing it)
          1 - "submitting..."
          2 - orange bar (% bought)?
          3 - orange bar (% bought)?
          4 - orange bar (% bought)?
          5 - aborted buy item
          6 - orange bar (% bought)?
          7 - orange bar (% bought)?
          -3 is orange bar sell item
          -1 = sell progress?
         */

        static readonly object removeOffersLocker = new object();
        static readonly object addOffersLocker = new object();
        static readonly object abortOffersLocker = new object();

        private List<GEItem> offersToRemove; //add items pending to be removed from SQLite database.
        private List<GEItem> removingOffers; //holds the offers that will be removed from removingOffers
        private List<GEItem> offersToAdd; //add items pending to be added to SQLite database.
        private List<GEItem> addingOffers; //holds the offers that will be added from addingOffers
        private List<GEItem> offersToAbort; //add items pending to be aborted from SQLite database.
        private List<GEItem> abortingOffers; //holds the offers that will be aborted from abortingOffers

        public GrandExchange()
        {
            offersToRemove = new List<GEItem>();
            removingOffers = new List<GEItem>();
            offersToAdd = new List<GEItem>();
            addingOffers = new List<GEItem>();
            offersToAbort = new List<GEItem>();
            abortingOffers = new List<GEItem>();
            /* Load grand exchange items */
            Console.WriteLine("Checking SQLite Database Grand Exchange Items Counts");
            try
            {
                string buyerCount = "0";
                string sellerCount = "0";
                string abortedBuyerCount = "0";
                string abortedSellerCount = "0";

                SQLiteDatabase db = new SQLiteDatabase(Constants.databaseName);
                DataTable dt = db.ExecuteQuery("SELECT Count(*) FROM grandExchangeBuying");
                if (dt.Rows.Count == 0)
                    buyerCount = "0";
                else
                    buyerCount = dt.Rows[0].ItemArray[0].ToString();

                dt = db.ExecuteQuery("SELECT Count(*) FROM grandExchangeSelling");
                if (dt.Rows.Count == 0)
                    sellerCount = "0";
                else
                    sellerCount = dt.Rows[0].ItemArray[0].ToString();

                dt = db.ExecuteQuery("SELECT Count(*) FROM grandExchangeBuying WHERE aborted=1");
                if (dt.Rows.Count == 0)
                    abortedBuyerCount = "0";
                else
                    abortedBuyerCount = dt.Rows[0].ItemArray[0].ToString();

                dt = db.ExecuteQuery("SELECT Count(*) FROM grandExchangeSelling WHERE aborted=1");
                if (dt.Rows.Count == 0)
                    abortedSellerCount = "0";
                else
                    abortedSellerCount = dt.Rows[0].ItemArray[0].ToString();

                db.CloseDatabase();

                Console.WriteLine("Total GrandExchange Buyers Count: " + buyerCount);
                Console.WriteLine("Total GrandExchange Sellers Count: " + sellerCount);
                Console.WriteLine("Total GrandExchange Aborted Buyers Count: " + abortedBuyerCount);
                Console.WriteLine("Total GrandExchange Aborted Sellers Count: " + abortedSellerCount);
            }
            catch (Exception e)
            {
                misc.WriteError(e.Message);
            }

            Event startGEEvent = new Event(5000);
            startGEEvent.setAction(() =>
            {
                processSales();
            });
            Server.registerEvent(startGEEvent);

            /*
             * Processes all the removing offers to SQL database on a new thread.
             * This will improve the proformance of the server
             */
            new Thread(removeAddUpdateOffersToGrandExchangeDatabase).Start(); 
        }


        protected void removeAddUpdateOffersToGrandExchangeDatabase()
        {
            while (true)
            {
                try
                {
                    Thread.Sleep(100); //100 milliseconds.
                }
                catch (ThreadInterruptedException) { }

                lock (removeOffersLocker)
                {
                    foreach (GEItem geItem in offersToRemove)
                        removingOffers.Add(geItem);
                    offersToRemove.Clear();
                }

                lock (addOffersLocker)
                {
                    foreach (GEItem geItem in offersToAdd)
                        addingOffers.Add(geItem);
                    offersToAdd.Clear();
                }

                lock (abortOffersLocker)
                {
                    foreach (GEItem geItem in offersToAbort)
                        abortingOffers.Add(geItem);
                    offersToAbort.Clear();
                }

                try
                {
                    //this check should go straight to Thread.Sleep.
                    if (removingOffers.Count == 0 && addingOffers.Count == 0 && abortingOffers.Count == 0) continue;

                    //Run this on seperate thread so it won't slow down the process.
                    SQLiteDatabase db = new SQLiteDatabase(Constants.databaseName); //opens new database connection.
                    
                    //Removes all the removingOffers from grandExchangeSelling table
                    //This delayed offer deleter should always be ran before inserter (below) or else it's possible bug may occur.
                    foreach (GEItem geItem in removingOffers)
                    {
                        if (geItem is BuyOffer)
                            db.ExecuteNonQuery("DELETE FROM grandExchangeBuying WHERE `playerHash` = " + geItem.getPlayerHash() + " AND `itemId` = " + geItem.getItem() + " AND `amount` = " + geItem.getTotalAmount() + " AND `price` = " + geItem.getPriceEach() + " AND `slot` = " + geItem.getSlot());
                        else if (geItem is SellOffer)
                            db.ExecuteNonQuery("DELETE FROM grandExchangeSelling WHERE `playerHash` = " + geItem.getPlayerHash() + " AND `itemId` = " + geItem.getItem() + " AND `amount` = " + geItem.getTotalAmount() + " AND `price` = " + geItem.getPriceEach() + " AND `slot` = " + geItem.getSlot());
                    }
                    //Add all new addingOffers to grandExchangeBuying or grandExchangeSelling table.
                    //This delayed offer inserter would cause a possible dupe, if both tables didn't have UNIQUE( slot, playerHash ), fixed now.
                    foreach (GEItem geItem in addingOffers)
                    {
                        if (geItem is BuyOffer)
                            db.ExecuteNonQuery("INSERT INTO grandExchangeBuying(itemId, amount, price, bought, slot, playerHash) VALUES (" + geItem.getItem() + ", " + geItem.getTotalAmount() + ", " + geItem.getPriceEach() + ", " + geItem.getAmountTraded() + ", " + geItem.getSlot() + ", " + geItem.getPlayerHash() + ")");
                        else if(geItem is SellOffer)
                            db.ExecuteNonQuery("INSERT INTO grandExchangeSelling(itemId, amount, price, sold, slot, playerHash) VALUES (" + geItem.getItem() + ", " + geItem.getTotalAmount() + ", " + geItem.getPriceEach() + ", " + geItem.getAmountTraded() + ", " + geItem.getSlot() + ", " + geItem.getPlayerHash() + ")");
                    }

                    //Aborts any Buying Offer or Selling Offer from grandExchangeBuying or grandExchangeSelling table.
                    foreach (GEItem geItem in abortingOffers)
                    {
                        if (geItem is BuyOffer)
                            db.ExecuteNonQuery("UPDATE grandExchangeBuying SET aborted = 1 WHERE slot = " + geItem.getSlot() + " AND playerHash = " + geItem.getPlayerHash());
                        else if (geItem is SellOffer)
                            db.ExecuteNonQuery("UPDATE grandExchangeSelling SET aborted = 1 WHERE slot = " + geItem.getSlot() + " AND playerHash = " + geItem.getPlayerHash());
                    }

                    db.CloseDatabase(); //closes the connection.
                    
                    removingOffers.Clear();
                    addingOffers.Clear();
                    abortingOffers.Clear();

                } catch (Exception e) {
                    misc.WriteError(e.Message);
                }
            }
        }

        protected void processSales()
        {
            OrderedDictionary soldBoughtItems = new OrderedDictionary();

            /*
             * First of all the old system was not possible to do with SQL
             * Would of required to do a SQL Query for each itemId sold and bought by all players
             * That would of ment over 10,000 items x 2 (buyers+sellers) so 20,000 queries to process.
             * 
             * The new system I created to fix this.
             * Works like this it everytime this runs matches up 1 GE Buying/Selling auction.
             * Then loops it 100 times or until no more matches are possible.
             * 
             * TODO: Match Buyer's of larger item quantity with Sellers with larger quanity instead of Sellers with
             * any item quantity. (this requires editing the query below to a better suited query).
             */

            BuyOffer buyer = null;
            SellOffer seller = null;
            int itemId;
            int itemAmount;
            int price;
            int sold;
            int bought;
            int collectedItem;
            int collectedGold;
            int overpaid;
            byte slot;
            long playerHash;

            SQLiteDatabase db = new SQLiteDatabase(Constants.databaseName);
            for (int processNumSales = 0; processNumSales < 100; processNumSales++)
            {
                soldBoughtItems.Clear();

                //Can't do more then 1 sale at a time, LIMIT 100 wont work since it will pick duplicate sellers.
                DataTable dt = db.ExecuteQuery("SELECT S.itemId AS sell_itemId, S.amount AS sell_amount, S.price AS sell_price, S.sold AS sell_sold, S.collectedItem AS sell_collectedItem, S.collectedGold AS sell_collectedGold, S.overpaid AS sell_overpaid, S.slot AS sell_slot, S.playerHash AS sell_playerHash, B.itemId AS buy_itemId, B.amount AS buy_amount, B.price AS buy_price, B.bought AS buy_bought, B.collectedItem AS buy_collectedItem, B.collectedGold AS buy_collectedGold, B.overpaid AS buy_overpaid, B.slot AS buy_slot, B.playerHash AS buy_playerHash FROM grandExchangeBuying AS B, grandExchangeSelling AS S ON B.itemId = S.itemId AND B.aborted = 0 AND S.aborted = 0 AND B.price >= S.price AND S.sold < S.amount AND B.bought < B.amount ORDER BY B.price DESC LIMIT 1");

                if (dt.Rows.Count == 0)
                {
                    db.CloseDatabase();
                    return;
                }
                else
                {
                    itemId = Convert.ToInt32(dt.Rows[0]["sell_itemId"]);
                    itemAmount = Convert.ToInt32(dt.Rows[0]["sell_amount"]);
                    price = Convert.ToInt32(dt.Rows[0]["sell_price"]);
                    sold = Convert.ToInt32(dt.Rows[0]["sell_sold"]);
                    collectedItem = Convert.ToInt32(dt.Rows[0]["sell_collectedItem"]);
                    collectedGold = Convert.ToInt32(dt.Rows[0]["sell_collectedGold"]);
                    overpaid = Convert.ToInt32(dt.Rows[0]["sell_overpaid"]);
                    slot = Convert.ToByte(dt.Rows[0]["sell_slot"]);
                    playerHash = (long)dt.Rows[0]["sell_playerHash"];

                    seller = new SellOffer(itemId, itemAmount, price, sold, collectedItem, collectedGold, overpaid, slot, playerHash);

                    itemId = Convert.ToInt32(dt.Rows[0]["buy_itemId"]);
                    itemAmount = Convert.ToInt32(dt.Rows[0]["buy_amount"]);
                    price = Convert.ToInt32(dt.Rows[0]["buy_price"]);
                    bought = Convert.ToInt32(dt.Rows[0]["buy_bought"]);
                    collectedItem = Convert.ToInt32(dt.Rows[0]["buy_collectedItem"]);
                    collectedGold = Convert.ToInt32(dt.Rows[0]["buy_collectedGold"]);
                    overpaid = Convert.ToInt32(dt.Rows[0]["buy_overpaid"]);
                    slot = Convert.ToByte(dt.Rows[0]["buy_slot"]);
                    playerHash = (long)dt.Rows[0]["buy_playerHash"];

                    buyer = new BuyOffer(itemId, itemAmount, price, bought, collectedItem, collectedGold, overpaid, slot, playerHash);
                }

                if (seller == null || buyer == null) continue;

                int amountToBuy = buyer.getTotalAmount() - buyer.getAmountTraded();
                int amountToSell = seller.getTotalAmount() - seller.getAmountTraded();

                // This check will never happen. SQL Query will not allow it.. Just old code I left in.
                if (amountToBuy <= 0 || amountToSell <= 0)
                    continue;

                int amount = (amountToBuy > amountToSell) ? amountToSell : amountToBuy;
                // Buys from Seller a random amount of a item.
                amount = misc.random(1, amount);

                // Buyer will pay minimum what the seller wants.
                int amountBuyerOverpaid = (buyer.getPriceEach() - seller.getPriceEach()) * amount; // buyer is paying more than the seller wants, therefore MAY recieve this amount as a refund.
                bool buyerKeepsRefund = misc.random(1) == 0; // if 0, the buyer gets a refund, if its 1...the seller gets more.
                buyer.setAmountTraded(buyer.getAmountTraded() + amount);
                seller.setAmountTraded(seller.getAmountTraded() + amount);

                /**
                    * How much refunded gold Buyer gets in addition to his previous refunded gold.
                    * or
                    * How much of the Buyer's overpaid gold that they couldn't keep goes as extra profit to the Seller.
                    */
                if (buyerKeepsRefund && amountBuyerOverpaid > 0)
                    buyer.setAmountOverpaid(buyer.getAmountOverpaid() + amountBuyerOverpaid);
                else if (!buyerKeepsRefund && amountBuyerOverpaid > 0)
                    seller.setAmountOverpaid(seller.getAmountOverpaid() + amountBuyerOverpaid);

                // Shows amount of Item Buyer bought in Slot 1 minus how much he already took out.
                if (buyer.getAmountItemsLeftToCollect() > 0)
                    buyer.setSlot1(new Item(buyer.getItem(), buyer.getAmountItemsLeftToCollect()));

                //Shows amount of Gold Buyer has in Slot 2 from previous refunded money plus how much he maybe will be refunded this sale.
                if ((buyer.getAmountCollectedGold() < buyer.getAmountOverpaid()) && (buyer.getAmountOverpaid() - buyer.getAmountCollectedGold()) > 0)
                    buyer.setSlot2(new Item(995, (buyer.getAmountOverpaid() - buyer.getAmountCollectedGold())));

                //Shows amount of Gold Seller in Slot 2 has minus how much he already took out.
                if (seller.getAmountGoldLeftToCollect() > 0)
                    seller.setSlot2(new Item(995, seller.getAmountGoldLeftToCollect()));

                Player buyerP = Server.getPlayerForName(buyer.getPlayerName());
                Player sellerP = Server.getPlayerForName(seller.getPlayerName());

                //Update both Buyer and Seller's Slots in the database 
                try
                {
                    db.ExecuteNonQuery("UPDATE grandExchangeBuying SET bought = " + buyer.getAmountTraded() + ", overpaid = " + buyer.getAmountOverpaid() + " WHERE slot = " + buyer.getSlot() + " AND playerHash = " + buyer.getPlayerHash());
                    db.ExecuteNonQuery("UPDATE grandExchangeSelling SET sold = " + seller.getAmountTraded() + ", overpaid = " + seller.getAmountOverpaid() + " WHERE slot = " + seller.getSlot() + " AND playerHash = " + seller.getPlayerHash());
                }
                catch (Exception e)
                {
                    //Instantly skip this sale if any database errors occurred.
                    //If one of those queries works and other fails then you will have a dupe -_-.
                    //TODO: A fix would be to keep retrying both queries until both successful.
                    misc.WriteError("[GrandExchange SQL Error]: " + e.Message);
                    continue;
                }

                /*
                    * TODO: Fix When player is offline and logs in after item is bought. He won't see messages below..
                    * Add something to Packets.cs (sendLogin() method) to process this.
                    * Maybe a (boolean in playerSaves for GE update?)
                    */
                if (buyerP != null)
                {
                    buyerP.getPackets().sendMessage("One or more of your Grand Exchange offers has been updated.");
                    buyerP.getPackets().updateGEProgress(buyer);
                    if (buyerP.getGESession() != null)
                    {
                        Item[] items = { buyer.getSlot1(), buyer.getSlot2() };
                        buyerP.getPackets().sendItems(-1, -1757, 523 + buyer.getSlot(), items);
                    }
                }

                /*
                    * TODO: Fix When player is offline and logs in after item is bought. He won't see messages below..
                    * Add something to Packets.cs (sendLogin() method) to process this.
                    * Maybe a (boolean in playerSaves for GE update?)
                    */
                if (sellerP != null)
                {
                    sellerP.getPackets().sendMessage("One or more of your Grand Exchange offers has been updated.");
                    sellerP.getPackets().updateGEProgress(seller);
                    if (sellerP.getGESession() != null)
                    {
                        Item[] items = { seller.getSlot1(), seller.getSlot2() };
                        sellerP.getPackets().sendItems(-1, -1757, 523 + seller.getSlot(), items);
                    }
                }
            }
        }

        /**
         * Add a GEItem to be added to database.
         * @param GEItem
         */
        public void addOffer(GEItem offer)
        {
            lock (addOffersLocker)
            {
                offersToAdd.Add(offer);
            }
        }

        /**
         * Add a GEItem to be update in database.
         * @param GEItem
         */
        public void abortOffer(GEItem geItem)
        {
            lock (abortOffersLocker)
            {
                offersToAbort.Add(geItem);
            }
        }

        /**
         * Add a GEItem to be removed from database.
         * @param GEItem
         */
        public void removeOffer(GEItem geItem)
        {
            lock (removeOffersLocker)
            {
                offersToRemove.Add(geItem);
            }
        }

        /**
         * Updates a Slot1 and Slot2 of any GEItem in the database instantly.
         * @param GEItem
         */
        public void updateGEItemSlotsDatabase(GEItem geItem)
        {
            try
            {
                SQLiteDatabase db = new SQLiteDatabase(Constants.databaseName);

                /**
                 * Each time you do in GESession.cs [checkOffer or abortOffer]
                 * A Slot1 and Slot2 is generated but those Slot's themselves are never saved, less data like this.
                 * Only thing thats saved is how much to generate of those Slots next time you call [checkOffer].
                 * Even generated Slots check against how much they can truly take out.
                 */
                if(geItem is BuyOffer)
                    db.ExecuteNonQuery("UPDATE grandExchangeBuying SET collectedItem = " + geItem.getAmountCollectedItem() + ", collectedGold = " + geItem.getAmountCollectedGold() + " WHERE slot = " + geItem.getSlot() + " AND playerHash = " + geItem.getPlayerHash());
                else if(geItem is SellOffer)
                    db.ExecuteNonQuery("UPDATE grandExchangeSelling SET collectedItem = " + geItem.getAmountCollectedItem() + ", collectedGold = " + geItem.getAmountCollectedGold() + " WHERE slot = " + geItem.getSlot() + " AND playerHash = " + geItem.getPlayerHash());

                db.CloseDatabase();
            }
            catch (Exception e)
            {
                misc.WriteError("GrandExchange Error]: " + e.Message);
            }
        }

        public void interactWithClerk(Player p, Npc clerk)
        {

        }

        public GEItem[] getOffersByPlayer(Player p)
        {
            /*
             * Gives the player their GrandExchange Items both Buying and Selling are here.
             * Returns a GEItem[] of all Item's array based on slot id, null array index = space
             */

            long playerHash = p.getLoginDetails().getLongName();

            try
            {
                int itemId;
                int amount;
                int price;
                bool isSoldNull;
                bool isBoughtNull;
                int sold;
                int bought;
                int collectedItem;
                int collectedGold;
                int overpaid;
                byte slot; //0-5
                bool aborted;
                GEItem[] myGEItems = new GEItem[6];

                SQLiteDatabase db = new SQLiteDatabase(Constants.databaseName);
                SQLiteVdbe preparedStatement = new SQLiteVdbe(db, "SELECT itemId, amount, price, bought, NULL sold, collectedItem, collectedGold, overpaid, slot, aborted FROM grandExchangeBuying WHERE playerHash = ? UNION SELECT itemId, amount, price, NULL bought, sold, collectedItem, collectedGold, overpaid, slot, aborted FROM grandExchangeSelling WHERE playerHash = ?");
                preparedStatement.Reset();
                preparedStatement.BindLong(1, playerHash);
                preparedStatement.BindLong(2, playerHash);

                while (preparedStatement.ExecuteStep() != Sqlite3.SQLITE_DONE) 
                {
                    if (preparedStatement.GetLastError() != "")
                    {
                        misc.WriteError("[GrandExchange SQL Error]: " + preparedStatement.GetLastError());
                        return null;
                    }

                    itemId = preparedStatement.Result_Int(0);
                    amount = preparedStatement.Result_Int(1);
                    price = preparedStatement.Result_Int(2);
                    isBoughtNull = string.IsNullOrEmpty(preparedStatement.Result_Text(3));
                    isSoldNull = string.IsNullOrEmpty(preparedStatement.Result_Text(4));
                    collectedItem = preparedStatement.Result_Int(5);
                    collectedGold = preparedStatement.Result_Int(6);
                    overpaid = preparedStatement.Result_Int(7);
                    slot = Convert.ToByte(preparedStatement.Result_Int(8));
                    aborted = Convert.ToBoolean(preparedStatement.Result_Int(9));

                    if (isSoldNull && !isBoughtNull)
                    {
                        bought = Convert.ToInt32(preparedStatement.Result_Text(3));
                        myGEItems[slot] = new BuyOffer(itemId, amount, price, bought, collectedItem, collectedGold, overpaid, slot, aborted, playerHash);

                    }
                    else if (isBoughtNull && !isSoldNull)
                    {
                        sold = Convert.ToInt32(preparedStatement.Result_Text(4));
                        myGEItems[slot] =  new SellOffer(itemId, amount, price, sold, collectedItem, collectedGold, overpaid, slot, aborted, playerHash);
                    }
                    else
                    {
                        misc.WriteError("[GrandExchange Error]: sold or bought both are NULL? how this happen?");
                    }
                }

                db.CloseDatabase();
                return myGEItems;
            }
            catch (Exception e)
            {
                misc.WriteError("GrandExchange Error]: " + e.Message);
            }

            return null;
        }

        public GEItem getOfferByPlayerSlot(Player p, byte slot)
        {
            /*
             * Gives the player their GrandExchange Items both Buying and Selling are here.
             * Returns a GEItem[] of all Item's array based on slot id, null array index = space
             */
            long playerHash = p.getLoginDetails().getLongName();

            try
            {
                int itemId;
                int amount;
                int price;
                bool isSoldNull;
                bool isBoughtNull;
                int sold;
                int bought;
                int collectedItem;
                int collectedGold;
                int overpaid;
                bool aborted;
                GEItem geItem = null;

                SQLiteDatabase db = new SQLiteDatabase(Constants.databaseName);
                SQLiteVdbe preparedStatement = new SQLiteVdbe(db, "SELECT itemId, amount, price, bought, NULL sold, collectedItem, collectedGold, overpaid, aborted FROM grandExchangeBuying WHERE playerHash = ? AND slot = ? UNION SELECT itemId, amount, price, NULL bought, sold, collectedItem, collectedGold, overpaid, aborted FROM grandExchangeSelling WHERE playerHash = ? AND slot = ?");
                preparedStatement.Reset();
                preparedStatement.BindLong(1, playerHash);
                preparedStatement.BindInteger(2, slot);
                preparedStatement.BindLong(3, playerHash);
                preparedStatement.BindInteger(4, slot);

                while (preparedStatement.ExecuteStep() != Sqlite3.SQLITE_DONE) 
                {
                    if(preparedStatement.GetLastError() != "") 
                    {
                         misc.WriteError("[GrandExchange SQL Error]: " + preparedStatement.GetLastError());
                        return null;
                    }

                    itemId = preparedStatement.Result_Int(0);
                    amount = preparedStatement.Result_Int(1);
                    price = preparedStatement.Result_Int(2);
                    isBoughtNull = string.IsNullOrEmpty(preparedStatement.Result_Text(3));
                    isSoldNull = string.IsNullOrEmpty(preparedStatement.Result_Text(4));
                    collectedItem =  preparedStatement.Result_Int(5);
                    collectedGold = preparedStatement.Result_Int(6);
                    overpaid = preparedStatement.Result_Int(7);
                    aborted = Convert.ToBoolean(preparedStatement.Result_Int(8));

                    if (isSoldNull && !isBoughtNull)
                    {
                        bought = Convert.ToInt32(preparedStatement.Result_Text(3));
                        geItem = new BuyOffer(itemId, amount, price, bought, collectedItem, collectedGold, overpaid, slot, aborted, playerHash);
                    }
                    else if (isBoughtNull && !isSoldNull)
                    {
                        sold = Convert.ToInt32(preparedStatement.Result_Text(4));
                        geItem = new SellOffer(itemId, amount, price, sold, collectedItem, collectedGold, overpaid, slot, aborted, playerHash);
                    }
                    else
                    {
                        misc.WriteError("[GrandExchange Error]: sold or bought both are NULL? how this happen?");
                    }
                }

                db.CloseDatabase();
                return geItem;
            }
            catch (Exception e)
            {
                misc.WriteError("[GrandExchange Error]: " + e.Message);
            }

            return null;
        }


        public void clickDesk(Player p, int x, int y, int option)
        {
            AreaEvent clickDeskAreaEvent = new AreaEvent(p, x - 1, y - 1, x + 1, y + 1);
            clickDeskAreaEvent.setAction(() =>
            {
                p.setFaceLocation(new Location(x, y, 0));
                switch (option)
                {
                    case 1: //1st click on desk [Use]
                        break;
                    case 2: //2nd click on desk [Exchange]
                        p.getPackets().closeInterfaces();
                        p.setGESession(new GESession(p, true));
                        break;
                    case 3: //3rd click on desk [Collect]
                        p.getPackets().closeInterfaces();
                        p.setGESession(new GESession(p, false));
                        break;
                    case 4: //4th click on desk [History]
                        //TODO: combine this with GESession, this is just interface test.
                        p.getPackets().displayInterface(643); //opens Grand Exchange History Box.
                        break;
                    case 5: //5th click on desk [Sets]
                        //TODO: combine this with GESession, this is just interface test.
                        p.getPackets().displayInterface(645); //opens Grand Exchange Sets Box.
                        break;
                }
            });
            Server.registerCoordinateEvent(clickDeskAreaEvent);
        }

        public void showCollection(Player p)
        {

        }
    }
}
