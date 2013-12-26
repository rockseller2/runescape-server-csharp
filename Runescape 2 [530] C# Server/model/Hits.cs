using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RunescapeServer.model
{
    class Hits
    {
        public enum HitType {
		    NO_DAMAGE = 0,			// blue
		    NORMAL_DAMAGE = 1,		// red
		    POISON_DAMAGE = 2,		// green
		    DISEASE_DAMAGE = 3	    // orange
	    }
	
	    public class Hit {
		
		    private HitType type;
		    private double damage;
		
		    public Hit(double damage, HitType type) {
			    this.type = type;
			    this.damage = damage;
		    }
		
		    public HitType getType() {
			    return type;
		    }
		
		    public int getDamage() {
                //This is used only to display the damage on client-side.
                //damage of 1.00 is shown as 10 damage
                //damage of 1.13 shown as 11 damage
                //damage of 1.15 shown as 12 damage
                //damage of 0.10 is shown as 1 damage. (lowest possible damage)

                //This is needed because 0.09 will round up to 1 damage when it should be 0.
                if (damage < 0.10) damage = 0;
                return (int)Math.Round(damage * 10);
		    }
	    }
	
	    public Hits() {
		    hit1 = null;
		    hit2 = null;
	    }
	
	    private Hit hit1;
	    private Hit hit2;
	
	    public void setHit1(Hit hit) {
		    this.hit1 = hit;
	    }

	    public void setHit2(Hit hit) {
		    this.hit2 = hit;
	    }
	
	    public int getHitDamage1() {
		    if(hit1 == null) {
			    return 0;
		    }
		    return hit1.getDamage();
	    }
	
	    public int getHitDamage2() {
		    if(hit2 == null) {
			    return 0;
		    }
		    return hit2.getDamage();
	    }
	
	    public HitType getHitType1() {
		    if(hit1 == null) {
			    return HitType.NO_DAMAGE;
		    }
            return hit1.getType();
	    }

        public HitType getHitType2()
        {
		    if(hit2 == null) {
			    return HitType.NO_DAMAGE;
		    }
		    return hit2.getType();
	    }
	
	    public void clear() {
		    hit1 = null;
		    hit2 = null;
	    }
    }
}
