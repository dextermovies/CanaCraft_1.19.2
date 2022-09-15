package net.joshua.cannacraft.item;

import net.joshua.cannacraft.CannaCraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS , CannaCraft.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register ("zircon",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register ("raw_zircon",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
