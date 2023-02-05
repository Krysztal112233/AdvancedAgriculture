package dev.krysztal.advagri.foundation.block;

import dev.krysztal.advagri.foundation.AdvAgriGameRules;
import dev.krysztal.advagri.foundation.AdvAgriSolarTerm;
import dev.krysztal.advagri.foundation.persistents.SolarTermPersistentState;
import javax.annotation.Nullable;
import lombok.Getter;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public abstract class AdvAgriCropBlock extends CropBlock {

  @Getter
  @Nullable
  private AdvAgriSolarTerm rightSolarTerm;

  @Getter
  @NotNull
  private VoxelShape[] voxelShapes;

  @Getter
  @NotNull
  private IntProperty age;

  public AdvAgriCropBlock(
    Settings settings,
    @Nullable AdvAgriSolarTerm rightSolarTerm,
    @NotNull VoxelShape[] voxelShapes,
    @NotNull IntProperty age
  ) {
    super(settings);
    this.rightSolarTerm = rightSolarTerm;
    this.voxelShapes = voxelShapes;
    this.age = age;
  }

  public AdvAgriCropBlock(
    Settings settings,
    @Nullable AdvAgriSolarTerm rightSolarTerm
  ) {
    super(settings);
    this.rightSolarTerm = rightSolarTerm;
  }

  public static VoxelShape getShapeOfAge(
    BlockState state,
    IntProperty age,
    VoxelShape[] voxelShapes
  ) {
    return voxelShapes[state.get(age)];
  }

  @Override
  public boolean canGrow(
    World world,
    Random random,
    BlockPos pos,
    BlockState state
  ) {
    if (this.rightSolarTerm == null) return true;

    // Check it allow season change.
    // If not, the crops will grow normally.
    if (
      !world.getGameRules().get(AdvAgriGameRules.ALLOW_SEASONS_CHANGE).get()
    ) return true;

    // The length between right term and current term.
    var stepLength = Math.abs(
      this.rightSolarTerm.ordinal() -
      SolarTermPersistentState.get(world).getSeason()
    );

    // Calc the growth chance.
    var growChance = (int) (
      ((double) stepLength / (double) AdvAgriSolarTerm.values().length) * 100
    );

    return random.nextBetweenExclusive(0, 100) <= growChance;
  }

  @Override
  public int getMaxAge() {
    return this.age.field_37656;
  }

  @Override
  public VoxelShape getOutlineShape(
    BlockState state,
    BlockView world,
    BlockPos pos,
    ShapeContext context
  ) {
    return getShapeOfAge(state, age, voxelShapes);
  }
}
