package dev.krysztal.advagri.foundation.mixin;

import dev.krysztal.advagri.foundation.api.injection.method.ItemIdentifierGetter;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Item.class)
public class ItemMixin implements ItemIdentifierGetter {

  @Override
  public Identifier getIdentifier() {
    return ((Item) ((Object) this)).getRegistryEntry()
      .getKey()
      .get()
      .getValue();
  }
}
