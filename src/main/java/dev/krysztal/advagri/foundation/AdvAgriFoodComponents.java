package dev.krysztal.advagri.foundation;

import dev.krysztal.advagri.effect.AdvAgriEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class AdvAgriFoodComponents {

  public static final FoodComponent ASPARAGUS;
  public static final FoodComponent PEELED_BAMBOO_SAPLING;
  public static final FoodComponent SWEET_POTATO;
  public static final FoodComponent SOLAR_BERRY;
  public static final FoodComponent WATER_CHESTNUT;
  public static final FoodComponent ROASTED_ACORNS;
  public static final FoodComponent GINKGO_NUTS;
  public static final FoodComponent AMETHYST_JELLY;

  static {
    ASPARAGUS =
      new FoodComponent.Builder()
        .hunger(4)
        .saturationModifier(0.6F)
        .meat()
        .snack()
        .build();

    PEELED_BAMBOO_SAPLING =
      new FoodComponent.Builder()
        .hunger(2)
        .saturationModifier(0.2F)
        .snack()
        .build();

    SWEET_POTATO =
      new FoodComponent.Builder()
        .hunger(4)
        .saturationModifier(0.6F)
        .snack()
        .build();

    SOLAR_BERRY =
      new FoodComponent.Builder()
        .hunger(2)
        .saturationModifier(0.1F)
        .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 60), 1)
        .statusEffect(
          new StatusEffectInstance(StatusEffects.NIGHT_VISION, 120),
          1
        )
        .alwaysEdible()
        .build();

    WATER_CHESTNUT =
      new FoodComponent.Builder()
        .hunger(4)
        .saturationModifier(0.7F)
        .statusEffect(
          new StatusEffectInstance(StatusEffects.POISON, 160),
          0.03F
        )
        .alwaysEdible()
        .build();

    ROASTED_ACORNS =
      new FoodComponent.Builder()
        .hunger(4)
        .saturationModifier(0.5F)
        .statusEffect(
          new StatusEffectInstance(StatusEffects.STRENGTH, 6 * 20),
          0.3F
        )
        .statusEffect(
          new StatusEffectInstance(StatusEffects.SATURATION, 6 * 20),
          0.3F
        )
        .statusEffect(
          new StatusEffectInstance(StatusEffects.ABSORPTION, 6 * 20),
          0.3F
        )
        .snack()
        .alwaysEdible()
        .build();

    GINKGO_NUTS =
      new FoodComponent.Builder()
        .hunger(2)
        .saturationModifier(0.5F)
        .statusEffect(
          new StatusEffectInstance(StatusEffects.POISON, 6 * 20),
          0.1F
        )
        .statusEffect(
          new StatusEffectInstance(StatusEffects.LUCK, 12 * 20),
          0.005F
        )
        .statusEffect(
          new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 12 * 20),
          0.005F
        )
        .statusEffect(
          new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 60 * 20),
          0.005F
        )
        .statusEffect(
          new StatusEffectInstance(StatusEffects.RESISTANCE, 60 * 20, 4),
          0.001F
        )
        .snack()
        .alwaysEdible()
        .build();

    AMETHYST_JELLY =
      new FoodComponent.Builder()
        .hunger(4)
        .saturationModifier(0.5F)
        .statusEffect(
          new StatusEffectInstance(AdvAgriEffects.LUBRICATION, 10 * 20),
          1F
        )
        .statusEffect(
          new StatusEffectInstance(AdvAgriEffects.LUBRICATION, 10 * 20, 13),
          0.01F
        )
        .snack()
        .build();
  }
}
