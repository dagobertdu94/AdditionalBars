package com.mdujovic17.additionalbars.content.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

public class HorizontalOxidizingBarsBlock extends HorizontalPaneBlock implements WeatheringCopper {

    private final WeatherState state;
    public HorizontalOxidizingBarsBlock(WeatherState state, Properties properties) {
        super(properties);
        this.state = state;
    }

    public HorizontalOxidizingBarsBlock(WeatherState state, Properties properties, BlockType... types) {
        super(properties, types);
        this.state = state;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        this.changeOverTime(state, world, pos, random);
    }

    @Override
    public WeatherState getAge() {
        return this.state;
    }
}
