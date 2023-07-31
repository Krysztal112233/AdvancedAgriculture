package dev.krysztal.advagri.extender

import dev.krysztal.advagri.foundation.component.WorldSeasonalComponent
import dev.krysztal.advagri.foundation.season.Season
import net.minecraft.world.World

fun World.getSeason(): Season = WorldSeasonalComponent.getComponent(this).season
