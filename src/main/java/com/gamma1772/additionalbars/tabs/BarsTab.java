package com.gamma1772.additionalbars.tabs;

import com.gamma1772.additionalbars.*;
import com.gamma1772.additionalbars.registries.ABBlocks;
import com.gamma1772.additionalbars.registries.ABItems;

import net.minecraft.core.registries.*;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.*;

public final class BarsTab {
	
	public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AdditionalBars.MODID);
	
	public static final RegistryObject<CreativeModeTab> ADDITIONAL_BARS = TABS.register("additional_bars", () -> CreativeModeTab.builder()
			.title(Component.translatable("itemGroup.additionalBars")).icon(() -> new ItemStack(ABBlocks.GOLD_BARS.get())).withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
			.displayItems((param, out) -> {
				ABItems.ITEMS.getEntries().stream().filter((ro) -> !(ro.getId().toString().toLowerCase().contains("horizontal_".toLowerCase())))
					.forEach((ro) -> ro.ifPresent(out::accept));
			}).build());
    public static final RegistryObject<CreativeModeTab> HORIZONTAL_ADDITIONAL_BARS = TABS.register("horizontal_additional_bars", () -> CreativeModeTab.builder()
			.title(Component.translatable("itemGroup.horizontaladditionalbars")).icon(() -> new ItemStack(ABBlocks.GOLD_BARS.get())).withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
			.displayItems((param, out) -> {
				ABItems.ITEMS.getEntries().stream().filter((ro) -> (ro.getId().toString().toLowerCase().contains("horizontal_".toLowerCase())))
					.forEach((ro) -> ro.ifPresent(out::accept));
			}).build());
	
}
