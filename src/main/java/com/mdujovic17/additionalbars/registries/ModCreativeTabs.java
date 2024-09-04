package com.mdujovic17.additionalbars.registries;

import com.mdujovic17.additionalbars.AdditionalBars;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AdditionalBars.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ADDITIONAL_BARS
            = CREATIVE_MODE_TABS.register("additional_bars", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.additionalbars.additionalbars"))
            .icon(() -> ModItems.GOLD_BARS.get().getDefaultInstance())
            .displayItems(((itemDisplayParameters, output) -> {
                output.accept(ModItems.GOLD_BARS.get());

                output.accept(ModItems.UNAFFECTED_COPPER_BARS.get());
                output.accept(ModItems.EXPOSED_COPPER_BARS.get());
                output.accept(ModItems.WEATHERED_COPPER_BARS.get());
                output.accept(ModItems.OXIDIZED_COPPER_BARS.get());

                output.accept(ModItems.WAXED_UNAFFECTED_COPPER_BARS.get());
                output.accept(ModItems.WAXED_EXPOSED_COPPER_BARS.get());
                output.accept(ModItems.WAXED_WEATHERED_COPPER_BARS.get());
                output.accept(ModItems.WAXED_OXIDIZED_COPPER_BARS.get());

                output.accept(ModItems.ACACIA_BARS.get());
                output.accept(ModItems.BIRCH_BARS.get());
                output.accept(ModItems.JUNGLE_BARS.get());
                output.accept(ModItems.OAK_BARS.get());
                output.accept(ModItems.DARK_OAK_BARS.get());
                output.accept(ModItems.SPRUCE_BARS.get());
                output.accept(ModItems.MANGROVE_BARS.get());
                output.accept(ModItems.CRIMSON_BARS.get());
                output.accept(ModItems.WARPED_BARS.get());

                output.accept(ModItems.CROSSED_GOLD_BARS.get());
                output.accept(ModItems.CROSSED_IRON_BARS.get());

                output.accept(ModItems.UNAFFECTED_CROSSED_COPPER_BARS.get());
                output.accept(ModItems.EXPOSED_CROSSED_COPPER_BARS.get());
                output.accept(ModItems.WEATHERED_CROSSED_COPPER_BARS.get());
                output.accept(ModItems.OXIDIZED_CROSSED_COPPER_BARS.get());

                output.accept(ModItems.WAXED_UNAFFECTED_CROSSED_COPPER_BARS.get());
                output.accept(ModItems.WAXED_EXPOSED_CROSSED_COPPER_BARS.get());
                output.accept(ModItems.WAXED_WEATHERED_CROSSED_COPPER_BARS.get());
                output.accept(ModItems.WAXED_OXIDIZED_CROSSED_COPPER_BARS.get());

                output.accept(ModItems.CROSSED_ACACIA_BARS.get());
                output.accept(ModItems.CROSSED_BIRCH_BARS.get());
                output.accept(ModItems.CROSSED_JUNGLE_BARS.get());
                output.accept(ModItems.CROSSED_OAK_BARS.get());
                output.accept(ModItems.CROSSED_DARK_OAK_BARS.get());
                output.accept(ModItems.CROSSED_SPRUCE_BARS.get());
                output.accept(ModItems.CROSSED_MANGROVE_BARS.get());
                output.accept(ModItems.CROSSED_CRIMSON_BARS.get());
                output.accept(ModItems.CROSSED_WARPED_BARS.get());

                output.accept(ModItems.HORIZONTAL_GOLD_BARS.get());
                output.accept(ModItems.HORIZONTAL_IRON_BARS.get());

                output.accept(ModItems.HORIZONTAL_UNAFFECTED_COPPER_BARS.get());
                output.accept(ModItems.HORIZONTAL_EXPOSED_COPPER_BARS.get());
                output.accept(ModItems.HORIZONTAL_WEATHERED_COPPER_BARS.get());
                output.accept(ModItems.HORIZONTAL_OXIDIZED_COPPER_BARS.get());

                output.accept(ModItems.WAXED_HORIZONTAL_UNAFFECTED_COPPER_BARS.get());
                output.accept(ModItems.WAXED_HORIZONTAL_EXPOSED_COPPER_BARS.get());
                output.accept(ModItems.WAXED_HORIZONTAL_WEATHERED_COPPER_BARS.get());
                output.accept(ModItems.WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS.get());

                output.accept(ModItems.HORIZONTAL_ACACIA_BARS.get());
                output.accept(ModItems.HORIZONTAL_BIRCH_BARS.get());
                output.accept(ModItems.HORIZONTAL_JUNGLE_BARS.get());
                output.accept(ModItems.HORIZONTAL_OAK_BARS.get());
                output.accept(ModItems.HORIZONTAL_DARK_OAK_BARS.get());
                output.accept(ModItems.HORIZONTAL_SPRUCE_BARS.get());
                output.accept(ModItems.HORIZONTAL_MANGROVE_BARS.get());
                output.accept(ModItems.HORIZONTAL_CRIMSON_BARS.get());
                output.accept(ModItems.HORIZONTAL_WARPED_BARS.get());

                output.accept(ModItems.HORIZONTAL_CROSSED_GOLD_BARS.get());
                output.accept(ModItems.HORIZONTAL_CROSSED_IRON_BARS.get());

                output.accept(ModItems.HORIZONTAL_CROSSED_UNAFFECTED_COPPER_BARS.get());
                output.accept(ModItems.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS.get());
                output.accept(ModItems.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS.get());
                output.accept(ModItems.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS.get());

                output.accept(ModItems.WAXED_HORIZONTAL_CROSSED_UNAFFECTED_COPPER_BARS.get());
                output.accept(ModItems.WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS.get());
                output.accept(ModItems.WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS.get());
                output.accept(ModItems.WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS.get());

                output.accept(ModItems.HORIZONTAL_CROSSED_ACACIA_BARS.get());
                output.accept(ModItems.HORIZONTAL_CROSSED_BIRCH_BARS.get());
                output.accept(ModItems.HORIZONTAL_CROSSED_JUNGLE_BARS.get());
                output.accept(ModItems.HORIZONTAL_CROSSED_OAK_BARS.get());
                output.accept(ModItems.HORIZONTAL_CROSSED_DARK_OAK_BARS.get());
                output.accept(ModItems.HORIZONTAL_CROSSED_SPRUCE_BARS.get());
                output.accept(ModItems.HORIZONTAL_CROSSED_MANGROVE_BARS.get());
                output.accept(ModItems.HORIZONTAL_CROSSED_CRIMSON_BARS.get());
                output.accept(ModItems.HORIZONTAL_CROSSED_WARPED_BARS.get());
            }))
            .build());
}
