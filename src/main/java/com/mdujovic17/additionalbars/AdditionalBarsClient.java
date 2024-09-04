package com.mdujovic17.additionalbars;

import com.mdujovic17.additionalbars.registries.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import static com.mdujovic17.additionalbars.AdditionalBars.MODID;

@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AdditionalBarsClient
{

    public AdditionalBarsClient(IEventBus modEventBus, ModContainer modContainer)
    {
    }

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        AdditionalBars.LOGGER.info("Additional Bars Client Setup");
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GOLD_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_BARS.get(), RenderType.cutout());
//
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSED_IRON_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSED_GOLD_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSED_ACACIA_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSED_BIRCH_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSED_JUNGLE_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSED_OAK_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSED_DARK_OAK_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSED_SPRUCE_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSED_CRIMSON_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSED_WARPED_BARS.get(), RenderType.cutout());
//
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_IRON_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_GOLD_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_ACACIA_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_BIRCH_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_DARK_OAK_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_JUNGLE_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_OAK_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_SPRUCE_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_CRIMSON_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_WARPED_BARS.get(), RenderType.cutout());
//
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_CROSSED_IRON_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_CROSSED_GOLD_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_CROSSED_ACACIA_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_CROSSED_BIRCH_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_CROSSED_JUNGLE_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_CROSSED_OAK_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_CROSSED_DARK_OAK_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_CROSSED_SPRUCE_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_CROSSED_CRIMSON_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_CROSSED_WARPED_BARS.get(), RenderType.cutout());
    }
}
