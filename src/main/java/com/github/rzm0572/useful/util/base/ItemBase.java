package com.github.rzm0572.useful.util.base;

import com.github.rzm0572.useful.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public String reg_name = "";
    public ItemBase(String name, String reg_name, CreativeTabs tab) {
        super();
        this.reg_name = reg_name;
        this.setUnlocalizedName(name);
        this.setCreativeTab(tab);
        this.setTextureName(Reference.MODID + ":" + this.reg_name);
    }
}
