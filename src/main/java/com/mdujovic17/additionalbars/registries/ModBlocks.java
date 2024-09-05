package com.mdujovic17.additionalbars.registries;

import com.mdujovic17.additionalbars.AdditionalBars;
import com.mdujovic17.additionalbars.content.block.*;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks
{
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AdditionalBars.MODID);

    // REGULAR //

    public static final DeferredBlock<Block> GOLD_BARS = BLOCKS.register("gold_bars", () -> createMetallicBarsBlock(MapColor.GOLD, SoundType.METAL, BarsType.REGULAR, BarsType.METAL));

    public static final DeferredBlock<Block> UNAFFECTED_COPPER_BARS = BLOCKS.register("copper_bars", () -> createOxidizingBarsBlock(WeatheringCopper.WeatherState.UNAFFECTED, MapColor.METAL, SoundType.COPPER, BarsType.REGULAR, BarsType.METAL, BarsType.OXIDIZING));
    public static final DeferredBlock<Block> EXPOSED_COPPER_BARS = BLOCKS.register("exposed_copper_bars", () -> createOxidizingBarsBlock(WeatheringCopper.WeatherState.EXPOSED, MapColor.METAL, SoundType.COPPER, BarsType.REGULAR, BarsType.METAL, BarsType.OXIDIZING));
    public static final DeferredBlock<Block> WEATHERED_COPPER_BARS = BLOCKS.register("weathered_copper_bars", () -> createOxidizingBarsBlock(WeatheringCopper.WeatherState.WEATHERED, MapColor.METAL, SoundType.COPPER, BarsType.REGULAR, BarsType.METAL, BarsType.OXIDIZING));
    public static final DeferredBlock<Block> OXIDIZED_COPPER_BARS = BLOCKS.register("oxidized_copper_bars", () -> createOxidizingBarsBlock(WeatheringCopper.WeatherState.OXIDIZED, MapColor.METAL, SoundType.COPPER, BarsType.REGULAR, BarsType.METAL, BarsType.OXIDIZING));

    public static final DeferredBlock<Block> WAXED_UNAFFECTED_COPPER_BARS = BLOCKS.register("waxed_copper_bars", () -> createMetallicBarsBlock(MapColor.METAL, SoundType.COPPER, BarsType.REGULAR, BarsType.METAL, BarsType.WAXED));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_BARS = BLOCKS.register("waxed_exposed_copper_bars", () -> createMetallicBarsBlock(MapColor.METAL, SoundType.COPPER, BarsType.REGULAR, BarsType.METAL, BarsType.WAXED));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_BARS = BLOCKS.register("waxed_weathered_copper_bars", () -> createMetallicBarsBlock(MapColor.METAL, SoundType.COPPER, BarsType.REGULAR, BarsType.METAL, BarsType.WAXED));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_BARS = BLOCKS.register("waxed_oxidized_copper_bars", () -> createMetallicBarsBlock(MapColor.METAL, SoundType.COPPER, BarsType.REGULAR, BarsType.METAL, BarsType.WAXED));

    public static final DeferredBlock<Block> ACACIA_BARS = BLOCKS.register("acacia_bars", () -> createWoddenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.REGULAR, BarsType.WOOD));
    public static final DeferredBlock<Block> BIRCH_BARS = BLOCKS.register("birch_bars", () -> createWoddenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.REGULAR, BarsType.WOOD));
    public static final DeferredBlock<Block> JUNGLE_BARS = BLOCKS.register("jungle_bars", () -> createWoddenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.REGULAR, BarsType.WOOD));
    public static final DeferredBlock<Block> OAK_BARS = BLOCKS.register("oak_bars", () -> createWoddenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.REGULAR, BarsType.WOOD));
    public static final DeferredBlock<Block> DARK_OAK_BARS = BLOCKS.register("dark_oak_bars", () -> createWoddenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.REGULAR, BarsType.WOOD));
    public static final DeferredBlock<Block> SPRUCE_BARS = BLOCKS.register("spruce_bars", () -> createWoddenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.REGULAR, BarsType.WOOD));
    public static final DeferredBlock<Block> MANGROVE_BARS = BLOCKS.register("mangrove_bars", () -> createWoddenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.REGULAR, BarsType.WOOD));
    public static final DeferredBlock<Block> CRIMSON_BARS = BLOCKS.register("crimson_bars", () -> createWoddenBarsBlock(MapColor.CRIMSON_NYLIUM, SoundType.NETHER_WOOD, BarsType.REGULAR, BarsType.NETHER));
    public static final DeferredBlock<Block> WARPED_BARS = BLOCKS.register("warped_bars", () -> createWoddenBarsBlock(MapColor.WARPED_NYLIUM, SoundType.NETHER_WOOD, BarsType.REGULAR, BarsType.NETHER));

    // CROSSED //

    public static final DeferredBlock<Block> CROSSED_IRON_BARS = BLOCKS.register("crossed_iron_bars", () -> createMetallicBarsBlock(MapColor.METAL, SoundType.METAL, BarsType.CROSSED, BarsType.METAL));
    public static final DeferredBlock<Block> CROSSED_GOLD_BARS = BLOCKS.register("crossed_gold_bars", () -> createMetallicBarsBlock(MapColor.GOLD, SoundType.METAL, BarsType.CROSSED, BarsType.METAL));

    public static final DeferredBlock<Block> UNAFFECTED_CROSSED_COPPER_BARS = BLOCKS.register("crossed_copper_bars", () -> createOxidizingBarsBlock(WeatheringCopper.WeatherState.UNAFFECTED, MapColor.METAL, SoundType.COPPER, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING));
    public static final DeferredBlock<Block> EXPOSED_CROSSED_COPPER_BARS = BLOCKS.register("crossed_exposed_copper_bars", () -> createOxidizingBarsBlock(WeatheringCopper.WeatherState.EXPOSED, MapColor.METAL, SoundType.COPPER, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING));
    public static final DeferredBlock<Block> WEATHERED_CROSSED_COPPER_BARS = BLOCKS.register("crossed_weathered_copper_bars", () -> createOxidizingBarsBlock(WeatheringCopper.WeatherState.WEATHERED, MapColor.METAL, SoundType.COPPER, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING));
    public static final DeferredBlock<Block> OXIDIZED_CROSSED_COPPER_BARS = BLOCKS.register("crossed_oxidized_copper_bars", () -> createOxidizingBarsBlock(WeatheringCopper.WeatherState.OXIDIZED, MapColor.METAL, SoundType.COPPER, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING));

    public static final DeferredBlock<Block> WAXED_UNAFFECTED_CROSSED_COPPER_BARS = BLOCKS.register("waxed_crossed_copper_bars", () -> createMetallicBarsBlock(MapColor.METAL, SoundType.COPPER, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED));
    public static final DeferredBlock<Block> WAXED_EXPOSED_CROSSED_COPPER_BARS = BLOCKS.register("waxed_crossed_exposed_copper_bars", () -> createMetallicBarsBlock(MapColor.METAL, SoundType.COPPER, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED));
    public static final DeferredBlock<Block> WAXED_WEATHERED_CROSSED_COPPER_BARS = BLOCKS.register("waxed_crossed_weathered_copper_bars", () -> createMetallicBarsBlock(MapColor.METAL, SoundType.COPPER, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_CROSSED_COPPER_BARS = BLOCKS.register("waxed_crossed_oxidized_copper_bars", () -> createMetallicBarsBlock(MapColor.METAL, SoundType.COPPER, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED));

    public static final DeferredBlock<Block> CROSSED_ACACIA_BARS = BLOCKS.register("crossed_acacia_bars", () -> createWoddenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.CROSSED, BarsType.WOOD));
    public static final DeferredBlock<Block> CROSSED_BIRCH_BARS = BLOCKS.register("crossed_birch_bars", () -> createWoddenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.CROSSED, BarsType.WOOD));
    public static final DeferredBlock<Block> CROSSED_JUNGLE_BARS = BLOCKS.register("crossed_jungle_bars", () -> createWoddenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.CROSSED, BarsType.WOOD));
    public static final DeferredBlock<Block> CROSSED_OAK_BARS = BLOCKS.register("crossed_oak_bars", () -> createWoddenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.CROSSED, BarsType.WOOD));
    public static final DeferredBlock<Block> CROSSED_DARK_OAK_BARS = BLOCKS.register("crossed_dark_oak_bars", () -> createWoddenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.CROSSED, BarsType.WOOD));
    public static final DeferredBlock<Block> CROSSED_SPRUCE_BARS = BLOCKS.register("crossed_spruce_bars", () -> createWoddenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.CROSSED, BarsType.WOOD));
    public static final DeferredBlock<Block> CROSSED_MANGROVE_BARS = BLOCKS.register("crossed_mangrove_bars", () -> createWoddenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.CROSSED, BarsType.WOOD));
    public static final DeferredBlock<Block> CROSSED_CRIMSON_BARS = BLOCKS.register("crossed_crimson_bars", () -> createWoddenBarsBlock(MapColor.CRIMSON_NYLIUM, SoundType.NETHER_WOOD, BarsType.CROSSED, BarsType.NETHER));
    public static final DeferredBlock<Block> CROSSED_WARPED_BARS = BLOCKS.register("crossed_warped_bars", () -> createWoddenBarsBlock(MapColor.WARPED_NYLIUM, SoundType.NETHER_WOOD, BarsType.CROSSED, BarsType.NETHER));

    // HORIZONTAL //

    public static final DeferredBlock<Block> HORIZONTAL_IRON_BARS = BLOCKS.register("horizontal_iron_bars", () -> createHorizontalMetallicBarsBlock(MapColor.METAL, SoundType.METAL, BarsType.HORIZONTAL, BarsType.METAL));
    public static final DeferredBlock<Block> HORIZONTAL_GOLD_BARS = BLOCKS.register("horizontal_gold_bars", () -> createHorizontalMetallicBarsBlock(MapColor.GOLD, SoundType.METAL, BarsType.HORIZONTAL, BarsType.METAL));

    public static final DeferredBlock<Block> HORIZONTAL_UNAFFECTED_COPPER_BARS = BLOCKS.register("horizontal_copper_bars", () -> createHorizontalOxidizingBarsBlock(WeatheringCopper.WeatherState.UNAFFECTED, MapColor.METAL, SoundType.COPPER, BarsType.HORIZONTAL, BarsType.METAL, BarsType.OXIDIZING));
    public static final DeferredBlock<Block> HORIZONTAL_EXPOSED_COPPER_BARS = BLOCKS.register("horizontal_exposed_copper_bars", () -> createHorizontalOxidizingBarsBlock(WeatheringCopper.WeatherState.EXPOSED, MapColor.METAL, SoundType.COPPER, BarsType.HORIZONTAL, BarsType.METAL, BarsType.OXIDIZING));
    public static final DeferredBlock<Block> HORIZONTAL_WEATHERED_COPPER_BARS = BLOCKS.register("horizontal_weathered_copper_bars", () -> createHorizontalOxidizingBarsBlock(WeatheringCopper.WeatherState.WEATHERED, MapColor.METAL, SoundType.COPPER, BarsType.HORIZONTAL, BarsType.METAL, BarsType.OXIDIZING));
    public static final DeferredBlock<Block> HORIZONTAL_OXIDIZED_COPPER_BARS = BLOCKS.register("horizontal_oxidized_copper_bars", () -> createHorizontalOxidizingBarsBlock(WeatheringCopper.WeatherState.OXIDIZED, MapColor.METAL, SoundType.COPPER, BarsType.HORIZONTAL, BarsType.METAL, BarsType.OXIDIZING));

    public static final DeferredBlock<Block> WAXED_HORIZONTAL_UNAFFECTED_COPPER_BARS = BLOCKS.register("waxed_horizontal_copper_bars", () -> createHorizontalMetallicBarsBlock(MapColor.METAL, SoundType.COPPER, BarsType.HORIZONTAL, BarsType.METAL, BarsType.WAXED));
    public static final DeferredBlock<Block> WAXED_HORIZONTAL_EXPOSED_COPPER_BARS = BLOCKS.register("waxed_horizontal_exposed_copper_bars", () -> createHorizontalMetallicBarsBlock(MapColor.METAL, SoundType.COPPER, BarsType.HORIZONTAL, BarsType.METAL, BarsType.WAXED));
    public static final DeferredBlock<Block> WAXED_HORIZONTAL_WEATHERED_COPPER_BARS = BLOCKS.register("waxed_horizontal_weathered_copper_bars", () -> createHorizontalMetallicBarsBlock(MapColor.METAL, SoundType.COPPER, BarsType.HORIZONTAL, BarsType.METAL, BarsType.WAXED));
    public static final DeferredBlock<Block> WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS = BLOCKS.register("waxed_horizontal_oxidized_copper_bars", () -> createHorizontalMetallicBarsBlock(MapColor.METAL, SoundType.COPPER, BarsType.HORIZONTAL, BarsType.METAL, BarsType.WAXED));

    public static final DeferredBlock<Block> HORIZONTAL_ACACIA_BARS = BLOCKS.register("horizontal_acacia_bars", () -> createHorizontalWoodenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.HORIZONTAL, BarsType.WOOD));
    public static final DeferredBlock<Block> HORIZONTAL_BIRCH_BARS = BLOCKS.register("horizontal_birch_bars", () -> createHorizontalWoodenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.HORIZONTAL, BarsType.WOOD));
    public static final DeferredBlock<Block> HORIZONTAL_JUNGLE_BARS = BLOCKS.register("horizontal_jungle_bars", () -> createHorizontalWoodenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.HORIZONTAL, BarsType.WOOD));
    public static final DeferredBlock<Block> HORIZONTAL_OAK_BARS = BLOCKS.register("horizontal_oak_bars", () -> createHorizontalWoodenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.HORIZONTAL, BarsType.WOOD));
    public static final DeferredBlock<Block> HORIZONTAL_DARK_OAK_BARS = BLOCKS.register("horizontal_dark_oak_bars", () -> createHorizontalWoodenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.HORIZONTAL, BarsType.WOOD));
    public static final DeferredBlock<Block> HORIZONTAL_SPRUCE_BARS = BLOCKS.register("horizontal_spruce_bars", () -> createHorizontalWoodenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.HORIZONTAL, BarsType.WOOD));
    public static final DeferredBlock<Block> HORIZONTAL_MANGROVE_BARS = BLOCKS.register("horizontal_mangrove_bars", () -> createHorizontalWoodenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.HORIZONTAL, BarsType.WOOD));
    public static final DeferredBlock<Block> HORIZONTAL_CRIMSON_BARS = BLOCKS.register("horizontal_crimson_bars", () -> createHorizontalWoodenBarsBlock(MapColor.CRIMSON_NYLIUM, SoundType.NETHER_WOOD, BarsType.HORIZONTAL, BarsType.NETHER));
    public static final DeferredBlock<Block> HORIZONTAL_WARPED_BARS = BLOCKS.register("horizontal_warped_bars", () -> createHorizontalWoodenBarsBlock(MapColor.WARPED_NYLIUM, SoundType.NETHER_WOOD, BarsType.HORIZONTAL, BarsType.NETHER));

    // HORIZONTAL CROSSED //

    public static final DeferredBlock<Block> HORIZONTAL_CROSSED_IRON_BARS = BLOCKS.register("horizontal_crossed_iron_bars", () -> createHorizontalMetallicBarsBlock(MapColor.METAL, SoundType.METAL, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL));
    public static final DeferredBlock<Block> HORIZONTAL_CROSSED_GOLD_BARS = BLOCKS.register("horizontal_crossed_gold_bars", () -> createHorizontalMetallicBarsBlock(MapColor.GOLD, SoundType.METAL, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL));

    public static final DeferredBlock<Block> HORIZONTAL_CROSSED_UNAFFECTED_COPPER_BARS = BLOCKS.register("horizontal_crossed_copper_bars", () -> createHorizontalOxidizingBarsBlock(WeatheringCopper.WeatherState.UNAFFECTED, MapColor.METAL, SoundType.COPPER, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING));
    public static final DeferredBlock<Block> HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS = BLOCKS.register("horizontal_crossed_exposed_copper_bars", () -> createHorizontalOxidizingBarsBlock(WeatheringCopper.WeatherState.EXPOSED, MapColor.METAL, SoundType.COPPER, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING));
    public static final DeferredBlock<Block> HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS = BLOCKS.register("horizontal_crossed_weathered_copper_bars", () -> createHorizontalOxidizingBarsBlock(WeatheringCopper.WeatherState.WEATHERED, MapColor.METAL, SoundType.COPPER, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING));
    public static final DeferredBlock<Block> HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS = BLOCKS.register("horizontal_crossed_oxidized_copper_bars", () -> createHorizontalOxidizingBarsBlock(WeatheringCopper.WeatherState.OXIDIZED, MapColor.METAL, SoundType.COPPER, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING));

    public static final DeferredBlock<Block> WAXED_HORIZONTAL_CROSSED_UNAFFECTED_COPPER_BARS = BLOCKS.register("waxed_horizontal_crossed_copper_bars", () -> createHorizontalMetallicBarsBlock(MapColor.METAL, SoundType.COPPER, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED));
    public static final DeferredBlock<Block> WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS = BLOCKS.register("waxed_horizontal_crossed_exposed_copper_bars", () -> createHorizontalMetallicBarsBlock(MapColor.METAL, SoundType.COPPER, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED));
    public static final DeferredBlock<Block> WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS = BLOCKS.register("waxed_horizontal_crossed_weathered_copper_bars", () -> createHorizontalMetallicBarsBlock(MapColor.METAL, SoundType.COPPER, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED));
    public static final DeferredBlock<Block> WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS = BLOCKS.register("waxed_horizontal_crossed_oxidized_copper_bars", () -> createHorizontalMetallicBarsBlock(MapColor.METAL, SoundType.COPPER, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED));

    public static final DeferredBlock<Block> HORIZONTAL_CROSSED_ACACIA_BARS = BLOCKS.register("horizontal_crossed_acacia_bars", () -> createHorizontalWoodenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.WOOD));
    public static final DeferredBlock<Block> HORIZONTAL_CROSSED_BIRCH_BARS = BLOCKS.register("horizontal_crossed_birch_bars", () -> createHorizontalWoodenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.WOOD));
    public static final DeferredBlock<Block> HORIZONTAL_CROSSED_JUNGLE_BARS = BLOCKS.register("horizontal_crossed_jungle_bars", () -> createHorizontalWoodenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.WOOD));
    public static final DeferredBlock<Block> HORIZONTAL_CROSSED_OAK_BARS = BLOCKS.register("horizontal_crossed_oak_bars", () -> createHorizontalWoodenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.WOOD));
    public static final DeferredBlock<Block> HORIZONTAL_CROSSED_DARK_OAK_BARS = BLOCKS.register("horizontal_crossed_dark_oak_bars", () -> createHorizontalWoodenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.WOOD));
    public static final DeferredBlock<Block> HORIZONTAL_CROSSED_SPRUCE_BARS = BLOCKS.register("horizontal_crossed_spruce_bars", () -> createHorizontalWoodenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.WOOD));
    public static final DeferredBlock<Block> HORIZONTAL_CROSSED_MANGROVE_BARS = BLOCKS.register("horizontal_crossed_mangrove_bars", () -> createHorizontalWoodenBarsBlock(MapColor.WOOD, SoundType.WOOD, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.WOOD));
    public static final DeferredBlock<Block> HORIZONTAL_CROSSED_CRIMSON_BARS = BLOCKS.register("horizontal_crossed_crimson_bars", () -> createHorizontalWoodenBarsBlock(MapColor.CRIMSON_NYLIUM, SoundType.NETHER_WOOD, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.NETHER));
    public static final DeferredBlock<Block> HORIZONTAL_CROSSED_WARPED_BARS = BLOCKS.register("horizontal_crossed_warped_bars", () -> createHorizontalWoodenBarsBlock(MapColor.WARPED_NYLIUM, SoundType.NETHER_WOOD, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.NETHER));

    private static BarsBlock createMetallicBarsBlock(MapColor color, SoundType sound, BlockType... types) {
        BarsBlock barsBlock = new BarsBlock(BlockBehaviour.Properties.of()
                .mapColor(color)
                .strength(5.0f, 6.0f)
                .sound(sound)
                .noOcclusion()
                .isValidSpawn(ModBlocks::never)
                .isRedstoneConductor(ModBlocks::never)
                .isViewBlocking(ModBlocks::never)
                .isSuffocating(ModBlocks::never));
        barsBlock.setBlockTypes(types);
        return barsBlock;
    }

    private static OxidizingBarsBlock createOxidizingBarsBlock(WeatheringCopper.WeatherState state, MapColor color, SoundType sound, BlockType... types) {
        OxidizingBarsBlock barsBlock = new OxidizingBarsBlock(state, BlockBehaviour.Properties.of()
                .mapColor(color)
                .strength(5.0f, 6.0f)
                .sound(sound)
                .noOcclusion()
                .isValidSpawn(ModBlocks::never)
                .isRedstoneConductor(ModBlocks::never)
                .isViewBlocking(ModBlocks::never)
                .isSuffocating(ModBlocks::never).randomTicks());
        barsBlock.setBlockTypes(types);
        return barsBlock;
    }

    private static BarsBlock createWoddenBarsBlock(MapColor color, SoundType sound, BlockType... types) {
        BarsBlock barsBlock = new BarsBlock(BlockBehaviour.Properties.of()
                .mapColor(color)
                .strength(4.0f, 3.0f)
                .sound(sound)
                .noOcclusion()
                .isValidSpawn(ModBlocks::never)
                .isRedstoneConductor(ModBlocks::never)
                .isViewBlocking(ModBlocks::never)
                .isSuffocating(ModBlocks::never));
        barsBlock.setBlockTypes(types);
        return barsBlock;
    }

    private static HorizontalPaneBlock createHorizontalMetallicBarsBlock(MapColor color, SoundType sound, BlockType... types) {
        HorizontalPaneBlock barsBlock = new HorizontalPaneBlock(BlockBehaviour.Properties.of()
                .mapColor(color)
                .strength(5.0f, 6.0f)
                .sound(sound)
                .noOcclusion()
                .isValidSpawn(ModBlocks::never)
                .isRedstoneConductor(ModBlocks::never)
                .isViewBlocking(ModBlocks::never)
                .isSuffocating(ModBlocks::never));
        barsBlock.setBlockTypes(types);
        return barsBlock;
    }

    private static HorizontalPaneBlock createHorizontalWoodenBarsBlock(MapColor color, SoundType sound, BlockType... types) {
        HorizontalPaneBlock barsBlock = new HorizontalPaneBlock(BlockBehaviour.Properties.of()
                .mapColor(color)
                .strength(4.0f, 3.0f)
                .sound(sound)
                .noOcclusion()
                .isValidSpawn(ModBlocks::never)
                .isRedstoneConductor(ModBlocks::never)
                .isViewBlocking(ModBlocks::never)
                .isSuffocating(ModBlocks::never));
        barsBlock.setBlockTypes(types);
        return barsBlock;
    }

    private static HorizontalOxidizingBarsBlock createHorizontalOxidizingBarsBlock(WeatheringCopper.WeatherState state, MapColor color, SoundType sound, BlockType... types) {
        HorizontalOxidizingBarsBlock barsBlock = new HorizontalOxidizingBarsBlock(state, BlockBehaviour.Properties.of()
                .mapColor(color)
                .strength(5.0f, 6.0f)
                .sound(sound)
                .noOcclusion()
                .isValidSpawn(ModBlocks::never)
                .isRedstoneConductor(ModBlocks::never)
                .isViewBlocking(ModBlocks::never)
                .isSuffocating(ModBlocks::never).randomTicks());
        barsBlock.setBlockTypes(types);
        return barsBlock;
    }

    private static Boolean never(BlockState blockState, BlockGetter blockView, BlockPos blockPos, EntityType<?> entityType) { return false; }
    private static boolean never(BlockState blockState, BlockGetter blockView, BlockPos blockPos) { return false; }
}

