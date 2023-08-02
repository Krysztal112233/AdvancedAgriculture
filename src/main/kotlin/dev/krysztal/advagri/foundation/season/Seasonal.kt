package dev.krysztal.advagri.foundation.season

interface Seasonal {

    companion object {
        private val fullSeasonAtlas =
            listOf(
                Season.entries.toTypedArray(),
                Season.entries.toTypedArray(),
                Season.entries.toTypedArray(),
            ).flatMap { it.asIterable() }
    }

    fun requiredSeason(): List<Season>? = null

    fun seasonWide(): Int

    fun seasonAtlas(): Set<Season> {
        val set = mutableSetOf<Season>()

        this.requiredSeason()?.forEach { it ->
            val forward = (it.ordinal + seasonWide()) + Season.entries.size
            val after = (it.ordinal - seasonWide()) + Season.entries.size

            fullSeasonAtlas.subList(forward, after).forEach(set::add)
        }

        return set
    }
}
