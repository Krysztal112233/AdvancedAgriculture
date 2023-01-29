package dev.krysztal.advagri.block.impls;

import dev.krysztal.advagri.entity.block.WaterWellBlockEntity;
import java.util.Random;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class WaterWellBlock extends BlockWithEntity {

  private int tickCount = 0;
  private final int maxTickCount = 8 + (new Random().nextInt(-4, 4));

  public WaterWellBlock(Settings settings) {
    super(settings);
  }

  @Override
  public BlockRenderType getRenderType(BlockState state) {
    return BlockRenderType.MODEL;
  }

  @Nullable
  @Override
  public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
    return new WaterWellBlockEntity(pos, state);
  }

  @Nullable
  @Override
  public <T extends BlockEntity> BlockEntityTicker<T> getTicker(
    World world,
    BlockState state,
    BlockEntityType<T> type
  ) {
    tickCount++;

    if (tickCount >= maxTickCount) {
      tickCount = 0;
      return (world1, pos, state1, be) ->
        ((WaterWellBlockEntity) be).tick(
            world1,
            pos,
            state1,
            (WaterWellBlockEntity) be
          );
    } else return super.getTicker(world, state, type);
  }
}
