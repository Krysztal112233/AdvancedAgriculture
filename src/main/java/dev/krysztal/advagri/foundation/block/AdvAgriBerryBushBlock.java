package dev.krysztal.advagri.foundation.block;

import lombok.Getter;
import lombok.Setter;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public abstract class AdvAgriBerryBushBlock
  extends AdvAgriCropBlock
  implements Fertilizable {

  @Getter
  @Setter
  private ItemStack dropStack;

  public AdvAgriBerryBushBlock(Settings settings, ItemStack dropStack) {
    super(settings, null);
    this.dropStack = dropStack;
  }

  @Override
  public boolean isFertilizable(
    BlockView world,
    BlockPos pos,
    BlockState state,
    boolean isClient
  ) {
    return true;
  }

  @Override
  public boolean canGrow(
    World world,
    Random random,
    BlockPos pos,
    BlockState state
  ) {
    return false;
  }

  @Override
  public void grow(
    ServerWorld world,
    Random random,
    BlockPos pos,
    BlockState state
  ) {
    this.dropStack.increment(1);
  }
}
