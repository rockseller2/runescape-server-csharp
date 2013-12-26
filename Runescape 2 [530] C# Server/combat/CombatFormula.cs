using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using RunescapeServer.model;
using RunescapeServer.player;
using RunescapeServer.npc;
using RunescapeServer.player.skills.prayer;
using RunescapeServer.definitions;
using RunescapeServer.util;

namespace RunescapeServer.combat
{
    class CombatFormula
    {
        public static double getPlayerMaxHit(Player player, int strBonusIncrease)
        {
            AttackStyle.CombatSkill fightType = player.getAttackStyle().getSkill();
            double myCurStrength = player.getSkills().getCurLevel(Skills.SKILL.STRENGTH);
            double myEquipStrengthBonus = (player.getEquipment().getBonus(Equipment.BONUS.STRENGTH) + strBonusIncrease);
            double fightingStyle = 0;
            double powerMultiplier = 1;
            double dharokModifier = 1;
            double damageMultiplier = 1;
            int strPrayer = player.getPrayers().getStrengthPrayer();
            if (strPrayer == 1)
            {
                powerMultiplier += 0.05;
            }
            else if (strPrayer == 2)
            {
                powerMultiplier += 0.1;
            }
            else if (strPrayer == 3)
            {
                powerMultiplier += 0.15;
            }
            else if (player.getPrayers().getSuperPrayer() == 1)
            {
                powerMultiplier += 0.18;
            }
            else if (player.getPrayers().getSuperPrayer() == 2)
            {
                powerMultiplier += 0.23;
            }

            if (wearingMeleeVoid(player))
            {
                damageMultiplier += 0.1;
            } else if (wearingDharok(player))
            {
                dharokModifier = (player.getSkills().getGreaterLevel(Skills.SKILL.HITPOINTS) - player.getSkills().getCurLevel(Skills.SKILL.HITPOINTS)) * 0.1;
            }
            if (fightType.Equals(AttackStyle.CombatSkill.AGGRESSIVE))
            {
                fightingStyle = 3;
            } else if (fightType.Equals(AttackStyle.CombatSkill.CONTROLLED))
            {
                fightingStyle = 1;
            }

            double cumulativeStrength = ((myCurStrength) * (powerMultiplier) + fightingStyle) * dharokModifier;
            //Can't change this. For huge damage it's a visual effect, not real maxHit!
            double maxHit = ((13 + (cumulativeStrength) + (myEquipStrengthBonus / 8) + ((cumulativeStrength * myEquipStrengthBonus) / 64)) * damageMultiplier) / 10; // NEW MAX HIT FORMULA
            return maxHit;
        }

        public static double getSpecialMeleeHit(Player p, Entity target, int weapon) {
		    double targetDefence = getMeleeDefence(p, target);
		    double attackerAttack = getMeleeAttack(p) * getSpecialAttackBonus(weapon);
            double hit = misc.randomDouble(getPlayerMaxHit(p, 0));
            double playerMaxHit = getPlayerMaxHit(p, 0);

            if (misc.randomDouble(attackerAttack) < misc.randomDouble(targetDefence))
            {
			    p.setLastHit(0);
			    return 0;
		    }
            if (hit < (playerMaxHit * 0.50))
            {
			    if (p.getLastHit() == 0) {
                    if (misc.random(6) == 0)
                    {
                        hit = (playerMaxHit * 0.50) + misc.randomDouble(playerMaxHit * 0.50);
				    }
                }
                else if (p.getLastHit() > misc.random(6))
                {
                    if (misc.random(6) == 0)
                    {
                        hit = (playerMaxHit * 0.50) + misc.randomDouble(playerMaxHit * 0.50);
				    }
			    }
		    }
		    return hit;
	    }

	    public static double getMeleeHit(Player p, Entity target) {
		    double targetDefence = getMeleeDefence(p, target);
		    double attack = getMeleeAttack(p);
            double hit = misc.randomDouble(getPlayerMaxHit(p, 0));
            if (misc.randomDouble(attack) < misc.randomDouble(targetDefence))
            {
			    p.setLastHit(0);
			    return 0;
		    }
		    if (hit < (p.getMaxHit() * 0.50)) {
			    if (p.getLastHit() == 0) {
                    if (misc.random(6) == 0)
                    {
                        hit = (getPlayerMaxHit(p, 0) * 0.50) + misc.randomDouble(getPlayerMaxHit(p, 0) * 0.50);
				    }
                }
                else if (p.getLastHit() > misc.randomDouble(6))
                {
                    if (misc.random(6) == 0)
                    {
                        hit = (getPlayerMaxHit(p, 0) * 0.50) + misc.randomDouble(getPlayerMaxHit(p, 0) * 0.50);
				    }
			    }
		    }
		    p.setLastHit(hit);
		    return hit;
	    }

	    public static double getMeleeDefence(Player p, Entity e) {
		    if(e is Npc) {
			    return 0.0;
		    }
		    Player target = (Player) e;

            //TODO: implement all Equipment Bonuses to be used for all of these Defence/Melee functions.
            /*
            int a = p.getEquipment().getBonus(Equipment.BONUS.CRUSH_ATTACK);
            int b = p.getEquipment().getBonus(Equipment.BONUS.CRUSH_DEFENCE);
            int c = p.getEquipment().getBonus(Equipment.BONUS.MAGIC_ATTACK);
            int d = p.getEquipment().getBonus(Equipment.BONUS.MAGIC_DEFENCE);
            int e = p.getEquipment().getBonus(Equipment.BONUS.PRAYER);
            int f = p.getEquipment().getBonus(Equipment.BONUS.RANGED_ATTACK);
            int g = p.getEquipment().getBonus(Equipment.BONUS.RANGED_DEFENCE);
            int h = p.getEquipment().getBonus(Equipment.BONUS.SLASH_ATTACK);
            int i = p.getEquipment().getBonus(Equipment.BONUS.SLASH_DEFENCE);
            int j = p.getEquipment().getBonus(Equipment.BONUS.STAB_ATTACK);
            int k = p.getEquipment().getBonus(Equipment.BONUS.STAB_DEFENCE);
            int l = p.getEquipment().getBonus(Equipment.BONUS.STRENGTH);
            int m = p.getEquipment().getBonus(Equipment.BONUS.SUMMONING);
            */

            int highestDefenceBonus = getHighestDefenceBonus(target);
            int defenceLevel = target.getSkills().getCurLevel(Skills.SKILL.DEFENCE);
            double power = (defenceLevel + highestDefenceBonus) * 0.0085; // was 0.0095
		    double amount = 1.160;
            if (highestDefenceBonus > 180)
			    amount = 1.568;
            else if (highestDefenceBonus > 290)
			    amount = 2.480;
            else if (highestDefenceBonus > 355)
			    amount = 3.580;
            power *= (defenceLevel * (power * 0.10)) + (highestDefenceBonus * amount) * (power * 0.012);
		    if (target.getPrayers().getDefencePrayer() == 1) {
			    power *= 1.05; //5% increase.
		    } else if (target.getPrayers().getDefencePrayer() == 2) {
			    power *= 1.10; //10% increase.
		    } else if (target.getPrayers().getDefencePrayer() == 3) {
			    power *= 1.15; //15% increase.
		    } else if (target.getPrayers().getSuperPrayer() == 1) {
			    power *= 1.20; //20% increase.
		    } else if (target.getPrayers().getSuperPrayer() == 2) {
			    power *= 1.25; //25% increase.
		    }
		    if (wearingVerac(p)) {
                power = (defenceLevel * 0.890); 
		    }
		    return power;
	    }

	    public static double getMeleeAttack(Player p) {
            //TODO: implement all Equipment Bonuses to be used for all of these Defence/Melee Attack functions.
            /*
            int a = p.getEquipment().getBonus(Equipment.BONUS.CRUSH_ATTACK);
            int b = p.getEquipment().getBonus(Equipment.BONUS.CRUSH_DEFENCE);
            int c = p.getEquipment().getBonus(Equipment.BONUS.MAGIC_ATTACK);
            int d = p.getEquipment().getBonus(Equipment.BONUS.MAGIC_DEFENCE);
            int e = p.getEquipment().getBonus(Equipment.BONUS.PRAYER);
            int f = p.getEquipment().getBonus(Equipment.BONUS.RANGED_ATTACK);
            int g = p.getEquipment().getBonus(Equipment.BONUS.RANGED_DEFENCE);
            int h = p.getEquipment().getBonus(Equipment.BONUS.SLASH_ATTACK);
            int i = p.getEquipment().getBonus(Equipment.BONUS.SLASH_DEFENCE);
            int j = p.getEquipment().getBonus(Equipment.BONUS.STAB_ATTACK);
            int k = p.getEquipment().getBonus(Equipment.BONUS.STAB_DEFENCE);
            int l = p.getEquipment().getBonus(Equipment.BONUS.STRENGTH);
            int m = p.getEquipment().getBonus(Equipment.BONUS.SUMMONING);
            */

		    int highestAttackBonus = getHighestAttackBonus(p);
            int attackLevel = p.getSkills().getCurLevel(Skills.SKILL.ATTACK);
            double multipler = 1.00;

		    if (p.getPrayers().getAttackPrayer() == 1) {
                multipler *= 1.05; //5% increase
		    } else if (p.getPrayers().getAttackPrayer() == 2) {
                multipler *= 1.10; //10% increase
		    } else if (p.getPrayers().getAttackPrayer() == 3 || p.getPrayers().getSuperPrayer() == 1) {
                multipler *= 1.15; //15% increase
		    } else if (p.getPrayers().getSuperPrayer() == 2) {
                multipler *= 1.20; //20% increase
		    }
		    if (wearingMeleeVoid(p)) {
                multipler *= 1.10; //10% increase
		    }

            double effectiveAttack = (attackLevel * multipler);
            return effectiveAttack * (highestAttackBonus > 0 ? highestAttackBonus : 1);
	    }

	    public static double getMagicHit(Player p, Entity target, int maxDamage) {
		    double magicAttack = getMagicAttack(p);
		    double magicDefence = getMagicDefence(target);

            if (misc.randomDouble(magicDefence) > misc.randomDouble(magicAttack))
			    return 0;

		    return misc.randomDouble(maxDamage);
	    }
	
	    private static double getMagicDefence(Entity e) {
		    if (e is Npc)
			    return 0;

		    Player p = (Player) e;
            int magicBonus = p.getEquipment().getBonus(Equipment.BONUS.MAGIC_DEFENCE);
		    int magicLevel = p.getSkills().getCurLevel(Skills.SKILL.MAGIC);
		    int defenceLevel = p.getSkills().getCurLevel(Skills.SKILL.DEFENCE);
		    double power = 1.100;
		    double amount = 0.0210;
		    if (magicBonus >= 90) {
			    amount = 0.0360;
		    } else if (magicBonus >= 100) { // equivalent of only wearing karil top+bottom
			    amount = 0.0510;
		    } else if (magicBonus > 100) { // equivalent of max mage w/ zerker+whip
			    amount = 0.0595;
		    } else if (magicBonus >= 120) { // equivalent of max mage w/ahrim
			    amount = 0.0770;
		    } else if (magicBonus >= 150) { // equivalent of max mage w/ karil
			    amount = 0.0940;
		    } else if (magicBonus >= 173) { // any higher
			    amount = 0.0995;
		    }
		    power *= (magicLevel * 0.0070) + (magicBonus * amount) + (defenceLevel * 0.0110);
		    if (wearingMageVoid(p)) {
			    power *= 1.30;
		    }
		    int prayer = p.getPrayers().getMagicPrayer();
		    if (prayer > 0) {
			    if (prayer == 1) {
				    power *= 1.05; //5% increase
			    } else if (prayer == 2) {
				    power *= 1.10; //10% increase
			    } else if (prayer == 3) {
				    power *= 1.15; //15% increase
			    }
		    }
		    if (p.getPrayers().getHeadIcon() == PrayerData.PrayerHeadIcon.MAGIC) {
			    power *= 0.50; //50% decrease
		    }
		    return power;
	    }

	    private static double getMagicAttack(Player p) {
            int magicAttackBonus = p.getEquipment().getBonus(Equipment.BONUS.MAGIC_ATTACK);
            double magicLevel = Convert.ToDouble(p.getSkills().getCurLevel(Skills.SKILL.MAGIC));
		    double power = 1.800;
		    double amount = 0.0205;
            if (magicAttackBonus >= 80)  // equivalent of max mage w/ zerker+whip
			    amount = 0.0500;
            else if (magicAttackBonus >= 90) // equivalent of max mage w/whip or mystic + ancient staff
			    amount = 0.0780;
            else if (magicAttackBonus >= 105) // equivalent of max mage w/ ancient staff
			    amount = 0.920;
            else if (magicAttackBonus >= 115) // equivalent of max mage w/ wand or better
			    amount = 0.1110;
            power *= (magicAttackBonus * amount) + (magicLevel *= 0.0120);
		    int magicPrayer = p.getPrayers().getMagicPrayer();
            if (magicPrayer > 0)
            {
                if (magicPrayer == 1)
				    power *= 1.05; //5% increase
                else if (magicPrayer == 2)
				    power *= 1.10; //10% increase
                else if (magicPrayer == 3)
				    power *= 1.15; //15% increase
		    }
		    return power;
	    }
	
	    public static double getNPCMeleeAttack(Npc npc) {
		    double power = 0.640;
		    double amount = 1.670;
            NpcData npcDef = NpcData.forId(npc.getId());
            int combatLevel = 3;
            if(npcDef == null) { //Level 3 if npcDef doesn't exist
                power *= (amount * combatLevel) * power;
                misc.WriteError("Missing npcDef for npcId: " + npc.getId());
            } else {
                combatLevel = NpcData.forId(npc.getId()).getCombat();
		        power *= (amount * combatLevel) * power;
		        if (npcDef.isBoss()) {
			        power *= 1.2;
		        }
            }
		    return power;
	    }

	    public static double getNPCMeleeDefence(Npc npc) {
		    double power = 0.600;
		    double amount = 0.900;

            NpcData npcDef = NpcData.forId(npc.getId());
            int combatLevel = 3;
            if (npcDef == null)
            { //Level 3 if npcDef doesn't exist
                power *= (amount * combatLevel) * power;
                misc.WriteError("Missing npcDef for npcId: " + npc.getId());
            }
            else
            {
                combatLevel = NpcData.forId(npc.getId()).getCombat();
                power *= (amount * combatLevel) * power;
                if (npcDef.isBoss())
                {
                    power *= 1.4; //40% increase.
                }
            }
		    return power;
	    }
	
	    public static double getRangeHit(Player attacker, Entity target, int bow, int arrow) {
            //TODO: 
            //add logic here to create damage based
            //based on different range defence vs range attack.
            //subtracted from Entity target's stats

            if (target is Npc)
            {
			    return getRangeMaxHit(attacker, bow, arrow);
		    }

            double rangeMaxHit = getRangeMaxHit(attacker, bow, arrow);
            double rangeDefence = getRangeDefence((Player)target);
            if (misc.randomDouble(rangeDefence) > misc.randomDouble(rangeMaxHit))
            {
                return 0;
            }
            return misc.randomDouble(rangeMaxHit);
	    }

	    public static double getRangeMaxHit(Player p, int bow, int arrow) {
            /*
            int a = p.getEquipment().getBonus(Equipment.BONUS.CRUSH_ATTACK);
            int b = p.getEquipment().getBonus(Equipment.BONUS.CRUSH_DEFENCE);
            int c = p.getEquipment().getBonus(Equipment.BONUS.MAGIC_ATTACK);
            int d = p.getEquipment().getBonus(Equipment.BONUS.MAGIC_DEFENCE);
            int e = p.getEquipment().getBonus(Equipment.BONUS.PRAYER);
            int f = p.getEquipment().getBonus(Equipment.BONUS.RANGED_ATTACK);
            int g = p.getEquipment().getBonus(Equipment.BONUS.RANGED_DEFENCE);
            int h = p.getEquipment().getBonus(Equipment.BONUS.SLASH_ATTACK);
            int i = p.getEquipment().getBonus(Equipment.BONUS.SLASH_DEFENCE);
            int j = p.getEquipment().getBonus(Equipment.BONUS.STAB_ATTACK);
            int k = p.getEquipment().getBonus(Equipment.BONUS.STAB_DEFENCE);
            int l = p.getEquipment().getBonus(Equipment.BONUS.STRENGTH);
            int m = p.getEquipment().getBonus(Equipment.BONUS.SUMMONING);
            */

            double rangeLevel = p.getSkills().getCurLevel(Skills.SKILL.RANGE);
            //TODO: use rangeAttackBonus in the formula somehow!.
            double rangeAttackBonus = p.getEquipment().getBonus(Equipment.BONUS.RANGED_ATTACK);
		    double rangeAttackMultipler = 1.00;
		    double rangeAttack = 0;
            int rangedWeaponArrowStrength = getRangeWeaponArrowStrength(p);
		    int rangePrayer = p.getPrayers().getRangePrayer();

            if (rangePrayer == 1)
                rangeAttackMultipler *= 1.05; //5% increase
            else if (rangePrayer == 2)
                rangeAttackMultipler *= 1.10; //10% increase
            else if (rangePrayer == 3)
                rangeAttackMultipler *= 1.15; //15% increase

		    if (wearingRangeVoid(p)) {
                rangeAttackMultipler *= 1.15; //15% increase
		    }
            rangeAttack = (rangeLevel * rangeAttackMultipler);
		    if (p.getAttackStyle().getStyle().Equals(AttackStyle.CombatStyle.RANGE_ACCURATE)) {
                rangeAttack += 3.00;
		    }
            double rangeMaxHit = ((rangeAttack + 8) * (rangedWeaponArrowStrength + 64) / 640);
            return rangeMaxHit;
	    }

        public static double getRangeDefence(Player p)
        {
            int rangedDefenceBonus = p.getEquipment().getBonus(Equipment.BONUS.RANGED_DEFENCE);
            double defenceLevel = p.getSkills().getCurLevel(Skills.SKILL.DEFENCE);
            AttackStyle.CombatSkill fightType = p.getAttackStyle().getSkill();
            if (fightType.Equals(AttackStyle.CombatSkill.DEFENSIVE))
                defenceLevel *= 1.10; //%10 increase.

            if(p.getPrayers().isPrayerActive(PrayerData.Prayer.THICK_SKIN))
                defenceLevel *= 1.05; //5% increase.
            else if (p.getPrayers().isPrayerActive(PrayerData.Prayer.ROCK_SKIN))
                defenceLevel *= 1.10; //10% increase.
            else if (p.getPrayers().isPrayerActive(PrayerData.Prayer.STEEL_SKIN))
                defenceLevel *= 1.15; //15% increase.
            else if (p.getPrayers().isPrayerActive(PrayerData.Prayer.SMITE))
                defenceLevel *= 1.20; //20% increase.
            else if (p.getPrayers().isPrayerActive(PrayerData.Prayer.CHIVALRY))
                defenceLevel *= 1.25; //25% increase.

            double rangeDefence = (defenceLevel * rangedDefenceBonus) / 200;
            return rangeDefence;

        }

	    private static int getRangeWeaponArrowStrength(Player p) {
		    int[][] items = {
			    new int[] {
			    890, // addy arrow
			    9143, // addy bolt
			    810, // addy dart
			    829, // addy jav
			    867, // addy knife
			    804, // addy thrownaxe
			    881, // barbed bolts
			    13803, // black bolts
			    3093, // black dart
			    869, // black knife
			    9139, // blurite bolt
			    4740, // bolt rack
			    8882, // bone bolts
			    13280, // broad tipped bolts
			    882, // bronze arrow
			    877, // bronze bolts
			    806, // bronze dart
			    825, // bronze jav
			    864, // bronze knife
			    800, // bronze thrownaxe
			    4214, // full crystal bow
			    13953, // corrupt morr jav
			    13957, // corrupt morr thrownaxe
			    9340, // diamond bolt
			    11212, // dragon arrow
			    9341, // dragon bolts
			    11230, // dragon dart
			    9338, // emerald bolts
			    10142, // guam tar
			    10145, // harralander tar
			    78, // ice arrows
			    884, // iron arrows
			    9140, // iron bolts
			    807, // iron dart
			    826, // iron javelin
			    863, // iron knife
			    801, // iron thrownaxe
			    10158, // kebbit bolts
			    10159, // long kebbit bolts
			    888, // mith arrow
			    9142, // mith bolts
			    809, // mithril dart
			    828, // mithril javelin
			    866, // mith knife
			    803, // mith thrownaxe
			    13879, // morrigans javelin
			    13883, // morrigans thrownaxe
			    2866, // ogre arrow
			    9342, // onyx bolts
			    880, // pearl bolts
			    10034, // red chinchompa
			    9339, // ruby bolts
			    892, // rune arrow
			    811, // rune dart
			    830, // rune javelin
			    868, // rune knife
			    805, // rune thrownaxe
			    9144, // rune bolts
			    9337, // sapphire bolts
			    9145, // silver bolts
			    886, // steel arrow
			    9141, // steel bolts
			    808, // steel dart
			    827, // steel javelin
			    865, // steel knife
			    802, // steel thrownaxe
			    10144, // tarromin tar
			    6522, // obsidian ring
			    9336, // topaz bolts
			    9706, // training arrows
			    879, // opal bolts
			    9236, // opal bolts (e)
			    9335, // jade bolts
			    9237, // jade bolts (e)
			    9238, // pearl bolts(e)
			    9239, // topaz bolts (e)
			    9241, // emerald bolts (e)
			    9240, // sapphire bolts (e)
			    9242, // ruby bolts (e)
			    9243, // diamond bolts (e)
			    9244, // dragon bolts (e)
			    9245, // onyx bolts (e)
			    }, 
			    new int[] { 
			    31, // addy arrow
			    100, // addy bolt
			    10, // addy dart
			    28, // addy jav
			    14, // addy knife
			    23, // addy thrownaxe
			    12, // barbed bolts
			    75, // black bolts
			    6, // black dart
			    8, // black knife
			    28, // blurite bolt
			    55, // bolt rack
			    49, // bone bolts
			    100, // broad tipped bolts
			    7, // bronze arrow
			    10, // bronze bolts
			    1, // bronze dart
			    6, // bronze jav
			    3, // bronze knife
			    5, // bronze thrownaxe
			    70, // full crystal bow
			    145, // corrupt morr jav
			    117, // corrupt morr thrownaxe
			    105, // diamond bolt
			    60, // dragon arrow
			    117, // dragon bolts
			    20, // dragon dart
			    85, // emerald bolts
			    16, // guam tar
			    49, // harralander tar
			    16, // ice arrows
			    10, // iron arrows
			    46, // iron bolts
			    3, // iron dart
			    10, // iron javelin
			    4, // iron knife
			    7, // iron thrownaxe
			    28, // kebbit bolts
			    38, // long kebbit bolts
			    22, // mith arrow
			    82, // mith bolts
			    7, // mithril dart
			    18, // mithril javelin
			    10, // mith knife
			    16, // mith thrownaxe
			    145, // morrigans javelin
			    117, // morrigans thrownaxe
			    22, // ogre arrow
			    120, // onyx bolts
			    48, // pearl bolts
			    15, // red chinchompa
			    103, // ruby bolts
			    49, // rune arrow
			    14, // rune dart
			    42, // rune javelin
			    24, // rune knife
			    36, // rune thrownaxe
			    115, // rune bolts
			    83, // sapphire bolts
			    36, // silver bolts
			    16, // steel arrow
			    64, // steel bolts
			    4, // steel dart
			    12, // steel javelin
			    7, // steel knife
			    11, // steel thrownaxe
			    31, // tarromin tar
			    49, // obsidian ring
			    66, // topaz bolts
			    7, // training arrows
			    10, // opal bolts
			    10, // opal bolts (e)
			    28, // jade bolts
			    28, // jade bolts (e)
			    46, // pearl bolts(e)
			    64, // topaz bolts (e)
			    82, // emerald bolts (e)
			    82, // sapphire bolts (e)
			    100, // ruby bolts (e)
			    100, // diamond bolts (e)
			    117, // dragon bolts (e)
			    115, // onyx bolts (e)
			    }
		    };
		    for (int i = 0; i < items[1].Length; i++) {
                if (p.getEquipment().getItemInSlot(ItemData.EQUIP.WEAPON) == items[0][i])
                {
				    return items[1][i];
			    }
		    }
            for (int i = 0; i < items[1].Length; i++)
            {
                if (p.getEquipment().getItemInSlot(ItemData.EQUIP.ARROWS) == items[0][i])
                {
				    return items[1][i];
			    }
		    }
		    return 0;
	    }
	
	    public static bool wearingMeleeVoid(Player p) {
            return p.getEquipment().getItemInSlot(ItemData.EQUIP.LEGS) == 8840 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.CHEST) == 8839 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.HAT) == 11665 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.HANDS) == 8842;
	    }

	    private static bool wearingRangeVoid(Player p) {
            return p.getEquipment().getItemInSlot(ItemData.EQUIP.LEGS) == 8840 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.CHEST) == 8839 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.HAT) == 11663 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.HANDS) == 8842;
	    }
	
	    private static bool wearingMageVoid(Player p) {
            return p.getEquipment().getItemInSlot(ItemData.EQUIP.LEGS) == 8840 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.CHEST) == 8839 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.HAT) == 11664 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.HANDS) == 8842;
	    }

        public static bool wearingDharok(Player p)
        {
            return p.getEquipment().getItemInSlot(ItemData.EQUIP.LEGS) == 4722 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.WEAPON) == 4718 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.CHEST) == 4720 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.HAT) == 4716;
        }

        public static bool wearingAhrim(Player p)
        {
            return p.getEquipment().getItemInSlot(ItemData.EQUIP.LEGS) == 4714 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.WEAPON) == 4710 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.CHEST) == 4712 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.HAT) == 4708;
        }

        public static bool wearingGuthan(Player p)
        {
            return p.getEquipment().getItemInSlot(ItemData.EQUIP.LEGS) == 4730 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.WEAPON) == 4726 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.CHEST) == 4728 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.HAT) == 4724;
        }

        public static bool wearingTorag(Player p)
        {
            return p.getEquipment().getItemInSlot(ItemData.EQUIP.LEGS) == 4751 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.WEAPON) == 4747 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.CHEST) == 4749 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.HAT) == 4745;
        }

        public static bool wearingKaril(Player p)
        {
            return p.getEquipment().getItemInSlot(ItemData.EQUIP.LEGS) == 4738 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.WEAPON) == 4734 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.CHEST) == 4736 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.HAT) == 4732;
        }

        public static bool wearingVerac(Player p)
        {
            return p.getEquipment().getItemInSlot(ItemData.EQUIP.LEGS) == 4759 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.WEAPON) == 4755 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.CHEST) == 4757 &&
            p.getEquipment().getItemInSlot(ItemData.EQUIP.HAT) == 4753;
        }
	
	    private static double[][] SPECIAL_WEAPON_BONUS = { 
		    new double[] {1215, 2.10}, // Dragon dagger.
		    new double[] {1231, 2.10}, // Dragon dagger.
		    new double[] {5680, 2.10}, // Dragon dagger.
		    new double[] {5698, 2.10}, // Dragon dagger.
		    new double[] {1305, 2.50}, // D long
		    new double[] {11694, 1.90}, // armadyl godsword
		    new double[] {11696, 1.90}, // bandos godsword
		    new double[] {11698, 1.90}, // saradomin godsword
		    new double[] {11700, 1.90}, // zamorak godsword
		    new double[] {11730, 2.30}, // saradomin sword
		    new double[] {1434, 2.90}, // dragon mace
		    new double[] {14484, 3.00}, // dragon claws
		    new double[] {4153, 6.75}, // g maul
		    new double[] {13902, 1.60}, // statius warhammer
		    new double[] {13899, 1.55}, // Vesta longsword
		    new double[] {13905, 1.80} // Vesta spear
	    };

        public static double getSpecialAttackBonus(int weapon)
        {
            for (int i = 0; i < SPECIAL_WEAPON_BONUS.Length; i++)
            {
                if (weapon == (int)SPECIAL_WEAPON_BONUS[i][0])
                {
                    return SPECIAL_WEAPON_BONUS[i][1];
                }
            }
            return 0;
        }

        private static int getHighestAttackBonus(Player p)
        {
            /* TODO:
             * Pretty stupid to figure out highest attack bonus
             * You won't know what kind of Attack bonus Crush/Slash etc. is used for what.
             */

		    int bonus = 0;
		    for (int i = 0; i < 3; i++) {
			    if (p.getEquipment().getBonus(i) > bonus) {
				    bonus = p.getEquipment().getBonus(i);
			    }
		    }
		    return bonus;
	    }
	
	    private static int getHighestDefenceBonus(Player p) 
        {
            /* TODO:
             * Also stupid as above, no point in figuring out highest defence bonus
             * Youwon't know what kind of Defence bonus it is used for.
             */
		    int bonus = 0;
		    for (int i = 5; i < 8; i++) {
                if (p.getEquipment().getBonus(i) > bonus)
                {
                    bonus = p.getEquipment().getBonus(i);
			    }
		    }
		    return bonus;
	    }
    }
}
