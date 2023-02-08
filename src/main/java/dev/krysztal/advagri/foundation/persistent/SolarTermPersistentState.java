package dev.krysztal.advagri.foundation.persistent;

import dev.krysztal.advagri.foundation.AdvAgriSolarTerm;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.PersistentState;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class SolarTermPersistentState extends PersistentState {

  private static final String NBT_KEY = "advagri_nbt_current_season";
  public static final String ID = "solar_term_persistent";

  @Getter
  @Setter
  private int season = 0;

  public void incSeason() {
    this.season = (this.season++) % AdvAgriSolarTerm.values().length;
  }

  public void decSeason() {
    this.season = (this.season--) % AdvAgriSolarTerm.values().length;
  }

  @Override
  public NbtCompound writeNbt(@NotNull NbtCompound nbt) {
    nbt.putInt(NBT_KEY, season);
    return nbt;
  }

  public static AdvAgriSolarTerm getSeason(@NotNull NbtCompound nbtCompound) {
    var currentSeason = nbtCompound.getInt(NBT_KEY);
    return currentSeason > 0 || currentSeason < AdvAgriSolarTerm.values().length
      ? AdvAgriSolarTerm.values()[currentSeason]
      : AdvAgriSolarTerm.SPRING;
  }

  public static SolarTermPersistentState load(NbtCompound nbtCompound) {
    return new SolarTermPersistentState();
  }

  public static SolarTermPersistentState get(@NotNull World world) {
    return Objects
      .requireNonNull(world.getServer())
      .getOverworld()
      .getPersistentStateManager()
      .getOrCreate(
        SolarTermPersistentState::load,
        SolarTermPersistentState::new,
        ID
      );
  }

  public static void set(@NotNull World world, SolarTermPersistentState state) {
    Objects
      .requireNonNull(world.getServer())
      .getOverworld()
      .getPersistentStateManager()
      .set(ID, state);
  }
}
