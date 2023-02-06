package dev.krysztal.advagri.entity.block;

import dev.krysztal.advagri.entity.AdvAgriEntities;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class WaterWellBlockEntity extends BlockEntity {

  @Getter
  @Setter
  private int phosphorusElement = 0;

  @Getter
  @Setter
  private int potassiumElement = 0;

  @Getter
  @Setter
  private int nitrogenElement = 0;

  @Getter
  @Setter
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
    this.setWet(world.getBlockState(pos.up()).getBlock() == Blocks.WATER);

    var itemEntities = world.getEntitiesByClass(
      ItemEntity.class,
      Box.from(new Vec3d(pos.getX(), pos.getY(), pos.up(1).getZ())),
      EntityPredicates.VALID_ENTITY
    );

    for (var itemEntity : itemEntities) {}

    this.markDirty();
  }

  @Override
  public void readNbt(NbtCompound nbt) {
    nbt.putInt("PotassiumElement", this.getPotassiumElement());
    nbt.putInt("PhosphorusElement", this.getPhosphorusElement());
    nbt.putInt("NitrogenElement", this.getNitrogenElement());

    nbt.putBoolean("Wet", this.isWet());

    super.readNbt(nbt);
  }

  @Override
  protected void writeNbt(NbtCompound nbt) {
    this.setPotassiumElement(nbt.getInt("PotassiumElement"));
    this.setPhosphorusElement(nbt.getInt("PhosphorusElement"));
    this.setNitrogenElement(nbt.getInt("NitrogenElement"));

    this.setWet(nbt.getBoolean("Wet"));

    super.writeNbt(nbt);
  }
}
