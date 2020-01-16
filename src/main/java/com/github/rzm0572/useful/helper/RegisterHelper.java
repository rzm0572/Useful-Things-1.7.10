package com.github.rzm0572.useful.helper;

import com.github.rzm0572.useful.util.base.ItemBase;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterHelper {
    public static void registerItem(ItemBase item) {
        GameRegistry.registerItem(item, item.reg_name);
    }
}
