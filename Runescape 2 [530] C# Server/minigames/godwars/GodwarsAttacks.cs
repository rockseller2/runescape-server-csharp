using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RunescapeServer.model;
using RunescapeServer.player;
using RunescapeServer.npc;
using RunescapeServer.player.skills.prayer;
using RunescapeServer.events;
using RunescapeServer.util;

namespace RunescapeServer.minigames.godwars
{
    class GodwarsAttacks
    {
        public GodwarsAttacks() {
	    }
	
	    private static string[] BANDOS_SHOUTS = {
		    "Death to our enemies!",
	        "Brargh!",
	        "Break their bones!",
	        "For the glory of the Big High War God!",
	        "Split their skulls!",
	        "We feast on the bones of our enemies tonight!",
	        "CHAAARGE!",
	        "Crush them underfoot!",
	        "All glory to Bandos!",
	        "GRAAAAAAAAAR!",
	    };
	
	    private static string[] ZAMORAK_SHOUTS = {
	        "Attack them, you dogs!",
	        "Forward!",
	        "Death to Saradomin's dogs!",
	        "Kill them, you cowards!",
	        "The Dark One will have their souls!",
	        "Zamorak curse them!",
	        "YARRRRRRR!",
	        "Rend them limb from limb!",
	        "No retreat!",
	    };
	
	    private static string[] SARADOMIN_SHOUTS = {
	        "Death to the enemies of the light!",
	        "Slay the evil ones!",
	        "Saradomin lend me strength!",
	        "By the power of Saradomin!",
	        "May Saradomin be my sword!",
	        "Good will always triumph!",
	        "Forward! Our allies are with us!",
	        "Saradomin is with us!",
	        "In the name of Saradomin!",
	        "Attack! Find the Godsword!",
	    };

	    public static void attack(Npc npc, Entity target) {
		    if (npc.isDead() || npc.isDestroyed() || target.isDead() || target.isDestroyed() || target.isDead()) {
			    return;
		    }
		    double damage = misc.randomDouble(npc.getMaxHit());
            PrayerData.PrayerHeadIcon prayerHeadIcon = ((Player)target).getPrayers().getHeadIcon();
		    int hitDelay = npc.getHitDelay();
		    int animation = npc.getAttackAnimation();
		    bool special = false;
		    switch(npc.getId()) {
			    case 6263: // Steelwill (bandos mage)
				    hitDelay = 1000;
				    animation = 65535;
                    if (prayerHeadIcon == PrayerData.PrayerHeadIcon.MAGIC)
					    damage = 0;

				    ((Player)target).getPackets().sendProjectile(npc.getLocation(), target.getLocation(), 32, 1203, 50, 40, 34, 50, target);
				    //npc.graphics(1201);
				    break;
				
			    case 6260: // Graardor (bandos)
				    randomMessage(npc, BANDOS_SHOUTS);
				    if (misc.random(3) == 0) {
					    special = true;
					    hitDelay = 1000;
					    animation = 7063;
					    ((Player)target).getPackets().sendProjectile(npc.getLocation(), target.getLocation(), 32, 1200, 50, 40, 34, 50, target);
                        if (prayerHeadIcon == PrayerData.PrayerHeadIcon.RANGE)
						    damage = 0;
					    else
						    damage = misc.randomDouble(35);
				    } else {
                        if (prayerHeadIcon == PrayerData.PrayerHeadIcon.MELEE)
						    damage = 0;
				    }
				    break;
				
			    case 6265: // Grimspike (bandos range)
				    hitDelay = 1000;
				    animation = 65535;
                    if (prayerHeadIcon == PrayerData.PrayerHeadIcon.RANGE)
					    damage = 0;
				    ((Player)target).getPackets().sendProjectile(npc.getLocation(), target.getLocation(), 32, 1206, 50, 40, 34, 50, target);
				    //npc.graphics(1201);
				    break;
				
			    case 6247: // Zilyana (sara boss)
				    randomMessage(npc, SARADOMIN_SHOUTS);
                    //One out of 3 chance
				    if (misc.random(3) == 0) {
					    animation = 6967;
					    special = true;
                        if (prayerHeadIcon == PrayerData.PrayerHeadIcon.MAGIC)
						    damage = 0;
				    } else {
                        if (prayerHeadIcon == PrayerData.PrayerHeadIcon.MELEE)
						    damage = 0;
				    }
				    break;
				
			    case 6250: // Growler (sara mage)
				    hitDelay = 1000;
                    if (prayerHeadIcon == PrayerData.PrayerHeadIcon.MAGIC)
					    damage = 0;
				    ((Player)target).getPackets().sendProjectile(npc.getLocation(), target.getLocation(), 32, 1227, 50, 20, 27, 50, target);			
				    break;
				
			    case 6252: // Bree (sara range)
				    hitDelay = 1000;
                    if (prayerHeadIcon == PrayerData.PrayerHeadIcon.RANGE)
					    damage = 0;
				    ((Player)target).getPackets().sendProjectile(npc.getLocation(), target.getLocation(), 32, 1227, 50, 20, 27, 50, target);			
				    //TODO all anims
				    break;
				
			    case 6203: // K'ril Tsutsaroth (zammy boss)
				    randomMessage(npc, ZAMORAK_SHOUTS);
                    if (prayerHeadIcon == PrayerData.PrayerHeadIcon.MELEE)
					    damage = 0;
                    //One out of 3 chance.
				    if (misc.random(3) == 0) {
					    animation = 6947;
					    damage = misc.randomDouble(49);
                        if (prayerHeadIcon != PrayerData.PrayerHeadIcon.MELEE && damage < (49 / 2))
						    damage = (49 / 2) + misc.randomDouble(49/2);
				    }
                    //One out of 4 chance.
				    if (misc.random(4) == 0) {
					    if (!target.isPoisoned()) {
						    if (damage > 0) {
							    Server.registerEvent(new PoisonEvent(target, 16));
						    }
					    }
				    }
				    break;
				
			    case 6208: // Balfrug Kreeyath (zammy mage)
				    hitDelay = 1200;
                    if (prayerHeadIcon == PrayerData.PrayerHeadIcon.MAGIC)
					    damage = 0;
				    ((Player)target).getPackets().sendProjectile(npc.getLocation(), target.getLocation(), 32, 1213, 50, 20, 27, 70, target);			
				    // TODO attack anim
				    break;
				
			    case 6206: // Zakl'n Gritch (zammy range)
				    hitDelay = 1200;
                    if (prayerHeadIcon == PrayerData.PrayerHeadIcon.RANGE)
					    damage = 0;
				    npc.setLastGraphics(new Graphics(1208));
				    ((Player)target).getPackets().sendProjectile(npc.getLocation(), target.getLocation(), 32, 1209, 50, 20, 27, 70, target);
				    break;
				
			    case 6222: // Kree'arra (armadyl boss)
                    //One out of 4 chance npc talking will display.
				    if (misc.random(4) == 0)
					    npc.setForceText("Kraaaaw!");
				    hitDelay = 1200;
                    //50% chance
				    if (misc.random(2) == 0 && npc.getAttacker() != null && npc.getAttacker().Equals(npc.getTarget())) {
					    special = true;
					    // Magic attack
					    damage = misc.randomDouble(21);
                        if (prayerHeadIcon == PrayerData.PrayerHeadIcon.MAGIC)
						    damage = 0;
					    ((Player)target).getPackets().sendProjectile(npc.getLocation(), target.getLocation(), 32, 1198, 50, 20, 27, 70, target);
				    } else if (npc.getAttacker() != null && npc.getAttacker().Equals(npc.getTarget())){
					    //range attack
                        if (prayerHeadIcon == PrayerData.PrayerHeadIcon.RANGE)
						    damage = 0;
					    ((Player)target).getPackets().sendProjectile(npc.getLocation(), target.getLocation(), 32, 1197, 50, 20, 27, 70, target);
				    } else {
					    // do melee attack because they arent attacking kree arra
                        damage = misc.randomDouble(25);
                        if (prayerHeadIcon == PrayerData.PrayerHeadIcon.MELEE)
						    damage = 0;
					    animation = 6977;
				    }
				    break;
				
			    case 6223: // Armadyl mage
				    hitDelay = 1200;
                    if (prayerHeadIcon == PrayerData.PrayerHeadIcon.MAGIC)
					    damage = 0;
				    ((Player)target).getPackets().sendProjectile(npc.getLocation(), target.getLocation(), 32, 1199, 50, 20, 27, 70, target);
				    break;
				
			    case 6225: // Armadyl range
				    hitDelay = 1200;
                    if (prayerHeadIcon == PrayerData.PrayerHeadIcon.RANGE)
					    damage = 0;
				    ((Player)target).getPackets().sendProjectile(npc.getLocation(), target.getLocation(), 32, 1190, 50, 20, 27, 70, target);
				    break;
		    }
		    if (animation != 65535) {
			    npc.setLastAnimation(new Animation(animation));
		    }
		    target.setLastAttacked(Environment.TickCount);
		    npc.setLastAttack(Environment.TickCount);
		    target.setAttacker(npc);
		    npc.resetCombatTurns();
		    if (damage > target.getHp()) {
			    damage = target.getHp();
		    }
		    double hit = damage;
            Event attackEvent = new Event(hitDelay);
            attackEvent.setAction(() => {
				attackEvent.stop();
				if (npc.getId() == 6263) {
					target.setLastGraphics(new Graphics(((hit > 0.10) ? 166 : 85), 0, 100));
				} else if (npc.getId() == 6260) {
					if (special) {
						target.setLastGraphics(new Graphics(((hit > 0.10) ? 160 : 65535), 0, 100));
					}
				} else if (npc.getId() == 6247) {
					if (special) {
                        if (hit < 0.10) { //No damage.
							return;
						} else {
							target.setLastGraphics(new Graphics(1207, 0, 100));
							npc.setCombatTurns(npc.getAttackSpeed() * 2);
						}
					}
				} else if (npc.getId() == 6208) {
					if (hit < 0.10) //No damage.
						target.setLastGraphics(new Graphics(85, 0, 100));
				} else if (npc.getId() == 6222) {
					if (special) {
						target.setLastGraphics(new Graphics(((hit > 0.10) ? 85 : 65535), 0, 100));
					}
				}
				if ((target.getCombatTurns() > 2 || target.getCombatTurns() < 0)) {
					target.setLastAnimation(new Animation(target.getDefenceAnimation()));
				}
				target.hit(hit);
		    });
            Server.registerEvent(attackEvent);
	    }

	    private static void randomMessage(Npc boss, string[] shouts) {
            //One out of 4 chance nothing will happen.
		    if (misc.random(4) != 0)
			    return;
            //Otherwise the boss npc will talk random message in game.
		    string message = shouts[misc.random(shouts.Length - 1)];
		    boss.setForceText(message);
	    }
        }
    }
