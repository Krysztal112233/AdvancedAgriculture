package dev.krysztal.advagri.extender

import net.minecraft.item.ItemGroup
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.util.Identifier

fun ItemGroup.toRegistryKey(identifier: Identifier): RegistryKey<ItemGroup>? {
    Registry.register(Registries.ITEM_GROUP, identifier, this)

    return RegistryKey.of(RegistryKeys.ITEM_GROUP, identifier)
}
