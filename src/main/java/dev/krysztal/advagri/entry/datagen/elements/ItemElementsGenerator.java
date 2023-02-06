package dev.krysztal.advagri.entry.datagen.elements;

import dev.krysztal.advagri.foundation.AdvAgriConstants;
import dev.krysztal.advagri.foundation.datagen.AdvAgriItemElementsProvider;
import dev.krysztal.advagri.item.AdvAgriItems;
import java.util.List;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ItemElementsGenerator extends AdvAgriItemElementsProvider {

  public ItemElementsGenerator(DataGenerator dataGenerator) {
    super(dataGenerator, new Identifier(AdvAgriConstants.MODID, "elements"));
  }

  @Override
  protected void generateItemElements() {
    List.of(AdvAgriItems.PHOSPHATE).forEach(super::createP);
    List.of(AdvAgriItems.FERTILIZER).forEach(super::createAll);
    List.of(Items.BONE_MEAL).forEach(super::createNP);
  }
}
