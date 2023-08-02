package dev.krysztal.advagri.block.plants

import dev.krysztal.advagri.extender.getSeason
import dev.krysztal.advagri.foundation.season.Season
import dev.krysztal.advagri.foundation.season.Seasonal
import dev.krysztal.advagri.foundation.util.blockSettings
import net.minecraft.block.BlockState
import net.minecraft.block.GrassBlock
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.random.Random
import net.minecraft.world.World

class MintBlock : GrassBlock(blockSettings()), Seasonal {
    override fun canGrow(world: World?, random: Random?, pos: BlockPos?, state: BlockState?): Boolean =
        requiredSeason().contains(world?.getSeason() ?: Season.Spring)

    override fun requiredSeason(): List<Season> =
        listOf(
            Season.EarlyWinter,
            Season.Winter,
            Season.LateWinter,
            Season.EarlySpring,
        )
}
