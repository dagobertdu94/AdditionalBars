package com.mdujovic17.additionalbars.content.block;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.IronBarsBlock;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.*;

@ParametersAreNonnullByDefault
public class BarsBlock extends IronBarsBlock {
    protected Set<BlockType> barsTypes = new HashSet<>();

    public BarsBlock(Properties properties) {
        super(properties);
    }

    public BarsBlock(Properties properties, BlockType... types) {
        super(properties);
        barsTypes.addAll(Arrays.stream(types).toList());
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        for ( BlockType type : barsTypes) {
            tooltipComponents.add(Component.translatable(type.getText().getString()).withStyle(type.getTextColor()));
        }
    }

    public void setBlockTypes(BlockType... types) {
        barsTypes.addAll(List.of(types));
    }
}
