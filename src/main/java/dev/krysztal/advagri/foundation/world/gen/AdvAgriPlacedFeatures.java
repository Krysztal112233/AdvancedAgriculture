package dev.krysztal.advagri.foundation.world.gen;

import static dev.krysztal.advagri.foundation.world.gen.AdvAgriConfiguredFeature.Nether.NETHER_SULPHUR_ORE_CONFIGURED_FEATURE;
import static dev.krysztal.advagri.foundation.world.gen.AdvAgriConfiguredFeature.OverWorld.*;

import java.util.Arrays;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import org.jetbrains.annotations.NotNull;

public class AdvAgriPlacedFeatures {

  public static class OverWorld {

    public static final PlacedFeature VERMICULITE_ORE_PLACED_FEATURE = getPlacedFeature(
      VERMICULITE_ORE_CONFIGURED_FEATURE,
      16,
      YOffset.getBottom(),
      YOffset.getTop()
    );

    public static final PlacedFeature SULPHUR_ORE_PLACED_FEATURE = getPlacedFeature(
      SULPHUR_ORE_CONFIGURED_FEATURE,
      8,
      YOffset.getBottom(),
      YOffset.fixed(64)
    );
    public static final PlacedFeature PHOS_ORE_PLACED_FEATURE = getPlacedFeature(
      PHOS_ORE_CONFIGURED_FEATURE,
      2,
      YOffset.getBottom(),
      YOffset.getTop()
    );
  }

  public static class Nether {

    public static final PlacedFeature NETHER_SULPHUR_ORE_PLACED_FEATURE = getPlacedFeature(
      NETHER_SULPHUR_ORE_CONFIGURED_FEATURE,
      16,
      YOffset.getBottom(),
      YOffset.getTop()
    );
  }

  @NotNull
  private static PlacedFeature getPlacedFeature(
    ConfiguredFeature<?, ?> configuredFeature,
    int countPerChunk,
    YOffset bottom,
    YOffset top
  ) {
    return new PlacedFeature(
      RegistryEntry.of(configuredFeature),
      Arrays.asList(
        CountPlacementModifier.of(countPerChunk), // number of veins per chunk
        SquarePlacementModifier.of(), // spreading horizontally
        HeightRangePlacementModifier.uniform(bottom, top)
      )
    );
  }
}
