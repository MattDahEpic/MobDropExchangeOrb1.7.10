package com.mattdahepic.mobdropexchangeorb.config;

import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class MobDropExchangeOrbGuiConfigFactory extends GuiConfig {
    public MobDropExchangeOrbGuiConfigFactory (GuiScreen parentScreen) {
        super(parentScreen, new ConfigElement(MobDropExchangeOrb.configFile.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),MobDropExchangeOrb.MODID,true,true,"Mob Drop Exchange Orb Configuration");
    }
}
