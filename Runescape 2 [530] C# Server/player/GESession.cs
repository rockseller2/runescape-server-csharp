using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RunescapeServer.grandexchange;
using RunescapeServer.definitions;
using RunescapeServer.model;
using RunescapeServer.events;
using RunescapeServer.util;

namespace RunescapeServer.player
{
    class GESession
    {
        private Player p;
        private GEItem[] myGEItems;
	    private GEItem currentOffer;
	
	    public GESession(Player p, bool isGrandExchangeOrCollectBox)
        {
		    this.p = p;
            //Load offers.
            myGEItems = Server.getGrandExchange().getOffersByPlayer(p);

            foreach (GEItem geItem in myGEItems)
            {
                if (geItem != null)
                    p.getPackets().updateGEProgress(geItem);
            }
            if(isGrandExchangeOrCollectBox)
		        openExchange();
            else
                openCollectBox();
	    }
	
	    public void openExchange() 
        {
		    p.getPackets().sendConfig(1109, -1);
		    p.getPackets().sendConfig(1110, 0);
		    p.getPackets().sendConfig(1111, 0);
		    p.getPackets().sendConfig(1112, -1);
		    p.getPackets().sendConfig(1113, -1);
		    p.getPackets().sendConfig(1114, 0);
		    p.getPackets().sendConfig(1115, 0);
		    p.getPackets().sendConfig(1116, 0);
		    p.getPackets().displayInterface(105); //opens Grand Exchange.
		    p.getPackets().setRightClickOptions(6, 6881491, 65535, 65535);
		    p.getPackets().setRightClickOptions(6, 6881489, 65535, 65535);
	    }

        public void openCollectBox()
        {
            p.getPackets().displayInterface(109); //opens Grand Exchange Collection Box.
        }

        public void goBackToGrandExchange()
        {
            /*
             * If you click back button from Buyer Screen
             * If everything works right it would remove item search from BuyOffer screen only
             * If you click back button from Seller Screen
             * It everything works right it would remove the flashing inventory.
             */

            if (currentOffer is BuyOffer)
            {
                //Removes the item search when leaving the Buyer screen.
                p.getPackets().sendInterface(0, 752, 6, 137); // Removes the item search
            }
            else if (currentOffer is SellOffer)
            {
                //Removes the flashing inventory when leaving the Seller screen.
                if (p.isHd())
                    p.getPackets().sendCloseInterface(746, 76); // Inventory
                else
                    p.getPackets().sendCloseInterface(548, 80); // Inventory
            }
        }

        public void newBuyOffer(byte slot)
        {
		    this.currentOffer = new BuyOffer(slot, p.getLoginDetails().getLongName());
            myGEItems[slot] = this.currentOffer;
		    p.getPackets().sendConfig(1109, -1);
		    p.getPackets().sendConfig(1110, 0);
		    p.getPackets().sendConfig(1111, 0);
		    p.getPackets().sendConfig(1112, slot);
		    p.getPackets().sendConfig(1113, 0);
		    p.getPackets().sendConfig(1114, 0);
		    p.getPackets().sendConfig(1115, 0);
		    p.getPackets().sendConfig(1116, 0);
		    openItemSearch();
	    }
	
	    public void newSellOffer(byte slot) 
        {
            this.currentOffer = new SellOffer(slot, p.getLoginDetails().getLongName());
            myGEItems[slot] = this.currentOffer;
		    p.getPackets().sendConfig(1109, -1);
		    p.getPackets().sendConfig(1110, 0);
		    p.getPackets().sendConfig(1111, 0);
		    p.getPackets().sendConfig(1112, slot);
		    p.getPackets().sendConfig(1113, 1);
		    p.getPackets().sendConfig(1114, 0);
		    p.getPackets().sendConfig(1115, 0);
		    p.getPackets().sendConfig(1116, 0);
		    p.getPackets().displayInventoryInterface(107);
		    p.getPackets().setRightClickOptions(1026, 107 * 65536 + 18, 0, 27);
		    object[] opts = new object[]{"", "", "", "", "Offer", -1, 0, 7, 4, 93, 7012370};
		    p.getPackets().sendClientScript(149, opts, "IviiiIsssss");
		    p.getPackets().sendItems(-1, 65535, 93, p.getInventory().getItems());
	    }
	
	    public void openItemSearch() 
        {
            p.getPackets().sendInterface(1, 752, 6, 389); // Opens the item search.
            p.getPackets().sendClientScript(570, new object[] { "Grand Exchange Item Search" }, "s");
	    }
	
	    public void updateSearchItem(int item) 
        {
		    ItemData.Item def = ItemData.forId(item);
            if (def == null)  {
                p.getPackets().sendMessage("Item: " + item + " cannot be found in item definitions, please report it.");
                return;
            }

            if (currentOffer == null) {
                p.getPackets().sendMessage("You shouldn't be running GE Item Search if you didn't click Buy in GE first");
                p.getPackets().sendCloseInterface(752, 6); // Removes the item search
                p.getPackets().sendInterface(0, 752, 6, 137); // Removes the item search
                return;
            }

		    p.getPackets().sendConfig(1109, item);
            p.getPackets().sendConfig(1110, 0);
		    p.getPackets().sendConfig(1114, def.getPrice().getNormalPrice());
		    p.getPackets().sendConfig(1116, def.getPrice().getMaximumPrice());
		    p.getPackets().sendConfig(1115, def.getPrice().getMinimumPrice());
		    p.getPackets().sendConfig(1111, def.getPrice().getNormalPrice());
            p.getPackets().modifyText(def.getExamine(), 105, 142); //item examine text.

            currentOffer.setTotalAmount(0);
		    currentOffer.setItem(item);
		    currentOffer.setPriceEach(def.getPrice().getNormalPrice());
            p.getPackets().sendInterface(0, 752, 6, 137);// Removes the item search
	    }

        public void setCustomAmount(int amount)
        {
            if (currentOffer == null)
            {
                p.getPackets().sendMessage("[setCustomAmount]: Nice try cheater!, If this is bug please report it.");
                return;
            }

            currentOffer.setTotalAmount(amount);
            if (currentOffer.getTotalAmount() < 1)
            {
                currentOffer.setTotalAmount(0);
            }
            p.getPackets().sendConfig(1110, currentOffer.getTotalAmount());
        }

	    public void incrementAmount(int increment, bool set) 
        {
            if (currentOffer == null)
            {
                p.getPackets().sendMessage("[incrementAmount]: Nice try cheater!, If this is bug please report it.");
                return;
            }

			if (currentOffer is SellOffer) {
                if (set)
                {
                    if (increment == 1000) //set to ALL click
                    {
                        currentOffer.setTotalAmount(p.getInventory().getItemAmount(currentOffer.getItem()));
                        p.getPackets().sendConfig(1110, currentOffer.getTotalAmount());
                        return;
                    }
                    else //set to 100, 10, 1 click
                    {
                        currentOffer.setTotalAmount(increment);
                        p.getPackets().sendConfig(1110, increment);
                    }
                } else {
                    if ((currentOffer.getTotalAmount() + increment) > Inventory.MAX_ITEM_AMOUNT)
                        currentOffer.setTotalAmount(Inventory.MAX_ITEM_AMOUNT);
                    else
                        currentOffer.setTotalAmount(currentOffer.getTotalAmount() + increment);
				}
			} else if (currentOffer is BuyOffer) {
                if ((currentOffer.getTotalAmount() + increment) > Inventory.MAX_ITEM_AMOUNT)
                    currentOffer.setTotalAmount(Inventory.MAX_ITEM_AMOUNT);
                else
                    currentOffer.setTotalAmount(currentOffer.getTotalAmount() + increment);
			}
			p.getPackets().sendConfig(1110, currentOffer.getTotalAmount());
	    }
	
	    public void decreaseAmount(int decrement) 
        {
            if (currentOffer == null)
            {
                p.getPackets().sendMessage("[decreaseAmount]: Nice try cheater!, If this is bug please report it.");
                return;
            }

			currentOffer.setTotalAmount(currentOffer.getTotalAmount() - decrement);
			if (currentOffer.getTotalAmount() < 1) {
				currentOffer.setTotalAmount(0);
			}
			p.getPackets().sendConfig(1110, currentOffer.getTotalAmount());
	    }
	
	    public void offerSellItem(int inventorySlot) 
        {
            if (currentOffer == null)
            {
                p.getPackets().sendMessage("[offerSellItem]: Nice try cheater!, If this is bug please report it.");
                return;
            }

            Item item = p.getInventory().getSlot(inventorySlot);
            if (item != null && item.getItemId() > 0 && item.getItemAmount() > 0)
            {
                int itemToShow = item.getItemId();
                ItemData.Item def = item.getDefinition();

                if (def == null)
                {
                    p.getPackets().sendMessage("Item: " + item.getItemId() + " cannot be found in item definitions, please report it.");
                    return;
                }

                if (def.isNoted())
                {
                    itemToShow = ItemData.getUnNotedItem(item.getItemId());
                    if (itemToShow == item.getItemId())
                    { 
                        // item is only noted (this is definetly itemData.xml file issue).
                        p.getPackets().sendMessage("Item: " + item.getItemId() + " An unnoted equivalent of this item cannot be found, please report it.");
                        return;
                    }
                    else
                    {
                        //update item def with un-noted def.
                        def = ItemData.forId(itemToShow); 
                        item.setItemId(itemToShow);
                    }
                }

                if (def.isPlayerBound() || (def.getPrice().getNormalPrice() == 0 && def.getPrice().getMaximumPrice() == 0 && def.getPrice().getMinimumPrice() == 0))
                { 
                    //look at unNoted item price, of a item which was previously noted.
                    p.getPackets().sendMessage("This item cannot be sold on the Grand Exchange.");
                    return;
                }
                p.getPackets().sendConfig(1109, item.getItemId());
                p.getPackets().sendConfig(1110, item.getItemAmount());
                p.getPackets().sendConfig(1114, def.getPrice().getNormalPrice());
                p.getPackets().sendConfig(1116, def.getPrice().getMaximumPrice());
                p.getPackets().sendConfig(1115, def.getPrice().getMinimumPrice());
                p.getPackets().sendConfig(1111, def.getPrice().getNormalPrice());
                p.getPackets().modifyText(def.getExamine(), 105, 142); //item examine text.

                currentOffer.setItem(item.getItemId());
                currentOffer.setTotalAmount(item.getItemAmount());
                currentOffer.setPriceEach(def.getPrice().getNormalPrice());
            }
	    }

        public void setCustomPrice(int amount)
        {
            if (currentOffer == null)
            {
                p.getPackets().sendMessage("[setCustomPrice]: Nice try cheater!, If this is bug please report it.");
                return;
            }

            ItemData.ItemPrice price = currentOffer.getItemPrice();
            if (amount < price.getMinimumPrice())
                currentOffer.setPriceEach(price.getMinimumPrice());
            else if(amount > price.getMaximumPrice())
                currentOffer.setPriceEach(price.getMaximumPrice());
            else
                currentOffer.setPriceEach(amount);
            p.getPackets().sendConfig(1111, currentOffer.getPriceEach());
        }
	
	    public void setPrice(int i) 
        {
            if (currentOffer == null)
            {
                p.getPackets().sendMessage("[setPrice]: Nice try cheater!, If this is bug please report it.");
                return;
            }

            ItemData.ItemPrice price = currentOffer.getItemPrice();
			if (i == 0) { // Min
                currentOffer.setPriceEach(price.getMinimumPrice());
			} else if (i == 1) { // Med
                currentOffer.setPriceEach(price.getNormalPrice());
			} else if (i == 2) { // Max
                currentOffer.setPriceEach(price.getMaximumPrice());
			} else if (i == 3) { // -1
				currentOffer.setPriceEach(currentOffer.getPriceEach() - 1);
                if (currentOffer.getPriceEach() <= price.getMinimumPrice())
                    currentOffer.setPriceEach(price.getMinimumPrice());
			} else if (i == 4) { // +1
				currentOffer.setPriceEach(currentOffer.getPriceEach() + 1);
                if (currentOffer.getPriceEach() >= price.getMaximumPrice())
                    currentOffer.setPriceEach(price.getMaximumPrice());
			}
			p.getPackets().sendConfig(1111, currentOffer.getPriceEach());
	    }
	
	    public void checkOffer(byte slot) 
        {
            this.currentOffer = myGEItems[slot];
            /*
             * The line below always gets the GEItem by player and GE slot from database.
             * It's alot slower to keep retrieving it from database.
             * Line above this comment uses the preloaded GEItems 
             * That should be the same thing, But faster.
             */
            //this.currentOffer = Server.getGrandExchange().getOfferByPlayerSlot(p, slot);

		    if (currentOffer == null) {
                p.getPackets().sendMessage("[checkOffer]: Nice try cheater!, If this is bug please report it.");
			    return;
		    }

            ItemData.ItemPrice price = currentOffer.getItemPrice();
            ItemData.Item def = ItemData.forId(currentOffer.getItem());

            if (def == null)
            {
                p.getPackets().sendMessage("Item: " + currentOffer.getItem() + " cannot be found in item definitions, please report it.");
                return;
            }

			p.getPackets().sendConfig(1109, currentOffer.getItem());
			p.getPackets().sendConfig(1110, currentOffer.getTotalAmount());
            p.getPackets().sendConfig(1111, currentOffer.getPriceEach());
			p.getPackets().sendConfig(1112, currentOffer.getSlot());
			p.getPackets().sendConfig(1113, 0);
			p.getPackets().sendConfig(1114, price.getNormalPrice());
			p.getPackets().sendConfig(1116, price.getMaximumPrice());
			p.getPackets().sendConfig(1115, price.getMinimumPrice());
            p.getPackets().modifyText(def.getExamine(), 105, 142); //item examine text.

			if (currentOffer is BuyOffer) {
                //A Buyer can have how much of the item's he bought shown even if they aborted the currentOffer.
                currentOffer.setSlot1((currentOffer.getAmountItemsLeftToCollect() > 0) ? new Item(currentOffer.getItem(), currentOffer.getAmountItemsLeftToCollect()) : null);

                /**If Buyer Aborted the item buying, it shows UnBought item gold + Overpay gold
                 * If Buyer doesn't abort the item it shows just Overpay gold.
                 */
                if (currentOffer.isAborted())
                    currentOffer.setSlot2((currentOffer.getTotalAmountGoldLeftToCollect() > 0) ? new Item(995, currentOffer.getTotalAmountGoldLeftToCollect()) : null);
                else
                    currentOffer.setSlot2((currentOffer.getAmountCollectedGold() < currentOffer.getAmountOverpaid()) ? new Item(995, currentOffer.getAmountOverpaid()) : null);
			} else if(currentOffer is SellOffer) {
                //If Seller Aborted the item selling, it shows UnSold items
                currentOffer.setSlot1((currentOffer.isAborted() && currentOffer.getTotalAmountItemsLeftToCollect() > 0) ? new Item(currentOffer.getItem(), currentOffer.getTotalAmountItemsLeftToCollect()) : null);

                //Always shows Seller Item Sold Gold + Overpay gold (shows how much money you made from sales + overpays.)
                currentOffer.setSlot2((currentOffer.getAmountGoldLeftToCollect() > 0) ? new Item(995, currentOffer.getAmountGoldLeftToCollect()) : null);
			 }

			Item[] items = {currentOffer.getSlot1(), currentOffer.getSlot2()};
			p.getPackets().sendItems(-1, -1757, 523 + currentOffer.getSlot(), items);
	    }
	
	    public void confirmOffer() 
        {
            /*
             * Confirm a Buyer or Seller listing.
             */
		    if (currentOffer == null) {
                p.getPackets().sendMessage("[confirmOffer]: Nice try cheater!, If this is bug please report it.");
			    return;
		    }

            long gpAmountCalculated = Math.BigMul(currentOffer.getTotalAmount(), currentOffer.getPriceEach());
            if (gpAmountCalculated > Inventory.MAX_ITEM_AMOUNT) {
                if (currentOffer is BuyOffer) {
                    p.getPackets().sendMessage("You won't be able to cover the offer, it exceeds maximum gold.");
                    return;
                } else if (currentOffer is SellOffer) {
                    p.getPackets().sendMessage("You can't sell that many, it would create too much gold to be able to take out.");
                    return;
                }
            }

		    if (currentOffer is BuyOffer) {
                int gpAmount = (int)gpAmountCalculated;
			    if (currentOffer.getTotalAmount() <= 0) {
				    p.getPackets().sendMessage("You must choose the quantity you wish to buy!");
				    return;
			    } else if (!p.getInventory().hasItemAmount(995, gpAmount)) {
				    p.getPackets().sendMessage("You don't have enough coins in your inventory to cover the offer.");
				    return;
			    } else if (!p.getInventory().deleteItem(995, gpAmount)) {
				    return;
			    }
		    } else if (currentOffer is SellOffer) {
			    if (currentOffer.getTotalAmount() <= 0) {
				    p.getPackets().sendMessage("You must choose the quantity you wish to sell!");
				    return;
			    } else if (!p.getInventory().hasItemAmount(currentOffer.getItem(), currentOffer.getTotalAmount())) {
				    p.getPackets().sendMessage("You do not have enough of this item in your inventory to cover the offer.");
				    return;
			    }
			    if (ItemData.forId(currentOffer.getItem()).isNoted() || ItemData.forId(currentOffer.getItem()).isStackable()) {
				    if (!p.getInventory().deleteItem(currentOffer.getItem(), currentOffer.getTotalAmount())) {
                        p.getPackets().sendMessage("[confirmOffer]: Nice try cheater!, you don't have this item!.");
					    return;
				    }
			    } else {
                    //UnNoted variant of this item, so remove multiple items from inventory.
                    int amountTotalDeleted = p.getInventory().deleteItemAndShowAmountDeleted(currentOffer.getUnNotedId(), currentOffer.getTotalAmount());
                    currentOffer.setTotalAmount(amountTotalDeleted);
                    p.getPackets().sendConfig(1110, currentOffer.getTotalAmount());
			    }
		    }

		    p.getPackets().sendConfig(1113, -1);
		    p.getPackets().sendConfig(1112, -1);
            currentOffer.setSubmitting(true);
		    p.getPackets().updateGEProgress(currentOffer);
		    Server.getGrandExchange().addOffer(currentOffer);
		    GEItem offer = currentOffer;
		    currentOffer = null;
            Event updateGEProgressEvent = new Event(500);
            updateGEProgressEvent.setAction(() => {
                updateGEProgressEvent.stop();
                offer.setSubmitting(false); //done submitting = orangebar
				p.getPackets().updateGEProgress(offer);	
		    });
            Server.registerEvent(updateGEProgressEvent);
	    }

	    public void abortOffer() 
        {
            if (currentOffer == null) {
                p.getPackets().sendMessage("[abortOffer]: Nice try cheater!, If this is bug please report it.");
                return;
            }

			if (currentOffer.isAborted())
				return;

            //Both slots appear when aborting items and money.
			if (currentOffer is BuyOffer) {
                currentOffer.setSlot1((currentOffer.getAmountItemsLeftToCollect() > 0) ? new Item(currentOffer.getItem(), currentOffer.getAmountItemsLeftToCollect()) : null);
                currentOffer.setSlot2((currentOffer.getTotalAmountGoldLeftToCollect() > 0) ? new Item(995, currentOffer.getTotalAmountGoldLeftToCollect()) : null);
			} else if(currentOffer is SellOffer) {
                currentOffer.setSlot1((currentOffer.getTotalAmountItemsLeftToCollect() > 0) ? new Item(currentOffer.getItem(), currentOffer.getTotalAmountItemsLeftToCollect()) : null);
                currentOffer.setSlot2((currentOffer.getAmountGoldLeftToCollect() > 0) ? new Item(995, currentOffer.getAmountGoldLeftToCollect()) : null);
            }

            Item[] items = { currentOffer.getSlot1(), currentOffer.getSlot2() };
			p.getPackets().sendItems(-1, -1757, 523 + currentOffer.getSlot(), items);
			currentOffer.setAborted(true);
			p.getPackets().updateGEProgress(currentOffer);
            Server.getGrandExchange().abortOffer(currentOffer);
            p.getPackets().sendMessage("Abort request acknowledged. Please be aware that your offer may have already been completed.");
	    }

	    public void collectSlot1(bool noted) 
        {
            /*
             * Collect item slot
             */
            if (currentOffer == null)
            {
                p.getPackets().sendMessage("[collectSlot1]: Nice try cheater!, If this is bug please report it.");
                return;
            }

			if (currentOffer.getSlot1() != null) {
				int itemId = currentOffer.getSlot1().getItemId();
                int notedId = ItemData.getNotedItem(itemId);

                /*
                 * If noted mode is active, and notedId is different then itemId,
                 * Then noted version of this itemId exists, 
                 * So you can take out item in noted version,
                 * Otherwise it takes it out in 
                 */
                int itemWithdraw = (noted && (notedId != itemId)) ? notedId : itemId;
                bool stackable = ItemData.forId(itemWithdraw).isStackable();

                if (noted && itemWithdraw == itemId)
                    p.getPackets().sendMessage("This item cannot be collected as a note.");

                // stackable item [arrows, runes etc] or possibly noted item.
                if (stackable)
                {
                    int playerInventoryItemAmount = p.getInventory().getItemAmount(itemWithdraw);
                    int grandExchangeSlot1ItemAmountToWithdraw = currentOffer.getSlot1().getItemAmount();

                    if (playerInventoryItemAmount >= Inventory.MAX_ITEM_AMOUNT)
                    {
                        p.getPackets().sendMessage("You cannot collect anymore of this item, you have maximum of this item in inventory.");
                        return;
                    }

                    //if player's inventory gold + slot2 gold is more then you can hold for that inventory item.
                    if (((long)playerInventoryItemAmount + (long)grandExchangeSlot1ItemAmountToWithdraw) > Inventory.MAX_ITEM_AMOUNT)
                        grandExchangeSlot1ItemAmountToWithdraw = (Inventory.MAX_ITEM_AMOUNT - playerInventoryItemAmount);

                    /*
                     * Change Slot1's amount based on how much left over
                     * if any when added to inventory after max item amount check.
                     */
                    if (p.getInventory().addItem(itemWithdraw, grandExchangeSlot1ItemAmountToWithdraw))
                        currentOffer.getSlot1().setItemAmount(currentOffer.getSlot1().getItemAmount() - grandExchangeSlot1ItemAmountToWithdraw);

                    currentOffer.setAmountCollectedItem(currentOffer.getAmountCollectedItem() + grandExchangeSlot1ItemAmountToWithdraw);
                    //clear the item slot if the slot's item amount is <= 0
                    if (currentOffer.getSlot1().getItemAmount() <= 0)
                        currentOffer.setSlot1(null);
                }
                else
                {
                    int amountToWithdraw = currentOffer.getSlot1().getItemAmount();
                    // isn't noted... and isn't stackable, withdraw as regular items
                    for (int i = 0; i < amountToWithdraw; i++)
                    {
                        if (!p.getInventory().addItem(itemWithdraw))
                            break;

                        currentOffer.getSlot1().setItemAmount(currentOffer.getSlot1().getItemAmount() - 1);
                        currentOffer.setAmountCollectedItem(currentOffer.getAmountCollectedItem() + 1);

                        if (currentOffer.getSlot1().getItemAmount() <= 0)
                        {
                            currentOffer.setSlot1(null);
                            break;
                        }
                    }
                }

                updateSlotStates();
			}
	    }
	
	    public void collectSlot2() 
        {
            /* 
             * Collects money slot
             */
            if (currentOffer == null)
            {
                p.getPackets().sendMessage("[collectSlot2]: Nice try cheater!, If this is bug please report it.");
                return;
            }

			if (currentOffer.getSlot2() != null) {
                int playerInventoryGoldAmount = p.getInventory().getItemAmount(995);
                int grandExchangeSlot2GoldAmountToWithdraw = currentOffer.getSlot2().getItemAmount();

                if (playerInventoryGoldAmount >= Inventory.MAX_ITEM_AMOUNT)
                {
                    p.getPackets().sendMessage("You cannot collect anymore money, you have maximum money in inventory.");
                    return;
                }

                //if player's inventory gold + slot2 gold is more then you can hold for that inventory item.
                /*
                 * have to cast both amounts with (long)
                 * because the way they are both (int)'s, they might create a negitive number
                 * and that negitive number is less then MAX_ITEM_AMOUNT so it wont work properly.
                 */
                if (((long)playerInventoryGoldAmount + (long)grandExchangeSlot2GoldAmountToWithdraw) > Inventory.MAX_ITEM_AMOUNT)
                    grandExchangeSlot2GoldAmountToWithdraw = (Inventory.MAX_ITEM_AMOUNT - playerInventoryGoldAmount);

                /*
                 * Change Slot2's amount based on how much left over
                 * if any when added to inventory after max item amount check.
                 */
                if (p.getInventory().addItem(995, grandExchangeSlot2GoldAmountToWithdraw)) {
                    currentOffer.getSlot2().setItemAmount(currentOffer.getSlot2().getItemAmount() - grandExchangeSlot2GoldAmountToWithdraw);
                }

                currentOffer.setAmountCollectedGold(currentOffer.getAmountCollectedGold() + grandExchangeSlot2GoldAmountToWithdraw);
                /*
                 * Clear Slot2's Gold Item, if gold item amount <=0
                 */
                if (currentOffer.getSlot2().getItemAmount() <= 0)
                    currentOffer.setSlot2(null);

                updateSlotStates();
			}
	    }

        public void updateSlotStates()
        {
            Item[] items = { currentOffer.getSlot1(), currentOffer.getSlot2() };
            p.getPackets().sendItems(-1, -1757, 523 + currentOffer.getSlot(), items);

            /*
             * Deletes the offer from database completely.
             * Only if amount you were willing to sell/(buy?) was completed
             * Or you clicked abort item 
             * And taken both items out of Slot1 and Slot2.
             * Otherwise it just saves how much you taken out of both slots (if anything).
             */
            if (((currentOffer.getAmountTraded() == currentOffer.getTotalAmount()) || currentOffer.isAborted()) && currentOffer.getSlot1() == null && currentOffer.getSlot2() == null)
            {
                Server.getGrandExchange().removeOffer(currentOffer);
                resetInterface();
                currentOffer = null;
            }
            else
            {
                Server.getGrandExchange().updateGEItemSlotsDatabase(currentOffer);
            }
        }

	    public void resetInterface() 
        {
		    p.getPackets().sendConfig(1109, -1);
		    p.getPackets().sendConfig(1110, -1);
		    p.getPackets().sendConfig(1112, -1);
		    p.getPackets().sendConfig(1113, -1);
		    p.getPackets().sendConfig(1114, -1);
		    p.getPackets().sendConfig(1116, -1);
		    p.getPackets().sendConfig(1115, -1);
		    p.getPackets().sendConfig(1111, -1);
		    p.getPackets().resetGESlot(currentOffer.getSlot());
	    }

	    public GEItem getCurrentOffer() 
        {
		    return currentOffer;
	    }
    }
}
