﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RunescapeServer.player;
using RunescapeServer.model;

namespace RunescapeServer.packethandler.commands
{
    class AboveGround : Command
    {
        public void execute(Player player, string[] arguments)
        {
            player.teleport(new Location(player.getLocation().getX(), player.getLocation().getY() - 6400, 0));
        }

        public int minimumRightsNeeded()
        {
            return 0;
        }
    }
}
