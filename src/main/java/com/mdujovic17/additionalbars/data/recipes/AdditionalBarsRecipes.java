package com.mdujovic17.additionalbars.data.recipes;

import com.mdujovic17.additionalbars.AdditionalBars;
import com.mdujovic17.additionalbars.registries.ModBlocks;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

public class AdditionalBarsRecipes {

    public static void registerRecipes(RecipeOutput output) {
        regularBarsRecipes(output);
        crossedBarsRecipes(output);
        horizontalBarsRecipes(output);
        horizontalCrossedBarsRecipes(output);
        horizontalToVerticalRecipes(output);
        crossedToRegularRecipes(output);
    }

    public static void regularBarsRecipes(RecipeOutput output) {
        AdditionalBars.LOGGER.info("Generating Recipes for Regular Bars...");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GOLD_BARS.get(), 16)
                .pattern("GGG")
                .pattern("NNN")
                .pattern("GGG")
                .define('G', Items.GOLD_INGOT)
                .define('N', Items.GOLD_NUGGET)
                .unlockedBy("has_gold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GOLD_INGOT))
                .group("bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.UNAFFECTED_COPPER_BARS, 64)
                .pattern("CCC")
                .pattern("NNN")
                .pattern("CCC")
                .define('C', Blocks.COPPER_BLOCK)
                .define('N', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COPPER_INGOT))
                .group("bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_BARS.get(), 16)
                .pattern("LLL")
                .pattern("SSS")
                .pattern("LLL")
                .define('L', Blocks.ACACIA_LOG)
                .define('S', Items.STICK)
                .unlockedBy("has_acacia_log", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.ACACIA_LOG))
                .group("bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_BARS.get(), 16)
                .pattern("LLL")
                .pattern("SSS")
                .pattern("LLL")
                .define('L', Blocks.BIRCH_LOG)
                .define('S', Items.STICK)
                .unlockedBy("has_gold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.BIRCH_LOG))
                .group("bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_BARS.get(), 16)
                .pattern("LLL")
                .pattern("SSS")
                .pattern("LLL")
                .define('L', Blocks.JUNGLE_LOG)
                .define('S', Items.STICK)
                .unlockedBy("has_jungle_log", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.JUNGLE_LOG))
                .group("bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.OAK_BARS.get(), 16)
                .pattern("LLL")
                .pattern("SSS")
                .pattern("LLL")
                .define('L', Blocks.OAK_LOG)
                .define('S', Items.STICK)
                .unlockedBy("has_oak_log", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.OAK_LOG))
                .group("bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_BARS.get(), 16)
                .pattern("LLL")
                .pattern("SSS")
                .pattern("LLL")
                .define('L', Blocks.DARK_OAK_LOG)
                .define('S', Items.STICK)
                .unlockedBy("has_dark_oak_log", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.DARK_OAK_LOG))
                .group("bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_BARS.get(), 16)
                .pattern("LLL")
                .pattern("SSS")
                .pattern("LLL")
                .define('L', Blocks.SPRUCE_LOG)
                .define('S', Items.STICK)
                .unlockedBy("has_spruce_log", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.SPRUCE_LOG))
                .group("bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_BARS.get(), 16)
                .pattern("LLL")
                .pattern("SSS")
                .pattern("LLL")
                .define('L', Blocks.MANGROVE_LOG)
                .define('S', Items.STICK)
                .unlockedBy("has_mangrove_log", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.MANGROVE_LOG))
                .group("bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_BARS.get(), 16)
                .pattern("LLL")
                .pattern("SSS")
                .pattern("LLL")
                .define('L', Blocks.CRIMSON_HYPHAE)
                .define('S', Items.STICK)
                .unlockedBy("has_crimson_hyphae", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.CRIMSON_HYPHAE))
                .group("bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WARPED_BARS.get(), 16)
                .pattern("LLL")
                .pattern("SSS")
                .pattern("LLL")
                .define('L', Blocks.WARPED_HYPHAE)
                .define('S', Items.STICK)
                .unlockedBy("has_warped_hyphae", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.WARPED_HYPHAE))
                .group("bars")
                .save(output);
    }

    private static void crossedBarsRecipes(RecipeOutput output) {
        AdditionalBars.LOGGER.info("Generating Recipes for Crossed Bars...");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_IRON_BARS, 2)
                .requires(Blocks.IRON_BARS, 2)
                .unlockedBy("has_iron_bars", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.IRON_BARS))
                .group("crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_GOLD_BARS, 2)
                .requires(ModBlocks.GOLD_BARS, 2)
                .unlockedBy("has_gold_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.GOLD_BARS))
                .group("crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.UNAFFECTED_CROSSED_COPPER_BARS, 2)
                .requires(ModBlocks.UNAFFECTED_COPPER_BARS, 2)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.UNAFFECTED_COPPER_BARS))
                .group("crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_CROSSED_COPPER_BARS, 2)
                .requires(ModBlocks.EXPOSED_COPPER_BARS, 2)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.UNAFFECTED_COPPER_BARS))
                .group("crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_CROSSED_COPPER_BARS, 2)
                .requires(ModBlocks.WEATHERED_COPPER_BARS, 2)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.UNAFFECTED_COPPER_BARS))
                .group("crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_CROSSED_COPPER_BARS, 2)
                .requires(ModBlocks.OXIDIZED_COPPER_BARS, 2)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.UNAFFECTED_COPPER_BARS))
                .group("crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_ACACIA_BARS, 2)
                .requires(ModBlocks.ACACIA_BARS, 2)
                .unlockedBy("has_acacia_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ACACIA_BARS))
                .group("crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_BIRCH_BARS, 2)
                .requires(ModBlocks.BIRCH_BARS, 2)
                .unlockedBy("has_birch_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.BIRCH_BARS))
                .group("crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_JUNGLE_BARS, 2)
                .requires(ModBlocks.JUNGLE_BARS, 2)
                .unlockedBy("has_jungle_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.JUNGLE_BARS))
                .group("crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_OAK_BARS, 2)
                .requires(ModBlocks.OAK_BARS, 2)
                .unlockedBy("has_oak_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.OAK_BARS))
                .group("crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_DARK_OAK_BARS, 2)
                .requires(ModBlocks.DARK_OAK_BARS, 2)
                .unlockedBy("has_dark_oak_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.DARK_OAK_BARS))
                .group("crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_SPRUCE_BARS, 2)
                .requires(ModBlocks.SPRUCE_BARS, 2)
                .unlockedBy("has_spruce_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.SPRUCE_BARS))
                .group("crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_MANGROVE_BARS, 2)
                .requires(ModBlocks.MANGROVE_BARS, 2)
                .unlockedBy("has_mangrove_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.MANGROVE_BARS))
                .group("crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_CRIMSON_BARS, 2)
                .requires(ModBlocks.CRIMSON_BARS, 2)
                .unlockedBy("has_crimson_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.CRIMSON_BARS))
                .group("crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_WARPED_BARS, 2)
                .requires(ModBlocks.WARPED_BARS, 2)
                .unlockedBy("has_warped_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.WARPED_BARS))
                .group("crossed_bars")
                .save(output);
    }

    private static void horizontalBarsRecipes(RecipeOutput output) {
        AdditionalBars.LOGGER.info("Generating Recipes for Horizontal Bars...");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_GOLD_BARS.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.GOLD_BARS)
                .unlockedBy("has_gold_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.GOLD_BARS))
                .group("horizontal_bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_IRON_BARS.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', Blocks.IRON_BARS)
                .unlockedBy("has_iron_bars", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.IRON_BARS))
                .group("horizontal_bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_UNAFFECTED_COPPER_BARS.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.UNAFFECTED_COPPER_BARS)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.UNAFFECTED_COPPER_BARS))
                .group("horizontal_bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_EXPOSED_COPPER_BARS.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.EXPOSED_COPPER_BARS)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.EXPOSED_COPPER_BARS))
                .group("horizontal_bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_WEATHERED_COPPER_BARS.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.WEATHERED_COPPER_BARS)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.WEATHERED_COPPER_BARS))
                .group("horizontal_bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.OXIDIZED_COPPER_BARS)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.OXIDIZED_COPPER_BARS))
                .group("horizontal_bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_ACACIA_BARS.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.ACACIA_BARS)
                .unlockedBy("has_acacia_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ACACIA_BARS))
                .group("horizontal_bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_BIRCH_BARS.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.BIRCH_BARS)
                .unlockedBy("has_birch_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.BIRCH_BARS))
                .group("horizontal_bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_JUNGLE_BARS.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.JUNGLE_BARS)
                .unlockedBy("has_jungle_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.JUNGLE_BARS))
                .group("horizontal_bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_OAK_BARS.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.OAK_BARS)
                .unlockedBy("has_oak_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.OAK_BARS))
                .group("horizontal_bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_DARK_OAK_BARS.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.DARK_OAK_BARS)
                .unlockedBy("has_dark_oak_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.DARK_OAK_BARS))
                .group("horizontal_bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_SPRUCE_BARS.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.SPRUCE_BARS)
                .unlockedBy("has_gold_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.SPRUCE_BARS))
                .group("horizontal_bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_MANGROVE_BARS.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.MANGROVE_BARS)
                .unlockedBy("has_mangrove_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.MANGROVE_BARS))
                .group("horizontal_bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CRIMSON_BARS.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.CRIMSON_BARS)
                .unlockedBy("has_crimson_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.CRIMSON_BARS))
                .group("horizontal_bars")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_WARPED_BARS.get(), 6)
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.WARPED_BARS)
                .unlockedBy("has_warped_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.WARPED_BARS))
                .group("horizontal_bars")
                .save(output);
    }

    private static void horizontalCrossedBarsRecipes(RecipeOutput output) {
        AdditionalBars.LOGGER.info("Generating Recipes for Horizontal Crossed Bars...");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_IRON_BARS, 2)
                .requires(Blocks.IRON_BARS, 2)
                .unlockedBy("has_iron_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.HORIZONTAL_IRON_BARS))
                .group("horizontal_crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_GOLD_BARS, 2)
                .requires(ModBlocks.HORIZONTAL_GOLD_BARS, 2)
                .unlockedBy("has_gold_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.HORIZONTAL_GOLD_BARS))
                .group("horizontal_crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_UNAFFECTED_COPPER_BARS, 2)
                .requires(ModBlocks.HORIZONTAL_UNAFFECTED_COPPER_BARS, 2)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.HORIZONTAL_UNAFFECTED_COPPER_BARS))
                .group("horizontal_crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS, 2)
                .requires(ModBlocks.HORIZONTAL_EXPOSED_COPPER_BARS, 2)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.HORIZONTAL_UNAFFECTED_COPPER_BARS))
                .group("horizontal_crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS, 2)
                .requires(ModBlocks.HORIZONTAL_WEATHERED_COPPER_BARS, 2)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.HORIZONTAL_UNAFFECTED_COPPER_BARS))
                .group("horizontal_crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS, 2)
                .requires(ModBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS, 2)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.HORIZONTAL_UNAFFECTED_COPPER_BARS))
                .group("horizontal_crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_ACACIA_BARS, 2)
                .requires(ModBlocks.HORIZONTAL_ACACIA_BARS, 2)
                .unlockedBy("has_acacia_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.HORIZONTAL_ACACIA_BARS))
                .group("horizontal_crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_BIRCH_BARS, 2)
                .requires(ModBlocks.HORIZONTAL_BIRCH_BARS, 2)
                .unlockedBy("has_birch_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.HORIZONTAL_BIRCH_BARS))
                .group("horizontal_crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_JUNGLE_BARS, 2)
                .requires(ModBlocks.HORIZONTAL_JUNGLE_BARS, 2)
                .unlockedBy("has_jungle_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.HORIZONTAL_JUNGLE_BARS))
                .group("horizontal_crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_OAK_BARS, 2)
                .requires(ModBlocks.HORIZONTAL_OAK_BARS, 2)
                .unlockedBy("has_oak_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.HORIZONTAL_OAK_BARS))
                .group("horizontal_crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_DARK_OAK_BARS, 2)
                .requires(ModBlocks.HORIZONTAL_DARK_OAK_BARS, 2)
                .unlockedBy("has_dark_oak_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.HORIZONTAL_DARK_OAK_BARS))
                .group("horizontal_crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_SPRUCE_BARS, 2)
                .requires(ModBlocks.HORIZONTAL_SPRUCE_BARS, 2)
                .unlockedBy("has_spruce_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.HORIZONTAL_SPRUCE_BARS))
                .group("horizontal_crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_MANGROVE_BARS, 2)
                .requires(ModBlocks.HORIZONTAL_MANGROVE_BARS, 2)
                .unlockedBy("has_mangrove_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.HORIZONTAL_MANGROVE_BARS))
                .group("horizontal_crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_CRIMSON_BARS, 2)
                .requires(ModBlocks.HORIZONTAL_CRIMSON_BARS, 2)
                .unlockedBy("has_crimson_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.HORIZONTAL_CRIMSON_BARS))
                .group("horizontal_crossed_bars")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_WARPED_BARS, 2)
                .requires(ModBlocks.HORIZONTAL_WARPED_BARS, 2)
                .unlockedBy("has_warped_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.HORIZONTAL_WARPED_BARS))
                .group("horizontal_crossed_bars")
                .save(output);
    }

    private static void horizontalToVerticalRecipes(RecipeOutput output) {
        AdditionalBars.LOGGER.info("Generating Recipes for Reverting Horizontal Bars to Vertical...");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.IRON_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_IRON_BARS, 1)
                .unlockedBy("has_iron_bars", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.IRON_BARS))
                .group("bars")
                .save(output, "additionalbars:horizontal_to_iron");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.GOLD_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_GOLD_BARS, 1)
                .unlockedBy("has_gold_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.GOLD_BARS))
                .group("bars")
                .save(output, "additionalbars:horizontal_to_gold");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.UNAFFECTED_COPPER_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_UNAFFECTED_COPPER_BARS, 1)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.UNAFFECTED_COPPER_BARS))
                .group("bars")
                .save(output, "additionalbars:horizontal_to_copper");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_COPPER_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_EXPOSED_COPPER_BARS, 1)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.EXPOSED_COPPER_BARS))
                .group("bars")
                .save(output, "additionalbars:horizontal_to_exposed_copper");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_COPPER_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_WEATHERED_COPPER_BARS, 1)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.WEATHERED_COPPER_BARS))
                .group("bars")
                .save(output, "additionalbars:horizontal_to_weathered_copper");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_COPPER_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS, 1)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.OXIDIZED_COPPER_BARS))
                .group("bars")
                .save(output, "additionalbars:horizontal_to_oxidized_copper");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_ACACIA_BARS, 1)
                .unlockedBy("has_acacia_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ACACIA_BARS))
                .group("bars")
                .save(output, "additionalbars:horizontal_to_acacia");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_BIRCH_BARS, 1)
                .unlockedBy("has_birch_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.BIRCH_BARS))
                .group("bars")
                .save(output, "additionalbars:horizontal_to_birch");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_JUNGLE_BARS, 1)
                .unlockedBy("has_jungle_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.JUNGLE_BARS))
                .group("bars")
                .save(output, "additionalbars:horizontal_to_jungle");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.OAK_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_OAK_BARS, 1)
                .unlockedBy("has_oak_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.OAK_BARS))
                .group("bars")
                .save(output, "additionalbars:horizontal_to_oak");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_DARK_OAK_BARS, 1)
                .unlockedBy("has_dark_oak_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.DARK_OAK_BARS))
                .group("bars")
                .save(output, "additionalbars:horizontal_to_dark_oak");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_SPRUCE_BARS, 1)
                .unlockedBy("has_spruce_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.SPRUCE_BARS))
                .group("bars")
                .save(output, "additionalbars:horizontal_to_spruce");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_MANGROVE_BARS, 1)
                .unlockedBy("has_mangrove_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.MANGROVE_BARS))
                .group("bars")
                .save(output, "additionalbars:horizontal_to_mangrove");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_CRIMSON_BARS, 1)
                .unlockedBy("has_crimson_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.CRIMSON_BARS))
                .group("bars")
                .save(output, "additionalbars:horizontal_to_crimson");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.WARPED_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_WARPED_BARS, 1)
                .unlockedBy("has_warped_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.WARPED_BARS))
                .group("bars")
                .save(output, "additionalbars:horizontal_to_warped");

        // CROSSED

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_IRON_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_CROSSED_IRON_BARS, 1)
                .unlockedBy("has_iron_bars", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.IRON_BARS))
                .group("crossed_bars")
                .save(output, "additionalbars:horizontal_to_crossed_iron");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_GOLD_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_CROSSED_GOLD_BARS, 1)
                .unlockedBy("has_gold_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.GOLD_BARS))
                .group("crossed_bars")
                .save(output, "additionalbars:horizontal_to_crossed_gold");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.UNAFFECTED_CROSSED_COPPER_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_CROSSED_UNAFFECTED_COPPER_BARS, 1)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.UNAFFECTED_COPPER_BARS))
                .group("crossed_bars")
                .save(output, "additionalbars:horizontal_to_crossed_copper");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_CROSSED_COPPER_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS, 1)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.EXPOSED_COPPER_BARS))
                .group("crossed_bars")
                .save(output, "additionalbars:horizontal_to_crossed_exposed_copper");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_CROSSED_COPPER_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS, 1)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.WEATHERED_COPPER_BARS))
                .group("crossed_bars")
                .save(output, "additionalbars:horizontal_to_crossed_weathered_copper");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_CROSSED_COPPER_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS, 1)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.OXIDIZED_COPPER_BARS))
                .group("crossed_bars")
                .save(output, "additionalbars:horizontal_to_crossed_oxidized_copper");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_ACACIA_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_CROSSED_ACACIA_BARS, 1)
                .unlockedBy("has_acacia_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ACACIA_BARS))
                .group("crossed_bars")
                .save(output, "additionalbars:horizontal_to_crossed_acacia");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_BIRCH_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_CROSSED_BIRCH_BARS, 1)
                .unlockedBy("has_birch_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.BIRCH_BARS))
                .group("crossed_bars")
                .save(output, "additionalbars:horizontal_to_crossed_birch");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_JUNGLE_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_CROSSED_JUNGLE_BARS, 1)
                .unlockedBy("has_jungle_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.JUNGLE_BARS))
                .group("crossed_bars")
                .save(output, "additionalbars:horizontal_to_crossed_jungle");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_OAK_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_CROSSED_OAK_BARS, 1)
                .unlockedBy("has_oak_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.OAK_BARS))
                .group("crossed_bars")
                .save(output, "additionalbars:horizontal_to_crossed_oak");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_DARK_OAK_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_CROSSED_DARK_OAK_BARS, 1)
                .unlockedBy("has_dark_oak_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.DARK_OAK_BARS))
                .group("crossed_bars")
                .save(output, "additionalbars:horizontal_to_crossed_dark_oak");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_SPRUCE_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_CROSSED_SPRUCE_BARS, 1)
                .unlockedBy("has_spruce_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.SPRUCE_BARS))
                .group("crossed_bars")
                .save(output, "additionalbars:horizontal_to_crossed_spruce");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_MANGROVE_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_CROSSED_MANGROVE_BARS, 1)
                .unlockedBy("has_mangrove_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.MANGROVE_BARS))
                .group("crossed_bars")
                .save(output, "additionalbars:horizontal_to_crossed_mangrove");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_CRIMSON_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_CROSSED_CRIMSON_BARS, 1)
                .unlockedBy("has_crimson_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.CRIMSON_BARS))
                .group("crossed_bars")
                .save(output, "additionalbars:horizontal_to_crossed_crimson");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_WARPED_BARS, 1)
                .requires(ModBlocks.HORIZONTAL_CROSSED_WARPED_BARS, 1)
                .unlockedBy("has_warped_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.WARPED_BARS))
                .group("crossed_bars")
                .save(output, "additionalbars:horizontal_to_crossed_warped");
    }

    private static void crossedToRegularRecipes(RecipeOutput output) {
        AdditionalBars.LOGGER.info("Generating Recipes for Reverting Crossed Bars to Regular...");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.IRON_BARS, 2)
                .requires(ModBlocks.CROSSED_IRON_BARS, 1)
                .unlockedBy("has_iron_bars", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.IRON_BARS))
                .group("bars")
                .save(output, "additionalbars:crossed_to_iron");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.GOLD_BARS, 2)
                .requires(ModBlocks.CROSSED_GOLD_BARS, 1)
                .unlockedBy("has_gold_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.GOLD_BARS))
                .group("bars")
                .save(output, "additionalbars:crossed_to_gold");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.UNAFFECTED_COPPER_BARS, 2)
                .requires(ModBlocks.UNAFFECTED_CROSSED_COPPER_BARS, 1)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.UNAFFECTED_COPPER_BARS))
                .group("bars")
                .save(output, "additionalbars:crossed_to_copper");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_COPPER_BARS, 2)
                .requires(ModBlocks.EXPOSED_CROSSED_COPPER_BARS, 1)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.EXPOSED_COPPER_BARS))
                .group("bars")
                .save(output, "additionalbars:crossed_to_exposed_copper");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_COPPER_BARS, 2)
                .requires(ModBlocks.WEATHERED_CROSSED_COPPER_BARS, 1)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.WEATHERED_COPPER_BARS))
                .group("bars")
                .save(output, "additionalbars:crossed_to_weathered_copper");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_COPPER_BARS, 2)
                .requires(ModBlocks.OXIDIZED_CROSSED_COPPER_BARS, 1)
                .unlockedBy("has_copper_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.OXIDIZED_COPPER_BARS))
                .group("bars")
                .save(output, "additionalbars:crossed_to_oxidized_copper");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_BARS, 2)
                .requires(ModBlocks.CROSSED_ACACIA_BARS, 1)
                .unlockedBy("has_acacia_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ACACIA_BARS))
                .group("bars")
                .save(output, "additionalbars:crossed_to_acacia");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_BARS, 2)
                .requires(ModBlocks.CROSSED_BIRCH_BARS, 1)
                .unlockedBy("has_birch_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.BIRCH_BARS))
                .group("bars")
                .save(output, "additionalbars:crossed_to_birch");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_BARS, 2)
                .requires(ModBlocks.CROSSED_JUNGLE_BARS, 1)
                .unlockedBy("has_jungle_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.JUNGLE_BARS))
                .group("bars")
                .save(output, "additionalbars:crossed_to_jungle");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.OAK_BARS, 2)
                .requires(ModBlocks.CROSSED_OAK_BARS, 1)
                .unlockedBy("has_oak_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.OAK_BARS))
                .group("bars")
                .save(output, "additionalbars:crossed_to_oak");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_BARS, 2)
                .requires(ModBlocks.CROSSED_DARK_OAK_BARS, 1)
                .unlockedBy("has_dark_oak_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.DARK_OAK_BARS))
                .group("bars")
                .save(output, "additionalbars:crossed_to_dark_oak");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_BARS, 2)
                .requires(ModBlocks.CROSSED_SPRUCE_BARS, 1)
                .unlockedBy("has_spruce_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.SPRUCE_BARS))
                .group("bars")
                .save(output, "additionalbars:crossed_to_spruce");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_BARS, 2)
                .requires(ModBlocks.CROSSED_MANGROVE_BARS, 1)
                .unlockedBy("has_mangrove_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.MANGROVE_BARS))
                .group("bars")
                .save(output, "additionalbars:crossed_to_mangrove");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_BARS, 2)
                .requires(ModBlocks.CROSSED_CRIMSON_BARS, 1)
                .unlockedBy("has_crimson_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.CRIMSON_BARS))
                .group("bars")
                .save(output, "additionalbars:crossed_to_crimson");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.WARPED_BARS, 2)
                .requires(ModBlocks.CROSSED_WARPED_BARS, 1)
                .unlockedBy("has_warped_bars", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.WARPED_BARS))
                .group("bars")
                .save(output, "additionalbars:crossed_to_warped");
    }
}
