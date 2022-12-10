package dev.krysztal.advagri.entrypoint.datagen.tags;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.foundation.AdvAgriTags;
import java.util.List;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;

public class MiscBlockTagGenerator extends FabricTagProvider.BlockTagProvider {

  public MiscBlockTagGenerator(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  protected void generateTags() {
    genSilt();
    genFellable();
    genLogs();
    genSulphur();
    genHiddenBamboo();
  }

  private static final List<Block> SILT_LIST = List.of(Blocks.MUD);

  private static final List<Block> FELLABLE_LIST = List.of(
    Blocks.DEAD_BUSH,
    Blocks.KELP_PLANT,
    Blocks.KELP,
    Blocks.TALL_GRASS,
    Blocks.GRASS,
    Blocks.BAMBOO_SAPLING,
    Blocks.SUGAR_CANE,
    Blocks.LARGE_FERN,
    Blocks.FERN,
    Blocks.SEA_PICKLE,
    Blocks.SEAGRASS,
    Blocks.TALL_SEAGRASS
  );

  private static final List<TagKey<Block>> FELLABLE_TAG_LIST = List.of(
    BlockTags.LEAVES,
    BlockTags.FLOWERS
  );

  private static final List<Block> SULPHUR_ORE_LIST = List.of(
    AdvAgriBlocks.SULPHUR_ORE.get(),
    AdvAgriBlocks.NETHER_SULPHUR_ORE.get()
  );

  private static final List<Block> HIDDEN_BAMBOO_LIST = List.of(
    Blocks.FERN,
    Blocks.GLASS,
    Blocks.GRASS_BLOCK,
    Blocks.TALL_GRASS,
    Blocks.LARGE_FERN
  );
  private static final List<TagKey<Block>> HIDDEN_BAMBOO_TAG_LIST = List.of(
    BlockTags.FLOWERS
  );

  private void genSilt() {
    SILT_LIST.forEach(getOrCreateTagBuilder(AdvAgriTags.BlockTags.SILT)::add);
  }

  private void genFellable() {
    FELLABLE_LIST.forEach(
      getOrCreateTagBuilder(AdvAgriTags.BlockTags.SILT)::add
    );

    FELLABLE_TAG_LIST.forEach(
      getOrCreateTagBuilder(AdvAgriTags.BlockTags.SILT)::addOptionalTag
    );
  }

  private void genSulphur() {
    SULPHUR_ORE_LIST.forEach(
      getOrCreateTagBuilder(AdvAgriTags.BlockTags.SULPHUR_ORE)::add
    );
  }

  private void genLogs() {
    super
      .getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
      .addOptionalTag(AdvAgriTags.BlockTags.GINKGO_LOGS);
  }

  private void genHiddenBamboo() {
    HIDDEN_BAMBOO_LIST.forEach(
      getOrCreateTagBuilder(AdvAgriTags.BlockTags.SULPHUR_ORE)::add
    );
    HIDDEN_BAMBOO_TAG_LIST.forEach(
      getOrCreateTagBuilder(AdvAgriTags.BlockTags.SULPHUR_ORE)::addOptionalTag
    );
  }
}
