package dev.krysztal.advagri.foundation.datagen;

import com.google.gson.Gson;
import dev.krysztal.advagri.foundation.resources.element.ElementsCombination;
import dev.krysztal.advagri.foundation.resources.element.ItemElementsCombination;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.DataWriter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.Identifier;

@Slf4j
public abstract class AdvAgriItemElementsProvider implements DataProvider {

  private final Identifier identifier;
  private final DataGenerator dataGenerator;
  protected List<ItemElementsCombination> elementsList = new ArrayList<>();

  public AdvAgriItemElementsProvider(
    DataGenerator dataGenerator,
    Identifier identifier
  ) {
    this.identifier = identifier;
    this.dataGenerator = dataGenerator;
  }

  @Override
  public void run(DataWriter writer) {
    this.generateItemElements();
    var pathResolver = dataGenerator.createPathResolver(
      DataGenerator.OutputType.DATA_PACK,
      identifier.getPath()
    );
    var gson = new Gson();

    for (ItemElementsCombination element : elementsList) {
      var jsonContent = gson.toJsonTree(element);
      var jsonPath = pathResolver.resolveJson(
        new Identifier(element.getItem())
      );

      try {
        DataProvider.writeToPath(writer, jsonContent, jsonPath);
      } catch (IOException e) {
        log.error("Couldn't save item element combination to {}", jsonPath, e);
      }
    }
  }

  @Override
  public String getName() {
    return "Elemental combinations for " + this.identifier.getPath();
  }

  protected abstract void generateItemElements();

  public void createN(ItemConvertible item) {
    createN(item, 1);
  }

  public void createN(ItemConvertible item, int count) {
    this.elementsList.add(
        new ItemElementsCombination(item, new ElementsCombination(count, 0, 0))
      );
  }

  public void createP(ItemConvertible item) {
    createP(item, 1);
  }

  public void createP(ItemConvertible item, int count) {
    this.elementsList.add(new ItemElementsCombination(item, 0, count, 0));
  }

  public void createK(ItemConvertible item) {
    createK(item, 1);
  }

  public void createK(ItemConvertible item, int count) {
    this.elementsList.add(new ItemElementsCombination(item, 0, 0, count));
  }

  public void createNP(ItemConvertible item) {
    this.createNP(item, 1);
  }

  public void createNP(ItemConvertible item, int count) {
    this.elementsList.add(new ItemElementsCombination(item, count, count, 0));
  }

  public void createNK(ItemConvertible item) {
    this.createNK(item, 1);
  }

  public void createNK(ItemConvertible item, int count) {
    this.elementsList.add(new ItemElementsCombination(item, count, 0, count));
  }

  public void createPK(ItemConvertible item) {
    this.createPK(item, 1);
  }

  public void createPK(ItemConvertible item, int count) {
    this.elementsList.add(new ItemElementsCombination(item, 0, count, count));
  }

  public void createAll(ItemConvertible item) {
    createAll(item, 1);
  }

  public void createAll(ItemConvertible item, int count) {
    this.elementsList.add(
        new ItemElementsCombination(item, count, count, count)
      );
  }
}
