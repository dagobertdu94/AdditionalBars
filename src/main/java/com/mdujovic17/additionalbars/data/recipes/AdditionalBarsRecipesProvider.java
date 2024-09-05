package com.mdujovic17.additionalbars.data.recipes;

import com.mdujovic17.additionalbars.AdditionalBars;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.CompletableFuture;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class AdditionalBarsRecipesProvider extends RecipeProvider {
    public AdditionalBarsRecipesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
        AdditionalBars.LOGGER.info("Registered Recipe Provider.");
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        AdditionalBarsRecipes.registerRecipes(recipeOutput);
    }
}
