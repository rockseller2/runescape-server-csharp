using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RunescapeServer.player;

namespace RunescapeServer.packethandler.commands
{
    class Bank : Command
    {
        public void execute(Player player, string[] arguments)
        {
            if (!player.inCombat())
                player.getBank().openBank();
        }

        public int minimumRightsNeeded()
        {
            return 0;
        }
    }
}
