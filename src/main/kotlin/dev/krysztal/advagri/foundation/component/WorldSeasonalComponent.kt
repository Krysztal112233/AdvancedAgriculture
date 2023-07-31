package dev.krysztal.advagri.foundation.component

import dev.krysztal.advagri.AdvAgri
import dev.krysztal.advagri.extender.toIdentifier
import dev.krysztal.advagri.foundation.season.Season
import dev.onyxstudios.cca.api.v3.component.ComponentKey
import dev.onyxstudios.cca.api.v3.component.ComponentRegistryV3
import dev.onyxstudios.cca.api.v3.world.WorldComponentFactoryRegistry
import dev.onyxstudios.cca.api.v3.world.WorldComponentInitializer
import net.minecraft.nbt.NbtCompound
import net.minecraft.world.World

class WorldSeasonalComponent() : SeasonalComponent, WorldComponentInitializer {

    private constructor(world: World) : this()

    private var currentSeason = Season.EarlySpring

    override fun readFromNbt(tag: NbtCompound) {
        this.currentSeason = Season.valueOf(tag.getString("CurrentSeason"))
    }

    override fun writeToNbt(tag: NbtCompound) {
        tag.putString("CurrentSeason", this.currentSeason.toString())
    }

    override fun getSeason(): Season = this.currentSeason

    override fun setSeason(season: Season) {
        this.currentSeason = season
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    override fun registerWorldComponentFactories(registry: WorldComponentFactoryRegistry) {
        registry.register(KEY) { WorldSeasonalComponent(it) }
    }

    companion object {
        private val KEY: ComponentKey<SeasonalComponent> = ComponentRegistryV3
            .INSTANCE
            .getOrCreate(
                "season".toIdentifier(),
                SeasonalComponent::class.java,
            )

        fun getComponent(world: World): SeasonalComponent = world.getComponent(KEY)
    }
}
