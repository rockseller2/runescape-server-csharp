using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using RunescapeServer.model;

namespace RunescapeServer.player
{
    class AppearanceUpdateFlags
    {
        private Player player;
        private Location lastRegion;
        private bool appearanceUpdateRequired;
        private bool forceMovementRequired;
        private bool chatTextUpdateRequired;
        private bool animationUpdateRequired;
        private bool graphicsUpdateRequired;
        private bool hitUpdateRequired;
        private bool hit2UpdateRequired;
        private bool entityFocusUpdateRequired;
        private bool forceTextUpdateRequired;
        private bool faceLocationUpdateRequired;
        private bool teleportUpdateRequired;
        private bool mapRegionChangeUpdateRequired;

        private bool clearable = false;

        public AppearanceUpdateFlags(Player player)
        {
            this.player = player;
            appearanceUpdateRequired = true;
            teleportUpdateRequired = true;
            forceMovementRequired = false;
            chatTextUpdateRequired = false;
            animationUpdateRequired = false;
            graphicsUpdateRequired = false;
            hitUpdateRequired = false;
            hit2UpdateRequired = false;
            entityFocusUpdateRequired = false;
            forceTextUpdateRequired = false;
            faceLocationUpdateRequired = false;
            mapRegionChangeUpdateRequired = false;
        }

        public bool isClearable()
        {
            return clearable;
        }

        public void setClearable(bool clearable)
        {
            this.clearable = clearable;
        }

        public Location getLastRegion()
        {
            return lastRegion;
        }

        public void setLastRegion(Location lastRegion)
        {
                this.lastRegion = lastRegion;
        }

        public bool isUpdateRequired()
        {
            return appearanceUpdateRequired || teleportUpdateRequired || chatTextUpdateRequired ||
                    animationUpdateRequired || graphicsUpdateRequired || hitUpdateRequired ||
                    hit2UpdateRequired || entityFocusUpdateRequired || forceTextUpdateRequired ||
                    faceLocationUpdateRequired || forceMovementRequired;
        }

        public bool hasMovementUpdate()
        {
            return player.getSprites().getPrimarySprite() != -1 ||
                   (player.getSprites().getPrimarySprite() != -1 && player.getSprites().getSecondarySprite() != -1);
        }

        public bool hasAnyUpdate()
        {
            return isUpdateRequired() || hasMovementUpdate();
        }

        public void clear()
        {
            appearanceUpdateRequired = false;
            teleportUpdateRequired = false; //not a isUpdateRequired because should do a update regardless if you are teleporting or not.
            mapRegionChangeUpdateRequired = false; //not a isUpdateRequired because mapRegion has to be accurately set when doing a update, or messes up).
            chatTextUpdateRequired = false;
            animationUpdateRequired = false;
            graphicsUpdateRequired = false;
            hitUpdateRequired = false;
            hit2UpdateRequired = false;
            entityFocusUpdateRequired = false;
            forceTextUpdateRequired = false;
            faceLocationUpdateRequired = false;
            forceMovementRequired = false;
            player.getSprites().setSprites(-1, -1);
            player.removeTemporaryAttribute("forceText");
        }

        public bool isAppearanceUpdateRequired()
        {
            return appearanceUpdateRequired;
        }

        public bool isGraphicsUpdateRequired()
        {
            return graphicsUpdateRequired;
        }

        public void setGraphicsUpdateRequired(bool set)
        {
            this.graphicsUpdateRequired = set;
        }

        public bool isTeleporting()
        {
            return this.teleportUpdateRequired;
        }

        public bool didMapRegionChange()
        {
            return mapRegionChangeUpdateRequired;
        }

        public void setDidMapRegionChange(bool didMapRegionChange)
        {
            this.mapRegionChangeUpdateRequired = didMapRegionChange;
        }

        public void setTeleporting(bool didTeleport)
        {
            this.teleportUpdateRequired = didTeleport;
        }

        public void setAppearanceUpdateRequired(bool set)
        {
            appearanceUpdateRequired = set;
        }

        public void setChatTextUpdateRequired(bool set)
        {
            chatTextUpdateRequired = set;
        }

        public bool isChatTextUpdateRequired()
        {
            return chatTextUpdateRequired;
        }

        public void setAnimationUpdateRequired(bool set)
        {
            this.animationUpdateRequired = set;
        }

        public bool isAnimationUpdateRequired()
        {
            return this.animationUpdateRequired;
        }

        public void setHitUpdateRequired(bool set)
        {
            this.hitUpdateRequired = set;
        }

        public bool isHitUpdateRequired()
        {
            return this.hitUpdateRequired;
        }

        public void setHit2UpdateRequired(bool set)
        {
            this.hit2UpdateRequired = set;
        }

        public bool isHit2UpdateRequired()
        {
            return this.hit2UpdateRequired;
        }

        public void setEntityFocusUpdateRequired(bool set)
        {
            this.entityFocusUpdateRequired = set;
        }

        public bool isEntityFocusUpdateRequired()
        {
            return entityFocusUpdateRequired;
        }

        public void setForceTextUpdateRequired(bool set)
        {
            this.forceTextUpdateRequired = set;
        }

        public bool isForceTextUpdateRequired()
        {
            return forceTextUpdateRequired;
        }

        public bool isFaceLocationUpdateRequired()
        {
            return faceLocationUpdateRequired;
        }

        public void setFaceLocationUpdateRequired(bool set)
        {
            this.faceLocationUpdateRequired = set;
        }

        public bool isForceMovementRequired()
        {
            return forceMovementRequired;
        }

        public void setForceMovementRequired(bool set)
        {
            this.forceMovementRequired = set;
        }
    }
}
