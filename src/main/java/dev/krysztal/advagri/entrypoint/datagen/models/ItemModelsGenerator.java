package dev.krysztal.advagri.entrypoint.datagen.models;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.item.AdvAgriItems;
import dev.krysztal.advagri.util.GeneratorUtils;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

public class ItemModelsGenerator extends FabricModelProvider {
    public ItemModelsGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        GeneratorUtils.<Block>collect(AdvAgriBlocks.class).forEach(blockStateModelGenerator::registerSimpleCubeAll);
        GeneratorUtils.<Block>collectDontGen(AdvAgriBlocks.class).forEach(blockStateModelGenerator::excludeFromSimpleItemModelGeneration);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        GeneratorUtils.<Item>collect(AdvAgriItems.class).forEach(item -> itemModelGenerator.register(item, Models.GENERATED));
    }
}
