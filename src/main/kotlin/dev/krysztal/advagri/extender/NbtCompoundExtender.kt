package dev.krysztal.advagri.extender

import net.minecraft.nbt.NbtCompound

fun NbtCompound.getSpeciesTraitCompound(): NbtCompound? =
    if (this.contains("SpecieTraits")) {
        this.getCompound("SpecieTraits")
    } else {
        null
    }
