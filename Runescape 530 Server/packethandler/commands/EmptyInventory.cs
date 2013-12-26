using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RunescapeServer.player;

namespace RunescapeServer.packethandler.commands
{
    class EmptyInventory : Command
    {
        public void execute(Player player, string[] arguments)
        {
            player.getInventory().deleteAll();
        }

        public int minimumRightsNeeded()
        {
            return 0;
        }
    }
}
