package dev.krysztal.advagri.entry.datagen.models;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.foundation.annotation.GenType;
import dev.krysztal.advagri.foundation.block.AdvAgriCropBlock;
import dev.krysztal.advagri.foundation.util.GeneratorUtils;
import java.util.List;
import java.util.stream.IntStream;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class CropModelsGenerator extends FabricModelProvider {

  private static final List<AdvAgriCropBlock> CROP_LIST = new GeneratorUtils.Collector(
    GenType.CropBlockState
  )
    .<AdvAgriCropBlock>collect(AdvAgriBlocks.class);

  public CropModelsGenerator(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  public void generateBlockStateModels(
    BlockStateModelGenerator blockStateModelGenerator
  ) {
    CROP_LIST.forEach(crop ->
      blockStateModelGenerator.registerCrop(
        crop,
        crop.getAgeProperty(),
        IntStream.rangeClosed(0, crop.getMaxAge()).toArray()
      )
    );
  }

  @Override
  public void generateItemModels(ItemModelGenerator itemModelGenerator) {}
}
