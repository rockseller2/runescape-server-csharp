using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using RunescapeServer.player;
using RunescapeServer.net;

namespace RunescapeServer.packethandler
{
    interface PacketHandler
    {
        void handlePacket(Player player, Packet p);
    }
}
