package dev.krysztal.advagri.entry.datagen.loottables;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.foundation.AdvAgriConstants;
import dev.krysztal.advagri.foundation.annotation.GenType;
import dev.krysztal.advagri.foundation.util.GeneratorUtils;
import java.util.function.BiConsumer;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class MiscLootTablesGenerator extends SimpleFabricLootTableProvider {

  public MiscLootTablesGenerator(FabricDataGenerator dataGenerator) {
    super(dataGenerator, LootContextTypes.BLOCK);
  }

  @Override
  public void accept(
    BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer
  ) {
    new GeneratorUtils.Collector(GenType.SimpleBlockLoot)
      .<Block>collect(AdvAgriBlocks.class)
      .forEach(block -> {
        identifierBuilderBiConsumer.accept(
          new Identifier(
            AdvAgriConstants.MODID,
            block.getLootTableId().getPath()
          ),
          BlockLootTableGenerator.drops(
            block,
            block.asItem(),
            ConstantLootNumberProvider.create(1.0F)
          )
        );
      });
  }
}
