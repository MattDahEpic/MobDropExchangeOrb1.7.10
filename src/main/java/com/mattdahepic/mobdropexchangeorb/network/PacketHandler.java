package com.mattdahepic.mobdropexchangeorb.network;

import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class PacketHandler {
    public static SimpleNetworkWrapper net;
    public static void initPackets () {
        net = NetworkRegistry.INSTANCE.newSimpleChannel(MobDropExchangeOrb.MODID.toUpperCase());
        registerMessage(SyncPacket.class, SyncPacket.SyncMessage.class);
    }
    private static int nextPacketId = 0;
    public static void registerMessage (Class packet,Class message) {
        net.registerMessage(packet,message,nextPacketId, Side.CLIENT);
        nextPacketId++;
    }
}
