using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RunescapeServer.player;

namespace RunescapeServer.packethandler.commands
{
    class RestoreSpecialAttack : Command
    {
        public void execute(Player player, string[] arguments)
        {
            player.getSpecialAttack().resetSpecial();
        }

        public int minimumRightsNeeded()
        {
            return 0;
        }
    }
}
