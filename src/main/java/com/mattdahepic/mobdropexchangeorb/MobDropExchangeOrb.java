package com.mattdahepic.mobdropexchangeorb;

import com.mattdahepic.mdecore.helpers.LogHelper;
import com.mattdahepic.mdecore.update.UpdateChecker;
import com.mattdahepic.mobdropexchangeorb.config.Config;
import com.mattdahepic.mobdropexchangeorb.item.ItemMobDropExchangeOrb;
import com.mattdahepic.mobdropexchangeorb.item.ItemMobEssence;
import com.mattdahepic.mobdropexchangeorb.network.PacketHandler;
import com.mattdahepic.mobdropexchangeorb.network.SyncPacket;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLLoadCompleteEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;

@Mod(modid = MobDropExchangeOrb.MODID,name = MobDropExchangeOrb.NAME,version = MobDropExchangeOrb.VERSION,dependencies = "required-after:mdecore@[v1.0-mc1.7.10,);")
public class MobDropExchangeOrb {
    @Mod.Instance("mobdropexchangeorb")
    public static MobDropExchangeOrb instance;

    public static final String MODID = "mobdropexchangeorb";
    public static final String NAME = "Mob Drop Exchange Orb";
    public static final String VERSION = "v1.5-mc1.7.10";

    @SidedProxy(clientSide = "com.mattdahepic.mobdropexchangeorb.client.ClientProxy",serverSide = "com.mattdahepic.mobdropexchangeorb.CommonProxy")
    public static CommonProxy proxy;

    public static Configuration configFile;

    //blocks

    //items
    public static Item itemMobDropExchangeOrb;
    public static Item itemMobEssence;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        FMLCommonHandler.instance().bus().register(instance);
        Config.load(event);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        PacketHandler.initPackets();
        itemMobDropExchangeOrb = new ItemMobDropExchangeOrb();
        itemMobEssence = new ItemMobEssence();
        proxy.registerBlocksItems();
        proxy.registerRecipes();
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info(MODID, "Ready to transmute!");
    }
    @Mod.EventHandler
    public void loadComplete (FMLLoadCompleteEvent event) {
        UpdateChecker.updateCheck(MODID,NAME,"https://raw.githubusercontent.com/MattDahEpic/MobDropExchangeOrb1.7.10/master/version.txt",VERSION);
    }
    @SubscribeEvent
    public void onPlayerJoinServer (PlayerEvent.PlayerLoggedInEvent event) {
        if (!event.player.worldObj.isRemote) {
            if (event.player instanceof EntityPlayerMP) {
                LogHelper.info(MODID,"Sending configuration settings packet from the server to the connecting client "+event.player.getDisplayName()+".");
                IMessage sync = new SyncPacket.SyncMessage(Config.blazeEssence,Config.stringEssence,Config.spiderEyeEssence,Config.gunpowderEssence,Config.enderPealEssence,Config.ghastTearEssence,Config.magmaCreamEssence,Config.arrowEssence,Config.boneEssence,Config.slimeBallEssence,Config.rottenFleshEssence,Config.convertMusicDisks,Config.convertWitchDrops,Config.glassBottleEssence,Config.glowstoneEssence,Config.redstoneEssence,Config.stickEssence,Config.sugarEssence,Config.orbHasDurability,Config.orbDurability,Config.orbHardMode);
                PacketHandler.net.sendTo(sync,(EntityPlayerMP) event.player);
            }
        }
    }
}
