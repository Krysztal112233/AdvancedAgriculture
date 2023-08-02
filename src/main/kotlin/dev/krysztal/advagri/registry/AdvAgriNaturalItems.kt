package dev.krysztal.advagri.registry

import dev.krysztal.advagri.AdvAgriItemGroups
import dev.krysztal.advagri.foundation.util.item
import io.wispforest.owo.registration.reflect.ItemRegistryContainer
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.Item
import java.lang.reflect.Field

class AdvAgriNaturalItems() : ItemRegistryContainer {

    companion object {
        fun init() = Unit

        @JvmField
        val STRAWBERRY_SEED = item()

        @JvmField
        val RICE_SEED = item()

        @JvmField
        val WATER_CHESTNUT = item()

        @JvmField
        val SWEET_POTATO_VINE = item()

        @JvmField
        val SWEET_POTATO = item()

        @JvmField
        val LETTUCE_SEED = item()

        @JvmField
        val CHILI_SEED = item()

        @JvmField
        val CORN_SEED = item()

        @JvmField
        val MINT_SEED = item()

        @JvmField
        val CORN = item()

        @JvmField
        val STRAWBERRY = item()

        @JvmField
        val RICE = item()

        @JvmField
        val WOOD_ASH = item()

        @JvmField
        val LETTUCE = item()

        @JvmField
        val CHILI = item()

        @JvmField
        val GARLIC = item()

        @JvmField
        val BAMBOO_LEAVES = item()

        @JvmField
        val BARK = item()

        // /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        @JvmField
        val PHOSPHORUS = item()

        @JvmField
        val TALC = item()

        // /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        @JvmField
        val GINKGO_SAPLING = item()

        @JvmField
        val APPLE_SAPLING = item()

        @JvmField
        val PEAR_SAPLING = item()

        @JvmField
        val PEACH_SAPLING = item()

        @JvmField
        val APRICOT_SAPLING = item()

        @JvmField
        val ORANGE_SAPLING = item()
    }

    override fun postProcessField(namespace: String?, value: Item?, identifier: String?, field: Field?) {
        ItemGroupEvents.modifyEntriesEvent(AdvAgriItemGroups.NATURAL)
            .register(
                ItemGroupEvents.ModifyEntries { content ->
                    content.add(value)
                },
            )
    }
}
