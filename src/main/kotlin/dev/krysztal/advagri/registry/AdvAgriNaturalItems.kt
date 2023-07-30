package dev.krysztal.advagri.registry

import dev.krysztal.advagri.AdvAgriItemGroups
import dev.krysztal.advagri.foundation.util.defaultItem
import io.wispforest.owo.registration.reflect.ItemRegistryContainer
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.Item
import java.lang.reflect.Field

class AdvAgriNaturalItems() : ItemRegistryContainer {

    companion object {
        fun init() = Unit

        @JvmField
        val STRAWBERRY_SEED = defaultItem()

        @JvmField
        val RICE_SEED = defaultItem()

        @JvmField
        val WATER_CHESTNUT = defaultItem()

        @JvmField
        val SWEET_POTATO_VINE = defaultItem()

        @JvmField
        val SWEET_POTATO = defaultItem()

        @JvmField
        val LETTUCE_SEED = defaultItem()

        @JvmField
        val CHILI_SEED = defaultItem()

        @JvmField
        val CORN_SEED = defaultItem()

        @JvmField
        val MINT_SEED = defaultItem()

        @JvmField
        val CORN = defaultItem()

        @JvmField
        val STRAWBERRY = defaultItem()

        @JvmField
        val RICE = defaultItem()

        @JvmField
        val WOOD_ASH = defaultItem()

        @JvmField
        val LETTUCE = defaultItem()

        @JvmField
        val CHILI = defaultItem()

        @JvmField
        val GARLIC = defaultItem()

        @JvmField
        val BAMBOO_LEAVES = defaultItem()

        @JvmField
        val PHOSPHORUS = defaultItem()

        @JvmField
        val BARK = defaultItem()

        @JvmField
        val TALC = defaultItem()
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
