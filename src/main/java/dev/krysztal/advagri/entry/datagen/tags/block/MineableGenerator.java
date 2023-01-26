package dev.krysztal.advagri.entry.datagen.tags.block;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.foundation.annotation.GenType;
import dev.krysztal.advagri.foundation.util.GeneratorUtils;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.mininglevel.v1.FabricMineableTags;
import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;

public class MineableGenerator extends FabricTagProvider.BlockTagProvider {

  public MineableGenerator(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  protected void generateTags() {
    new GeneratorUtils.Collector(GenType.MineAxe)
      .<Block>collect(AdvAgriBlocks.class)
      .forEach(super.getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)::add);

    new GeneratorUtils.Collector(GenType.MineShovel)
      .<Block>collect(AdvAgriBlocks.class)
      .forEach(super.getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)::add);

    new GeneratorUtils.Collector(GenType.MinePickaxe)
      .<Block>collect(AdvAgriBlocks.class)
      .forEach(super.getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)::add);

    new GeneratorUtils.Collector(GenType.MineSword)
      .<Block>collect(AdvAgriBlocks.class)
      .forEach(
        super.getOrCreateTagBuilder(FabricMineableTags.SWORD_MINEABLE)::add
      );

    new GeneratorUtils.Collector(GenType.MineHoe)
      .<Block>collect(AdvAgriBlocks.class)
      .forEach(super.getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)::add);
  }
}
