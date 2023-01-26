package dev.krysztal.advagri.entity.block;

import dev.krysztal.advagri.entity.AdvAgriEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class WaterWellBlockEntity extends BlockEntity {

  public WaterWellBlockEntity(BlockPos pos, BlockState state) {
    super(AdvAgriEntities.BlockEntities.WATER_WELL_BLOCK_ENTITY, pos, state);
  }
}
