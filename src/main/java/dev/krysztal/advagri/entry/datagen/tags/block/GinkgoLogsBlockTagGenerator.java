package dev.krysztal.advagri.entry.datagen.tags.block;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.foundation.AdvAgriTags;
import java.util.List;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;

public class GinkgoLogsBlockTagGenerator
  extends FabricTagProvider.BlockTagProvider {

  private static final List<Block> GINKGO_LOGS_BLOCK = List.of(
    AdvAgriBlocks.GINKGO_LOG,
    AdvAgriBlocks.GINKGO_WOOD,
    AdvAgriBlocks.STRIPPED_GINKGO_WOOD,
    AdvAgriBlocks.STRIPPED_GINKGO_LOG
  );

  public GinkgoLogsBlockTagGenerator(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  protected void generateTags() {
    GINKGO_LOGS_BLOCK.forEach(
      super.getOrCreateTagBuilder(AdvAgriTags.BlockTags.GINKGO_LOGS)::add
    );
  }
}
