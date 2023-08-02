package dev.krysztal.advagri.registry

import dev.krysztal.advagri.AdvAgriItemGroups
import dev.krysztal.advagri.foundation.util.stoneTypeBlock
import io.wispforest.owo.registration.reflect.BlockRegistryContainer
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.block.Block
import java.lang.reflect.Field

class AdvAgriNaturalBlocks : BlockRegistryContainer {

    companion object {
        fun init() = Unit

        @JvmField
        val PYRITE = stoneTypeBlock()

        @JvmField
        val CHALCOPYRITE = stoneTypeBlock()
    }

    override fun postProcessField(namespace: String?, value: Block?, identifier: String?, field: Field?) {
        ItemGroupEvents.modifyEntriesEvent(AdvAgriItemGroups.NATURAL)
            .register(
                ItemGroupEvents.ModifyEntries { content ->
                    content.add(value)
                },
            )
    }
}
