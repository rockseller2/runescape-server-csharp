using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RunescapeServer.grandexchange
{
    public class BuyOffer : GEItem
    {

        public BuyOffer()
        {
        }

        public BuyOffer(byte slot, long playerHash)
        {
            /*
             * This is used when clicking any empty slot to go into Buyer's screen 
             * used to detect which slot you currently in as currentOffer
             * and what kind the currentOffer is in this case its BuyOffer
             */
            setSlot(slot);
            setPlayerHash(playerHash);
        }

        public BuyOffer(int item, int totalAmount, int price, int bought, int collectedItem, int collectedGold, int overpaid, byte slot, long playerHash)
        {
            // This is used by automatic updating all Buyer's Item globally.
		    setItem(item);
		    setTotalAmount(totalAmount);
            setPriceEach(price);
		    setAmountTraded(bought);
            setAmountCollectedItem(collectedItem);
            setAmountCollectedGold(collectedGold);
            setAmountOverpaid(overpaid);
            setSlot(slot);
            setPlayerHash(playerHash);
	    }

        public BuyOffer(int item, int totalAmount, int price, int bought, int collectedItem, int collectedGold, int overpaid, byte slot, bool aborted, long playerHash)
        {
            // This is used for loading up the Buyer's Items upon clicking View Grand Exchange
            setItem(item);
            setTotalAmount(totalAmount);
            setPriceEach(price);
            setAmountTraded(bought);
            setAmountCollectedItem(collectedItem);
            setAmountCollectedGold(collectedGold);
            setAmountOverpaid(overpaid);
            setSlot(slot);
            setAborted(aborted);
            setPlayerHash(playerHash);
        }

        public override sbyte getAbortedBarId()
        {
		    return 5;
	    }

        public override sbyte getCompletedBarId()
        {
		    return 5;
	    }

        public override sbyte getOrangeBarId()
        {
		    return 2;
	    }

        public override sbyte getSubmittingId()
        {
		    return 1;
	    }

        public override int getDisplayItem()
        {
		    return getItem();
	    }
    }
}
