package dev.krysztal.advagri.foundation.hybride

import net.minecraft.nbt.NbtCompound

/**
 * # Trait
 * This interface defined the trait of species,
 * for crops, trees, and animals or even more.
 */
interface SpecieTrait {

    fun evaluate(origin: NbtCompound, income: NbtCompound)
}
