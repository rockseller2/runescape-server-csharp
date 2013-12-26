using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using RunescapeServer.definitions;
using RunescapeServer.model;

namespace RunescapeServer.player
{
    class Inventory
    {
        public const int MAX_ITEM_AMOUNT = int.MaxValue;
        public const int MAX_INVENTORY_SLOTS = 28;
        private Item[] slots = new Item[MAX_INVENTORY_SLOTS];
	    private int[] protectedItems;

	    private Player p;
	
	    public Inventory(Player p) {
            this.p = p;
		    for (int i = 0; i < slots.Length; i++) {
			    slots[i] = new Item(-1, 0);
		    }
	    }
	
	    public int getTotalFreeSlots() {
		    int j = 0;
            for (int i = 0; i < slots.Length; i++)
            {
			    if (slots[i].getItemId() == -1) {
				    j++;
			    }
		    }
		    return j;
	    }
	
	    public int findFreeSlot() {
            for (int i = 0; i < slots.Length; i++)
            {
			    if (slots[i].getItemId() == -1) {
				    return i;
			    }
		    }
		    return -1;
	    }
	
	    public bool hasItem(int itemId) {
            for (int i = 0; i < slots.Length; i++)
            {
			    if (slots[i].getItemId() == itemId) {
				    return true;
			    }
		    }
		    return false;
	    }
	
	    public bool hasItemAmount(int itemId, long amount) {
		    int j = 0;
            for (int i = 0; i < slots.Length; i++)
            {
			    if (slots[i].getItemId() == itemId) {
				    j += slots[i].getItemAmount();
			    }
		    }
		    return j >= amount;
	    }
	
	    public int findItemSlot(int itemId) {
            for (int slot = 0; slot < slots.Length; slot++)
            {
                if (slots[slot].getItemId() == itemId)
                    return slot;
		    }
		    return -1;
	    }
	
	    public int getItemAmount(int itemId) {
            //TODO: maybe increase later it to long (if you want to calculate multiple max item counts at once.
		    int itemAmount = 0;
            for (int i = 0; i < slots.Length; i++)
            {
			    if (slots[i].getItemId() == itemId) {
                    if ((itemAmount + slots[i].getItemAmount()) > MAX_ITEM_AMOUNT)
                        return MAX_ITEM_AMOUNT;
                    else
                        itemAmount += slots[i].getItemAmount();
			    }
		    }
            return itemAmount;
	    }
	
	    public void clearAll() {
            for (int i = 0; i < slots.Length; i++)
            {
			    slots[i].setItemId(-1);
			    slots[i].setItemAmount(0);
		    }
		    p.getPackets().refreshInventory();
	    }
	
	    public bool replaceSingleItem(int itemToReplace, int itemToAdd) {
            int slot = findItemSlot(itemToReplace);
		    if (slot == -1) {
			    return false;
		    }

            return replaceItemSlot(itemToReplace, itemToAdd, slot);
	    }
	
	    public bool replaceItemSlot(int itemToReplace, int itemToAdd, int slot) {
		    if (slots[slot].getItemId() != itemToReplace || slots[slot].getItemAmount() <= 0) {
			    return false;
		    }
		    slots[slot].setItemId(itemToAdd);
		    slots[slot].setItemAmount(1);
		    p.getPackets().refreshInventory();
		    return true;
	    }
	
	    public void addItemOrGround(int item, int amount) {
		    /*
		     * We try to add the item to the inventory..
		     */
		    if (addItem(item, amount)) {
			    return;
		    }
		    /*
		     * It didn't add the item above, yet we have room for it?..odd.
		     */
		    if (getTotalFreeSlots() > 0) {
			    return;
		    }
		    /*
		     * Add the item to the ground.
		     */
		    GroundItem g = new GroundItem(item, amount, p.getLocation(), p);
		    Server.getGroundItems().newEntityDrop(g);
	    }
	
	    public void addItemOrGround(int item) {
		    addItemOrGround(item, 1);
	    }
	
	    public bool addItem(int item) {
		    return addItem(item, 1, findFreeSlot());
	    }
	
	    public bool addItem(int item, int amount) {
		    return addItem(item, amount, findFreeSlot());
	    }
	
	    public bool addItem(int itemId, int amount, int slot) {
            if(itemId < 0 || itemId > Constants.MAX_ITEMS) 
                return false;
		    bool stackable = ItemData.forId(itemId).isStackable();
		    if (amount <= 0) {
			    return false;
		    }
		    if (!stackable) {
			    if (getTotalFreeSlots() <= 0) {
				    p.getPackets().sendMessage("Not enough space in your inventory.");
				    return false;
			    }
			    if (slots[slot].getItemId() != -1) {
				    slot = findFreeSlot();
				    if (slot == -1) {
					    p.getPackets().sendMessage("Not enough space in your inventory.");
					    return false;
				    }
			    }
			    slots[slot].setItemId(itemId);
			    slots[slot].setItemAmount(1);
			    p.getPackets().refreshInventory();
			    return true;
		    } else if(stackable) {
			    if (hasItem(itemId)) {
                    slot = findItemSlot(itemId);
			    }
			    else if (getTotalFreeSlots() <= 0) {
				    p.getPackets().sendMessage("Not enough space in your inventory.");
				    return false;
			    }
			    long newAmount = ((long)amount + slots[slot].getItemAmount());
                if (newAmount > MAX_ITEM_AMOUNT)
                {
				    p.getPackets().sendMessage("Not enough space in your inventory.");
				    return false;
			    }
			    if (slots[slot].getItemId() != -1 && slots[slot].getItemId() != itemId) {
				    slot = findFreeSlot();
				    if (slot == -1) {
					    p.getPackets().sendMessage("Not enough space in your inventory.");
					    return false;
				    }
			    }
			    slots[slot].setItemId(itemId);
			    slots[slot].setItemAmount(slots[slot].getItemAmount() + amount);
			    p.getPackets().refreshInventory();
			    return true;
		    }
		    return false;
	    }
	
	    public void deleteAll() {
		    for (int i = 0; i < slots.Length; i++) {
			    deleteItem(slots[i].getItemId(), i, slots[i].getItemAmount());
		    }
	    }
	
	    public bool deleteItem(int itemId) {
            return deleteItem(itemId, findItemSlot(itemId), 1);
	    }
	
	    public bool deleteItem(int itemId, int amount) {
		    /**
             * This works differently then deleteItem(itemId, slot, amount);
             * This one will remove multiple items if amount is more then stack.
             * As well as non-stackable items
             */

            if (amount <= getItemAmount(itemId))
            {
                int amountToDelete = amount;

                for (int slot = 0; slot < slots.Length; slot++)
                {
                    if (amountToDelete <= 0)
                        return true;
                    if (slots[slot].getItemId() == itemId && slots[slot].getItemAmount() >= 1)
                    {
                        if (slots[slot].getItemAmount() >= amountToDelete)
                        {
                            slots[slot].setItemAmount(slots[slot].getItemAmount() - amountToDelete);
                            amountToDelete = 0;
                            //I would just return here but it may have to set itemId to -1 and refreshInventory.
                        }
                        else if (slots[slot].getItemAmount() < amountToDelete)
                        {
                            amountToDelete -= slots[slot].getItemAmount();
                            slots[slot].setItemAmount(0);
                        }

                        if (slots[slot].getItemAmount() <= 0)
                        {
                            slots[slot].setItemId(-1);
                            slots[slot].setItemAmount(0);
                        }
                        p.getPackets().refreshInventory();
                    }
                }
            }
            return false;
	    }
	
	    public bool deleteItem(int itemId, int slot, int amount) {
		    if (slot == -1) {
			    return false;
		    }
		    if (slots[slot].getItemId() == itemId && slots[slot].getItemAmount() >= amount) {
			    slots[slot].setItemAmount(slots[slot].getItemAmount() - amount);
			    if (slots[slot].getItemAmount() <= 0) {
				    slots[slot].setItemId(-1);
				    slots[slot].setItemAmount(0);
			    }
			    p.getPackets().refreshInventory();
			    return true;
		    }
		    return false;
	    }

        public int deleteItemAndShowAmountDeleted(int itemId, int amount)
        {
            /**
             * This is used for Grand Exchange currently.
             * Used with any kind of items.
             * It will attempt to delete until either the amount is reached
             * Or if total amount of the existing item to delete is greater then amount you specified
             * It returns # it deleted items.
             */

            int amountToDelete = amount;
            int amountDeleted = 0;

            for (int slot = 0; slot < slots.Length; slot++)
            {
                if (amountToDelete <= 0)
                    return amount;
                if (slots[slot].getItemId() == itemId && slots[slot].getItemAmount() >= 1)
                {
                    if (slots[slot].getItemAmount() >= amountToDelete)
                    {
                        slots[slot].setItemAmount(slots[slot].getItemAmount() - amountToDelete);
                        amountToDelete = 0;
                        amountDeleted = amount;
                        //I would just return here but it may have to set itemId to -1 and refreshInventory.
                    }
                    else if (slots[slot].getItemAmount() < amountToDelete)
                    {
                        amountToDelete -= slots[slot].getItemAmount();
                        amountDeleted += slots[slot].getItemAmount();
                        slots[slot].setItemAmount(0);
                    }

                    if (slots[slot].getItemAmount() <= 0)
                    {
                        slots[slot].setItemId(-1);
                        slots[slot].setItemAmount(0);
                    }
                    p.getPackets().refreshInventory();
                }
            }

            return amountDeleted;
        }
	    public int getAmountInSlot(int slot) {
		    if (slot < 0 || slot > 28) {
			    return -1;
		    }
		    return slots[slot].getItemAmount();
	    }

	    public int getItemInSlot(int slot) {
		    if (slot < 0 || slot > 28) {
			    return -1;
		    }
		    return slots[slot].getItemId();
	    }
	
	    public Item getSlot(int slot) {
		    if (slot < 0 || slot > 28) {
			    return null;
		    }
		    return slots[slot];
	    }
	
	    public Item[] getItems() {
		    return slots;
	    }
	
	    public void setProtectedItems(int[] protectedItems) {
		    this.protectedItems = protectedItems;
	    }

	    public int[] getProtectedItems() {
		    return protectedItems;
	    }
	
	    public int getProtectedItem(int i) {
		    return protectedItems[i];
	    }

    }
}
