using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Runtime.Serialization;
using RunescapeServer.util;

namespace RunescapeServer.grandexchange
{
    public class SellOffer : GEItem
    {
        public SellOffer()
        {
        }

        public SellOffer(byte slot, long playerHash)
        {
            /*
             * This is used when clicking any empty slot to go into Seller's screen 
             * used to detect which slot you currently in as currentOffer
             * and what kind the currentOffer is in this case its SellOffer
             */
            setSlot(slot);
            setPlayerHash(playerHash);
        }

        public SellOffer(int item, int totalAmount, int price, byte slot, long playerHash)
        {
            setItem(item);
            setTotalAmount(totalAmount);
            setPriceEach(price);
            setPlayerHash(playerHash);
            setSlot(slot);
            setAmountTraded(0);
        }

        public SellOffer(int item, int totalAmount, int price, int sold, int collectedItem, int collectedGold, int overpaid, byte slot, long playerHash)
        {
            // This is used by automatic updating all Seller's Item globally.
		    setItem(item);
		    setTotalAmount(totalAmount);
            setPriceEach(price);
		    setAmountTraded(sold);
            setAmountCollectedItem(collectedItem);
            setAmountCollectedGold(collectedGold);
            setAmountOverpaid(overpaid);
            setSlot(slot);
            setPlayerHash(playerHash);
	    }

        public SellOffer(int item, int totalAmount, int price, int sold, int collectedItem, int collectedGold, int overpaid, byte slot, bool aborted, long playerHash)
        {
            // This is used for loading up the Seller's Items upon clicking View Grand Exchange
            setItem(item);
            setTotalAmount(totalAmount);
            setPriceEach(price);
            setAmountTraded(sold);
            setAmountCollectedItem(collectedItem);
            setAmountCollectedGold(collectedGold);
            setAmountOverpaid(overpaid);
            setSlot(slot);
            setAborted(aborted);
            setPlayerHash(playerHash);
        }

        public override sbyte getAbortedBarId()
        {
		    return -3;
	    }

        public override sbyte getCompletedBarId()
        {
		    return -3;
	    }

        public override sbyte getOrangeBarId()
        {
		    return -2;
	    }

        public override sbyte getSubmittingId()
        {
		    return -7;
	    }

        public override int getDisplayItem()
        {
		    return getUnNotedId();
	    }
    }
}
