package dev.krysztal.advagri.foundation.resources.element;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import net.minecraft.item.ItemConvertible;

@Data
@AllArgsConstructor
public class ItemElementsCombination {

  public ItemElementsCombination(
    ItemConvertible item,
    ElementsCombination elementsCombination
  ) {
    this.item = item.asItem().getIdentifier().toString();
    this.elementsCombination = elementsCombination;
  }

  public ItemElementsCombination(
    ItemConvertible item,
    int nitrogen,
    int phosphorus,
    int potassium
  ) {
    this.item = item.asItem().getIdentifier().toString();
    this.elementsCombination =
      new ElementsCombination(nitrogen, phosphorus, potassium);
  }

  @Getter
  private String item;

  @Getter
  private ElementsCombination elementsCombination;

  public ItemElementsCombination setItem(ItemConvertible item) {
    this.item = item.asItem().getIdentifier().toString();
    return this;
  }

  public ItemElementsCombination setItem(String item) {
    this.item = item;
    return this;
  }
}
