package com.github.rzm0572.useful.item;

import com.github.rzm0572.useful.helper.RegisterHelper;
import com.github.rzm0572.useful.util.base.ItemBase;

public class ItemLoader {
    public static ItemBase goldenEgg = new ItemGoldenEgg();

    public static void registerItems() {
        RegisterHelper.registerItem(goldenEgg);
    }
}
