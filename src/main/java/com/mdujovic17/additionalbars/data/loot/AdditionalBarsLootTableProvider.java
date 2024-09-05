package com.mdujovic17.additionalbars.data.loot;

import com.mdujovic17.additionalbars.AdditionalBars;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class AdditionalBarsLootTableProvider extends LootTableProvider {

    public AdditionalBarsLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, Set.of(), List.of(new SubProviderEntry(AdditionalBarsBlockLoot::new, LootContextParamSets.BLOCK)), lookupProvider);
        AdditionalBars.LOGGER.info("Registered Loot Table Provider.");
    }
}
