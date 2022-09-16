package dev.krysztal.advagri.entrypoint.datagen;

import dev.krysztal.advagri.entrypoint.datagen.models.ItemModelsGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGen implements DataGeneratorEntrypoint {


    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(ItemModelsGenerator::new);
    }
}
