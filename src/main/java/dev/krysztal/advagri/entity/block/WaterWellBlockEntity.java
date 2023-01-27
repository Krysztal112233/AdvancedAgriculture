package dev.krysztal.advagri.entity.block;

import dev.krysztal.advagri.entity.AdvAgriEntities;
import lombok.Getter;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WaterWellBlockEntity extends BlockEntity {

  @Getter
  private int phoElement = 0;

  @Getter
  private int potElement = 0;

  @Getter
  private int calElement = 0;

  @Getter
  private boolean wet = false;

  public WaterWellBlockEntity(BlockPos pos, BlockState state) {
    super(AdvAgriEntities.BlockEntities.WATER_WELL_BLOCK_ENTITY, pos, state);
  }

  public void tick(
    World world,
    BlockPos pos,
    BlockState state,
    WaterWellBlockEntity entity
  ) {
    if (world.getBlockState(pos.up()).getBlock() != Blocks.WATER) return;

    this.wet = true;
    this.markDirty();
  }

  @Override
  public void readNbt(NbtCompound nbt) {
    nbt.putInt("pot_element", this.getPotElement());
    nbt.putInt("pho_element", this.getPhoElement());
    nbt.putInt("cal_element", this.getCalElement());

    nbt.putBoolean("wet", this.isWet());

    super.readNbt(nbt);
  }

  @Override
  protected void writeNbt(NbtCompound nbt) {
    potElement = nbt.getInt("pot_element");
    phoElement = nbt.getInt("pho_element");
    calElement = nbt.getInt("cal_element");

    wet = nbt.getBoolean("wet");

    super.writeNbt(nbt);
  }
}
