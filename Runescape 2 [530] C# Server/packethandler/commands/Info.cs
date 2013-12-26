using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RunescapeServer.player;
using RunescapeServer.combat;
using RunescapeServer.npc;
using RunescapeServer.definitions;

namespace RunescapeServer.packethandler.commands
{
    class Info : Command
    {
        public void execute(Player player, string[] arguments)
        {
            if (arguments.Length == 0)
            {
                player.getPackets().sendMessage("[Info command]: ::info npcId (example ::info 1)");
                return;
            }

            int npcId = 0;

            if (!int.TryParse(arguments[0], out npcId))
            {
                player.getPackets().sendMessage("[Info command]: ::info npcId (example ::info 1)");
                return;
            }
            if (npcId < 0 || npcId > NpcData.getTotalNpcDefinitions())
                return;

            player.getPackets().sendMessage("ATT = " + (int)CombatFormula.getMeleeAttack(player) + " DEF = " + (int)CombatFormula.getMeleeDefence(player, player) + " SPEC = " + (int)CombatFormula.getMeleeAttack(player) * CombatFormula.getSpecialAttackBonus(player.getEquipment().getItemInSlot(ItemData.EQUIP.WEAPON)));
            player.getPackets().sendMessage("NPC ATT = " + (int)CombatFormula.getNPCMeleeAttack(new Npc(npcId)) + " NPC DEF = " + (int)CombatFormula.getNPCMeleeDefence(new Npc(npcId)));
        }

        public int minimumRightsNeeded()
        {
            return 0;
        }
    }
}
