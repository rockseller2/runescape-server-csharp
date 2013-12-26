using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RunescapeServer.model;
using RunescapeServer.definitions;
using System.Runtime.Serialization;
using RunescapeServer.util;

namespace RunescapeServer.grandexchange
{
    public abstract class GEItem
    {
        public long playerHash;
        public string playerName;
        public int item;
        public int totalAmount;
        public int amountTraded;
        public int amountCollectedItem; //this is for the Slot1 (Item amount took out).
        public int amountCollectedGold; //this is for the Slot2 (Gold amount took out).
        public int amountOverpaid; //this is for the Slot2 extra (Gold amount over-paid for item) works as addition for Seller's gold profit, or just refund to Buyer's gold.
        public int priceEach;
        public byte slot;
        public bool aborted;
        public bool submitting;
        public Item slot1;
        public Item slot2;
        public int unNotedId;
        public abstract sbyte getSubmittingId();
        public abstract sbyte getOrangeBarId();
        public abstract sbyte getCompletedBarId();
        public abstract sbyte getAbortedBarId();
        public abstract int getDisplayItem();

        public GEItem()
        {
            this.aborted = false;
        }

        public void setItem(int item)
        {
            this.item = item;
            this.unNotedId = ItemData.getUnNotedItem(item);
        }

        public string getPlayerName()
        {
            return playerName;
        }

        public long getPlayerHash()
        {
            return playerHash;
        }

        public void setPlayerHash(long playerHash)
        {
            this.playerHash = playerHash;
            this.playerName = misc.longToPlayerName(playerHash);
        }

        public int getTotalAmount()
        {
            return totalAmount;
        }

        public void setTotalAmount(int totalAmount)
        {
            this.totalAmount = totalAmount;
        }

        public int getAmountTraded()
        {
            return amountTraded;
        }

        public void setAmountTraded(int amountTraded)
        {
            this.amountTraded = amountTraded;
        }

        public bool isCompleted()
        {
            return totalAmount == amountTraded;
        }

        public int getAmountCollectedItem()
        {
            return amountCollectedItem;
        }

        public void setAmountCollectedItem(int amountCollectedItem)
        {
            this.amountCollectedItem = amountCollectedItem;
        }

        public int getAmountCollectedGold()
        {
            return amountCollectedGold;
        }

        public void setAmountCollectedGold(int amountCollectedGold)
        {
            this.amountCollectedGold = amountCollectedGold;
        }

        public int getAmountOverpaid()
        {
            return amountOverpaid;
        }

        public void setAmountOverpaid(int amountOverpaid)
        {
            this.amountOverpaid = amountOverpaid;
        }

        public int getTotalAmountItemsLeftToCollect()
        {
            //Unsold items total: ((TotalAmount - AmountTraded) - getAmountCollectedItem)
            //Also could be used as UnBought (but this doesn't exist in runescape lol afaik).

            int amountTotalItemsLeftToCollect = getTotalAmount() - getAmountTraded();
            if (getAmountCollectedItem() < amountTotalItemsLeftToCollect)
                amountTotalItemsLeftToCollect -= getAmountCollectedItem();

            return amountTotalItemsLeftToCollect;
        }

        public int getTotalAmountGoldLeftToCollect()
        {
            //Unsold items total in Gold and Overpay

            int amountTotalItemsGoldLeftAndOverPayGold = ((getTotalAmountItemsLeftToCollect() * getPriceEach()) + getAmountOverpaid());

            int amountTotalItemsGoldLeftAndOverPayGoldLeftToCollect = 0;
            if (getAmountCollectedGold() < amountTotalItemsGoldLeftAndOverPayGold)
                amountTotalItemsGoldLeftAndOverPayGoldLeftToCollect = amountTotalItemsGoldLeftAndOverPayGold - getAmountCollectedGold();
            return amountTotalItemsGoldLeftAndOverPayGoldLeftToCollect;
        }

        public int getAmountItemsLeftToCollect()
        {
            //Bought or Sold items total: (AmountTraded - AmountCollectedItem)
            int amountItemsLeftToCollect = 0;
            if (getAmountCollectedItem() < getAmountTraded())
                amountItemsLeftToCollect = getAmountTraded() - getAmountCollectedItem();
            return amountItemsLeftToCollect;
        }

        public int getAmountGoldLeftToCollect()
        {
            //Gets amount of gold left to collect.
            int amountItemsGoldLeftToCollectAndOverPayGold = ((getAmountItemsLeftToCollect() * getPriceEach()) + getAmountOverpaid());

            int amountItemsGoldLeftToCollectAndOverPayGoldLeftToCollect = 0;
            if (getAmountCollectedGold() < amountItemsGoldLeftToCollectAndOverPayGold)
                amountItemsGoldLeftToCollectAndOverPayGoldLeftToCollect = amountItemsGoldLeftToCollectAndOverPayGold - getAmountCollectedGold();
            return amountItemsGoldLeftToCollectAndOverPayGoldLeftToCollect;
        }

        public int getItem()
        {
            return item;
        }

        public void setPriceEach(int priceEach)
        {
            this.priceEach = priceEach;
        }

        public int getPriceEach()
        {
            return priceEach;
        }

        public void setSlot(byte slot)
        {
            this.slot = slot;
        }

        public byte getSlot()
        {
            return slot;
        }

        public void setAborted(bool aborted)
        {
            this.aborted = aborted;
        }

        public bool isAborted()
        {
            return aborted;
        }

        public void setSubmitting(bool submitting)
        {
            this.submitting = submitting;
        }

        public bool isSubmitting()
        {
            return submitting;
        }

        public sbyte getProgress()
        {
            if (isAborted())
                return getAbortedBarId();
            else if (getAmountTraded() == getTotalAmount())
                return getCompletedBarId();
            else if (isSubmitting())
                return getSubmittingId();
            else
                return getOrangeBarId(); //When item is Submitted or just want to display it.. same as return 0;? it seems so.
            //else
            //    return 0; //no item progress? (empty GE Slot). [never used it seems.. works fine without it].
        }

        public Item getSlot1()
        {
            return slot1;
        }

        public void setSlot1(Item slot1)
        {
            this.slot1 = slot1;
        }

        public Item getSlot2()
        {
            return slot2;
        }

        public void setSlot2(Item slot2)
        {
            this.slot2 = slot2;
        }

        public int getUnNotedId()
        {
            return unNotedId;
        }

        public ItemData.ItemPrice getItemPrice()
        {
            return ItemData.forId(getUnNotedId() > 0 ? getUnNotedId() : getItem()).getPrice();
        }
    }
}
