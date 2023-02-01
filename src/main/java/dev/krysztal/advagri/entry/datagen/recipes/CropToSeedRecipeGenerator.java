package dev.krysztal.advagri.entry.datagen.recipes;

import dev.krysztal.advagri.item.AdvAgriItems;
import java.util.List;
import java.util.function.Consumer;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import org.apache.commons.lang3.tuple.Triple;

public class CropToSeedRecipeGenerator extends FabricRecipeProvider {

  public static final List<Triple<Item, Item, Integer>> PRODUCT_SEED_MAPPING = List.of(
    Triple.of(AdvAgriItems.CORN, AdvAgriItems.SEED_BAG_CORN, 4),
    Triple.of(AdvAgriItems.STRAWBERRY, AdvAgriItems.SEED_BAG_STRAWBERRY, 8),
    Triple.of(AdvAgriItems.CHILI, AdvAgriItems.SEED_BAG_CHILI, 4)
  );

  public CropToSeedRecipeGenerator(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
    PRODUCT_SEED_MAPPING.forEach(it -> offerCropToSeedRecipe(it, exporter));
  }

  private static void offerCropToSeedRecipe(
    Triple<Item, Item, Integer> itemTriple,
    Consumer<RecipeJsonProvider> exporter
  ) {
    ShapelessRecipeJsonBuilder
      .create(itemTriple.getMiddle(), itemTriple.getRight())
      .input(itemTriple.getLeft())
      .criterion("harvest_crop", conditionsFromItem(itemTriple.getLeft()))
      .offerTo(exporter);
  }
}
