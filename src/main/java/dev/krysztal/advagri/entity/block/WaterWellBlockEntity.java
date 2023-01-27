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
  private int phosphorusElement = 0;

  @Getter
  private int potassiumElement = 0;

  @Getter
  private int calciumElement = 0;

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
    this.wet = world.getBlockState(pos.up()).getBlock() == Blocks.WATER;
    this.markDirty();
  }

  @Override
  public void readNbt(NbtCompound nbt) {
    nbt.putInt("PotassiumElement", this.getPotassiumElement());
    nbt.putInt("PhosphorusElement", this.getPhosphorusElement());
    nbt.putInt("CalciumElement", this.getCalciumElement());

    nbt.putBoolean("Wet", this.isWet());

    super.readNbt(nbt);
  }

  @Override
  protected void writeNbt(NbtCompound nbt) {
    potassiumElement = nbt.getInt("PotassiumElement");
    phosphorusElement = nbt.getInt("PhosphorusElement");
    calciumElement = nbt.getInt("CalciumElement");

    wet = nbt.getBoolean("Wet");

    super.writeNbt(nbt);
  }
}
