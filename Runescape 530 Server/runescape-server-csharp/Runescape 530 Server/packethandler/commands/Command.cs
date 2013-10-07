using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RunescapeServer.player;

namespace RunescapeServer.packethandler.commands
{
    interface Command
    {
        void execute(Player player, string[] arguments);
        int minimumRightsNeeded();
    }
}
