package dev.krysztal.advagri.block.impls;

import dev.krysztal.advagri.entity.AdvAgriEntities;
import dev.krysztal.advagri.entity.block.WaterWellBlockEntity;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;
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
    return checkType(
      type,
      AdvAgriEntities.BlockEntities.WATER_WELL_BLOCK_ENTITY,
      (world1, pos, state1, be) ->
        (
          (WaterWellBlockEntity) (
            Objects.requireNonNull(world.getBlockEntity(pos))
          )
        ).tick(world1, pos, state1, be)
    );
  }
}
