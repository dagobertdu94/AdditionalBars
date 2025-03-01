package com.gamma1772.additionalbars.registries;

import com.gamma1772.additionalbars.AdditionalBars;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("all")
public class ABItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalBars.MODID);

    public static final RegistryObject<Item> GOLD_BARS                         = ITEMS.register("gold_bars",                          () -> new BlockItem(ABBlocks.GOLD_BARS.get(),                            new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BARS                       = ITEMS.register("acacia_bars",                        () -> new BlockItem(ABBlocks.ACACIA_BARS.get(),                          new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_BARS                        = ITEMS.register("birch_bars",                         () -> new BlockItem(ABBlocks.BIRCH_BARS.get(),                           new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BARS                       = ITEMS.register("jungle_bars",                        () -> new BlockItem(ABBlocks.JUNGLE_BARS.get(),                          new Item.Properties()));
    public static final RegistryObject<Item> OAK_BARS                          = ITEMS.register("oak_bars",                           () -> new BlockItem(ABBlocks.OAK_BARS.get(),                             new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_BARS                     = ITEMS.register("dark_oak_bars",                      () -> new BlockItem(ABBlocks.DARK_OAK_BARS.get(),                        new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BARS                       = ITEMS.register("spruce_bars",                        () -> new BlockItem(ABBlocks.SPRUCE_BARS.get(),                          new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BARS                     = ITEMS.register("mangrove_bars",                      () -> new BlockItem(ABBlocks.MANGROVE_BARS.get(),                        new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_BARS                     = ITEMS.register("cherry_bars",                      () -> new BlockItem(ABBlocks.CHERRY_BARS.get(),                        new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_BARS                      = ITEMS.register("crimson_bars",                       () -> new BlockItem(ABBlocks.CRIMSON_BARS.get(),                         new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BARS                       = ITEMS.register("warped_bars",                        () -> new BlockItem(ABBlocks.WARPED_BARS.get(),                          new Item.Properties()));

    public static final RegistryObject<Item> CROSSED_IRON_BARS                 = ITEMS.register("crossed_iron_bars",                  () -> new BlockItem(ABBlocks.CROSSED_IRON_BARS.get(),                    new Item.Properties()));
    public static final RegistryObject<Item> CROSSED_GOLD_BARS                 = ITEMS.register("crossed_gold_bars",                  () -> new BlockItem(ABBlocks.CROSSED_GOLD_BARS.get(),                    new Item.Properties()));
    public static final RegistryObject<Item> CROSSED_ACACIA_BARS               = ITEMS.register("crossed_acacia_bars",                () -> new BlockItem(ABBlocks.CROSSED_ACACIA_BARS.get(),                  new Item.Properties()));
    public static final RegistryObject<Item> CROSSED_BIRCH_BARS                = ITEMS.register("crossed_birch_bars",                 () -> new BlockItem(ABBlocks.CROSSED_BIRCH_BARS.get(),                   new Item.Properties()));
    public static final RegistryObject<Item> CROSSED_JUNGLE_BARS               = ITEMS.register("crossed_jungle_bars",                () -> new BlockItem(ABBlocks.CROSSED_JUNGLE_BARS.get(),                  new Item.Properties()));
    public static final RegistryObject<Item> CROSSED_OAK_BARS                  = ITEMS.register("crossed_oak_bars",                   () -> new BlockItem(ABBlocks.CROSSED_OAK_BARS.get(),                     new Item.Properties()));
    public static final RegistryObject<Item> CROSSED_DARK_OAK_BARS             = ITEMS.register("crossed_dark_oak_bars",              () -> new BlockItem(ABBlocks.CROSSED_DARK_OAK_BARS.get(),                new Item.Properties()));
    public static final RegistryObject<Item> CROSSED_SPRUCE_BARS               = ITEMS.register("crossed_spruce_bars",                () -> new BlockItem(ABBlocks.CROSSED_SPRUCE_BARS.get(),                  new Item.Properties()));
    public static final RegistryObject<Item> CROSSED_MANGROVE_BARS             = ITEMS.register("crossed_mangrove_bars",              () -> new BlockItem(ABBlocks.CROSSED_MANGROVE_BARS.get(),                new Item.Properties()));
    public static final RegistryObject<Item> CROSSED_CHERRY_BARS             = ITEMS.register("crossed_cherry_bars",              () -> new BlockItem(ABBlocks.CROSSED_CHERRY_BARS.get(),                new Item.Properties()));
    public static final RegistryObject<Item> CROSSED_CRIMSON_BARS              = ITEMS.register("crossed_crimson_bars",               () -> new BlockItem(ABBlocks.CROSSED_CRIMSON_BARS.get(),                 new Item.Properties()));
    public static final RegistryObject<Item> CROSSED_WARPED_BARS               = ITEMS.register("crossed_warped_bars",                () -> new BlockItem(ABBlocks.CROSSED_WARPED_BARS.get(),                  new Item.Properties()));

    public static final RegistryObject<Item> HORIZONTAL_IRON_BARS              = ITEMS.register("horizontal_iron_bars",               () -> new BlockItem(ABBlocks.HORIZONTAL_IRON_BARS.get(),                 new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_GOLD_BARS              = ITEMS.register("horizontal_gold_bars",               () -> new BlockItem(ABBlocks.HORIZONTAL_GOLD_BARS.get(),                 new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_ACACIA_BARS            = ITEMS.register("horizontal_acacia_bars",             () -> new BlockItem(ABBlocks.HORIZONTAL_ACACIA_BARS.get(),               new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_BIRCH_BARS             = ITEMS.register("horizontal_birch_bars",              () -> new BlockItem(ABBlocks.HORIZONTAL_BIRCH_BARS.get(),                new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_JUNGLE_BARS            = ITEMS.register("horizontal_jungle_bars",             () -> new BlockItem(ABBlocks.HORIZONTAL_JUNGLE_BARS.get(),               new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_OAK_BARS               = ITEMS.register("horizontal_oak_bars",                () -> new BlockItem(ABBlocks.HORIZONTAL_OAK_BARS.get(),                  new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_DARK_OAK_BARS          = ITEMS.register("horizontal_dark_oak_bars",           () -> new BlockItem(ABBlocks.HORIZONTAL_DARK_OAK_BARS.get(),             new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_SPRUCE_BARS            = ITEMS.register("horizontal_spruce_bars",             () -> new BlockItem(ABBlocks.HORIZONTAL_SPRUCE_BARS.get(),               new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_MANGROVE_BARS          = ITEMS.register("horizontal_mangrove_bars",           () -> new BlockItem(ABBlocks.HORIZONTAL_MANGROVE_BARS.get(),             new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_CHERRY_BARS          = ITEMS.register("horizontal_cherry_bars",           () -> new BlockItem(ABBlocks.HORIZONTAL_CHERRY_BARS.get(),             new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_CRIMSON_BARS           = ITEMS.register("horizontal_crimson_bars",            () -> new BlockItem(ABBlocks.HORIZONTAL_CRIMSON_BARS.get(),              new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_WARPED_BARS            = ITEMS.register("horizontal_warped_bars",             () -> new BlockItem(ABBlocks.HORIZONTAL_WARPED_BARS.get(),               new Item.Properties()));

    public static final RegistryObject<Item> HORIZONTAL_CROSSED_IRON_BARS      = ITEMS.register("horizontal_crossed_iron_bars",       () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_IRON_BARS.get(),         new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_GOLD_BARS      = ITEMS.register("horizontal_crossed_gold_bars",       () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_GOLD_BARS.get(),         new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_ACACIA_BARS    = ITEMS.register("horizontal_crossed_acacia_bars",     () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_ACACIA_BARS.get(),       new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_BIRCH_BARS     = ITEMS.register("horizontal_crossed_birch_bars",      () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_BIRCH_BARS.get(),        new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_JUNGLE_BARS    = ITEMS.register("horizontal_crossed_jungle_bars",     () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_JUNGLE_BARS.get(),       new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_OAK_BARS       = ITEMS.register("horizontal_crossed_oak_bars",        () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_OAK_BARS.get(),          new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_DARK_OAK_BARS  = ITEMS.register("horizontal_crossed_dark_oak_bars",   () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_DARK_OAK_BARS.get(),     new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_SPRUCE_BARS    = ITEMS.register("horizontal_crossed_spruce_bars",     () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_SPRUCE_BARS.get(),       new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_MANGROVE_BARS  = ITEMS.register("horizontal_crossed_mangrove_bars",   () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_MANGROVE_BARS.get(),       new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_CHERRY_BARS  = ITEMS.register("horizontal_crossed_cherry_bars",   () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_CHERRY_BARS.get(),       new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_CRIMSON_BARS   = ITEMS.register("horizontal_crossed_crimson_bars",    () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_CRIMSON_BARS.get(),      new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_WARPED_BARS    = ITEMS.register("horizontal_crossed_warped_bars",     () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_WARPED_BARS.get(),       new Item.Properties()));

    public static final RegistryObject<Item> COPPER_BARS = ITEMS.register("copper_bars", () -> new BlockItem(ABBlocks.COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_COPPER_BARS = ITEMS.register("exposed_copper_bars", () -> new BlockItem(ABBlocks.EXPOSED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_COPPER_BARS = ITEMS.register("weathered_copper_bars", () -> new BlockItem(ABBlocks.WEATHERED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_BARS = ITEMS.register("oxidized_copper_bars", () -> new BlockItem(ABBlocks.OXIDIZED_COPPER_BARS.get(), new Item.Properties()));

    public static final RegistryObject<Item> CROSSED_COPPER_BARS = ITEMS.register("crossed_copper_bars", () -> new BlockItem(ABBlocks.CROSSED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CROSSED_EXPOSED_COPPER_BARS = ITEMS.register("crossed_exposed_copper_bars", () -> new BlockItem(ABBlocks.CROSSED_EXPOSED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CROSSED_WEATHERED_COPPER_BARS = ITEMS.register("crossed_weathered_copper_bars", () -> new BlockItem(ABBlocks.CROSSED_WEATHERED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CROSSED_OXIDIZED_COPPER_BARS = ITEMS.register("crossed_oxidized_copper_bars", () -> new BlockItem(ABBlocks.CROSSED_OXIDIZED_COPPER_BARS.get(), new Item.Properties()));

    public static final RegistryObject<Item> HORIZONTAL_COPPER_BARS = ITEMS.register("horizontal_copper_bars", () -> new BlockItem(ABBlocks.HORIZONTAL_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_EXPOSED_COPPER_BARS = ITEMS.register("horizontal_exposed_copper_bars", () -> new BlockItem(ABBlocks.HORIZONTAL_EXPOSED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_WEATHERED_COPPER_BARS = ITEMS.register("horizontal_weathered_copper_bars", () -> new BlockItem(ABBlocks.HORIZONTAL_WEATHERED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_OXIDIZED_COPPER_BARS = ITEMS.register("horizontal_oxidized_copper_bars", () -> new BlockItem(ABBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS.get(), new Item.Properties()));

    public static final RegistryObject<Item> HORIZONTAL_CROSSED_COPPER_BARS = ITEMS.register("horizontal_crossed_copper_bars", () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS = ITEMS.register("horizontal_crossed_exposed_copper_bars", () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS = ITEMS.register("horizontal_crossed_weathered_copper_bars", () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS = ITEMS.register("horizontal_crossed_oxidized_copper_bars", () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS.get(), new Item.Properties()));

    public static final RegistryObject<Item> WAXED_COPPER_BARS = ITEMS.register("waxed_copper_bars", () -> new BlockItem(ABBlocks.WAXED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_EXPOSED_COPPER_BARS = ITEMS.register("waxed_exposed_copper_bars", () -> new BlockItem(ABBlocks.WAXED_EXPOSED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_WEATHERED_COPPER_BARS = ITEMS.register("waxed_weathered_copper_bars", () -> new BlockItem(ABBlocks.WAXED_WEATHERED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_OXIDIZED_COPPER_BARS = ITEMS.register("waxed_oxidized_copper_bars", () -> new BlockItem(ABBlocks.WAXED_OXIDIZED_COPPER_BARS.get(), new Item.Properties()));

    public static final RegistryObject<Item> WAXED_CROSSED_COPPER_BARS = ITEMS.register("waxed_crossed_copper_bars", () -> new BlockItem(ABBlocks.WAXED_CROSSED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_CROSSED_EXPOSED_COPPER_BARS = ITEMS.register("waxed_crossed_exposed_copper_bars", () -> new BlockItem(ABBlocks.WAXED_CROSSED_EXPOSED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_CROSSED_WEATHERED_COPPER_BARS = ITEMS.register("waxed_crossed_weathered_copper_bars", () -> new BlockItem(ABBlocks.WAXED_CROSSED_WEATHERED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_CROSSED_OXIDIZED_COPPER_BARS = ITEMS.register("waxed_crossed_oxidized_copper_bars", () -> new BlockItem(ABBlocks.WAXED_CROSSED_OXIDIZED_COPPER_BARS.get(), new Item.Properties()));

    public static final RegistryObject<Item> WAXED_HORIZONTAL_COPPER_BARS = ITEMS.register("waxed_horizontal_copper_bars", () -> new BlockItem(ABBlocks.WAXED_HORIZONTAL_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_HORIZONTAL_EXPOSED_COPPER_BARS = ITEMS.register("waxed_horizontal_exposed_copper_bars", () -> new BlockItem(ABBlocks.WAXED_HORIZONTAL_EXPOSED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_HORIZONTAL_WEATHERED_COPPER_BARS = ITEMS.register("waxed_horizontal_weathered_copper_bars", () -> new BlockItem(ABBlocks.WAXED_HORIZONTAL_WEATHERED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS = ITEMS.register("waxed_horizontal_oxidized_copper_bars", () -> new BlockItem(ABBlocks.WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS.get(), new Item.Properties()));

    public static final RegistryObject<Item> WAXED_HORIZONTAL_CROSSED_COPPER_BARS = ITEMS.register("waxed_horizontal_crossed_copper_bars", () -> new BlockItem(ABBlocks.WAXED_HORIZONTAL_CROSSED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS = ITEMS.register("waxed_horizontal_crossed_exposed_copper_bars", () -> new BlockItem(ABBlocks.WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS = ITEMS.register("waxed_horizontal_crossed_weathered_copper_bars", () -> new BlockItem(ABBlocks.WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS = ITEMS.register("waxed_horizontal_crossed_oxidized_copper_bars", () -> new BlockItem(ABBlocks.WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS.get(), new Item.Properties()));

}
