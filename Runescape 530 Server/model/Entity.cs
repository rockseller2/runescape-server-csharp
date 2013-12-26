using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using RunescapeServer.npc;
using RunescapeServer.player;
using RunescapeServer.combat;
using RunescapeServer.util;
using RunescapeServer.events;

namespace RunescapeServer.model
{
    abstract class Entity
    {
        private Animation lastAnimation;
        private Graphics lastGraphics;
        private Location location;
        private Location faceLocation;
        private int entityFocusId; 
	    private int index;
	    private Sprite sprite;
	    private Location teleportTo = null;
	    private Hits hits;
	    private bool dead;
	    private bool visible;
	    private int combatTurns;
	    private Entity target;
	    private Entity attacker;
	    private Entity lastOpponent;
	    private int lastAttack;
	    private int lastAttacked;
	    private int poisonAmount;
	    private int lastMagicAttack;
        protected Queue<Hits.Hit> queuedHits;
	    private Dictionary<Entity, double> killers;
        private double damageTaken;
        private Dictionary<string, Object> temporaryAttributes;
	    protected Follow follow;
	    private int lastAttackType;
	    private int miasmicEffect;
	    private bool frozen;

	    public Entity() {
            this.entityFocusId = -1;
            queuedHits = new Queue<Hits.Hit>();
            hits = new Hits();
            visible = true;
            dead = false;
            target = null;
            attacker = null;
            combatTurns = 0;
            poisonAmount = 0;
            damageTaken = 0; //this is used for small damages such as 0.10 etc. when it reaches 1.0 it will take 1 hp off health.
            killers = new Dictionary<Entity, double>();
            temporaryAttributes = new Dictionary<string, Object>();
            follow = new Follow(this);
            sprite = new Sprite();
            this.location = new Location(2322 + misc.random(1), 3171 + misc.random(5), 0);
	    }

	    public abstract void hit(double damage);
        public abstract void hit(double damage, Hits.HitType type);
	    public abstract int getMaxHp();
	    public abstract int getHp();
        public abstract void setHp(int newHp);
	    public abstract bool isAutoRetaliating();
	    public abstract int getAttackAnimation();
	    public abstract int getAttackSpeed();
	    public abstract int getHitDelay();
	    public abstract double getMaxHit();
	    public abstract int getDefenceAnimation();
	    public abstract int getDeathAnimation();
	    public abstract void dropLoot();
	    public abstract bool isDestroyed();
	    public abstract void heal(int amount);

        public void setTemporaryAttribute(string attribute, Object value)
        {
            object retObj;
            if (temporaryAttributes.TryGetValue(attribute, out retObj))
                temporaryAttributes[attribute] = value;  //Exists already, so altar.
            else
                temporaryAttributes.Add(attribute, value); //Not existed yet. so add
                
        }

        public object getTemporaryAttribute(string attribute)
        {
            object retObj;
            if (temporaryAttributes.TryGetValue(attribute, out retObj))
                return temporaryAttributes[attribute];
            else
                return null;
        }

        public void removeTemporaryAttribute(string attribute)
        {
            temporaryAttributes.Remove(attribute);
        }

        public void setForceText(string forceText)
        {
            setTemporaryAttribute("forceText", forceText);
            if (this is Player)
                ((Player)this).getUpdateFlags().setForceTextUpdateRequired(true);
            else if (this is Npc)
                ((Npc)this).getUpdateFlags().setForceTextUpdateRequired(true);
        }

        public void setLastAnimation(Animation lastAnimation)
        {
            this.lastAnimation = lastAnimation;
            if (this is Player)
                ((Player)this).getUpdateFlags().setAnimationUpdateRequired(true);
            else if (this is Npc)
                ((Npc)this).getUpdateFlags().setAnimationUpdateRequired(true);
        }

        public Animation getLastAnimation()
        {
            return lastAnimation;
        }

        public void setLastGraphics(Graphics lastGraphics)
        {
            this.lastGraphics = lastGraphics;
            if (this is Player)
                ((Player)this).getUpdateFlags().setGraphicsUpdateRequired(true);
            else if (this is Npc)
                ((Npc)this).getUpdateFlags().setGraphicsUpdateRequired(true);
        }

        public Graphics getLastGraphics()
        {
            return lastGraphics;
        }

        public void processQueuedHits()
        {
            // kinda messy, but what can you do.
            Hits.Hit hit = null;
            Hits.Hit hit2 = null;

            if(this is Player) {
                if (!((Player)this).getUpdateFlags().isHitUpdateRequired())
                {
                    if (queuedHits.Count() > 0)
                    {
                        hit = queuedHits.Dequeue();

                        //Send damage of hit1 to screen.
                        getHits().setHit1(hit);
                        ((Player)this).getUpdateFlags().setHitUpdateRequired(true);
                    }
                }
                if (!((Player)this).getUpdateFlags().isHit2UpdateRequired())
                {
                    if (queuedHits.Count() > 0)
                    {
                        hit2 = queuedHits.Dequeue();

                        //Send damage of hit2 to screen.
                        getHits().setHit2(hit2);
                        ((Player)this).getUpdateFlags().setHit2UpdateRequired(true);
                    }
                }
            } else {
                if (!((Npc)this).getUpdateFlags().isHitUpdateRequired())
                {
                    if (queuedHits.Count() > 0)
                    {
                        hit = queuedHits.Dequeue();

                        //Send damage of hit1 to screen.
                        getHits().setHit1(hit);
                        ((Npc)this).getUpdateFlags().setHitUpdateRequired(true);
                    }
                }
                if (!((Npc)this).getUpdateFlags().isHit2UpdateRequired())
                {
                    if (queuedHits.Count() > 0)
                    {
                        hit2 = queuedHits.Dequeue();

                        //Send damage of hit2 to screen.
                        getHits().setHit2(hit2);
                        ((Npc)this).getUpdateFlags().setHit2UpdateRequired(true);
                    }
                }
            }

            if(hit != null)
                damageTaken += ((double)hit.getDamage() / 10);
            if (hit2 != null)
                damageTaken += ((double)hit2.getDamage() / 10);

            //If the fraction damage adds up to 1 damage or mroe then we process it off healthpoints.
            if (this is Player && damageTaken >= 1)
            {
                Skills skills = ((Player)this).getSkills();
                int damageToTake = (int)damageTaken;

                skills.setCurLevel(Skills.SKILL.HITPOINTS, skills.getCurLevel(Skills.SKILL.HITPOINTS) - damageToTake);
                damageTaken -= damageToTake;
                if (skills.getCurLevel(Skills.SKILL.HITPOINTS) <= 0)
                {
                    skills.setCurLevel(Skills.SKILL.HITPOINTS, 0);
                    if (!isDead())
                    {
                        Server.registerEvent(new DeathEvent(this));
                        setDead(true);
                    }
                }
                ((Player)this).getPackets().sendSkillLevel(Skills.SKILL.HITPOINTS);
            }
            else if (this is Npc && damageTaken >= 1)
            {
                NpcSkills skills = ((Npc)this).getSkills();
                int damageToTake = (int)damageTaken;

                skills.setCurLevel(NpcSkills.SKILL.HITPOINTS, skills.getCurLevel(NpcSkills.SKILL.HITPOINTS) - damageToTake);
                damageTaken -= damageToTake;
                if (skills.getCurLevel(NpcSkills.SKILL.HITPOINTS) == 0)
                {
                    if (!isDead())
                    {
                        Server.registerEvent(new DeathEvent(this));
                        setDead(true);
                    }
                }
            }
        }

	    public void addToHitCount(Entity killer, double damage) {
            /*
             * Damage could be 0.5 which if followed by another damage 
             * which also does 0.5 then
             * It will take 1 health point off the target [player or npc]
             * 
             * Not to mention this is used to tell who did the most damage 
             * on a target in PVP, or on a PVE monster (to get drops shown to killer).
             */
		    if(!killers.ContainsKey(killer)) {
			    killers.Add(killer, damage);
		    } else {
			    killers[killer] += damage;
		    }
	    }
	
	    public Entity getKiller() {
		    Entity highestHitter = null;
		    int highestHit = 0;
            foreach (KeyValuePair<Entity, double> entry in killers)
            {
			    if (entry.Key != null) {
				    if(entry.Value > highestHit) {
					    highestHitter = entry.Key;
				    }
			    }
		    }
		    return highestHitter;
	    }

	    public void clearKillersHits() {
		    killers.Clear();
	    }

	    public Hits getHits() {
		    return hits;
	    }
	
	    public void teleport(Location location) {
		    this.teleportTo = location;
		    if (this is Player) {
			    ((Player) this).getWalkingQueue().resetWalkingQueue();
		    }
	    }
	
	    public void resetTeleportTo() {
		    this.teleportTo = null;
	    }
	
	    public Location getTeleportTo() {
		    return this.teleportTo;
	    }
	
	    public void setLocation(Location location) {
		    this.location = location;
	    }
	
	    public Location getLocation() {
		    return location;
	    }

        public void setFaceLocation(Location faceLocation)
        {
            this.faceLocation = faceLocation;
            if (this is Player)
                ((Player)this).getUpdateFlags().setFaceLocationUpdateRequired(true);
            else if (this is Npc)
                ((Npc)this).getUpdateFlags().setFaceLocationUpdateRequired(true);
        }

        public Location getFaceLocation()
        {
            return faceLocation;
        }

        public void setEntityFocus(int entityFocus)
        {
            this.entityFocusId = entityFocus;
            if (this is Player)
                ((Player)this).getUpdateFlags().setEntityFocusUpdateRequired(true);
            else if(this is Npc)
                ((Npc)this).getUpdateFlags().setEntityFocusUpdateRequired(true);
        }

        public int getEntityFocus()
        {
            return entityFocusId;
        }

	    public void setIndex(int index) {
		    this.index = index;
	    }
	
	    public int getIndex() {
		    return this.index;
	    }
	
	    public void setVisible(bool visible) {
            this.visible = visible;
	    }
	
	    public bool isVisible() {
            return visible;
	    }
	
	    public void setDead(bool dead) {
		    this.dead = dead;
            //Resets damage taken back to 0.
            damageTaken = 0;
	    }
	
	    public bool isDead() {
		    return dead;
	    }
	
	    public int getClientIndex() {
		    if(this is Player) {
			    return this.index + 32768;
		    } else {
			    return this.index;
		    }
	    }
	
	    public bool inCombat() {
		    if (target == null && attacker == null) {
			    return false;
		    }
		    return true;
	    }

	    public void setTarget(Entity target) {
		    this.target = target;
	    }

	    public Entity getTarget() {
		    return target;
	    }

	    public void setAttacker(Entity attacker) {
		    this.attacker = attacker;
	    }

	    public Entity getAttacker() {
		    return attacker;
	    }
	
	    public void setCombatTurns(int i) {
		    combatTurns = i;
	    }
	
	    public int getCombatTurns() {
		    return combatTurns;
	    }
	
	    public void resetCombatTurns() {
		    combatTurns = 0;
	    }
	
	    public void incrementCombatTurns() {
		    combatTurns++;
	    }

	    public void setLastkiller(Entity lastOpponent) {
		    this.lastOpponent = lastOpponent;
	    }

	    public Entity getLastKiller() {
		    return lastOpponent;
	    }

	    public bool isPoisoned() {
		    return poisonAmount > 0;
	    }

        public void setPoisonAmount(int poisonAmount)
        {
            if (poisonAmount <= 0)
                poisonAmount = 0;
		    this.poisonAmount = poisonAmount;
	    }

	    public int getPoisonAmount() {
		    return poisonAmount;
	    }

	    public void setLastAttack(int lastAttack) {
		    this.lastAttack = lastAttack;
	    }

	    public int getLastAttack() {
		    return lastAttack;
	    }

	    public Follow getFollow() {
		    return follow;
	    }

	    public void setLastAttackType(int lastAttackType) {
		    this.lastAttackType = lastAttackType;
	    }

	    public int getLastAttackType() {
		    return lastAttackType;
	    }

	    public void setLastMagicAttack(int lastMagicAttack) {
		    this.lastMagicAttack = lastMagicAttack;
	    }

	    public int getLastMagicAttack() {
		    return lastMagicAttack;
	    }

	    public Sprite getSprites() {
		    return sprite;
	    }

	    public void setLastAttacked(int lastAttacked) {
		    this.lastAttacked = lastAttacked;
	    }

	    public int getLastAttacked() {
		    return lastAttacked;
	    }

	    public void setMiasmicEffect(int miasmicEffect) {
		    this.miasmicEffect = miasmicEffect;
	    }

	    public int getMiasmicEffect() {
		    return miasmicEffect;
	    }

	    public void setFrozen(bool frozen) {
		    this.frozen = frozen;
	    }

	    public bool isFrozen() {
		    return frozen;
	    }
	
    }
}
