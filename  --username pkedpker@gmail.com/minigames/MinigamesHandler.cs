using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RunescapeServer.minigames.agilityarena;
using RunescapeServer.minigames.fightpits;
using RunescapeServer.player;

namespace RunescapeServer.minigames
{
    class MinigamesHandler
    {
        private AgilityArena agilityArena;
	    private FightPits fightPits;

        public MinigamesHandler()
        {
		    this.agilityArena = new AgilityArena();
		    this.fightPits = new FightPits();
	    }

	    public AgilityArena getAgilityArena() {
		    return agilityArena;
	    }

	    public FightPits getFightPits() {
		    return fightPits;
	    }
    }
}
