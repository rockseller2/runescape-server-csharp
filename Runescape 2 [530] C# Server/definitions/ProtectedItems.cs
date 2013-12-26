using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RunescapeServer.player;
using RunescapeServer.model;

namespace RunescapeServer.definitions
{
    class ProtectedItems
    {

	
	    private static int INVENTORY = 0, EQUIPMENT = 1;

	    public static int[] getProtectedItem1(Player p) {
		    int[] protectedItem = new int[2];
		    protectedItem[0] = -1;

            foreach (Item item in p.getInventory().getItems()) {
                if(item.getItemId() == -1) continue;
                int price = item.getDefinition().getPrice().getMaximumPrice();
                if ((price > ItemData.forId(protectedItem[0]).getPrice().getMaximumPrice()))
                {
                    protectedItem[0] = item.getItemId();
				    protectedItem[1] = INVENTORY;
			    }
		    }

            foreach(Item item in p.getEquipment().getEquipment()) {
                if (item.getItemId() == -1) continue;
                int price = item.getDefinition().getPrice().getMaximumPrice();
                if (price > ItemData.forId(protectedItem[0]).getPrice().getMaximumPrice())
                {
                    protectedItem[0] = item.getItemId();
				    protectedItem[1] = EQUIPMENT;
			    }
            }
		    return protectedItem;
	    }
	
	    public static int[] getProtectedItem2(Player p) {
		    int[] protectedItem = new int[2];
		    protectedItem[0] = -1;
		    int[] protectedItem1 = getProtectedItem1(p);
		    bool save;

            foreach (Item item in p.getInventory().getItems())
            {
                if (item.getItemId() == -1) continue;
                int amt = item.getItemAmount();
                int price = item.getDefinition().getPrice().getMaximumPrice();

                if (price > ItemData.forId(protectedItem[0]).getPrice().getMaximumPrice())
                {
                    save = true;
                    if (protectedItem1[1] == INVENTORY)
                    {
                        if (protectedItem1[0] == item.getItemId())
                        {
                            if (amt < 2)
                            {
                                save = false;
                            }
                        }
                    }
                    if (save)
                    {
                        protectedItem[0] = item.getItemId();
                        protectedItem[1] = INVENTORY;
                    }
                }
            }

            foreach (Item item in p.getEquipment().getEquipment())
            {
                if (item.getItemId() == -1) continue;
                int price = item.getDefinition().getPrice().getMaximumPrice();
                int amt = item.getItemAmount();
                if (price > ItemData.forId(protectedItem[0]).getPrice().getMaximumPrice())
                {
                    save = true;
                    if (protectedItem1[1] == EQUIPMENT)
                    {
                        if (protectedItem1[0] == item.getItemId())
                        {
                            if (amt < 2)
                            {
                                save = false;
                            }
                        }
                    }
                    if (save)
                    {
                        protectedItem[0] = item.getItemId();
                        protectedItem[1] = EQUIPMENT;
                    }
                }
            }

		    return protectedItem;
	    }
	
	    public static int[] getProtectedItem3(Player p) {
		    int[] protectedItem = new int[2];
		    protectedItem[0] = -1;
		    int[] protectedItem1 = getProtectedItem1(p);
		    int[] protectedItem2 = getProtectedItem2(p);
		    bool save;

            foreach (Item item in p.getInventory().getItems()) {
                if (item.getItemId() == -1) continue;
                int amt = item.getItemAmount();
                int price = item.getDefinition().getPrice().getMaximumPrice();
                if (price > ItemData.forId(protectedItem[0]).getPrice().getMaximumPrice())
                {
				    save = true;
				    if (protectedItem1[1] == INVENTORY) {
                        if (protectedItem1[0] == item.getItemId())
                        {
						    if (amt < 2) {
							    save = false;
						    }
					    }
				    }
				    if (protectedItem2[1] == INVENTORY) {
                        if (protectedItem2[0] == item.getItemId())
                        {
						    if (amt < 2) {
							    save = false;
						    }
					    }
				    }
				    if (protectedItem1[1] == INVENTORY && protectedItem2[1] == INVENTORY) {
                        if (protectedItem1[0] == item.getItemId() && protectedItem2[0] == item.getItemId())
                        {
						    if (amt < 3) {
							    save = false;
						    }
					    }
				    }

				    if (save) {
                        protectedItem[0] = item.getItemId();
					    protectedItem[1] = INVENTORY;
				    }
			    }
		    }

            foreach (Item item in p.getEquipment().getEquipment()) {
                if (item.getItemId() == -1) continue;
                int price = item.getDefinition().getPrice().getMaximumPrice();
                int amt = item.getItemAmount();
                if (price > ItemData.forId(protectedItem[0]).getPrice().getMaximumPrice())
                {
				    save = true;
				    if (protectedItem1[1] == EQUIPMENT) {
                        if (protectedItem1[0] == item.getItemId())
                        {
						    if (amt < 2) {
							    save = false;
						    }
					    }
				    }
				    if (protectedItem2[1] == EQUIPMENT) {
                        if (protectedItem2[0] == item.getItemId())
                        {
						    if (amt < 2) {
							    save = false;
						    }
					    }
				    }
				    if (protectedItem1[1] == EQUIPMENT && protectedItem2[1] == EQUIPMENT) {
                        if (protectedItem1[0] == item.getItemId() && protectedItem2[0] == item.getItemId())
                        {
						    if (amt < 3) {
							    save = false;
						    }
					    }
				    }
				    if (save) {
                        protectedItem[0] = item.getItemId();
					    protectedItem[1] = EQUIPMENT;
				    }
			    }
		    }
		    return protectedItem;
	    }
	
	    public static int[] getProtectedItem4(Player p) {
		    int[] protectedItem = new int[2];
		    protectedItem[0] = -1;
		    int[] protectedItem1 = getProtectedItem1(p);
		    int[] protectedItem2 = getProtectedItem2(p);
		    int[] protectedItem3 = getProtectedItem3(p);
		    bool save;

            foreach (Item item in p.getInventory().getItems())
            {
                if (item.getItemId() == -1) continue;
                int amt = item.getItemAmount();
                int price = item.getDefinition().getPrice().getMaximumPrice();
                if (price > ItemData.forId(protectedItem[0]).getPrice().getMaximumPrice())
                {
				    save = true;
                    if (protectedItem1[0] == item.getItemId() && protectedItem1[1] == INVENTORY)
                    {
					    if (amt < 2) {
						    save = false;
					    }
				    }
                    if (protectedItem2[0] == item.getItemId() && protectedItem2[1] == INVENTORY)
                    {
					    if (amt < 2) {
						    save = false;
					    }
				    }
                    if (protectedItem3[0] == item.getItemId() && protectedItem3[1] == INVENTORY)
                    {
					    if (amt < 2) {
						    save = false;
					    }
				    }
				    if (amt == 2) {
					    int[][] array = {protectedItem1, protectedItem2, protectedItem3};
					    int k = 0;
					    for (int j = 0; j < array.Length; j++) {
                            if (array[j][0] == item.getItemId() && array[j][1] == INVENTORY)
                            {
							    k++;
						    }
					    }
					    if (k >= 2) {
						    save = false;
					    }
				    }
				    if (protectedItem1[1] == INVENTORY && protectedItem2[1] == INVENTORY && protectedItem3[1] == INVENTORY) {
                        if (protectedItem1[0] == item.getItemId() && protectedItem2[0] == item.getItemId() && protectedItem3[0] == item.getItemId())
                        {
						    if (amt < 4) {
							    save = false;
						    }
					    }
				    }
				    if (save) {
                        protectedItem[0] = item.getItemId();
					    protectedItem[1] = INVENTORY;
				    }
			    }
		    }

            foreach (Item item in p.getEquipment().getEquipment())
            {
                if (item.getItemId() == -1) continue;
                int price = item.getDefinition().getPrice().getMaximumPrice();
                int amt = item.getItemAmount();
                if (price > ItemData.forId(protectedItem[0]).getPrice().getMaximumPrice())
                {
				    save = true;
                    if (protectedItem1[0] == item.getItemId() && protectedItem1[1] == EQUIPMENT)
                    {
					    if (amt < 2) {
						    save = false;
					    }
				    }
                    if (protectedItem2[0] == item.getItemId() && protectedItem2[1] == EQUIPMENT)
                    {
					    if (amt < 2) {
						    save = false;
					    }
				    }
                    if (protectedItem3[0] == item.getItemId() && protectedItem3[1] == EQUIPMENT)
                    {
					    if (amt < 2) {
						    save = false;
					    }
				    }
				    if (amt == 2) {
					    int[][] array = {protectedItem1, protectedItem2, protectedItem3};
					    int k = 0;
					    for (int j = 0; j < array.Length; j++) {
                            if (array[j][0] == item.getItemId() && array[j][1] == EQUIPMENT)
                            {
							    k++;
						    }
					    }
					    if (k >= 2) {
						    save = false;
					    }
				    }
				    if (protectedItem1[1] == EQUIPMENT && protectedItem2[1] == EQUIPMENT && protectedItem3[1] == EQUIPMENT) {
                        if (protectedItem1[0] == item.getItemId() && protectedItem2[0] == item.getItemId() && protectedItem3[0] == item.getItemId())
                        {
						    if (amt < 4) {
							    save = false;
						    }
					    }
				    }
				    if (save) {
                        protectedItem[0] = item.getItemId();
					    protectedItem[1] = EQUIPMENT;
				    }
			    }
		    }
		    return protectedItem;
	    }
	
	    public static void displayItemsInterface(Player p) {
		    int amountToKeep = p.isSkulled() ? 0 : 3;
		    if (p.getPrayers().isProtectItem()) {
			    amountToKeep = p.isSkulled() ? 1 : 4;
		    }
		    int item1 = getProtectedItem1(p)[0];
		    int item2 = getProtectedItem2(p)[0];
		    int item3 = getProtectedItem3(p)[0];
		    int item4 = amountToKeep == 4 ? getProtectedItem4(p)[0] : -1;
		    if (amountToKeep == 1) {
			    item2 = 65535;
			    item3 = 65535;
			    item3 = item1;
		    }
		    if (amountToKeep == 0) {
			    item1 = 65535;
			    item2 = 65535;
			    item3 = 65535;
			    item4 = 65535;
		    }
		    object[] opts = new object[]{17598720, 20221838, "You're marked with a <col=ff3333>skull<col=ff981f>.", 0, 1, item4, item1, item2, item3, /* Items to keep */ amountToKeep /* Items to keep */, 0};
		    p.getPackets().displayInterface(102);
            p.getPackets().sendClientScript(118, opts, "iiooooiisii");
            p.getPackets().setRightClickOptions(1278, (102 * 65536) + 21, 0, 40);
            p.getPackets().setRightClickOptions(1278, (102 * 65536) + 18, 0, 4);
	    }
    }
}
