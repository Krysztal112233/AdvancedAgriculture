package dev.krysztal.advagri.foundation.resource;

import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import dev.krysztal.advagri.foundation.AdvAgriConstants;
import dev.krysztal.advagri.foundation.resource.element.ItemElementsCombination;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.resource.Resource;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

@Slf4j
public class AdvAgriElementResourceManager
  implements SimpleSynchronousResourceReloadListener {

  @Getter
  private static ImmutableList<ItemElementsCombination> elementRegistry = ImmutableList.of();

  @Override
  public Identifier getFabricId() {
    return new Identifier(AdvAgriConstants.MODID, "elements");
  }

  @Override
  public void reload(ResourceManager manager) {
    elementRegistry = ImmutableList.of();
    var elementsArrayList = new ArrayList<ItemElementsCombination>();
    var entrySet = manager
      .findResources("elements", path -> path.getPath().endsWith(".json"))
      .entrySet();
    var gson = new Gson();

    entrySet.forEach(entry -> {
      Identifier id = entry.getKey();
      Resource resource = entry.getValue();
      try (var resourceReader = resource.getReader()) {
        var elements = gson.fromJson(
          resourceReader,
          ItemElementsCombination.class
        );
        elementsArrayList.removeIf($ ->
          Objects.equals($.getItem(), elements.getItem())
        ); // Delete duplicate elements
        elementsArrayList.add(elements);
      } catch (IOException e) {
        log.error(
          "Error occurred while loading resource json " + id.toString()
        );
        throw new RuntimeException(e);
      }
    });

    elementRegistry = ImmutableList.copyOf(elementsArrayList);
  }
}
