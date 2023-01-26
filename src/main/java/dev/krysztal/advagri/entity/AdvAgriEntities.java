package dev.krysztal.advagri.entity;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.entity.block.WaterWellBlockEntity;
import net.minecraft.block.entity.BlockEntityType;

public class AdvAgriEntities {

  public static void init() {
    ItemEntities.init();
    BlockEntities.init();
  }

  public static class ItemEntities {

    static void init() {}
  }

  public static class BlockEntities {

    static void init() {}

    public static final BlockEntityType<WaterWellBlockEntity> WATER_WELL_BLOCK_ENTITY = BlockEntityType.create(
      "water_well_block",
      BlockEntityType.Builder.create(
        WaterWellBlockEntity::new,
        AdvAgriBlocks.WATER_WELL_BLOCK
      )
    );
  }
}
