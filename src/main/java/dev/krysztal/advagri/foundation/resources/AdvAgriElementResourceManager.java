package dev.krysztal.advagri.foundation.resources;

import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import dev.krysztal.advagri.foundation.AdvAgriConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import lombok.Builder;
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
  private static ImmutableList<Element> elementRegistry = ImmutableList.of();

  @Override
  public Identifier getFabricId() {
    return new Identifier(AdvAgriConstants.MODID, "elements");
  }

  @Override
  public void reload(ResourceManager manager) {
    elementRegistry = ImmutableList.of();
    var elementsArrayList = new ArrayList<Element>();
    var entrySet = manager
      .findResources("elements", path -> path.getPath().endsWith(".json"))
      .entrySet();
    var gson = new Gson();

    entrySet.forEach(entry -> {
      Identifier id = entry.getKey();
      Resource resource = entry.getValue();
      try (var resourceReader = resource.getReader()) {
        var elements = gson.fromJson(resourceReader, Element.class);
        elementsArrayList.removeIf($ -> Objects.equals($.item, elements.item));
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

  @Builder
  public static class Element {

    @Getter
    private String item;

    @Getter
    private Elements elements;

    @Builder
    public static class Elements {

      @Getter
      @Builder.Default
      private int nitrogen = 0;

      @Getter
      @Builder.Default
      private int potassium = 0;

      @Getter
      @Builder.Default
      private int phosphorus = 0;
    }
  }
}
