package dev.krysztal.advagri.block.impls.crops;

import dev.krysztal.advagri.foundation.AdvAgriSolarTerm;
import dev.krysztal.advagri.foundation.block.AdvAgriCropBlock;
import dev.krysztal.advagri.item.AdvAgriItems;
import lombok.Getter;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;

public class SweetPotatoBlock extends AdvAgriCropBlock {

  private static final IntProperty AGE = IntProperty.of("age", 0, 6);

  @Getter
  private static final VoxelShape[] voxelShapes = new VoxelShape[] {
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D), // Age 0, 播种
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), // Age 1, 出苗
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), // Age 2, 一格
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D), // Age 3, 一格半
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D), // Age 4, 开花
    Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D), // Age 5, 枯死
  };

  @Override
  public int getMaxAge() {
    return AGE.field_37656;
  }

  @Override
  public IntProperty getAgeProperty() {
    return AGE;
  }

  @Override
  protected ItemConvertible getSeedsItem() {
    return AdvAgriItems.SEED_BAG_SWEET_POTATO_BEAN;
  }

  public SweetPotatoBlock(Settings settings) {
    super(settings, AdvAgriSolarTerm.SPRING);
  }

  @Override
  public void appendProperties(
    StateManager.Builder<Block, BlockState> builder
  ) {
    builder.add(AGE);
  }

  @Override
  public boolean canGrow(
    World world,
    Random random,
    BlockPos pos,
    BlockState state
  ) {
    return state.get(SweetPotatoBlock.AGE) < 4;
  }
}
