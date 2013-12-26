using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using RunescapeServer.events;
using RunescapeServer.model;

namespace RunescapeServer.player.skills.prayer
{
    class Prayer : PrayerData
    {
        public static bool wantToBury(Player p, int item, int slot) {
	        for (int i = 0; i < BONES.Length; i++) {
		        if (item == BONES[i]) {
			        buryBone(p, i, slot);
			        return true;
		        }
	        }
	        return false;
        }

        private static void buryBone(Player p, int i, int slot) {
	        long lastBury = 0;
	        if (p.getTemporaryAttribute("lastBury") != null) {
		        lastBury = (int) p.getTemporaryAttribute("lastBury");
	        }
	        if (Environment.TickCount - lastBury < 400) {
		        return;
	        }

            p.getWalkingQueue().resetWalkingQueue();
	        p.getPackets().clearMapFlag();
	        p.getPackets().sendMessage("You dig a hole in the ground...");
	        p.setLastAnimation(new Animation(BURY_ANIMATION));
            Event buryBoneEvent = new Event(300);
            buryBoneEvent.setAction(() => {
		        buryBoneEvent.stop();
		        if (p.getInventory().deleteItem(BONES[i], slot, 1)) {
			        p.getSkills().addXp(Skills.SKILL.PRAYER, BURY_XP[i]);
			        p.setTemporaryAttribute("lastBury", Environment.TickCount);
			        p.getPackets().sendMessage("You bury the bones.");
		        }
	        });
            Server.registerEvent(buryBoneEvent);
        }

	    public static bool canUsePrayer(Player p, int id) {
		    if (id < 5 || id > 57) {
			    return false;
		    }
            if (p.getSkills().getCurLevel(Skills.SKILL.PRAYER) <= 0)
            {
			    return false;
		    }
		    int j = 0;
		    for (int i = 5 ; i <= 57; i += 2) {
			    if (id == i) {
				    if (i == 53) {
					    p.getPackets().softCloseInterfaces();
					    p.getPackets().modifyText("This prayer is currently unavailable.", 210, 1);
					    p.getPackets().sendChatboxInterface(210);
					    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_SUMMONING], 0);
					    continue;
				    }
                    if (p.getSkills().getGreaterLevel(Skills.SKILL.PRAYER) < PRAYER_LVL[j])
                    {
					    p.getPackets().softCloseInterfaces();
					    p.getPackets().modifyText("You need level " + PRAYER_LVL[j] + " Prayer to use " + PRAYER_NAME[j] + ".", 210, 1);
					    p.getPackets().sendChatboxInterface(210);
					    return false;
				    }
			    }
			    j++;
		    }
		    return true;
	    }
	
	    public static void deactivateAllPrayers(Player p) {
		    p.getPrayers().setPrayerDrain(0.0);
		    p.getPrayers().setSuperPrayer(0);
		    p.getPrayers().setAttackPrayer(0);
		    p.getPrayers().setDefencePrayer(0);
		    p.getPrayers().setStrengthPrayer(0);
		    p.getPrayers().setRangePrayer(0);
		    p.getPrayers().setMagicPrayer(0);
		    p.getPrayers().setOverheadPrayer(0);
		    p.getPrayers().setHeadIcon(PrayerHeadIcon.NOTHING);
		    p.getPrayers().setProtectItem(false);
		    p.getPrayers().setRapidRestore(false);
		    p.getPrayers().setRapidHeal(false);
            //TODO: figure out why it sends the same sendConfig 3 times for the same prayers LOL.
            //TODO: Uncomment this loop after?
            //This loop below would unset all those prayer config's without doing them 3 times and less code.
            /*foreach (int prayerConfigId in PRAYER_CONFIG)
            {
                p.getPackets().sendConfig(prayerConfigId, 0);
            }*/


		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.RAPID_RESTORE], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.RAPID_HEAL], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_ITEM], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.THICK_SKIN], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ROCK_SKIN], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.STEEL_SKIN], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.BURST_OF_STRENGTH], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SUPERHUMAN_STRENGTH], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ULTIMATE_STRENGTH], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CLARITY_OF_THOUGHT], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.IMPROVED_REFLEXES], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.INCREDIBLE_REFLEXES], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SHARP_EYE], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.EAGLE_EYE], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.HAWK_EYE], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_WILL], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_LORE], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_MIGHT], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_RANGED], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_MELEE], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.RETRIBUTION], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.REDEMPTION], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SMITE], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_MAGIC], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.BURST_OF_STRENGTH], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SUPERHUMAN_STRENGTH], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ULTIMATE_STRENGTH], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CLARITY_OF_THOUGHT], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.IMPROVED_REFLEXES], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.INCREDIBLE_REFLEXES], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.HAWK_EYE], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.EAGLE_EYE], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_WILL], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_LORE], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_MIGHT], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SHARP_EYE], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.BURST_OF_STRENGTH], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SUPERHUMAN_STRENGTH], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ULTIMATE_STRENGTH], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CLARITY_OF_THOUGHT], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.IMPROVED_REFLEXES], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.INCREDIBLE_REFLEXES], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SHARP_EYE], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.HAWK_EYE], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.EAGLE_EYE], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_LORE], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_MIGHT], 0);
		    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_WILL], 0);

            foreach (Prayer prayer in Enum.GetValues(typeof(Prayer))) {
			    p.getPrayers().setPrayerActive(prayer, false);
		    }
	    }
	
	    public static void startPrayerDrainEvent(Player p) {
            Event prayerDrainEvent = new Event(600);
            prayerDrainEvent.setAction(() => {
			    if (p == null || p.isDead() || !isPrayerActive(p)) {
                    prayerDrainEvent.stop();
				    return;
			    }
			    double amountDrain = 0.0;
                foreach (Prayer prayer in Enum.GetValues(typeof(Prayer)))
                {
				    if(p.getPrayers().isPrayerActive(prayer)) {
					    double drain = DRAIN_RATE[(int)prayer];
					    double bonus = (0.035 * p.getEquipment().getBonus(Equipment.BONUS.PRAYER));
					    drain = drain * (1 + bonus);
					    drain = 0.6 / drain;
					    amountDrain += drain;
				    }
			    }
			    p.decreasePrayerPoints(amountDrain);
			    if(p.getSkills().getCurLevel(Skills.SKILL.PRAYER) <= 0)
                    prayerDrainEvent.stop();
		    });
            Server.registerEvent(prayerDrainEvent);
	    }

	    protected static bool isPrayerActive(Player p) {
            foreach (Prayer prayer in Enum.GetValues(typeof(Prayer))) {
                if (p.getPrayers().isPrayerActive(prayer))
				    return true;
		    }
		    return false;
	    }

        /**
         * This is used for SpecialAttack Dragon Scimitar
         * Which turns of certain Prayer to be forced off.
         * Can be used for other things in the future.
         */
        public static void forcePrayerOff(Player p, Prayer prayer)
        {
            if (p.getPrayers().isPrayerActive(prayer))
            {
                switch (prayer)
                {
                    case Prayer.THICK_SKIN: // thick skin
                        p.getPrayers().setDefencePrayer(0);
                        break;
                    case Prayer.ROCK_SKIN: // rock skin
                        p.getPrayers().setDefencePrayer(0);
                        break;
                    case Prayer.STEEL_SKIN: // steel skin
                        p.getPrayers().setDefencePrayer(0);
                        break;
                    case Prayer.BURST_OF_STRENGTH: // burst of strength
                        p.getPrayers().setStrengthPrayer(0);
                        break;
                    case Prayer.SUPERHUMAN_STRENGTH: // superhuman strength
                        p.getPrayers().setStrengthPrayer(0);
                        break;
                    case Prayer.ULTIMATE_STRENGTH: // ultimate strength
                        p.getPrayers().setStrengthPrayer(0);
                        break;
                    case Prayer.CLARITY_OF_THOUGHT: // clarity of thought
                        p.getPrayers().setAttackPrayer(0);
                        break;
                    case Prayer.IMPROVED_REFLEXES: // improved reflexes
                        p.getPrayers().setAttackPrayer(0);
                        break;
                    case Prayer.INCREDIBLE_REFLEXES: // incredible reflexes
                        p.getPrayers().setAttackPrayer(0);
                        break;
                    case Prayer.PROTECT_FROM_MAGIC: // Magic protect
                        p.getPrayers().setOverheadPrayer(0);
                        p.getPrayers().setHeadIcon(PrayerHeadIcon.NOTHING);
                        break;
                    case Prayer.PROTECT_FROM_RANGED: // Ranged protect
                        p.getPrayers().setOverheadPrayer(0);
                        p.getPrayers().setHeadIcon(PrayerHeadIcon.NOTHING);
                        break;
                    case Prayer.PROTECT_FROM_MELEE: // Melee protect
                        p.getPrayers().setOverheadPrayer(0);
                        p.getPrayers().setHeadIcon(PrayerHeadIcon.NOTHING);
                        break;
                    case Prayer.RETRIBUTION: // Retribution
                        p.getPrayers().setOverheadPrayer(0);
                        p.getPrayers().setHeadIcon(PrayerHeadIcon.NOTHING);
                        break;
                    case Prayer.REDEMPTION: // Redemption
                        p.getPrayers().setOverheadPrayer(0);
                        p.getPrayers().setHeadIcon(PrayerHeadIcon.NOTHING);
                        break;
                    case Prayer.SMITE: // Smite
                        p.getPrayers().setOverheadPrayer(0);
                        p.getPrayers().setHeadIcon(PrayerHeadIcon.NOTHING);
                        break;
                    case Prayer.CHIVALRY: // Chivalry
                        p.getPrayers().setSuperPrayer(0);
                        break;
                    case Prayer.PIETY: // Piety
                        p.getPrayers().setSuperPrayer(0);
                        break;
                    case Prayer.PROTECT_ITEM:
                        p.getPrayers().setProtectItem(false);
                        break;
                    case Prayer.RAPID_RESTORE: // Rapid restore.
                        p.getPrayers().setRapidRestore(false);
                        break;
                    case Prayer.RAPID_HEAL: // Rapid heal.
                        p.getPrayers().setRapidHeal(false);
                        break;
                    case Prayer.SHARP_EYE: // Sharp Eye.
                        p.getPrayers().setRangePrayer(0);
                        break;
                    case Prayer.HAWK_EYE: // Hawk Eye.
                        p.getPrayers().setRangePrayer(0);
                        break;
                    case Prayer.EAGLE_EYE: // Eagle Eye.
                        p.getPrayers().setRangePrayer(0);
                        break;
                    case Prayer.MYSTIC_WILL: // Mystic Will.
                        p.getPrayers().setMagicPrayer(0);
                        break;
                    case Prayer.MYSTIC_LORE: // Mystic Lore.
                        p.getPrayers().setMagicPrayer(0);
                        break;
                    case Prayer.MYSTIC_MIGHT: // Mystic Might.
                        p.getPrayers().setMagicPrayer(0);
                        break;
                }
                p.getPrayers().setPrayerActive(prayer, false);
                p.getPackets().sendConfig(PrayerData.PRAYER_CONFIG[(int)prayer], 0);
            }
        }

	    public static void togglePrayer(Player p, Prayer prayer) {
		    if (p.isDead()) {
			    return;
		    }
            if (p.getSkills().getCurLevel(Skills.SKILL.PRAYER) <= 0)
            {
			    deactivateAllPrayers(p);
			    return;
		    }
		    p.getPackets().softCloseInterfaces();
		    bool usingPrayer = isPrayerActive(p);
			switch(prayer) {
				    case Prayer.THICK_SKIN: // thick skin
					    if (p.getPrayers().getDefencePrayer() != 1) {
						    p.getPrayers().setDefencePrayer(1);
						    p.getPrayers().setSuperPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ROCK_SKIN], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.STEEL_SKIN], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
                            p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.THICK_SKIN], 1);
						    p.getPrayers().setPrayerActive(Prayer.THICK_SKIN, true); // thick skin
						    p.getPrayers().setPrayerActive(Prayer.ROCK_SKIN, false); // rock skin
						    p.getPrayers().setPrayerActive(Prayer.STEEL_SKIN, false); // steel skin
						    p.getPrayers().setPrayerActive(Prayer.CHIVALRY, false); // chivalry
						    p.getPrayers().setPrayerActive(Prayer.PIETY, false); // piety
					    } else if (p.getPrayers().getDefencePrayer() == 1) {
						    p.getPrayers().setDefencePrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.THICK_SKIN], 0);
						    p.getPrayers().setPrayerActive(Prayer.THICK_SKIN, false);
					    }
					    break;
				    case Prayer.ROCK_SKIN: // rock skin
					    if (p.getPrayers().getDefencePrayer() != 2) {
						    p.getPrayers().setDefencePrayer(2);
						    p.getPrayers().setSuperPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.THICK_SKIN], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.STEEL_SKIN], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
                            p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ROCK_SKIN], 1);
						    p.getPrayers().setPrayerActive(Prayer.THICK_SKIN, false); // thick skin
						    p.getPrayers().setPrayerActive(Prayer.ROCK_SKIN, true); // rock skin
						    p.getPrayers().setPrayerActive(Prayer.STEEL_SKIN, false); // steel skin
						    p.getPrayers().setPrayerActive(Prayer.CHIVALRY, false); // chivalry
						    p.getPrayers().setPrayerActive(Prayer.PIETY, false); // piety
                        } else if (p.getPrayers().getDefencePrayer() == 2) {
						    p.getPrayers().setDefencePrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ROCK_SKIN], 0);
						    p.getPrayers().setPrayerActive(Prayer.ROCK_SKIN, false);
					    }
					    break;
				    case Prayer.STEEL_SKIN: // steel skin
					    if (p.getPrayers().getDefencePrayer() != 3) {
						    p.getPrayers().setDefencePrayer(3);
						    p.getPrayers().setSuperPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.THICK_SKIN], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ROCK_SKIN], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
                            p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.STEEL_SKIN], 1);
						    p.getPrayers().setPrayerActive(Prayer.THICK_SKIN, false); // thick skin
						    p.getPrayers().setPrayerActive(Prayer.ROCK_SKIN, false); // rock skin
						    p.getPrayers().setPrayerActive(Prayer.STEEL_SKIN, true); // steel skin
						    p.getPrayers().setPrayerActive(Prayer.CHIVALRY, false); // chivalry
						    p.getPrayers().setPrayerActive(Prayer.PIETY, false); // piety
					    } else if (p.getPrayers().getDefencePrayer() == 3) {
						    p.getPrayers().setDefencePrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.STEEL_SKIN], 0);
						    p.getPrayers().setPrayerActive(Prayer.STEEL_SKIN, false);
					    }
					    break;
				    case Prayer.BURST_OF_STRENGTH: // burst of strength
					    if (p.getPrayers().getStrengthPrayer() != 1) {
						    p.getPrayers().setStrengthPrayer(1);
						    p.getPrayers().setSuperPrayer(0);
						    p.getPrayers().setRangePrayer(0);
						    p.getPrayers().setMagicPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SUPERHUMAN_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ULTIMATE_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SHARP_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.EAGLE_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.HAWK_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_WILL], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_LORE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_MIGHT], 0);
                            p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.BURST_OF_STRENGTH], 1);
						    p.getPrayers().setPrayerActive(Prayer.BURST_OF_STRENGTH, true); // burst of strength
						    p.getPrayers().setPrayerActive(Prayer.SUPERHUMAN_STRENGTH, false); // superhuman strength
						    p.getPrayers().setPrayerActive(Prayer.ULTIMATE_STRENGTH, false); // ultimate strength
						    p.getPrayers().setPrayerActive(Prayer.CHIVALRY, false); // chivalry
						    p.getPrayers().setPrayerActive(Prayer.PIETY, false); // piety
						    p.getPrayers().setPrayerActive(Prayer.SHARP_EYE, false); // sharp eye
						    p.getPrayers().setPrayerActive(Prayer.HAWK_EYE, false); // hawk eye
						    p.getPrayers().setPrayerActive(Prayer.EAGLE_EYE, false); // eagle eye
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_WILL, false); // mystic will
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_LORE, false); // mystic lore
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_MIGHT, false); // mystic might
					    } else if (p.getPrayers().getStrengthPrayer() == 1) {
						    p.getPrayers().setStrengthPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.BURST_OF_STRENGTH], 0);
						    p.getPrayers().setPrayerActive(Prayer.BURST_OF_STRENGTH, false);
					    }
					    break;
				    case Prayer.SUPERHUMAN_STRENGTH: // superhuman strength
					    if (p.getPrayers().getStrengthPrayer() != 2) {
						    p.getPrayers().setStrengthPrayer(2);
						    p.getPrayers().setSuperPrayer(0);
						    p.getPrayers().setRangePrayer(0);
						    p.getPrayers().setMagicPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.BURST_OF_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ULTIMATE_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SHARP_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.EAGLE_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.HAWK_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_WILL], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_LORE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_MIGHT], 0);
                            p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SUPERHUMAN_STRENGTH], 1);
						    p.getPrayers().setPrayerActive(Prayer.BURST_OF_STRENGTH, false); // burst of strength
						    p.getPrayers().setPrayerActive(Prayer.SUPERHUMAN_STRENGTH, true); // superhuman strength
						    p.getPrayers().setPrayerActive(Prayer.ULTIMATE_STRENGTH, false); // ultimate strength
						    p.getPrayers().setPrayerActive(Prayer.CHIVALRY, false); // chivalry
						    p.getPrayers().setPrayerActive(Prayer.PIETY, false); // piety
						    p.getPrayers().setPrayerActive(Prayer.SHARP_EYE, false); // sharp eye
						    p.getPrayers().setPrayerActive(Prayer.HAWK_EYE, false); // hawk eye
						    p.getPrayers().setPrayerActive(Prayer.EAGLE_EYE, false); // eagle eye
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_WILL, false); // mystic will
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_LORE, false); // mystic lore
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_MIGHT, false); // mystic might
					    } else if (p.getPrayers().getStrengthPrayer() == 2) {
						    p.getPrayers().setStrengthPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SUPERHUMAN_STRENGTH], 0);
						    p.getPrayers().setPrayerActive(Prayer.SUPERHUMAN_STRENGTH, false);
					    }
					    break;
				    case Prayer.ULTIMATE_STRENGTH: // ultimate strength
					    if (p.getPrayers().getStrengthPrayer() != 3) {
						    p.getPrayers().setStrengthPrayer(3);
						    p.getPrayers().setSuperPrayer(0);
						    p.getPrayers().setRangePrayer(0);
						    p.getPrayers().setMagicPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.BURST_OF_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SUPERHUMAN_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SHARP_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.EAGLE_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.HAWK_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_WILL], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_LORE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_MIGHT], 0);
                            p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ULTIMATE_STRENGTH], 1);
						    p.getPrayers().setPrayerActive(Prayer.BURST_OF_STRENGTH, false); // burst of strength
						    p.getPrayers().setPrayerActive(Prayer.SUPERHUMAN_STRENGTH, false); // superhuman strength
						    p.getPrayers().setPrayerActive(Prayer.ULTIMATE_STRENGTH, true); // ultimate strength
						    p.getPrayers().setPrayerActive(Prayer.CHIVALRY, false); // chivalry
						    p.getPrayers().setPrayerActive(Prayer.PIETY, false); // piety
						    p.getPrayers().setPrayerActive(Prayer.SHARP_EYE, false); // sharp eye
						    p.getPrayers().setPrayerActive(Prayer.HAWK_EYE, false); // hawk eye
						    p.getPrayers().setPrayerActive(Prayer.EAGLE_EYE, false); // eagle eye
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_WILL, false); // mystic will
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_LORE, false); // mystic lore
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_MIGHT, false); // mystic might
					    } else if (p.getPrayers().getStrengthPrayer() == 3) {
						    p.getPrayers().setStrengthPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ULTIMATE_STRENGTH], 0);
						    p.getPrayers().setPrayerActive(Prayer.ULTIMATE_STRENGTH, false);
					    }
					    break;
				    case Prayer.CLARITY_OF_THOUGHT: // clarity of thought
					    if (p.getPrayers().getAttackPrayer() != 1) {
						    p.getPrayers().setAttackPrayer(1);
						    p.getPrayers().setSuperPrayer(0);
						    p.getPrayers().setRangePrayer(0);
						    p.getPrayers().setMagicPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.IMPROVED_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.INCREDIBLE_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SHARP_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.EAGLE_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.HAWK_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_WILL], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_LORE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_MIGHT], 0);
                            p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CLARITY_OF_THOUGHT], 1);
						    p.getPrayers().setPrayerActive(Prayer.CLARITY_OF_THOUGHT, true); // clarity of thought
						    p.getPrayers().setPrayerActive(Prayer.IMPROVED_REFLEXES, false); // improved reflexes
						    p.getPrayers().setPrayerActive(Prayer.INCREDIBLE_REFLEXES, false); // incredible reflexes
						    p.getPrayers().setPrayerActive(Prayer.CHIVALRY, false); // chivalry
						    p.getPrayers().setPrayerActive(Prayer.PIETY, false); // piety
						    p.getPrayers().setPrayerActive(Prayer.SHARP_EYE, false); // sharp eye
						    p.getPrayers().setPrayerActive(Prayer.HAWK_EYE, false); // hawk eye
						    p.getPrayers().setPrayerActive(Prayer.EAGLE_EYE, false); // eagle eye
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_WILL, false); // mystic will
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_LORE, false); // mystic lore
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_MIGHT, false); // mystic might
					    } else if (p.getPrayers().getAttackPrayer() == 1) {
						    p.getPrayers().setAttackPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CLARITY_OF_THOUGHT], 0);
						    p.getPrayers().setPrayerActive(Prayer.CLARITY_OF_THOUGHT, false);
					    }
					    break;
				    case Prayer.IMPROVED_REFLEXES: // improved reflexes
					    if (p.getPrayers().getAttackPrayer() != 2) {
						    p.getPrayers().setAttackPrayer(2);
						    p.getPrayers().setSuperPrayer(0);
						    p.getPrayers().setRangePrayer(0);
						    p.getPrayers().setMagicPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CLARITY_OF_THOUGHT], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.INCREDIBLE_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SHARP_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.EAGLE_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.HAWK_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_WILL], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_LORE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_MIGHT], 0);
                            p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.IMPROVED_REFLEXES], 1);
						    p.getPrayers().setPrayerActive(Prayer.CLARITY_OF_THOUGHT, false); // clarity of thought
						    p.getPrayers().setPrayerActive(Prayer.IMPROVED_REFLEXES, true); // improved reflexes
						    p.getPrayers().setPrayerActive(Prayer.INCREDIBLE_REFLEXES, false); // incredible reflexes
						    p.getPrayers().setPrayerActive(Prayer.CHIVALRY, false); // chivalry
						    p.getPrayers().setPrayerActive(Prayer.PIETY, false); // piety
						    p.getPrayers().setPrayerActive(Prayer.SHARP_EYE, false); // sharp eye
						    p.getPrayers().setPrayerActive(Prayer.HAWK_EYE, false); // hawk eye
						    p.getPrayers().setPrayerActive(Prayer.EAGLE_EYE, false); // eagle eye
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_WILL, false); // mystic will
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_LORE, false); // mystic lore
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_MIGHT, false); // mystic might
					    } else if (p.getPrayers().getAttackPrayer() == 2) {
						    p.getPrayers().setAttackPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.IMPROVED_REFLEXES], 0);
						    p.getPrayers().setPrayerActive(Prayer.IMPROVED_REFLEXES, false);
					    }
					    break;
				    case Prayer.INCREDIBLE_REFLEXES: // incredible reflexes
					    if (p.getPrayers().getAttackPrayer() != 3) {
						    p.getPrayers().setAttackPrayer(3);
						    p.getPrayers().setSuperPrayer(0);
						    p.getPrayers().setRangePrayer(0);
						    p.getPrayers().setMagicPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CLARITY_OF_THOUGHT], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.IMPROVED_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SHARP_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.EAGLE_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.HAWK_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_WILL], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_LORE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_MIGHT], 0);
                            p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.INCREDIBLE_REFLEXES], 1);
						    p.getPrayers().setPrayerActive(Prayer.CLARITY_OF_THOUGHT, false); // clarity of thought
						    p.getPrayers().setPrayerActive(Prayer.IMPROVED_REFLEXES, false); // improved reflexes
						    p.getPrayers().setPrayerActive(Prayer.INCREDIBLE_REFLEXES, true); // incredible reflexes
						    p.getPrayers().setPrayerActive(Prayer.CHIVALRY, false); // chivalry
						    p.getPrayers().setPrayerActive(Prayer.PIETY, false); // piety
						    p.getPrayers().setPrayerActive(Prayer.SHARP_EYE, false); // sharp eye
						    p.getPrayers().setPrayerActive(Prayer.HAWK_EYE, false); // hawk eye
						    p.getPrayers().setPrayerActive(Prayer.EAGLE_EYE, false); // eagle eye
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_WILL, false); // mystic will
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_LORE, false); // mystic lore
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_MIGHT, false); // mystic might
					    } else if (p.getPrayers().getAttackPrayer() == 3) {
						    p.getPrayers().setAttackPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.INCREDIBLE_REFLEXES], 0);
						    p.getPrayers().setPrayerActive(Prayer.INCREDIBLE_REFLEXES, false);
					    }
					    break;
				    case Prayer.PROTECT_FROM_MAGIC: // Magic protect
					    if (p.getPrayers().getOverheadPrayer() != 1) {
						    p.getPrayers().setOverheadPrayer(1);
						    p.getPrayers().setHeadIcon(PrayerHeadIcon.MAGIC);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_RANGED], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_MELEE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.RETRIBUTION], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.REDEMPTION], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SMITE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_MAGIC], 1);
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_MAGIC, true); // magic protect
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_RANGED, false); // range protect
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_MELEE, false); // melee protect
						    p.getPrayers().setPrayerActive(Prayer.RETRIBUTION, false); // retribution
						    p.getPrayers().setPrayerActive(Prayer.REDEMPTION, false); // redemption
						    p.getPrayers().setPrayerActive(Prayer.SMITE, false); // smite
					    } else if (p.getPrayers().getOverheadPrayer() == 1) {
						    p.getPrayers().setOverheadPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_MAGIC], 0);
						    p.getPrayers().setHeadIcon(PrayerHeadIcon.NOTHING);
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_MAGIC, false);
					    }
					    break;
				    case Prayer.PROTECT_FROM_RANGED: // Ranged protect
					    if (p.getPrayers().getOverheadPrayer() != 2) {
						    p.getPrayers().setOverheadPrayer(2);
						    p.getPrayers().setHeadIcon(PrayerHeadIcon.RANGE);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_MAGIC], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_MELEE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.RETRIBUTION], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.REDEMPTION], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SMITE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_RANGED], 1);
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_MAGIC, false); // magic protect
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_RANGED, true); // range protect
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_MELEE, false); // melee protect
						    p.getPrayers().setPrayerActive(Prayer.RETRIBUTION, false); // retribution
						    p.getPrayers().setPrayerActive(Prayer.REDEMPTION, false); // redemption
						    p.getPrayers().setPrayerActive(Prayer.SMITE, false); // smite
					    } else if (p.getPrayers().getOverheadPrayer() == 2) {
						    p.getPrayers().setOverheadPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_RANGED], 0);
						    p.getPrayers().setHeadIcon(PrayerHeadIcon.NOTHING);
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_RANGED, false);
					    }
					    break;
				    case Prayer.PROTECT_FROM_MELEE: // Melee protect
					    if (p.getPrayers().getOverheadPrayer() != 3) {
						    p.getPrayers().setOverheadPrayer(3);
						    p.getPrayers().setHeadIcon(PrayerHeadIcon.MELEE);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_MAGIC], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_RANGED], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.RETRIBUTION], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.REDEMPTION], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SMITE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_MELEE], 1);
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_MAGIC, false); // magic protect
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_RANGED, false); // range protect
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_MELEE, true); // melee protect
						    p.getPrayers().setPrayerActive(Prayer.RETRIBUTION, false); // retribution
						    p.getPrayers().setPrayerActive(Prayer.REDEMPTION, false); // redemption
						    p.getPrayers().setPrayerActive(Prayer.SMITE, false); // smite
					    } else if (p.getPrayers().getOverheadPrayer() == 3) {
						    p.getPrayers().setOverheadPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_MELEE], 0);
						    p.getPrayers().setHeadIcon(PrayerHeadIcon.NOTHING);
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_MELEE, false);
					    }
					    break;
				    case Prayer.RETRIBUTION: // Retribution
					    if (p.getPrayers().getOverheadPrayer() != 4) {
						    p.getPrayers().setOverheadPrayer(4);
						    p.getPrayers().setHeadIcon(PrayerHeadIcon.RETRIBUTION);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_MAGIC], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_RANGED], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_MELEE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.REDEMPTION], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SMITE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.RETRIBUTION], 1);
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_MAGIC, false); // magic protect
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_RANGED, false); // range protect
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_MELEE, false); // melee protect
						    p.getPrayers().setPrayerActive(Prayer.RETRIBUTION, true); // retribution
						    p.getPrayers().setPrayerActive(Prayer.REDEMPTION, false); // redemption
						    p.getPrayers().setPrayerActive(Prayer.SMITE, false); // smite
					    } else if (p.getPrayers().getOverheadPrayer() == 4) {
						    p.getPrayers().setOverheadPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.RETRIBUTION], 0);
						    p.getPrayers().setHeadIcon(PrayerHeadIcon.NOTHING);
						    p.getPrayers().setPrayerActive(Prayer.RETRIBUTION, false);
					    }
					    break;
				    case Prayer.REDEMPTION: // Redemption
					    if (p.getPrayers().getOverheadPrayer() != 5) {
						    p.getPrayers().setOverheadPrayer(5);
						    p.getPrayers().setHeadIcon(PrayerHeadIcon.REDEMPTION);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_MAGIC], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_RANGED], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_MELEE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.RETRIBUTION], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SMITE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.REDEMPTION], 1);
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_MAGIC, false); // magic protect
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_RANGED, false); // range protect
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_MELEE, false); // melee protect
						    p.getPrayers().setPrayerActive(Prayer.RETRIBUTION, false); // retribution
						    p.getPrayers().setPrayerActive(Prayer.REDEMPTION, true); // redemption
						    p.getPrayers().setPrayerActive(Prayer.SMITE, false); // smite
					    } else if (p.getPrayers().getOverheadPrayer() == 5) {
						    p.getPrayers().setOverheadPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.REDEMPTION], 0);
						    p.getPrayers().setHeadIcon(PrayerHeadIcon.NOTHING);
						    p.getPrayers().setPrayerActive(Prayer.REDEMPTION, false);
					    }
					    break;
				    case Prayer.SMITE: // Smite
					    if (p.getPrayers().getOverheadPrayer() != 6) {
						    p.getPrayers().setOverheadPrayer(6);
						    p.getPrayers().setHeadIcon(PrayerHeadIcon.SMITE);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_MAGIC], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_RANGED], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_FROM_MELEE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.RETRIBUTION], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.REDEMPTION], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SMITE], 1);
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_MAGIC, false); // magic protect
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_RANGED, false); // range protect
						    p.getPrayers().setPrayerActive(Prayer.PROTECT_FROM_MELEE, false); // melee protect
						    p.getPrayers().setPrayerActive(Prayer.RETRIBUTION, false); // retribution
						    p.getPrayers().setPrayerActive(Prayer.REDEMPTION, false); // redemption
						    p.getPrayers().setPrayerActive(Prayer.SMITE, true); // smite
					    } else if (p.getPrayers().getOverheadPrayer() == 6) {
						    p.getPrayers().setOverheadPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SMITE], 0);
						    p.getPrayers().setHeadIcon(PrayerHeadIcon.NOTHING);
						    p.getPrayers().setPrayerActive(Prayer.SMITE, false);
					    }
					    break;
				    case Prayer.CHIVALRY: // Chivalry
					    if (p.getPrayers().getSuperPrayer() != 1) {
						    p.getPrayers().setSuperPrayer(1);
						    p.getPrayers().setAttackPrayer(0);
						    p.getPrayers().setDefencePrayer(0);
						    p.getPrayers().setStrengthPrayer(0);
						    p.getPrayers().setRangePrayer(0);
						    p.getPrayers().setMagicPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.THICK_SKIN], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ROCK_SKIN], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.STEEL_SKIN], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.BURST_OF_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SUPERHUMAN_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ULTIMATE_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CLARITY_OF_THOUGHT], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.IMPROVED_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.INCREDIBLE_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SHARP_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.EAGLE_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.HAWK_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_WILL], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_LORE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_MIGHT], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 1);
						    p.getPrayers().setPrayerActive(Prayer.CHIVALRY, true); // chivalry
						    p.getPrayers().setPrayerActive(Prayer.PIETY, false); // piety
						    p.getPrayers().setPrayerActive(Prayer.THICK_SKIN, false); // thick skin
						    p.getPrayers().setPrayerActive(Prayer.ROCK_SKIN, false); // rock skin
						    p.getPrayers().setPrayerActive(Prayer.STEEL_SKIN, false); // steel skin
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_WILL, false); // mystic will
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_LORE, false); // mystic lore
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_MIGHT, false); // mystic might
						    p.getPrayers().setPrayerActive(Prayer.CLARITY_OF_THOUGHT, false); // clarity of thought
						    p.getPrayers().setPrayerActive(Prayer.IMPROVED_REFLEXES, false); // improved reflexes
						    p.getPrayers().setPrayerActive(Prayer.INCREDIBLE_REFLEXES, false); // incredible reflexes
						    p.getPrayers().setPrayerActive(Prayer.BURST_OF_STRENGTH, false); // burst of strength
						    p.getPrayers().setPrayerActive(Prayer.SUPERHUMAN_STRENGTH, false); // superhuman strength
						    p.getPrayers().setPrayerActive(Prayer.ULTIMATE_STRENGTH, false); // ultimate strength
						    p.getPrayers().setPrayerActive(Prayer.SHARP_EYE, false); // sharp eye
						    p.getPrayers().setPrayerActive(Prayer.HAWK_EYE, false); // hawk eye
						    p.getPrayers().setPrayerActive(Prayer.EAGLE_EYE, false); // eagle eye
					    } else if (p.getPrayers().getSuperPrayer() == 1) {
						    p.getPrayers().setSuperPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
						    p.getPrayers().setPrayerActive(Prayer.CHIVALRY, false);
					    }
					    break;
				    case Prayer.PIETY: // Piety
					    if (p.getPrayers().getSuperPrayer() != 2) {
						    p.getPrayers().setSuperPrayer(2);
						    p.getPrayers().setAttackPrayer(0);
						    p.getPrayers().setDefencePrayer(0);
						    p.getPrayers().setStrengthPrayer(0);
						    p.getPrayers().setRangePrayer(0);
						    p.getPrayers().setMagicPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.THICK_SKIN], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ROCK_SKIN], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.STEEL_SKIN], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.BURST_OF_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SUPERHUMAN_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ULTIMATE_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CLARITY_OF_THOUGHT], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.IMPROVED_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.INCREDIBLE_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SHARP_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.EAGLE_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.HAWK_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_WILL], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_LORE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_MIGHT], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 1);
						    p.getPrayers().setPrayerActive(Prayer.CHIVALRY, false); // chivalry
						    p.getPrayers().setPrayerActive(Prayer.PIETY, true); // piety
						    p.getPrayers().setPrayerActive(Prayer.THICK_SKIN, false); // thick skin
						    p.getPrayers().setPrayerActive(Prayer.ROCK_SKIN, false); // rock skin
						    p.getPrayers().setPrayerActive(Prayer.STEEL_SKIN, false); // steel skin
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_WILL, false); // mystic will
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_LORE, false); // mystic lore
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_MIGHT, false); // mystic might
						    p.getPrayers().setPrayerActive(Prayer.CLARITY_OF_THOUGHT, false); // clarity of thought
						    p.getPrayers().setPrayerActive(Prayer.IMPROVED_REFLEXES, false); // improved reflexes
						    p.getPrayers().setPrayerActive(Prayer.INCREDIBLE_REFLEXES, false); // incredible reflexes
						    p.getPrayers().setPrayerActive(Prayer.BURST_OF_STRENGTH, false); // burst of strength
						    p.getPrayers().setPrayerActive(Prayer.SUPERHUMAN_STRENGTH, false); // superhuman strength
						    p.getPrayers().setPrayerActive(Prayer.ULTIMATE_STRENGTH, false); // ultimate strength
						    p.getPrayers().setPrayerActive(Prayer.SHARP_EYE, false); // sharp eye
						    p.getPrayers().setPrayerActive(Prayer.HAWK_EYE, false); // hawk eye
						    p.getPrayers().setPrayerActive(Prayer.EAGLE_EYE, false); // eagle eye
					    } else if (p.getPrayers().getSuperPrayer() == 2) {
						    p.getPrayers().setSuperPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
						    p.getPrayers().setPrayerActive(Prayer.PIETY, false);
					    }
					    break;
				    case Prayer.PROTECT_ITEM:
					    p.getPrayers().setProtectItem(!p.getPrayers().isProtectItem());
					    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PROTECT_ITEM], p.getPrayers().isProtectItem() ? 1 : 0);
					    p.getPrayers().setPrayerActive(Prayer.PROTECT_ITEM, p.getPrayers().isProtectItem());
					    break;
				    case Prayer.RAPID_RESTORE: // Rapid restore.
					    p.getPrayers().setRapidRestore(!p.getPrayers().isRapidRestore());
					    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.RAPID_RESTORE], p.getPrayers().isRapidRestore() ? 1 : 0);
					    p.getPrayers().setPrayerActive(Prayer.RAPID_RESTORE, p.getPrayers().isRapidRestore());
					    break;
				    case Prayer.RAPID_HEAL: // Rapid heal.
					    p.getPrayers().setRapidHeal(!p.getPrayers().isRapidHeal());
					    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.RAPID_HEAL], p.getPrayers().isRapidHeal() ? 1 : 0);
					    p.getPrayers().setPrayerActive(Prayer.RAPID_HEAL, p.getPrayers().isRapidRestore());
					    break;
				    case Prayer.SHARP_EYE: // Sharp Eye.
					    if (p.getPrayers().getRangePrayer() != 1) {
						    p.getPrayers().setRangePrayer(1);
						    p.getPrayers().setSuperPrayer(0);
						    p.getPrayers().setAttackPrayer(0);
						    p.getPrayers().setStrengthPrayer(0);
						    p.getPrayers().setMagicPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.BURST_OF_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SUPERHUMAN_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ULTIMATE_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CLARITY_OF_THOUGHT], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.IMPROVED_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.INCREDIBLE_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.HAWK_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.EAGLE_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_WILL], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_LORE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_MIGHT], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SHARP_EYE], 1);
						    p.getPrayers().setPrayerActive(Prayer.SHARP_EYE, true); // sharp eye
						    p.getPrayers().setPrayerActive(Prayer.HAWK_EYE, false); // hawk eye
						    p.getPrayers().setPrayerActive(Prayer.EAGLE_EYE, false); // eagle eye
						    p.getPrayers().setPrayerActive(Prayer.CHIVALRY, false); // chivalry
						    p.getPrayers().setPrayerActive(Prayer.PIETY, false); // piety
						    p.getPrayers().setPrayerActive(Prayer.CLARITY_OF_THOUGHT, false); // clarity of thought
						    p.getPrayers().setPrayerActive(Prayer.IMPROVED_REFLEXES, false); // improved reflexes
						    p.getPrayers().setPrayerActive(Prayer.INCREDIBLE_REFLEXES, false); // incredible reflexes
						    p.getPrayers().setPrayerActive(Prayer.BURST_OF_STRENGTH, false); // burst of strength
						    p.getPrayers().setPrayerActive(Prayer.SUPERHUMAN_STRENGTH, false); // superhuman strength
						    p.getPrayers().setPrayerActive(Prayer.ULTIMATE_STRENGTH, false); // ultimate strength
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_WILL, false); // mystic will
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_LORE, false); // mystic lore
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_MIGHT, false); // mystic might
					    } else if (p.getPrayers().getRangePrayer() == 1) {
						    p.getPrayers().setRangePrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SHARP_EYE], 0);
						    p.getPrayers().setPrayerActive(Prayer.SHARP_EYE, false);
					    }
					    break;
				    case Prayer.HAWK_EYE: // Hawk Eye.
					    if (p.getPrayers().getRangePrayer() != 2) {
						    p.getPrayers().setRangePrayer(2);
						    p.getPrayers().setSuperPrayer(0);
						    p.getPrayers().setAttackPrayer(0);
						    p.getPrayers().setStrengthPrayer(0);
						    p.getPrayers().setMagicPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.BURST_OF_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SUPERHUMAN_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ULTIMATE_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CLARITY_OF_THOUGHT], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.IMPROVED_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.INCREDIBLE_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SHARP_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.EAGLE_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_WILL], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_LORE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_MIGHT], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.HAWK_EYE], 1);
						    p.getPrayers().setPrayerActive(Prayer.SHARP_EYE, false); // sharp eye
						    p.getPrayers().setPrayerActive(Prayer.HAWK_EYE, true); // hawk eye
						    p.getPrayers().setPrayerActive(Prayer.EAGLE_EYE, false); // eagle eye
						    p.getPrayers().setPrayerActive(Prayer.CHIVALRY, false); // chivalry
						    p.getPrayers().setPrayerActive(Prayer.PIETY, false); // piety
						    p.getPrayers().setPrayerActive(Prayer.CLARITY_OF_THOUGHT, false); // clarity of thought
						    p.getPrayers().setPrayerActive(Prayer.IMPROVED_REFLEXES, false); // improved reflexes
						    p.getPrayers().setPrayerActive(Prayer.INCREDIBLE_REFLEXES, false); // incredible reflexes
						    p.getPrayers().setPrayerActive(Prayer.BURST_OF_STRENGTH, false); // burst of strength
						    p.getPrayers().setPrayerActive(Prayer.SUPERHUMAN_STRENGTH, false); // superhuman strength
						    p.getPrayers().setPrayerActive(Prayer.ULTIMATE_STRENGTH, false); // ultimate strength
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_WILL, false); // mystic will
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_LORE, false); // mystic lore
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_MIGHT, false); // mystic might
					    } else if (p.getPrayers().getRangePrayer() == 2) {
						    p.getPrayers().setRangePrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.HAWK_EYE], 0);
						    p.getPrayers().setPrayerActive(Prayer.HAWK_EYE, false);
					    }
					    break;
				    case Prayer.EAGLE_EYE: // Eagle Eye.
					    if (p.getPrayers().getRangePrayer() != 3) {
						    p.getPrayers().setRangePrayer(3);
						    p.getPrayers().setSuperPrayer(0);
						    p.getPrayers().setAttackPrayer(0);
						    p.getPrayers().setStrengthPrayer(0);
						    p.getPrayers().setMagicPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.BURST_OF_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SUPERHUMAN_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ULTIMATE_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CLARITY_OF_THOUGHT], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.IMPROVED_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.INCREDIBLE_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SHARP_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.HAWK_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_WILL], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_LORE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_MIGHT], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.EAGLE_EYE], 1);
						    p.getPrayers().setPrayerActive(Prayer.SHARP_EYE, false); // sharp eye
						    p.getPrayers().setPrayerActive(Prayer.HAWK_EYE, false); // hawk eye
						    p.getPrayers().setPrayerActive(Prayer.EAGLE_EYE, true); // eagle eye
						    p.getPrayers().setPrayerActive(Prayer.CHIVALRY, false); // chivalry
						    p.getPrayers().setPrayerActive(Prayer.PIETY, false); // piety
						    p.getPrayers().setPrayerActive(Prayer.CLARITY_OF_THOUGHT, false); // clarity of thought
						    p.getPrayers().setPrayerActive(Prayer.IMPROVED_REFLEXES, false); // improved reflexes
						    p.getPrayers().setPrayerActive(Prayer.INCREDIBLE_REFLEXES, false); // incredible reflexes
						    p.getPrayers().setPrayerActive(Prayer.BURST_OF_STRENGTH, false); // burst of strength
						    p.getPrayers().setPrayerActive(Prayer.SUPERHUMAN_STRENGTH, false); // superhuman strength
						    p.getPrayers().setPrayerActive(Prayer.ULTIMATE_STRENGTH, false); // ultimate strength
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_WILL, false); // mystic will
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_LORE, false); // mystic lore
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_MIGHT, false); // mystic might
					    } else if (p.getPrayers().getRangePrayer() == 3) {
						    p.getPrayers().setRangePrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.EAGLE_EYE], 0);
						    p.getPrayers().setPrayerActive(Prayer.EAGLE_EYE, false);
					    }
					    break;
				    case Prayer.MYSTIC_WILL: // Mystic Will.
					    if (p.getPrayers().getMagicPrayer() != 1) {
						    p.getPrayers().setMagicPrayer(1);
						    p.getPrayers().setSuperPrayer(0);
						    p.getPrayers().setAttackPrayer(0);
						    p.getPrayers().setStrengthPrayer(0);
						    p.getPrayers().setRangePrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.BURST_OF_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SUPERHUMAN_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ULTIMATE_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CLARITY_OF_THOUGHT], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.IMPROVED_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.INCREDIBLE_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SHARP_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.HAWK_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.EAGLE_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_LORE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_MIGHT], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_WILL], 1);
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_WILL, true); // mystic will
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_LORE, false); // mystic lore
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_MIGHT, false); // mystic might
						    p.getPrayers().setPrayerActive(Prayer.CHIVALRY, false); // chivalry
						    p.getPrayers().setPrayerActive(Prayer.PIETY, false); // piety
						    p.getPrayers().setPrayerActive(Prayer.CLARITY_OF_THOUGHT, false); // clarity of thought
						    p.getPrayers().setPrayerActive(Prayer.IMPROVED_REFLEXES, false); // improved reflexes
						    p.getPrayers().setPrayerActive(Prayer.INCREDIBLE_REFLEXES, false); // incredible reflexes
						    p.getPrayers().setPrayerActive(Prayer.BURST_OF_STRENGTH, false); // burst of strength
						    p.getPrayers().setPrayerActive(Prayer.SUPERHUMAN_STRENGTH, false); // superhuman strength
						    p.getPrayers().setPrayerActive(Prayer.ULTIMATE_STRENGTH, false); // ultimate strength
						    p.getPrayers().setPrayerActive(Prayer.SHARP_EYE, false); // sharp eye
						    p.getPrayers().setPrayerActive(Prayer.HAWK_EYE, false); // hawk eye
						    p.getPrayers().setPrayerActive(Prayer.EAGLE_EYE, false); // eagle eye
					    } else if (p.getPrayers().getMagicPrayer() == 1) {
						    p.getPrayers().setMagicPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_WILL], 0);
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_WILL, false);
					    }
					    break;
				    case Prayer.MYSTIC_LORE: // Mystic Lore.
					    if (p.getPrayers().getMagicPrayer() != 2) {
						    p.getPrayers().setMagicPrayer(2);
						    p.getPrayers().setSuperPrayer(0);
						    p.getPrayers().setAttackPrayer(0);
						    p.getPrayers().setStrengthPrayer(0);
						    p.getPrayers().setRangePrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.BURST_OF_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SUPERHUMAN_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ULTIMATE_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CLARITY_OF_THOUGHT], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.IMPROVED_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.INCREDIBLE_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SHARP_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.HAWK_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.EAGLE_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_WILL], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_MIGHT], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_LORE], 1);
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_WILL, false); // mystic will
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_LORE, true); // mystic lore
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_MIGHT, false); // mystic might
						    p.getPrayers().setPrayerActive(Prayer.CHIVALRY, false); // chivalry
						    p.getPrayers().setPrayerActive(Prayer.PIETY, false); // piety
						    p.getPrayers().setPrayerActive(Prayer.CLARITY_OF_THOUGHT, false); // clarity of thought
						    p.getPrayers().setPrayerActive(Prayer.IMPROVED_REFLEXES, false); // improved reflexes
						    p.getPrayers().setPrayerActive(Prayer.INCREDIBLE_REFLEXES, false); // incredible reflexes
						    p.getPrayers().setPrayerActive(Prayer.BURST_OF_STRENGTH, false); // burst of strength
						    p.getPrayers().setPrayerActive(Prayer.SUPERHUMAN_STRENGTH, false); // superhuman strength
						    p.getPrayers().setPrayerActive(Prayer.ULTIMATE_STRENGTH, false); // ultimate strength
						    p.getPrayers().setPrayerActive(Prayer.SHARP_EYE, false); // sharp eye
						    p.getPrayers().setPrayerActive(Prayer.HAWK_EYE, false); // hawk eye
						    p.getPrayers().setPrayerActive(Prayer.EAGLE_EYE, false); // eagle eye
					    } else if (p.getPrayers().getMagicPrayer() == 2) {
						    p.getPrayers().setMagicPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_LORE], 0);
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_LORE, false);
					    }
					    break;
				    case Prayer.MYSTIC_MIGHT: // Mystic Might.
					    if (p.getPrayers().getMagicPrayer() != 3) {
						    p.getPrayers().setMagicPrayer(3);
						    p.getPrayers().setSuperPrayer(0);
						    p.getPrayers().setAttackPrayer(0);
						    p.getPrayers().setStrengthPrayer(0);
						    p.getPrayers().setRangePrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.BURST_OF_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SUPERHUMAN_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.ULTIMATE_STRENGTH], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CLARITY_OF_THOUGHT], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.IMPROVED_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.INCREDIBLE_REFLEXES], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.PIETY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.CHIVALRY], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.SHARP_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.HAWK_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.EAGLE_EYE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_WILL], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_LORE], 0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_MIGHT], 1);
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_WILL, false); // mystic will
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_LORE, false); // mystic lore
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_MIGHT, true); // mystic might
						    p.getPrayers().setPrayerActive(Prayer.CHIVALRY, false); // chivalry
						    p.getPrayers().setPrayerActive(Prayer.PIETY, false); // piety
						    p.getPrayers().setPrayerActive(Prayer.CLARITY_OF_THOUGHT, false); // clarity of thought
						    p.getPrayers().setPrayerActive(Prayer.IMPROVED_REFLEXES, false); // improved reflexes
						    p.getPrayers().setPrayerActive(Prayer.INCREDIBLE_REFLEXES, false); // incredible reflexes
						    p.getPrayers().setPrayerActive(Prayer.BURST_OF_STRENGTH, false); // burst of strength
						    p.getPrayers().setPrayerActive(Prayer.SUPERHUMAN_STRENGTH, false); // superhuman strength
						    p.getPrayers().setPrayerActive(Prayer.ULTIMATE_STRENGTH, false); // ultimate strength
						    p.getPrayers().setPrayerActive(Prayer.SHARP_EYE, false); // sharp eye
						    p.getPrayers().setPrayerActive(Prayer.HAWK_EYE, false); // hawk eye
						    p.getPrayers().setPrayerActive(Prayer.EAGLE_EYE, false); // eagle eye
					    } else if (p.getPrayers().getMagicPrayer() == 3) {
						    p.getPrayers().setMagicPrayer(0);
						    p.getPackets().sendConfig(PRAYER_CONFIG[(int)Prayer.MYSTIC_MIGHT], 0);
						    p.getPrayers().setPrayerActive(Prayer.MYSTIC_MIGHT, false);
					    }
					    break;
			    }
			    if (!usingPrayer && isPrayerActive(p)) { // we werent using a prayer but we are now
				    startPrayerDrainEvent(p);
			    }
	    }
    }
}
