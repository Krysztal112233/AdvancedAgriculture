package dev.krysztal.advagri.item.tools;

import lombok.Getter;
import lombok.Setter;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;


public class AdvAgriToolMaterials implements ToolMaterial {

    @Setter
    @Getter
    private float miningSpeedMultiplier;
    @Setter
    @Getter
    private int durability;
    @Setter
    @Getter
    private float attackDamage;
    @Setter
    @Getter
    private int miningLevel;
    @Setter
    @Getter
    private int enchantability;
    @Setter
    @Getter
    private Ingredient repairIngredient;

}
