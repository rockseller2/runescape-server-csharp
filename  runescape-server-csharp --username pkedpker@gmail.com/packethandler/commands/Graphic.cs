using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RunescapeServer.player;
using RunescapeServer.model;

namespace RunescapeServer.packethandler.commands
{
    class Graphic : Command
    {
        public void execute(Player player, string[] arguments) {
            if (arguments.Length == 0)
            {
                player.getPackets().sendMessage("[Graphic command]: ::gfx gfx_number");
                return;
            }

            int gfxId = 0;
            if (!int.TryParse(arguments[0], out gfxId))
                gfxId = 0;
            player.setLastGraphics(new Graphics(gfxId, 0, 100));
	    }

	    public int minimumRightsNeeded() {
		    return 0;
	    }
    }
}
