package dev.krysztal.advagri.entry;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.entity.AdvAgriEntities;
import dev.krysztal.advagri.event.AdvAgriEvents;
import dev.krysztal.advagri.foundation.AdvAgriGameRules;
import dev.krysztal.advagri.foundation.AdvAgriTags;
import dev.krysztal.advagri.foundation.resources.AdvAgriElementResourceManager;
import dev.krysztal.advagri.item.AdvAgriItems;
import dev.krysztal.advagri.loot.AdvAgriLoot;
import lombok.extern.slf4j.Slf4j;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.resource.ResourceType;

@Slf4j
public class General implements ModInitializer {

  @Override
  public void onInitialize() {
    initResourceManager();
    AdvAgriBlocks.init();
    AdvAgriItems.init();
    AdvAgriEntities.init();
    AdvAgriTags.init();
    AdvAgriGameRules.init();
    AdvAgriLoot.init();
    AdvAgriEvents.init();
  }

  private void initResourceManager() {
    ResourceManagerHelper
      .get(ResourceType.SERVER_DATA)
      .registerReloadListener(new AdvAgriElementResourceManager());
  }
}
