package dev.krysztal.advagri.registry

import io.wispforest.owo.registration.reflect.ItemRegistryContainer

class AdvAgriProductItems() : ItemRegistryContainer {
    companion object {

        fun init() = Unit
    }

//    override fun postProcessField(namespace: String?, value: Item?, identifier: String?, field: Field?) {
//        ItemGroupEvents.modifyEntriesEvent(AdvAgriItemGroups.PRODUCT)
//            .register(
//                ItemGroupEvents.ModifyEntries { content ->
//                    content.add(value)
//                },
//            )
//    }
}
