package com.github.rzm0572.useful.proxy;

import com.github.rzm0572.useful.item.ItemLoader;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ItemLoader.registerItems();
    }

    public void init(FMLInitializationEvent event) {
        // TODO
    }

    public void postInit(FMLPostInitializationEvent event) {
        // TODO
    }
}
