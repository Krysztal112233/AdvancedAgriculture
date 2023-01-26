package dev.krysztal.advagri.entry.datagen.recipes;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.foundation.AdvAgriTags;
import java.util.function.Consumer;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;

public class LogRecipesGenerator extends FabricRecipeProvider {

  public LogRecipesGenerator(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
    RecipeProvider.offerPlanksRecipe(
      exporter,
      AdvAgriBlocks.GINKGO_PLANKS,
      AdvAgriTags.ItemTags.GINKGO_LOGS
    );
  }
}
