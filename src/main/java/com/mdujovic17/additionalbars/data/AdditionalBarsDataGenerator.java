package com.mdujovic17.additionalbars.data;

import com.mdujovic17.additionalbars.AdditionalBars;
import com.mdujovic17.additionalbars.data.loot.AdditionalBarsBlockLoot;
import com.mdujovic17.additionalbars.data.loot.AdditionalBarsLootTableProvider;
import com.mdujovic17.additionalbars.data.recipes.AdditionalBarsRecipesProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.mdujovic17.additionalbars.AdditionalBars.MODID;

@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD)
public class AdditionalBarsDataGenerator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();

        AdditionalBars.LOGGER.info("Registering Data Providers...");
        generator.addProvider(event.includeServer(), new AdditionalBarsRecipesProvider(output, lookupProvider));
        generator.addProvider(event.includeServer(), new AdditionalBarsLootTableProvider(output, lookupProvider));
    }
}
