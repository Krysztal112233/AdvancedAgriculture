package dev.krysztal.advagri.entrypoint;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class Client implements ClientModInitializer {

  public void onInitializeClient() {
    BlockRenderLayerMap.INSTANCE.putBlocks(
      RenderLayer.getTranslucent(),
      AdvAgriBlocks.GINKGO_LEAVES
    );

    BlockRenderLayerMap.INSTANCE.putBlocks(
      RenderLayer.getCutout(),
      AdvAgriBlocks.SOLAR_BERRY_BUSH_BLOCK,
      AdvAgriBlocks.LETTUCE_BLOCK,
      AdvAgriBlocks.CORN_BLOCK,
      AdvAgriBlocks.GARLIC_BLOCK,
      AdvAgriBlocks.SWEET_POTATO_BLOCK,
      AdvAgriBlocks.WATER_CHESTNUT_BLOCK,
      AdvAgriBlocks.STRAW_BERRY_BLOCK
    );
  }
}
