package dev.krysztal.advagri.entrypoint.datagen;

import dev.krysztal.advagri.entrypoint.datagen.recipes.FurnaceGenerator;
import dev.krysztal.advagri.entrypoint.datagen.tags.MiscBlockTagGenerator;
import dev.krysztal.advagri.entrypoint.datagen.tags.MiscItemTagGenerator;
import dev.krysztal.advagri.foundation.AdvAgriRegistrates;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class AdvAgriDataGen implements DataGeneratorEntrypoint {

  @Override
  public void onInitializeDataGenerator(
    FabricDataGenerator fabricDataGenerator
  ) {
    fabricDataGenerator.addProvider(MiscBlockTagGenerator::new);
    fabricDataGenerator.addProvider(MiscItemTagGenerator::new);

    fabricDataGenerator.addProvider(FurnaceGenerator::new);

    ExistingFileHelper helper = ExistingFileHelper.standard();
    AdvAgriRegistrates.BLOCK_REGISTRATE.setupDatagen(
      fabricDataGenerator,
      helper
    );
    AdvAgriRegistrates.ITEM_REGISTRATE.setupDatagen(
      fabricDataGenerator,
      helper
    );
    AdvAgriRegistrates.FOOD_REGISTRATE.setupDatagen(
      fabricDataGenerator,
      helper
    );
  }
}
