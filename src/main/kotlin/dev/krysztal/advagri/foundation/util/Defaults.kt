package dev.krysztal.advagri.foundation.util

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.item.Item

fun item() = Item(FabricItemSettings())

fun itemSettings() = FabricItemSettings()

fun blockSettings(): AbstractBlock.Settings = FabricBlockSettings.copy(Blocks.STONE)

fun stoneTypeBlock() = Block(FabricBlockSettings.copy(Blocks.STONE))
