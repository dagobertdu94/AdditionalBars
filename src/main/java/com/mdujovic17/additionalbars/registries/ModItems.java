package com.mdujovic17.additionalbars.registries;

import com.mdujovic17.additionalbars.AdditionalBars;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AdditionalBars.MODID);

    public static final DeferredItem<BlockItem> GOLD_BARS = ITEMS.registerSimpleBlockItem("gold_bars", ModBlocks.GOLD_BARS);

    public static final DeferredItem<BlockItem> UNAFFECTED_COPPER_BARS = ITEMS.registerSimpleBlockItem("copper_bars", ModBlocks.UNAFFECTED_COPPER_BARS);
    public static final DeferredItem<BlockItem> EXPOSED_COPPER_BARS = ITEMS.registerSimpleBlockItem("exposed_copper_bars", ModBlocks.EXPOSED_COPPER_BARS);
    public static final DeferredItem<BlockItem> WEATHERED_COPPER_BARS = ITEMS.registerSimpleBlockItem("weathered_copper_bars", ModBlocks.WEATHERED_COPPER_BARS);
    public static final DeferredItem<BlockItem> OXIDIZED_COPPER_BARS = ITEMS.registerSimpleBlockItem("oxidized_copper_bars", ModBlocks.OXIDIZED_COPPER_BARS);

    public static final DeferredItem<BlockItem> WAXED_UNAFFECTED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_copper_bars", ModBlocks.WAXED_UNAFFECTED_COPPER_BARS);
    public static final DeferredItem<BlockItem> WAXED_EXPOSED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_exposed_copper_bars", ModBlocks.WAXED_EXPOSED_COPPER_BARS);
    public static final DeferredItem<BlockItem> WAXED_WEATHERED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_weathered_copper_bars", ModBlocks.WAXED_WEATHERED_COPPER_BARS);
    public static final DeferredItem<BlockItem> WAXED_OXIDIZED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_oxidized_copper_bars", ModBlocks.WAXED_OXIDIZED_COPPER_BARS);

    public static final DeferredItem<BlockItem> ACACIA_BARS = ITEMS.registerSimpleBlockItem("acacia_bars", ModBlocks.ACACIA_BARS);
    public static final DeferredItem<BlockItem> BIRCH_BARS = ITEMS.registerSimpleBlockItem("birch_bars", ModBlocks.BIRCH_BARS);
    public static final DeferredItem<BlockItem> JUNGLE_BARS = ITEMS.registerSimpleBlockItem("jungle_bars", ModBlocks.JUNGLE_BARS);
    public static final DeferredItem<BlockItem> OAK_BARS = ITEMS.registerSimpleBlockItem("oak_bars", ModBlocks.OAK_BARS);
    public static final DeferredItem<BlockItem> DARK_OAK_BARS = ITEMS.registerSimpleBlockItem("dark_oak_bars", ModBlocks.DARK_OAK_BARS);
    public static final DeferredItem<BlockItem> SPRUCE_BARS = ITEMS.registerSimpleBlockItem("spruce_bars", ModBlocks.SPRUCE_BARS);
    public static final DeferredItem<BlockItem> MANGROVE_BARS = ITEMS.registerSimpleBlockItem("mangrove_bars", ModBlocks.MANGROVE_BARS);
    public static final DeferredItem<BlockItem> CRIMSON_BARS = ITEMS.registerSimpleBlockItem("crimson_bars", ModBlocks.CRIMSON_BARS);
    public static final DeferredItem<BlockItem> WARPED_BARS = ITEMS.registerSimpleBlockItem("warped_bars", ModBlocks.WARPED_BARS);

    public static final DeferredItem<BlockItem> CROSSED_GOLD_BARS = ITEMS.registerSimpleBlockItem("crossed_gold_bars", ModBlocks.CROSSED_GOLD_BARS);
    public static final DeferredItem<BlockItem> CROSSED_IRON_BARS = ITEMS.registerSimpleBlockItem("crossed_iron_bars", ModBlocks.CROSSED_IRON_BARS);

    public static final DeferredItem<BlockItem> UNAFFECTED_CROSSED_COPPER_BARS = ITEMS.registerSimpleBlockItem("crossed_copper_bars", ModBlocks.UNAFFECTED_CROSSED_COPPER_BARS);
    public static final DeferredItem<BlockItem> EXPOSED_CROSSED_COPPER_BARS = ITEMS.registerSimpleBlockItem("crossed_exposed_copper_bars", ModBlocks.EXPOSED_CROSSED_COPPER_BARS);
    public static final DeferredItem<BlockItem> WEATHERED_CROSSED_COPPER_BARS = ITEMS.registerSimpleBlockItem("crossed_weathered_copper_bars", ModBlocks.WEATHERED_CROSSED_COPPER_BARS);
    public static final DeferredItem<BlockItem> OXIDIZED_CROSSED_COPPER_BARS = ITEMS.registerSimpleBlockItem("crossed_oxidized_copper_bars", ModBlocks.OXIDIZED_CROSSED_COPPER_BARS);

    public static final DeferredItem<BlockItem> WAXED_UNAFFECTED_CROSSED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_crossed_copper_bars", ModBlocks.WAXED_UNAFFECTED_CROSSED_COPPER_BARS);
    public static final DeferredItem<BlockItem> WAXED_EXPOSED_CROSSED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_crossed_exposed_copper_bars", ModBlocks.WAXED_EXPOSED_CROSSED_COPPER_BARS);
    public static final DeferredItem<BlockItem> WAXED_WEATHERED_CROSSED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_crossed_weathered_copper_bars", ModBlocks.WAXED_WEATHERED_CROSSED_COPPER_BARS);
    public static final DeferredItem<BlockItem> WAXED_OXIDIZED_CROSSED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_crossed_oxidized_copper_bars", ModBlocks.WAXED_OXIDIZED_CROSSED_COPPER_BARS);

    public static final DeferredItem<BlockItem> CROSSED_ACACIA_BARS = ITEMS.registerSimpleBlockItem("crossed_acacia_bars", ModBlocks.CROSSED_ACACIA_BARS);
    public static final DeferredItem<BlockItem> CROSSED_BIRCH_BARS = ITEMS.registerSimpleBlockItem("crossed_birch_bars", ModBlocks.CROSSED_BIRCH_BARS);
    public static final DeferredItem<BlockItem> CROSSED_JUNGLE_BARS = ITEMS.registerSimpleBlockItem("crossed_jungle_bars", ModBlocks.CROSSED_JUNGLE_BARS);
    public static final DeferredItem<BlockItem> CROSSED_OAK_BARS = ITEMS.registerSimpleBlockItem("crossed_oak_bars", ModBlocks.CROSSED_OAK_BARS);
    public static final DeferredItem<BlockItem> CROSSED_DARK_OAK_BARS = ITEMS.registerSimpleBlockItem("crossed_dark_oak_bars", ModBlocks.CROSSED_DARK_OAK_BARS);
    public static final DeferredItem<BlockItem> CROSSED_SPRUCE_BARS = ITEMS.registerSimpleBlockItem("crossed_spruce_bars", ModBlocks.CROSSED_SPRUCE_BARS);
    public static final DeferredItem<BlockItem> CROSSED_MANGROVE_BARS = ITEMS.registerSimpleBlockItem("crossed_mangrove_bars", ModBlocks.CROSSED_MANGROVE_BARS);
    public static final DeferredItem<BlockItem> CROSSED_CRIMSON_BARS = ITEMS.registerSimpleBlockItem("crossed_crimson_bars", ModBlocks.CROSSED_CRIMSON_BARS);
    public static final DeferredItem<BlockItem> CROSSED_WARPED_BARS = ITEMS.registerSimpleBlockItem("crossed_warped_bars", ModBlocks.CROSSED_WARPED_BARS);

    public static final DeferredItem<BlockItem> HORIZONTAL_GOLD_BARS = ITEMS.registerSimpleBlockItem("horizontal_gold_bars", ModBlocks.HORIZONTAL_GOLD_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_IRON_BARS = ITEMS.registerSimpleBlockItem("horizontal_iron_bars", ModBlocks.HORIZONTAL_IRON_BARS);

    public static final DeferredItem<BlockItem> HORIZONTAL_UNAFFECTED_COPPER_BARS = ITEMS.registerSimpleBlockItem("horizontal_copper_bars", ModBlocks.HORIZONTAL_UNAFFECTED_COPPER_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_EXPOSED_COPPER_BARS = ITEMS.registerSimpleBlockItem("horizontal_exposed_copper_bars", ModBlocks.HORIZONTAL_EXPOSED_COPPER_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_WEATHERED_COPPER_BARS = ITEMS.registerSimpleBlockItem("horizontal_weathered_copper_bars", ModBlocks.HORIZONTAL_WEATHERED_COPPER_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_OXIDIZED_COPPER_BARS = ITEMS.registerSimpleBlockItem("horizontal_oxidized_copper_bars", ModBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS);

    public static final DeferredItem<BlockItem> WAXED_HORIZONTAL_UNAFFECTED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_horizontal_copper_bars", ModBlocks.WAXED_HORIZONTAL_UNAFFECTED_COPPER_BARS);
    public static final DeferredItem<BlockItem> WAXED_HORIZONTAL_EXPOSED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_horizontal_exposed_copper_bars", ModBlocks.WAXED_HORIZONTAL_EXPOSED_COPPER_BARS);
    public static final DeferredItem<BlockItem> WAXED_HORIZONTAL_WEATHERED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_horizontal_weathered_copper_bars", ModBlocks.WAXED_HORIZONTAL_WEATHERED_COPPER_BARS);
    public static final DeferredItem<BlockItem> WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_horizontal_oxidized_copper_bars", ModBlocks.WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS);

    public static final DeferredItem<BlockItem> HORIZONTAL_ACACIA_BARS = ITEMS.registerSimpleBlockItem("horizontal_acacia_bars", ModBlocks.HORIZONTAL_ACACIA_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_BIRCH_BARS = ITEMS.registerSimpleBlockItem("horizontal_birch_bars", ModBlocks.HORIZONTAL_BIRCH_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_JUNGLE_BARS = ITEMS.registerSimpleBlockItem("horizontal_jungle_bars", ModBlocks.HORIZONTAL_JUNGLE_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_OAK_BARS = ITEMS.registerSimpleBlockItem("horizontal_oak_bars", ModBlocks.HORIZONTAL_OAK_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_DARK_OAK_BARS = ITEMS.registerSimpleBlockItem("horizontal_dark_oak_bars", ModBlocks.HORIZONTAL_DARK_OAK_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_SPRUCE_BARS = ITEMS.registerSimpleBlockItem("horizontal_spruce_bars", ModBlocks.HORIZONTAL_SPRUCE_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_MANGROVE_BARS = ITEMS.registerSimpleBlockItem("horizontal_mangrove_bars", ModBlocks.HORIZONTAL_MANGROVE_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_CRIMSON_BARS = ITEMS.registerSimpleBlockItem("horizontal_crimson_bars", ModBlocks.HORIZONTAL_CRIMSON_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_WARPED_BARS = ITEMS.registerSimpleBlockItem("horizontal_warped_bars", ModBlocks.HORIZONTAL_WARPED_BARS);

    public static final DeferredItem<BlockItem> HORIZONTAL_CROSSED_GOLD_BARS = ITEMS.registerSimpleBlockItem("horizontal_crossed_gold_bars", ModBlocks.HORIZONTAL_CROSSED_GOLD_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_CROSSED_IRON_BARS = ITEMS.registerSimpleBlockItem("horizontal_crossed_iron_bars", ModBlocks.HORIZONTAL_CROSSED_IRON_BARS);

    public static final DeferredItem<BlockItem> HORIZONTAL_CROSSED_UNAFFECTED_COPPER_BARS = ITEMS.registerSimpleBlockItem("horizontal_crossed_copper_bars", ModBlocks.HORIZONTAL_UNAFFECTED_COPPER_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS = ITEMS.registerSimpleBlockItem("horizontal_crossed_exposed_copper_bars", ModBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS = ITEMS.registerSimpleBlockItem("horizontal_crossed_weathered_copper_bars", ModBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS = ITEMS.registerSimpleBlockItem("horizontal_crossed_oxidized_copper_bars", ModBlocks.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS);

    public static final DeferredItem<BlockItem> WAXED_HORIZONTAL_CROSSED_UNAFFECTED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_horizontal_crossed_copper_bars", ModBlocks.WAXED_HORIZONTAL_UNAFFECTED_COPPER_BARS);
    public static final DeferredItem<BlockItem> WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_horizontal_crossed_exposed_copper_bars", ModBlocks.WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS);
    public static final DeferredItem<BlockItem> WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_horizontal_crossed_weathered_copper_bars", ModBlocks.WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS);
    public static final DeferredItem<BlockItem> WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_horizontal_crossed_oxidized_copper_bars", ModBlocks.WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS);

    public static final DeferredItem<BlockItem> HORIZONTAL_CROSSED_ACACIA_BARS = ITEMS.registerSimpleBlockItem("horizontal_crossed_acacia_bars", ModBlocks.HORIZONTAL_CROSSED_ACACIA_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_CROSSED_BIRCH_BARS = ITEMS.registerSimpleBlockItem("horizontal_crossed_birch_bars", ModBlocks.HORIZONTAL_CROSSED_BIRCH_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_CROSSED_JUNGLE_BARS = ITEMS.registerSimpleBlockItem("horizontal_crossed_jungle_bars", ModBlocks.HORIZONTAL_CROSSED_JUNGLE_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_CROSSED_OAK_BARS = ITEMS.registerSimpleBlockItem("horizontal_crossed_oak_bars", ModBlocks.HORIZONTAL_CROSSED_OAK_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_CROSSED_DARK_OAK_BARS = ITEMS.registerSimpleBlockItem("horizontal_crossed_dark_oak_bars", ModBlocks.HORIZONTAL_CROSSED_DARK_OAK_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_CROSSED_SPRUCE_BARS = ITEMS.registerSimpleBlockItem("horizontal_crossed_spruce_bars", ModBlocks.HORIZONTAL_CROSSED_SPRUCE_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_CROSSED_MANGROVE_BARS = ITEMS.registerSimpleBlockItem("horizontal_crossed_mangrove_bars", ModBlocks.HORIZONTAL_CROSSED_MANGROVE_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_CROSSED_CRIMSON_BARS = ITEMS.registerSimpleBlockItem("horizontal_crossed_crimson_bars", ModBlocks.HORIZONTAL_CROSSED_CRIMSON_BARS);
    public static final DeferredItem<BlockItem> HORIZONTAL_CROSSED_WARPED_BARS = ITEMS.registerSimpleBlockItem("horizontal_crossed_warped_bars", ModBlocks.HORIZONTAL_CROSSED_WARPED_BARS);
}
