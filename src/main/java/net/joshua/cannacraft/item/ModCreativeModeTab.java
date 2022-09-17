package net.joshua.cannacraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CANNACRAFT_TAB = new CreativeModeTab("cannacrafttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get()) ;
        }
    };
}
