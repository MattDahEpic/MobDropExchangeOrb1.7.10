package com.mattdahepic.mobdropexchangeorb.network;

import com.mattdahepic.mdecore.helpers.LogHelper;
import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import com.mattdahepic.mobdropexchangeorb.config.Config;
import com.mattdahepic.mobdropexchangeorb.recipe.RecipeRegisterer;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;

public class SyncPacket implements IMessageHandler<SyncPacket.SyncMessage,IMessage> {
    @Override
    public IMessage onMessage (SyncMessage message,MessageContext ctx) {
        if (ctx.side.isClient()) {
            LogHelper.info(MobDropExchangeOrb.MODID,"Recieved a configuration syncronization packet from the server. Changing config values accordingly...");
            Config.blazeEssence = message.blazeEssence;
            Config.stringEssence = message.stringEssence;
            Config.spiderEyeEssence = message.spiderEyeEssence;
            Config.gunpowderEssence = message.gunpowderEssence;
            Config.enderPealEssence = message.enderPearlEssence;
            Config.ghastTearEssence = message.ghastTearEssence;
            Config.magmaCreamEssence = message.magmaCreamEssence;
            Config.arrowEssence = message.arrowEssence;
            Config.boneEssence = message.boneEssence;
            Config.slimeBallEssence = message.slimeBallEssence;
            Config.rottenFleshEssence = message.rottenFleshEssence;

            Config.convertMusicDisks = message.convertMusicDisks;

            Config.convertWitchDrops = message.convertWitchDrops;
            Config.glassBottleEssence = message.glassBottleEssence;
            Config.glowstoneEssence = message.glowstoneEssence;
            Config.redstoneEssence = message.redstoneEssence;
            Config.stickEssence = message.stickEssence;
            Config.sugarEssence = message.sugarEssence;

            Config.orbHasDurability = message.orbHasDurability;
            Config.orbDurability = message.orbDurability;
            Config.orbHardMode = message.orbHardMode;

            LogHelper.info(MobDropExchangeOrb.MODID,"Changing recipes according to server settings.");
            RecipeRegisterer.registerRecipes(Config.convertMusicDisks,Config.convertWitchDrops,Config.orbHardMode);
        }
        return null;
    }
    public static class SyncMessage implements IMessage {
        private int blazeEssence;
        private int stringEssence;
        private int spiderEyeEssence;
        private int gunpowderEssence;
        private int enderPearlEssence;
        private int ghastTearEssence;
        private int magmaCreamEssence;
        private int arrowEssence;
        private int boneEssence;
        private int slimeBallEssence;
        private int rottenFleshEssence;
        private boolean convertMusicDisks;
        private boolean convertWitchDrops;
        private int glassBottleEssence;
        private int glowstoneEssence;
        private int redstoneEssence;
        private int stickEssence;
        private int sugarEssence;
        private boolean orbHasDurability;
        private int orbDurability;
        private boolean orbHardMode;
        public SyncMessage () {}
        public SyncMessage (int blazeEssence,int stringEssence,int spiderEyeEssence,int gunpowderEssence,int enderPearlEssence,int ghastTearEssence,int magmaCreamEssence, int arrowEssence,int boneEssence,int slimeBallEssence,int rottenFleshEssence,boolean convertMusicDisks,boolean convertWitchDrops, int glassBottleEssence,int glowstoneEssence,int redstoneEssence,int stickEssence,int sugarEssence,boolean orbHasDurability,int orbDurability,boolean orbHardMode) {
            this.blazeEssence = blazeEssence;
            this.stringEssence = stringEssence;
            this.spiderEyeEssence = spiderEyeEssence;
            this.gunpowderEssence = gunpowderEssence;
            this.enderPearlEssence = enderPearlEssence;
            this.ghastTearEssence = ghastTearEssence;
            this.magmaCreamEssence = magmaCreamEssence;
            this.arrowEssence = arrowEssence;
            this.boneEssence = boneEssence;
            this.slimeBallEssence = slimeBallEssence;
            this.rottenFleshEssence = rottenFleshEssence;
            this.convertMusicDisks = convertMusicDisks;
            this.convertWitchDrops = convertWitchDrops;
            this.glassBottleEssence = glassBottleEssence;
            this.glowstoneEssence = glowstoneEssence;
            this.redstoneEssence = redstoneEssence;
            this.stickEssence = stickEssence;
            this.sugarEssence = sugarEssence;
            this.orbHasDurability = orbHasDurability;
            this.orbDurability = orbDurability;
            this.orbHardMode = orbHardMode;
        }
        @Override
        public void fromBytes (ByteBuf buf) {
            this.blazeEssence = buf.readInt();
            this.stringEssence = buf.readInt();
            this.spiderEyeEssence = buf.readInt();
            this.gunpowderEssence = buf.readInt();
            this.enderPearlEssence = buf.readInt();
            this.ghastTearEssence = buf.readInt();
            this.magmaCreamEssence = buf.readInt();
            this.arrowEssence = buf.readInt();
            this.boneEssence = buf.readInt();
            this.slimeBallEssence = buf.readInt();
            this.rottenFleshEssence = buf.readInt();
            this.convertMusicDisks = buf.readBoolean();
            this.convertWitchDrops = buf.readBoolean();
            this.glassBottleEssence = buf.readInt();
            this.glowstoneEssence = buf.readInt();
            this.redstoneEssence = buf.readInt();
            this.stickEssence = buf.readInt();
            this.sugarEssence = buf.readInt();
            this.orbHasDurability = buf.readBoolean();
            this.orbDurability = buf.readInt();
            this.orbHardMode = buf.readBoolean();
        }
        @Override
        public void toBytes (ByteBuf buf) {
            buf.writeInt(blazeEssence);
            buf.writeInt(stringEssence);
            buf.writeInt(spiderEyeEssence);
            buf.writeInt(gunpowderEssence);
            buf.writeInt(enderPearlEssence);
            buf.writeInt(ghastTearEssence);
            buf.writeInt(magmaCreamEssence);
            buf.writeInt(arrowEssence);
            buf.writeInt(boneEssence);
            buf.writeInt(slimeBallEssence);
            buf.writeInt(rottenFleshEssence);
            buf.writeBoolean(convertMusicDisks);
            buf.writeBoolean(convertWitchDrops);
            buf.writeInt(glassBottleEssence);
            buf.writeInt(glowstoneEssence);
            buf.writeInt(redstoneEssence);
            buf.writeInt(stickEssence);
            buf.writeInt(sugarEssence);
            buf.writeBoolean(orbHasDurability);
            buf.writeInt(orbDurability);
            buf.writeBoolean(orbHardMode);
        }
    }
}
