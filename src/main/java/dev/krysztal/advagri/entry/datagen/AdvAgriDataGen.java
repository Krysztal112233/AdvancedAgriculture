package dev.krysztal.advagri.entry.datagen;

import dev.krysztal.advagri.entry.datagen.elements.ItemElementsGenerator;
import dev.krysztal.advagri.entry.datagen.loottables.MiscLootTablesGenerator;
import dev.krysztal.advagri.entry.datagen.models.CropModelsGenerator;
import dev.krysztal.advagri.entry.datagen.models.MiscModelsGenerator;
import dev.krysztal.advagri.entry.datagen.recipes.CropToSeedRecipesGenerator;
import dev.krysztal.advagri.entry.datagen.recipes.FoodFurnaceRecipesGenerator;
import dev.krysztal.advagri.entry.datagen.recipes.LogRecipesGenerator;
import dev.krysztal.advagri.entry.datagen.tags.block.GinkgoLogsBlockTagGenerator;
import dev.krysztal.advagri.entry.datagen.tags.block.MineLevelTagsGenerator;
import dev.krysztal.advagri.entry.datagen.tags.block.MineableTagsGenerator;
import dev.krysztal.advagri.entry.datagen.tags.item.GinkgoLogsItemTagsGenerator;
import dev.krysztal.advagri.entry.datagen.tags.item.MiscTagsGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AdvAgriDataGen implements DataGeneratorEntrypoint {

  @Override
  public void onInitializeDataGenerator(
    FabricDataGenerator fabricDataGenerator
  ) {
    //===========================================================//
    fabricDataGenerator.addProvider(MiscModelsGenerator::new);
    fabricDataGenerator.addProvider(CropModelsGenerator::new);

    //===========================================================//
    fabricDataGenerator.addProvider(MiscLootTablesGenerator::new);

    //===========================================================//
    fabricDataGenerator.addProvider(MineLevelTagsGenerator::new);
    fabricDataGenerator.addProvider(MineableTagsGenerator::new);
    fabricDataGenerator.addProvider(MiscTagsGenerator::new);

    fabricDataGenerator.addProvider(GinkgoLogsBlockTagGenerator::new);
    fabricDataGenerator.addProvider(GinkgoLogsItemTagsGenerator::new);
    //===========================================================//

    fabricDataGenerator.addProvider(FoodFurnaceRecipesGenerator::new);
    fabricDataGenerator.addProvider(LogRecipesGenerator::new);
    fabricDataGenerator.addProvider(CropToSeedRecipesGenerator::new);

    //===========================================================//
    fabricDataGenerator.addProvider(ItemElementsGenerator::new);
  }
}
