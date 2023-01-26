package dev.krysztal.advagri.block.impls;

import dev.krysztal.advagri.entity.block.WaterWellBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class WaterWellBlock extends Block implements BlockEntityProvider {

  public WaterWellBlock(Settings settings) {
    super(settings);
  }

  @Nullable
  @Override
  public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
    return new WaterWellBlockEntity(pos, state);
  }
}
