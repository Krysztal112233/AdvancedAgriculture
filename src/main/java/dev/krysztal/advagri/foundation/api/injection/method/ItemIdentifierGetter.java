package dev.krysztal.advagri.foundation.api.injection.method;

import net.minecraft.util.Identifier;

public interface ItemIdentifierGetter {
  public default Identifier getIdentifier() {
    return null;
  }
}
