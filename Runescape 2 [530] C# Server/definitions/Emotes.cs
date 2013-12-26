using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RunescapeServer.model;
using RunescapeServer.player;
using RunescapeServer.events;

namespace RunescapeServer.definitions
{
    class Emotes
    {
        /**
         * Handles a player emote: does the appropriate animation.
         * @param player
         * @param buttonId
         * @return
         */
        public static bool emote(Player player, int buttonId)
        {
            if (buttonId == 2)
            {
                player.setLastAnimation(new Animation(855, 0));
            }
            else if (buttonId == 3)
            {
                player.setLastAnimation(new Animation(856, 0));
            }
            else if (buttonId == 4)
            {
                player.setLastAnimation(new Animation(858, 0));
            }
            else if (buttonId == 5)
            {
                player.setLastAnimation(new Animation(859, 0));
            }
            else if (buttonId == 6)
            {
                player.setLastAnimation(new Animation(857, 0));
            }
            else if (buttonId == 7)
            {
                player.setLastAnimation(new Animation(863, 0));
            }
            else if (buttonId == 8)
            {
                player.setLastAnimation(new Animation(2113, 0));
            }
            else if (buttonId == 9)
            {
                player.setLastAnimation(new Animation(862, 0));
            }
            else if (buttonId == 10)
            {
                player.setLastAnimation(new Animation(864, 0));
            }
            else if (buttonId == 11)
            {
                player.setLastAnimation(new Animation(861, 0));
            }
            else if (buttonId == 12)
            {
                player.setLastAnimation(new Animation(2109, 0));
            }
            else if (buttonId == 13)
            {
                player.setLastAnimation(new Animation(2111, 0));
            }
            else if (buttonId == 14)
            {
                player.setLastAnimation(new Animation(866, 0));
            }
            else if (buttonId == 15)
            {
                player.setLastAnimation(new Animation(2106, 0));
            }
            else if (buttonId == 16)
            {
                player.setLastAnimation(new Animation(2107, 0));
            }
            else if (buttonId == 17)
            {
                player.setLastAnimation(new Animation(2108, 0));
            }
            else if (buttonId == 18)
            {
                player.setLastAnimation(new Animation(860, 0));
            }
            else if (buttonId == 19)
            {
                player.setLastAnimation(new Animation(0x558, 0));
                player.setLastGraphics(new Graphics(574, 0));
            }
            else if (buttonId == 20)
            {
                player.setLastAnimation(new Animation(2105, 0));
            }
            else if (buttonId == 21)
            {
                player.setLastAnimation(new Animation(2110, 0));
            }
            else if (buttonId == 22)
            {
                player.setLastAnimation(new Animation(865, 0));
            }
            else if (buttonId == 23)
            {
                player.setLastAnimation(new Animation(2112, 0));
            }
            else if (buttonId == 24)
            {
                player.setLastAnimation(new Animation(0x84F, 0));
            }
            else if (buttonId == 25)
            {
                player.setLastAnimation(new Animation(0x850, 0));
            }
            else if (buttonId == 26)
            {
                player.setLastAnimation(new Animation(1131, 0));
            }
            else if (buttonId == 27)
            {
                player.setLastAnimation(new Animation(1130, 0));
            }
            else if (buttonId == 28)
            {
                player.setLastAnimation(new Animation(1129, 0));
            }
            else if (buttonId == 29)
            {
                player.setLastAnimation(new Animation(1128, 0));
            }
            else if (buttonId == 30)
            {
                player.setLastAnimation(new Animation(4275, 0));
            }
            else if (buttonId == 31)
            {
                player.setLastAnimation(new Animation(1745, 0));
            }
            else if (buttonId == 32)
            {
                player.setLastAnimation(new Animation(4280, 0));
            }
            else if (buttonId == 33)
            {
                player.setLastAnimation(new Animation(4276, 0));
            }
            else if (buttonId == 34)
            {
                player.setLastAnimation(new Animation(3544, 0));
            }
            else if (buttonId == 35)
            {
                player.setLastAnimation(new Animation(3543, 0));
            }
            else if (buttonId == 36)
            {
                player.setLastAnimation(new Animation(7272, 0));
                player.setLastGraphics(new Graphics(1244, 0));
            }
            else if (buttonId == 37)
            {
                player.setLastAnimation(new Animation(2836, 0));
            }
            else if (buttonId == 38)
            {
                player.setLastAnimation(new Animation(6111, 0));
            }
            else if (buttonId == 39)
            {
                Skillcape.emote(player);
            }
            else if (buttonId == 40)
            {
                player.setLastAnimation(new Animation(7531, 0));
            }
            else if (buttonId == 41)
            {
                player.setLastAnimation(new Animation(2414, 0));
                player.setLastGraphics(new Graphics(1537, 0));
            }
            else if (buttonId == 42)
            {
                player.setLastAnimation(new Animation(8770, 0));
                player.setLastGraphics(new Graphics(1553, 0));
            }
            else if (buttonId == 43) // Explore
            {
                player.setLastAnimation(new Animation(9990, 0));
                player.setLastGraphics(new Graphics(1734, 0));
            } 
            else if (buttonId == 44) { // Trick
                player.setLastAnimation(new Animation(10530, 0));
                player.setLastGraphics(new Graphics(1864, 0));
            }
            else if (buttonId == 45) { // Freeze
                player.setLastAnimation(new Animation(11044, 0));
                player.setLastGraphics(new Graphics(1973, 0));
            }
            else if (buttonId == 46)
            {
                //TODO: lol todo.. umm ya.. unmovable remover is here so.. 
                //it can be used to cheat to remove unmovable spells haha.
                //to fix: make another unmovable check so there would be 2 ways to become unmovable.

                //trigger the turkey emote event which changes animation/graphic based on delay.
                if (player.getTemporaryAttribute("turkeyEmoteInProgress") == null) {
                    player.setTemporaryAttribute("turkeyEmoteStage", 11);
                    player.setTemporaryAttribute("turkeyEmoteInProgress", 1);
                } else {
                    //Force cancellation of the turkeyEmote Event.
                    player.setTemporaryAttribute("turkeyEmoteStage", -1);
                    //Don't create a new event until the old one is stopped.
                    return false;
                }

                Event turkeyEmoteEvent = new Event(500); //500 milliseconds per stage timer (adjust this for better results).
                turkeyEmoteEvent.setAction(() =>
                {
                    int turkeyEmoteStage = (int)(player.getTemporaryAttribute("turkeyEmoteStage") == null ? -1 : (int)player.getTemporaryAttribute("turkeyEmoteStage"));

                    if (turkeyEmoteStage <= 0)
                    {
                        //kill off this event.
                        turkeyEmoteEvent.stop();
                        player.removeTemporaryAttribute("unmovable");
                        player.setTemporaryAttribute("turkeyEmoteInProgress", null);
                        return;
                    }

                    if (turkeyEmoteStage == 11) {
                        player.setLastAnimation(new Animation(10994, 0));
                    } else if (turkeyEmoteStage == 10) {
                        player.setLastGraphics(new Graphics(1714, 0));
                    } else if (turkeyEmoteStage == 9) {
                        player.setLastAnimation(new Animation(10996, 0));
                        player.setTemporaryAttribute("unmovable", true);
                        player.getAppearance().setNpcId(8499);
                        player.getUpdateFlags().setAppearanceUpdateRequired(true);
                    } else if (turkeyEmoteStage == 1) {
                        player.setLastAnimation(new Animation(10995, 0));
                        player.setLastGraphics(new Graphics(1714, 0));
                        player.getAppearance().setNpcId(-1);
                        player.getUpdateFlags().setAppearanceUpdateRequired(true);
                        player.removeTemporaryAttribute("unmovable");
                        player.removeTemporaryAttribute("turkeyEmoteStage");
                    }
                    if (turkeyEmoteStage > 0) {
                        turkeyEmoteStage--;
                        player.setTemporaryAttribute("turkeyEmoteStage", turkeyEmoteStage);
                    }
                });
                Server.registerEvent(turkeyEmoteEvent);
            }
            else
            {
                return false;
            }
            return true;
        }
    }
}
