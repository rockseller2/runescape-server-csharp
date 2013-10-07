using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RunescapeServer.player.skills.fletching;
using RunescapeServer.player.skills.herblore;
using RunescapeServer.player.skills.cooking;
using RunescapeServer.player.skills.mining;
using RunescapeServer.player.skills.smithing;
using RunescapeServer.player.skills.woodcutting;
using RunescapeServer.player.skills.fishing;
using RunescapeServer.player.skills.crafting;

namespace RunescapeServer.player.skills
{
    class SkillHandler
    {
        public static int SKILLCAPE_PRICE = 250000;

	    public static void resetAllSkills(Player p) {
		    Fletching.setFletchItem(p, null);
		    Herblore.setHerbloreItem(p, null);
		    Cooking.setCookingItem(p, null);
		    Mining.resetMining(p);
		    Smithing.resetSmithing(p);
		    Woodcutting.resetWoodcutting(p);
		    Fishing.resetFishing(p);
		    Crafting.resetCrafting(p);
		    p.removeTemporaryAttribute("harvesting");
	    }
    }
}
