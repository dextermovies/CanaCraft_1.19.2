package net.joshua.cannacraft.item;

import ca.weblite.objc.Proxy;
import net.joshua.cannacraft.CannaCraft;
import net.joshua.cannacraft.block.ModBlocks;
import net.joshua.cannacraft.item.custom.Eightballitem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.io.ObjectInputStream;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            CannaCraft.MOD_ID);
    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CANNACRAFT_TAB)));

    public static final RegistryObject<Item> CANNACRAFT_ICO = ITEMS.register("cannacraft_ico",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CANNACRAFT_TAB)));

    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CANNACRAFT_TAB)));

    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new Eightballitem(new Item.Properties().tab(ModCreativeModeTab.CANNACRAFT_TAB).stacksTo(1)));

    public static final RegistryObject<Item> BLUEBERRY_SEEDS = ITEMS.register("blueberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BLUEBERRY_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.CANNACRAFT_TAB)));

    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CANNACRAFT_TAB)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));

    public static final RegistryObject<Item> CANNABIS_INDICA_SEEDS = ITEMS.register("cannabis_indica_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CANNABIS_INDICA_CROPBLOCK.get(),
                    new Item.Properties().tab(ModCreativeModeTab.CANNACRAFT_TAB)));
    public static final RegistryObject<Item> CANNABIS_INDICA = ITEMS.register("cannabis_indica",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CANNACRAFT_TAB)
                    .food(new FoodProperties.Builder().nutrition(-2).build())));
    public static final RegistryObject<Item> CANNABIS_SATIVA_SEEDS = ITEMS.register("cannabis_sativa_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CANNABIS_SATIVA_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.CANNACRAFT_TAB)));

    public static final RegistryObject<Item> CANNABIS_SATIVA = ITEMS.register("cannabis_sativa",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CANNACRAFT_TAB)
                    .food(new FoodProperties.Builder().nutrition(-2).build())));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
