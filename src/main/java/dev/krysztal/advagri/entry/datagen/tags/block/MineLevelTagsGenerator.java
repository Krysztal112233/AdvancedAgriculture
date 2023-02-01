package dev.krysztal.advagri.entry.datagen.tags.block;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.foundation.annotation.GenType;
import dev.krysztal.advagri.foundation.util.GeneratorUtils;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.mininglevel.v1.MiningLevelManager;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MineLevelTagsGenerator extends FabricTagProvider.BlockTagProvider {

  private static final TagKey<Block> MINE_LEVEL_0 = TagKey.of(
    Registry.BLOCK_KEY,
    new Identifier("fabric:needs_tool_level_0")
  );

  public MineLevelTagsGenerator(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  protected void generateTags() {
    new GeneratorUtils.Collector(GenType.MineLevel0)
      .<Block>collect(AdvAgriBlocks.class)
      .forEach(super.getOrCreateTagBuilder(MINE_LEVEL_0)::add);

    new GeneratorUtils.Collector(GenType.MineLevel1)
      .<Block>collect(AdvAgriBlocks.class)
      .forEach(
        super.getOrCreateTagBuilder(MiningLevelManager.getBlockTag(1))::add
      );

    new GeneratorUtils.Collector(GenType.MineLevel2)
      .<Block>collect(AdvAgriBlocks.class)
      .forEach(
        super.getOrCreateTagBuilder(MiningLevelManager.getBlockTag(2))::add
      );

    new GeneratorUtils.Collector(GenType.MineLevel3)
      .<Block>collect(AdvAgriBlocks.class)
      .forEach(
        super.getOrCreateTagBuilder(MiningLevelManager.getBlockTag(3))::add
      );

    new GeneratorUtils.Collector(GenType.MineLevel4)
      .<Block>collect(AdvAgriBlocks.class)
      .forEach(
        super.getOrCreateTagBuilder(MiningLevelManager.getBlockTag(4))::add
      );
  }
}
