package dev.krysztal.advagri.foundation.block

import dev.krysztal.advagri.extender.getSeason
import dev.krysztal.advagri.foundation.season.Season
import dev.krysztal.advagri.foundation.season.Seasonal
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.ShapeContext
import net.minecraft.block.SweetBerryBushBlock
import net.minecraft.entity.Entity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.server.world.ServerWorld
import net.minecraft.state.StateManager
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.random.Random
import net.minecraft.util.shape.VoxelShape
import net.minecraft.world.BlockView
import net.minecraft.world.World

abstract class AbstractSeasonalBushBlock(settings: Settings?) : SweetBerryBushBlock(settings), Seasonal {
    abstract override fun appendProperties(builder: StateManager.Builder<Block, BlockState>?)

    abstract override fun getOutlineShape(
        state: BlockState?,
        world: BlockView?,
        pos: BlockPos?,
        context: ShapeContext?,
    ): VoxelShape?

    abstract override fun onUse(
        state: BlockState?,
        world: World?,
        pos: BlockPos?,
        player: PlayerEntity?,
        hand: Hand?,
        hit: BlockHitResult?,
    ): ActionResult

    abstract override fun grow(world: ServerWorld?, random: Random?, pos: BlockPos?, state: BlockState?)

    override fun canGrow(world: World?, random: Random?, pos: BlockPos?, state: BlockState?): Boolean {
        val season = world?.getSeason() ?: Season.EarlySpring
//        this.seasonWide().
//        this.requiredSeason().con

        return true
    }

    /**
     * Remove entity damage than super class.
     */
    override fun onEntityCollision(state: BlockState?, world: World?, pos: BlockPos?, entity: Entity?) = Unit
}
