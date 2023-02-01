package dev.krysztal.advagri.entry.datagen;

import dev.krysztal.advagri.entry.datagen.loottables.LootTablesGenerator;
import dev.krysztal.advagri.entry.datagen.models.CropModelsGenerator;
import dev.krysztal.advagri.entry.datagen.models.ModelsGenerator;
import dev.krysztal.advagri.entry.datagen.recipes.CropToSeedRecipeGenerator;
import dev.krysztal.advagri.entry.datagen.recipes.FurnaceGenerator;
import dev.krysztal.advagri.entry.datagen.recipes.LogRecipesGenerator;
import dev.krysztal.advagri.entry.datagen.tags.block.GinkgoLogsBlockTagGenerator;
import dev.krysztal.advagri.entry.datagen.tags.block.MineLevelGenerator;
import dev.krysztal.advagri.entry.datagen.tags.block.MineableGenerator;
import dev.krysztal.advagri.entry.datagen.tags.item.GinkgoLogsItemTagGenerator;
import dev.krysztal.advagri.entry.datagen.tags.item.MiscTagGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AdvAgriDataGen implements DataGeneratorEntrypoint {

  @Override
  public void onInitializeDataGenerator(
    FabricDataGenerator fabricDataGenerator
  ) {
    //===========================================================//
    fabricDataGenerator.addProvider(ModelsGenerator::new);
    fabricDataGenerator.addProvider(CropModelsGenerator::new);

    //===========================================================//
    fabricDataGenerator.addProvider(LootTablesGenerator::new);

    //===========================================================//
    fabricDataGenerator.addProvider(MineLevelGenerator::new);
    fabricDataGenerator.addProvider(MineableGenerator::new);
    fabricDataGenerator.addProvider(MiscTagGenerator::new);

    fabricDataGenerator.addProvider(GinkgoLogsBlockTagGenerator::new);
    fabricDataGenerator.addProvider(GinkgoLogsItemTagGenerator::new);
    //===========================================================//

    fabricDataGenerator.addProvider(FurnaceGenerator::new);
    fabricDataGenerator.addProvider(LogRecipesGenerator::new);
    fabricDataGenerator.addProvider(CropToSeedRecipeGenerator::new);
  }
}
