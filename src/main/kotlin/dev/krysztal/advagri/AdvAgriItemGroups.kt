package dev.krysztal.advagri

import dev.krysztal.advagri.extender.toRegistryKey
import dev.krysztal.advagri.registry.AdvAgriNaturalItems
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroups
import net.minecraft.item.ItemStack
import net.minecraft.text.Text

object AdvAgriItemGroups {
    fun init() {
        ItemGroups.BUILDING_BLOCKS
    }

    val NATURAL = FabricItemGroup
        .builder()
        .icon { ItemStack(AdvAgriNaturalItems.BAMBOO_LEAVES) }
        .displayName(Text.translatable("itemGroup.advagri.natural"))
        .build()
        .toRegistryKey(AdvAgri.identifier("natural"))

//    val PRODUCT = FabricItemGroup
//        .builder()
//        .icon { ItemStack(AdvAgriProductItems.WOOD_ASH) }
//        .displayName(Text.translatable("itemGroup.advagri.product"))
//        .build()
//        .toRegistryKey(AdvAgri.identifier("product"))
}
