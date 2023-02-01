package dev.krysztal.advagri.entry.datagen.tags.item;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.foundation.AdvAgriTags;
import java.util.List;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.TagKey;

public class MiscTagsGenerator extends FabricTagProvider.ItemTagProvider {

  private static final List<Item> PLANT_LIST = List.of(
    Items.FERN,
    Items.DEAD_BUSH,
    Items.KELP,
    Items.SEA_PICKLE,
    Items.SEAGRASS
  );

  private static final List<TagKey<Item>> PLANT_TAG_LIST = List.of(
    ItemTags.LEAVES,
    ItemTags.FLOWERS
  );

  private static final List<Item> GINKGO_LOGS_ITEM = List.of(
    AdvAgriBlocks.GINKGO_LOG.asItem(),
    AdvAgriBlocks.GINKGO_WOOD.asItem(),
    AdvAgriBlocks.STRIPPED_GINKGO_WOOD.asItem(),
    AdvAgriBlocks.STRIPPED_GINKGO_LOG.asItem()
  );

  public MiscTagsGenerator(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  protected void generateTags() {
    PLANT_TAG_LIST.forEach(
      super.getOrCreateTagBuilder(AdvAgriTags.ItemTags.PLANT)::addOptionalTag
    );

    PLANT_LIST.forEach(
      super.getOrCreateTagBuilder(AdvAgriTags.ItemTags.PLANT)::add
    );

    GINKGO_LOGS_ITEM.forEach(
      super.getOrCreateTagBuilder(AdvAgriTags.ItemTags.GINKGO_LOGS)::add
    );
  }
}
