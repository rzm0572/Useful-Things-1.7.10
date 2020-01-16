package com.github.rzm0572.useful;

import com.github.rzm0572.useful.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = "1.7.10")
public class Useful {
    @Instance(Reference.MODID)
    public static Useful instance;

    @SidedProxy(serverSide = Reference.COMMON, clientSide = Reference.CLIENT)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // TODO
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // TODO
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // TODO
    }
}
