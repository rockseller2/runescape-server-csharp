using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using RunescapeServer.player;
using RunescapeServer.net;
using RunescapeServer.packethandler.commands;

namespace RunescapeServer.packethandler
{
    class Command : PacketHandler
    {
        public void handlePacket(Player player, Packet p)
        {
            string command = p.readRS2String().ToLower();
            CommandManager.execute(player, command);
        }
    }
}
