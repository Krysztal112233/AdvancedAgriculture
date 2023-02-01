package dev.krysztal.advagri.entry.datagen.recipes;

import dev.krysztal.advagri.item.AdvAgriItems;
import java.util.List;
import java.util.function.Consumer;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import org.apache.commons.lang3.tuple.Pair;

public class FoodFurnaceRecipesGenerator extends FabricRecipeProvider {

  private static List<Pair<Item, Item>> SNAKE_FOOD_LIST = List.of(
    Pair.of(AdvAgriItems.ACORNS, AdvAgriItems.ROASTED_ACORNS)
  );

  public FoodFurnaceRecipesGenerator(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
    SNAKE_FOOD_LIST.forEach(it -> offerSnakeCookingRecipe(it, exporter));
  }

  private static void offerSnakeCookingRecipe(
    Pair<Item, Item> itemPair,
    Consumer<RecipeJsonProvider> exporter
  ) {
    CookingRecipeJsonBuilder
      .createSmelting(
        Ingredient.ofItems(itemPair.getLeft()),
        itemPair.getRight(),
        0.1F,
        200
      )
      .criterion(
        "has_" + itemPair.getLeft().getName(),
        conditionsFromItem(itemPair.getLeft())
      )
      .offerTo(exporter);
  }
}
