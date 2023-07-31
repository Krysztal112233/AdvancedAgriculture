package dev.krysztal.advagri.foundation.season

interface Seasonal {
    fun requiredSeason(): List<Season>? = null
}
