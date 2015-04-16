package com.mattdahepic.mobdropexchangeorb;

import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
    public void registerRenderers() {}
    public void registerBlocksItems() {
        GameRegistry.registerItem(MobDropExchangeOrb.itemMobDropExchangeOrb,"mobDropExchangeOrb");
        GameRegistry.registerItem(MobDropExchangeOrb.itemMobEssence,"mobEssence");
    }
    public void registerRecipes() {
        //TODO: maybe add back in the recipes here?
    }
}
