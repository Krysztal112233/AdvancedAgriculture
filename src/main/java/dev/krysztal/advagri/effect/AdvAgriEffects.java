package dev.krysztal.advagri.effect;

import dev.krysztal.advagri.effect.impls.Lubrication;
import dev.krysztal.advagri.foundation.AdvAgriConstants;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdvAgriEffects {

  public static final StatusEffect LUBRICATION = new Lubrication();

  static {
    Registry.register(
      Registry.STATUS_EFFECT,
      new Identifier(AdvAgriConstants.MODID, "lubrication"),
      LUBRICATION
    );
  }

  public static void init() {}
}
