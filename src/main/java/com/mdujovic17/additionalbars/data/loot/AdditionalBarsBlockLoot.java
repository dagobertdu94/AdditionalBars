package com.mdujovic17.additionalbars.data.loot;

import com.mdujovic17.additionalbars.AdditionalBars;
import com.mdujovic17.additionalbars.registries.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.HashSet;
import java.util.Set;

public class AdditionalBarsBlockLoot extends BlockLootSubProvider {

    public AdditionalBarsBlockLoot(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, lookupProvider);
    }

    @Override
    protected void generate() {
        AdditionalBars.LOGGER.info("Generating Block Loot Tables...");
        for (DeferredHolder<Block, ? extends Block> b : ModBlocks.BLOCKS.getEntries().stream().toList()) {
            AdditionalBars.LOGGER.debug("Generating Loot Table for {}", b.getId());
            dropSelf(b.get());
        }
        AdditionalBars.LOGGER.info("Block Loot Table Generation Complete.");
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(e -> (Block) e.get()).toList();
    }
}
