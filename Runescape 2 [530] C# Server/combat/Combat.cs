using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using RunescapeServer.definitions;
using RunescapeServer.events;
using RunescapeServer.player;
using RunescapeServer.npc;
using RunescapeServer.player.skills;
using RunescapeServer.model;
using RunescapeServer.player.skills.prayer;
using RunescapeServer.util;
using RunescapeServer.minigames.duelarena;

namespace RunescapeServer.combat
{
    class Combat
    {
        public Combat() {
	    }

        public enum CombatType
        {
		    MELEE,
		    MAGE,
		    RANGE
	    }
	
	    public static void newAttack(Entity killer, Entity target) {
		    if (killer.getLastAttack() > 0) {
			    /*if (Environment.TickCount - killer.getLastAttack() >= (killer.getAttackSpeed() * 500)) {
				    killer.setCombatTurns(killer.getAttackSpeed());
			    }*/
		    } else {
			    killer.setCombatTurns(killer.getAttackSpeed());
		    }
		    killer.setEntityFocus(target.getClientIndex());
		    killer.setTarget(target);
		    checkAutoCast(killer, target);
		    killer.setFaceLocation(target.getLocation());
	    }

	    private static void checkAutoCast(Entity killer, Entity target) {
		    if (killer is Npc) {
			    return;
		    }
		    if (((Player)killer).getTemporaryAttribute("autoCastSpell") != null) {
			    int id = (int)((Player)killer).getTemporaryAttribute("autoCastSpell");
			    bool ancients = (bool)(((Player)killer).getTemporaryAttribute("autoCastAncients") != null ? true : false);
			    ((Player) killer).setTemporaryAttribute("autoCasting", true);
			    MagicCombat.newMagicAttack((Player)killer, target, id, ancients);
		    }
	    }
	
	    public static void combatLoop(Entity killer) {
		    bool usingRange = killer is Player ? RangeCombat.isUsingRange(killer) : npcUsesRange(killer);
		    Entity target = killer.getTarget();
		    killer.incrementCombatTurns();
		    bool autoCasting = killer is Npc ? false : ((Player)killer).getTemporaryAttribute("autoCasting") != null;
		    bool dragonfire = false;
		    bool guthanSpecial = false;

            //if you are auto casting you are not in combat loop.
		    if (autoCasting)
			    return;

            //If who you were attacking or who attacked you doesn't exist anymore. [Most important, should be first]
            if (target == null || (killer.getAttacker() == null && target == null))
            {
                //stop fighting.
                resetCombat(killer, 1);
                return;
            }

            //If it's the npc attacking and npc isn't owned by another player or player is attacking
		    if (((killer is Npc) && ((Npc)killer).getOwner() == null) || killer is Player) {
			    if (killer.getLastAttacked() > 0 || killer.getLastAttack() > 0) {
                    //if the last time npc or player was attacked was 6 seconds ago or last time npc or player attacked was 6 seconds ago
				    if (isXSecondsSinceCombat(killer, killer.getLastAttacked(), 6000) && isXSecondsSinceCombat(killer, killer.getLastAttack(), 6000)) {
                        //stop fighting.
					    resetCombat(killer, 1);
					    return;
				    }
			    }
		    }
            
            //If you are a player and using range then your distance is 8 or if you are a npc using range get the npc's attackRange otherwise get the size of the npc as distance.
		    int distance = (killer is Player && usingRange) ? 8 : (killer is Npc && usingRange) ? getNpcAttackRange(killer) : getNPCSize(killer, target);
		    //if you the player are not using range and you are attacking another player
            if (!usingRange && killer is Player && target is Player) {
                //if the player who is getting attacked is not standing still.
			    if (((Player)target).getSprites().getPrimarySprite() != -1) {
                    //if you are using range on a player who is moving then distance to attack is 11, otherwise no range it's 3.
				    distance = usingRange ? 11 : 3;
			    }
		    }

            /**
             * This is the distance check.
             * If all [player vs player], [player vs npc] or [npc vs player] are within distance of each other.
             * Only can run after the check above which gets the proper distance.
             */
		    if (!killer.getLocation().withinDistance(target.getLocation(), distance) && !target.getLocation().withinDistance(killer.getLocation(), distance)) {
			    return;
		    }

            //Can you [npc or player] even attack the entity
		    if (!canAttack(killer, target, usingRange)) {
                //stop fighting.
			    resetCombat(killer, 0);
			    return;
		    }

            //Are you a player using ranged attacks?
		    if (usingRange && killer is Player) {
                //Do you have ammo and a bow?
				if (RangeCombat.hasAmmo(killer) && RangeCombat.hasValidBowArrow(killer)) {
					((Player)killer).getWalkingQueue().resetWalkingQueue();
					((Player)killer).getPackets().closeInterfaces();
					((Player)killer).getPackets().clearMapFlag();
				} else {
                    //You cannot attack the monster as you don't have ammo or a bow.
					killer.setTarget(null);
					return;
				}
		    }

            //Are you a player who is attacking a npc.
		    if (target is Npc && killer is Player) {
                //If you are attacking Zilyana boss.
                if (((Npc)target).getId() == 6247) { // Zilyana (sara boss)
                    //TODO: Stop any walking err why only zilyana boss?, have to check this out later.
				    ((Player)killer).getWalkingQueue().resetWalkingQueue();
				    ((Player)killer).getPackets().clearMapFlag();
			    }
		    }

            //All the checks above are passed, below starts the actual assigning of target and doing the attack.

            //If you [npc or player] attacking turn is greater or equal to your attacking speed. 
		    if(killer.getCombatTurns() >= killer.getAttackSpeed()) {
                //If [npc or player] has auto attack back on, and who they are attacking still exists.
			    if (target.isAutoRetaliating() && target.getTarget() == null) {
                    //Make the [npc or player] follow who they are trying to attack.
				    target.getFollow().setFollowing(killer);
                    //Make the [npc or player] face up to their attacker.
				    target.setEntityFocus(killer.getClientIndex());
                   
				    if ((target.getCombatTurns() >= (target.getAttackSpeed() / 2)) && target.getAttacker() == null) {
					    target.setCombatTurns(target.getAttackSpeed() / 2);
				    }
                    //Assign the [npc or player] who is getting attacked it's target who is attacking them.
				    target.setTarget(killer);
                    //If the person who is getting attacked is a player
				    if (target is Player) {
                        //Stop the movement of player who is getting attacked 
					    ((Player) target).getWalkingQueue().resetWalkingQueue();
					    ((Player) target).getPackets().clearMapFlag();
				    }
			    }
                //Set the attack delay, if you are using range then delay is 2.4 seconds, otherwise magic.. 2.75 seconds.
			    int delay = usingRange ? 2400 : 2750;
                //if delay has come up, TODO: why checks only against LastMagicAttack() since it could it also be Ranged?
			    if (Environment.TickCount - killer.getLastMagicAttack() < delay) {
                    //If the player who is attacking using range.
				    if (usingRange && killer is Player) {
                        //Stop the movement of the attacker who is using ranged attacks.
					    ((Player)killer).getWalkingQueue().resetWalkingQueue();
					    ((Player)killer).getPackets().clearMapFlag();
				    }
				    return;
			    }
                //If the attacker is a npc
			    if (killer is Npc) {
                    //Perform the npc attack as a killer on your target (most likely a player)
				    if (NPCAttack.npcAttack((Npc) killer, target)) {
					    return;
                    //If the dice 50/50 kicks in and the npc attacking is a dragon.
				    } else if ((misc.random(2) == 0) && isDragon(killer)) {
                        //Do your dragon fire as a dragon npc.
					    doDragonfire(killer, target);
                        //Dragonfire was done, variable used to stop some attack animation.
					    dragonfire = true;
				    }
			    }
                //If the person getting attacked is a player.
			    if (target is Player) {
                    //Close all their interfaces.
				    ((Player) target).getPackets().closeInterfaces();
			    }
                //If the attacker [npc or player] has a attack animation and dragonfire variable wasn't set.
			    if ((killer.getAttackAnimation() != 65535) && !dragonfire) {
                    //Do your attack animation as a [npc or player].
				    killer.setLastAnimation(new Animation(killer.getAttackAnimation()));
			    }
                //If the [player or npc] is not using ranged attacks
			    if (!usingRange) {
                    //If the [player or npc]'s combatTurns is not equal to 0.
				    if (target.getCombatTurns() != 0) {
                        //If the [player or npc] getting attacked has a defensive animation.
					    if (target.getDefenceAnimation() != 65535) {
                            //Do a blocking/defensive animation.
						    target.setLastAnimation(new Animation(target.getDefenceAnimation()));
					    }
				    }
			    }
                //Make the attacker [player or npc] start following the attacked.
			    killer.getFollow().setFollowing(target);
                //Set a timer for the [player or npc] which indicates the last time they were attacked by killer.
			    target.setLastAttacked(Environment.TickCount);
                //Set a timer for the [player or npc] which indicates the last time they attacked the target.
			    killer.setLastAttack(Environment.TickCount);
                //Reset the combat turns. [This makes sure both attackers don't attack at same time]
			    killer.resetCombatTurns();
                //Assign the [npc or player] who is getting attacked it's target who is attacking them.
			    target.setAttacker(killer);
                //Set the skulls, the method checks if [player attacks player] also [checks if player is dueling or in fightpits or has skull], otherwise gets skull.
			    setSkull(killer, target);
                //If the attacker is a player.
			    if (killer is Player) {
                    //Set attacking player's combatType to melee attack.
				    ((Player) killer).setLastCombatType(CombatType.MELEE);
                    //Close all your interfaces as a attacker
				    ((Player) killer).getPackets().closeInterfaces();
                    //If you the attacking player is using a special attack.
				    if (((Player) killer).getSpecialAttack().isUsingSpecial()) {
                        //Do your special attack on your target which may be a [player or npc]
					    if (((Player) killer).getSpecialAttack().doSpecialAttack(killer, target)) {
						    return;
					    }
                    //If you the attacking [player or npc] while wearing guthan armour set.
				    } else if (CombatFormula.wearingGuthan((Player)killer)) {
                        //Roll a 25% dice.
					    if (misc.random(4) == 0) {
                            //If dice hits 25%, show some kind of graphics..
						    killer.setLastGraphics(new Graphics(398, 0));
                            //Set some variable to indicate you are using guthan special.
						    guthanSpecial = true;
					    }
				    }
			    }
                //If you the [player or npc] is using range.
			    if (usingRange) {
                    //Go into the RangeCombat ranging logic loop processing class.
				    RangeCombat.rangeCombatLoop(killer, target);
				    return;
			    }
                //If the dragon npc did his dragonfire attack quit right here.
			    if (dragonfire) {
				    return;
			    }
                //Copies guthanSpecial variable to a different variable so it won't change when passed into a Event.
			    bool guthanSpec = guthanSpecial;
                //Gets the damage you as the attacker [player or npc] will do on target [player or npc]
			    double damage = getDamage(killer, target);
                //Checks if damage will kill the player, sets a temporary variable 'willDie'
			    checkIfWillDie(target, damage);
                //Starts a new Event based on the attack of the attacker [player or npc] hit delay
                Event attackEvent = new Event(killer.getHitDelay());
                attackEvent.setAction(() => {
                    //Stop attack event after this run
                    attackEvent.stop();
                    //Add the XP for the killer [player only].
					addXp(killer, target, damage);
                    //Set the hit to be sent on the attacked target [player or npc]
					target.hit(damage);
                    //If the attacker [player] is using the Smite prayer drain prayer from target [player] based on damage done
					checkSmite(killer, target, damage);
                    //If the attacker [player] done damage to a target player who has recoil ring equipped
                    //if damage greater then 10 then damage is divided by 10 otherwise it just hits 1 (if damage is between 1 to 10).
					checkRecoilRing(killer, target, damage);
					checkVengeance(killer, target, damage);
                    //if you are using the guthanSpecial which does some healing
					if (guthanSpec) {
						// heals 30% of the damage, and an added random 70% of the damage
						killer.heal((int) (damage * 0.30 + misc.randomDouble((damage * 0.70))));
					}
                    //if the target you are attacking is a npc.
					if (target is Npc) {
                        //if it is Tzhaar monsters, you as the attacker will take 1 damage.
						if (((Npc)target).getId() == 2736 || ((Npc)target).getId() == 2737) { // Tzhaar lvl 45s
							killer.hit(1); // their recoil attack
						}
					}
			    });
                Server.registerEvent(attackEvent);
		    }
	    }

	    private static bool isDragon(Entity killer) {
		    int id = (((Npc)killer).getId());
		    return id == 53 || id == 54 || id == 55 || id == 941 || id == 1590 || id == 1591 || id == 1692 || id == 5362 || id == 5364;
	    }
	
	    public static void doDragonfire(Entity killer, Entity target) {
		    killer.setLastAnimation(new Animation(81));
		    killer.setLastGraphics(new Graphics(1, 0, 50));
            
            Event doDragonFireEvent = new Event(600);
            doDragonFireEvent.setAction(() => {
                doDragonFireEvent.stop();
				string message = null;
				int fireDamage = 55;
				bool wearingShield = ((Player)target).getEquipment().getItemInSlot(ItemData.EQUIP.SHIELD) == 1540 || ((Player)target).getEquipment().getItemInSlot(ItemData.EQUIP.SHIELD) == 11283 || ((Player)target).getEquipment().getItemInSlot(ItemData.EQUIP.SHIELD) == 11284;
				if (((Player)target).getAntifireCycles() > 0) {
					if (wearingShield) {
						message = "Your shield and potion combine to fully protect you from the dragon's breath.";
						fireDamage = 0;
					} else {
						message = "Your antifire potion partially protects you from the dragon's breath.";
						fireDamage = 20;
					}
				} else if (wearingShield) {
					message = "Your shield deflects some of the dragon's breath.";
					fireDamage = 20;
				} else {
					message = fireDamage == 0 ? "The dragon's breath has no effect, you got lucky this time!" : "The dragon's breath horribly burns you!";
				}
				((Player)target).getPackets().sendMessage(message);
				target.hit(misc.randomDouble(fireDamage));
		    });
	    }
	
	    public static void checkIfWillDie(Entity target, double damage) {
		    if (target is Npc) {
			    return;
		    }
		    bool willDie = ((Player)target).getHp() - damage <= 0;
		    if (willDie) {
			    ((Player)target).setTemporaryAttribute("willDie", true);
		    }
	    }

	    public static int getNPCSize(Entity killer, Entity target) {
            //If both attacker and target are players, size = 1
		    if (killer is Player && target is Player) {
			    return 1;
		    }
            //If both attacker and target are not existing, size = 1
		    if (target == null || killer == null) {
			    return 1;
		    }
            //If target is a player and attacker is a Npc, then target becomes the attacker Npc.
            //Used to figure out who the Npc is.
		    if ((target is Player) && (killer is Npc)) {
			    target = killer;
		    }
            //TODO: Add sizes to NPC Defintions. (to avoid this method all together).
            //Based on certain NPC Id's it figures out the sizes of 3 and size 4's 
            //otherwise it just returns size 1.
		    switch(((Npc)target).getId()) {
			    case 6247:
			    case 6203:
			    case 6208:
			    case 6204:
			    case 6223:
			    case 6227:
			    case 6225:
				    return 3;
				
			    case 6222:
				    return 4;
		    }
		    return 1;
	    }
	
	    public static int getNpcAttackRange(Entity killer) {
		    if (killer.getLocation().getX() >= 19000) {
			    return ((Npc)killer).getMaximumCoords().getX() - ((Npc)killer).getMinimumCoords().getX();
		    }
		    return 15;
	    }

	    public static bool npcUsesRange(Entity killer) {
            //If attacker is a Player then exit.
		    if (killer is Player) {
			    return false;
		    }
            //Figures out the NPC ID of the attacker
		    int id = ((Npc)killer).getId();
            //TODO: Maybe make a array atleast? if not add this information to NPC Defintions.
            //If any of those NPC Id's below match then that NPC uses Ranged attacks.
		    switch(id) {
			    case 2028:
			    case 2025:
			    case 6263:
			    case 6265:
			    case 6250:
			    case 6208:
			    case 6206:
			    case 6222:
			    case 6223:
			    case 6225:
			    case 2739:
			    case 2740:
			    case 2743:
			    case 2744:
			    case 2745:
				    return true;
		    }
		    return false;
	    }

	    public static bool isXSecondsSinceCombat(Entity entity, long timeSinceHit, int time) {
		    return Environment.TickCount - timeSinceHit > time;
	    }

	    public static void checkRecoilRing(Entity killer, Entity target, double damage) {
		    if (target is Npc) {
			    return;
		    }
		    bool hasRecoilRing = (((Player) target).getEquipment().getItemInSlot(ItemData.EQUIP.RING) == 2550);
            if (hasRecoilRing)
            {
                //If the damage done on target is more then 10, then divide it by 10.
                //otherwise if damage is less then 10 and greater then 0 do a hit of 1 damage otherwise hit of 0 damage
			    double hit = damage > 10 ? (damage / 10) : (damage <= 10 && damage > 0) ? 1 : 0;
                //no damage exit.
			    if (hit == 0) {
				    return;
			    }
                //The attacker [yourself] gets hit for the damage set above, as recoiled damage.
			    killer.hit(hit);
                //The attacked who is wearing the recoil ring loses one 1 charge from his character.
			    ((Player) target).setRecoilCharges((((Player) target).getRecoilCharges() - 1));
                //If the person has 0 or less recoil charges left
			    if (((Player) target).getRecoilCharges() <= 0) {

                    //TODO: check if ring will get deleted (I think it wont!).

                    //Get the item in ring slot, could be any ring, possible to destory other rings if you lag it of course.
				    Item ringSlot = ((Player) target).getEquipment().getSlot(ItemData.EQUIP.RING);
                    //Set the current ring in your ring slot to -1 [destoryed]
				    ringSlot.setItemId(-1);
                    //Set amount of the ring you are wearing to 0, none.
				    ringSlot.setItemAmount(0);
                    //Send the attacked a equipment update packet.
				    ((Player) target).getPackets().refreshEquipment();
                    //Send the attacked player a message that he lost his ring.
				    ((Player) target).getPackets().sendMessage("Your Ring of recoil has shattered!");
                    //Reset your recoil charges on your account back to 40. [still won't work without a ring]
				    ((Player) target).setRecoilCharges(40);
			    }
		    }
	    }

	    public static void checkSmite(Entity killer, Entity target, double damage) {
            //If the attacker is a Npc or target is a Npc or damage is less then 0, exits.
		    if (killer is Npc || target is Npc || damage <= 0) {
			    return;
		    }
            //If target player's current prayer level is greater then 0 and target player isn't dead.
            if (((Player)target).getSkills().getCurLevel(Skills.SKILL.PRAYER) > 0 && !((Player)target).isDead())
            {
                //If the Player attacker has the smite headicon on (doesn't technically mean SMITE prayer is on).
			    if (((Player)killer).getPrayers().getHeadIcon() == PrayerData.PrayerHeadIcon.SMITE) {
                    //Set the target player's current prayer level to what it was before and subtract the damage divided by 4 from your their prayer.
                    ((Player)target).getSkills().setCurLevel(Skills.SKILL.PRAYER, ((Player)target).getSkills().getCurLevel(Skills.SKILL.PRAYER) - (int)(damage / 4));
                    //Send the target player's the new prayer update to their client.
                    ((Player)target).getPackets().sendSkillLevel(Skills.SKILL.PRAYER);
			    }
		    }
	    }

	    public static double getDamage(Entity killer, Entity target) {
            //If attacker is a Npc
		    if (killer is Npc) {
                //Gets the NPC's max hit
                double maxDamage = killer.getMaxHit();
                //If the NPC's max hit is more then target's healthpoints
			    if (maxDamage > target.getHp()) {
                    //Set's NPC's new max hit to the target's healthpoints.
				    maxDamage = target.getHp();
			    }
                //If target is a Player
			    if (target is Player) {
                    //Get the NPC Defintions for the Attacker's NPC Id.
                    NpcData npcDef = NpcData.forId(((Npc)killer).getId());
                    //Gets the NPC's attack style (MELEE, RANGE OR MAGIC)
                    int npcAttackStyle = ((Npc)killer).getAttackType();
                    
                    //If the target Player has prayer headicon on for MELEE (doesn't mean prayer is on!) and npc attacker style is also MELEE
				    if (((Player)target).getPrayers().getHeadIcon() == PrayerData.PrayerHeadIcon.MELEE && npcAttackStyle == NpcData.MELEE) {
					    //The damage will be 0.
                        return 0;
                        //Otherwise if checks if the NPC Melee Attack damage precisely randomized is less then Player's Melee Defence also precisely randomized.
				    } else if (misc.randomDouble(CombatFormula.getNPCMeleeAttack((Npc)killer)) < misc.randomDouble(CombatFormula.getMeleeDefence((Player) target, (Player) target))) {
					    //The damage will be 0.
                        return 0;
				    }
			    }
                //Returns a damage based on the NPC's max hit.
			    return misc.randomDouble(maxDamage);
		    } else {
                //If the target is NPC
			    if (target is Npc) {
                    //Checks if the Player attacker's Melee Attack precisely randomized is less then target's NPC Melee defense also precisely randomized.
				    if (misc.randomDouble(CombatFormula.getMeleeAttack((Player)killer)) < misc.randomDouble(CombatFormula.getNPCMeleeDefence((Npc)target))) {
					    //The damage will be 0.
                        return 0;
				    }
			    }
                //This finds the damage of attacker's MeleeHit vs target [Npc or Player]'s MeleeHit.
			    double damage = CombatFormula.getMeleeHit((Player)killer, target);
                //If target is a Player
			    if (target is Player) {
                    //If target Player has headicon MELEE on (doesn't mean prayer is on)
				    if (((Player) target).getPrayers().getHeadIcon() == PrayerData.PrayerHeadIcon.MELEE) {
                        //the damage calculated from melee hit is reduced by 40% [0.60=40%]
					    damage = (damage * 0.60);
				    }
			    }
                //If damage going to be done is more then target's healthpoints
			    if (damage > target.getHp()) {
                    //damage will be reduced to the target's healthpoints
				    damage = target.getHp();
			    }
                //returns the damage.
			    return damage;
		    }
	    }
	
	    public static void setSkull(Entity killer, Entity target) {
		    if ((killer is Player) && (target is Player)) {
			    if (Location.inFightPits(killer.getLocation())) {
				    return;
			    }
			    if (((Player)killer).getDuel() == null) {
				    if ((killer.getLastKiller() == null || (!killer.getLastKiller().Equals(target)) && !((Player)killer).isSkulled())) {
					    ((Player) killer).renewSkull();
					    target.setLastkiller(killer);
				    }
			    }
		    }
	    }

	    private static bool canAttack(Entity killer, Entity target, bool usingRange) {
		    if (target.isDead() || killer.isDead() || target.isDestroyed() || killer.isDestroyed()) {
			    return false;
		    }
		    if (killer is Npc) {
			    if (((Npc) killer).getId() < 2025 && ((Npc) killer).getId() > 2030) {
				    if (!target.getLocation().inArea(((Npc)killer).getMinimumCoords().getX(), ((Npc)killer).getMinimumCoords().getY(), ((Npc)killer).getMaximumCoords().getX(), ((Npc)killer).getMaximumCoords().getY())) {
					    return false;
				    }
			    }
		    }
		    if (target is Npc) {
			    if (((Npc) target).getHp() <= 0) {
				    return false;
			    }
			    if (((Npc)target).getId() >= 6222 && ((Npc)target).getId() <= 6228) {
				    if (!usingRange && killer is Player) {
					    ((Player)killer).getPackets().sendMessage("You are unable to reach the flying beast..");
					    return false;
				    }
			    }
		    }
		    if ((target is Player) && (killer is Player)) {
			    if (Location.inFightPits(target.getLocation()) && Location.inFightPits(((Player) killer).getLocation())) {
				    if (!Server.getMinigames().getFightPits().hasGameStarted()) {
					    return false;
				    }
				    return true;
			    }
			    if (((Player) killer).getDuel() != null) {
				    if (((Player)target).getDuel() != null) {
					    if (((Player) killer).getDuel().getPlayer2().Equals(((Player) target)) && ((Player) target).getDuel().getPlayer2().Equals(((Player) killer))) {
						    if (((Player) killer).getDuel().ruleEnabled(DuelSession.RULE.NO_MELEE)) {
							    ((Player) killer).getPackets().sendMessage("Melee combat has been disabled in this duel!");
							    return false;
						    }
						    if (((Player) killer).getDuel().getStatus() == 6 && ((Player) target).getDuel().getStatus() == 6) {
							    return true;
						    }
					    }
				    }
				    ((Player) killer).getPackets().sendMessage("That isn't your opponent.");
				    return false;
			    } else
			    if (!Location.inWilderness(target.getLocation())) {
				    ((Player) killer).getPackets().sendMessage("That player isn't in the wilderness.");
				    return false;
			    } else
			    if (!Location.inWilderness(killer.getLocation())) {
				    ((Player) killer).getPackets().sendMessage("You aren't in the wilderness.");
				    return false;
			    }
                int killerWildLevel = ((Player)killer).getLocation().wildernessLevel();
                int targetWildLevel = ((Player)target).getLocation().wildernessLevel();
			    int killerCombatLevel = ((Player)killer).getSkills().getCombatLevel();
                int targetCombatLevel = ((Player)target).getSkills().getCombatLevel();
			    int highest = killerCombatLevel > targetCombatLevel ? killerCombatLevel : targetCombatLevel;
			    int lowest = highest == killerCombatLevel ? targetCombatLevel : killerCombatLevel;
			    int difference = (highest - lowest);
			    if (difference > killerWildLevel || difference > targetWildLevel) {
				    ((Player) killer).getPackets().sendMessage("You must move deeper into the wilderness to attack that player.");
				    return false;
			    }
		    }
		    if (!Location.inMultiCombat(target.getLocation())) {
			    if (killer.getAttacker() != null && !killer.getAttacker().Equals(target) && killer.getLastAttacked() > 0) {
				    if (killer is Player) {
					    ((Player) killer).getPackets().sendMessage("You are already in combat!");
				    }
				    return false;
			    }
			    if (target.getAttacker() != null && !target.getAttacker().Equals(killer) && target.getLastAttacked() > 0) {
				    if (killer is Player) {
					    string type = target is Player ? "player" : "npc";
					    ((Player) killer).getPackets().sendMessage("That " + type + " is already in combat.");
				    }
				    return false;
			    }
		    }
		    return true;
	    }

	    public static void checkVengeance(Entity killer, Entity target, double damage) {
		    if (target is Npc || damage <= 0 || ((target.getHp() - damage) <= 0)) {
			    return;
		    }
		    if (((Player) target).hasVengeance()) {
			    if (Environment.TickCount - ((Player)target).getLastVengeanceTime() <= 600) {
				    return;
			    }
			    int vengDamage = misc.random((int) (damage * 0.75));
			    ((Player) target).setForceText("Taste vengeance!");
			    ((Player) target).setVengeance(false);
			    killer.hit(vengDamage);
			    ((Player) killer).setLastVengeanceTime(Environment.TickCount);
			    return;
		    }
		    return;
	    }
	
	    public static void addXp(Entity killer, Entity target, double damage) {
		    int xpRate = 230;
		    if ((killer is Player) && (target is Npc)) {
			    Player p = (Player) killer;
			    CombatType type = p.getLastCombatType();
			    AttackStyle.CombatSkill fightType = p.getAttackStyle().getSkill();
                AttackStyle.CombatStyle fightStyle = p.getAttackStyle().getStyle();
			    if(type == CombatType.MELEE) {
                    if (!fightType.Equals(AttackStyle.CombatSkill.CONTROLLED))
                    {
					    Skills.SKILL skill = Skills.SKILL.ATTACK;
                        if (fightType.Equals(AttackStyle.CombatSkill.ACCURATE))
                        {
						    skill = Skills.SKILL.ATTACK;
                        }
                        else if (fightType.Equals(AttackStyle.CombatSkill.DEFENSIVE))
                        {
						    skill = Skills.SKILL.DEFENCE;
                        }
                        else if (fightType.Equals(AttackStyle.CombatSkill.AGGRESSIVE))
                        {
						    skill = Skills.SKILL.STRENGTH;
					    }
                        p.getSkills().addXp(skill, (xpRate * damage));
                        p.getSkills().addXp(Skills.SKILL.HITPOINTS, (xpRate * 0.30));
				    } else {
                        p.getSkills().addXp(Skills.SKILL.ATTACK, ((xpRate * 0.30) * damage));
                        p.getSkills().addXp(Skills.SKILL.DEFENCE, ((xpRate * 0.30) * damage));
                        p.getSkills().addXp(Skills.SKILL.STRENGTH, ((xpRate * 0.30) * damage));
                        p.getSkills().addXp(Skills.SKILL.HITPOINTS, (0.25 * damage));
				    }
			    } else {
                    if (fightStyle.Equals(AttackStyle.CombatStyle.RANGE_ACCURATE) || fightStyle.Equals(AttackStyle.CombatStyle.RANGE_RAPID))
                    {
					    p.getSkills().addXp(Skills.SKILL.RANGE, (xpRate * damage));
                    }
                    else if (fightStyle.Equals(AttackStyle.CombatStyle.RANGE_DEFENSIVE))
                    {
					    p.getSkills().addXp(Skills.SKILL.RANGE, ((xpRate * 0.50) * damage));
					    p.getSkills().addXp(Skills.SKILL.DEFENCE, ((xpRate * 0.50) * damage));
				    }
				    p.getSkills().addXp(Skills.SKILL.HITPOINTS, ((xpRate * 0.30) * damage));
			    }
		    }
		    target.addToHitCount(killer, damage);
	    }

	    public static void resetCombat(Entity killer, int type) {
		    if (killer != null) {
			    killer.setEntityFocus(65535);
			    killer.setTarget(null);
			    killer.getFollow().setFollowing(null);
			    if (type == 1) {
				    killer.setLastAttack(0);
				    killer.setLastAttacked(0);
				    if (killer.getAttacker() != null) {
					    if (killer.getAttacker().getEntityFocus() != -1) {
						    if (killer.getAttacker().getEntityFocus() == killer.getClientIndex()) {
							    killer.getAttacker().setEntityFocus(65535);
						    }
					    }
                        killer.setAttacker(null);
				    }
			    }
		    }
	    }
    }
}
