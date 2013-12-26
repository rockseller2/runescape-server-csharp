using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RunescapeServer.player;

namespace RunescapeServer.packethandler.commands
{
    class CharacterAppearance : Command
    {
        public void execute(Player player, string[] arguments)
        {
            ConfigureAppearance.openInterface(player);
        }

        public int minimumRightsNeeded()
        {
            return 0;
        }
    }
}
