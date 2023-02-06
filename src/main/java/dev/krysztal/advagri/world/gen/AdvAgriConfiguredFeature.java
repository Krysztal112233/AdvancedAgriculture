package dev.krysztal.advagri.world.gen;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import net.minecraft.block.Block;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.world.gen.feature.*;
import org.jetbrains.annotations.NotNull;

public class AdvAgriConfiguredFeature {

  public static class OverWorld {

    public static final ConfiguredFeature<?, ?> VERMICULITE_ORE_CONFIGURED_FEATURE = getConfiguredFeature(
      OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
      AdvAgriBlocks.VERMICULITE_ORE,
      16
    ); // vein size

    public static final ConfiguredFeature<?, ?> SULPHUR_ORE_CONFIGURED_FEATURE = getConfiguredFeature(
      OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
      AdvAgriBlocks.SULPHUR_ORE,
      8
    ); // vein size

    public static final ConfiguredFeature<?, ?> PHOSPHATE_ORE_CONFIGURED_FEATURE = getConfiguredFeature(
      OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
      AdvAgriBlocks.PHOSPHATE_ORE,
      16
    ); // vein size
  }

  public static class Nether {

    public static final ConfiguredFeature<?, ?> NETHER_SULPHUR_ORE_CONFIGURED_FEATURE = getConfiguredFeature(
      OreConfiguredFeatures.NETHERRACK,
      AdvAgriBlocks.NETHER_SULPHUR_ORE,
      8
    ); // vein size
  }

  @NotNull
  private static ConfiguredFeature<OreFeatureConfig, Feature<OreFeatureConfig>> getConfiguredFeature(
    RuleTest ruleTest,
    Block block,
    int veinSize
  ) {
    return new ConfiguredFeature<>(
      Feature.ORE,
      new OreFeatureConfig(ruleTest, block.getDefaultState(), veinSize)
    );
  }
}
