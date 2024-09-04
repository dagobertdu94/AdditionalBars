package com.mdujovic17.additionalbars.content.block;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class OxidizingBarsBlock extends BarsBlock implements WeatheringCopper {

    private final WeatherState state;

    /** @Deprecated */
    private OxidizingBarsBlock(WeatherState state, Properties properties) {
        super(properties);
        this.state = state;
    }

    public OxidizingBarsBlock(WeatherState state, Properties properties, BlockType... types) {
        super(properties, types);
        this.state = state;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        this.changeOverTime(state, world, pos, random);
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return WeatheringCopper.getNext(state.getBlock()).isPresent();
    }

    @Override
    public WeatherState getAge() {
        return this.state;
    }
}
