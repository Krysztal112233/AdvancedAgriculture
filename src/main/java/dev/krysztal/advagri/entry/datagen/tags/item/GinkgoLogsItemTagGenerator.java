package dev.krysztal.advagri.entry.datagen.tags.item;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.foundation.AdvAgriTags;
import java.util.List;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;

public class GinkgoLogsItemTagGenerator
  extends FabricTagProvider.ItemTagProvider {

  private static final List<Item> GINKGO_LOGS_ITEM = List.of(
    AdvAgriBlocks.GINKGO_LOG.asItem(),
    AdvAgriBlocks.GINKGO_WOOD.asItem(),
    AdvAgriBlocks.STRIPPED_GINKGO_WOOD.asItem(),
    AdvAgriBlocks.STRIPPED_GINKGO_LOG.asItem()
  );

  public GinkgoLogsItemTagGenerator(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  protected void generateTags() {
    GINKGO_LOGS_ITEM.forEach(
      super.getOrCreateTagBuilder(AdvAgriTags.ItemTags.GINKGO_LOGS)::add
    );
  }
}
