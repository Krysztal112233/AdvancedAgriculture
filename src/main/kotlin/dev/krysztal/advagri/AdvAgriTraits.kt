package dev.krysztal.advagri

import dev.krysztal.advagri.extender.toIdentifier
import dev.krysztal.advagri.foundation.hybride.trait.Express
import dev.krysztal.advagri.foundation.hybride.trait.GrowthPhenology
import dev.krysztal.advagri.foundation.hybride.trait.TreeHeight

object AdvAgriTraits {
    val TRAITS = mutableMapOf(
        "express".toIdentifier() to Express(),
        "growth_phenology".toIdentifier() to GrowthPhenology(),
        "tree_height".toIdentifier() to TreeHeight(),
    )
}
