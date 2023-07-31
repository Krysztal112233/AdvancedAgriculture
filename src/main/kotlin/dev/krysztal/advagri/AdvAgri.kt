package dev.krysztal.advagri

import dev.krysztal.advagri.registry.AdvAgriNaturalBlocks
import dev.krysztal.advagri.registry.AdvAgriNaturalItems
import io.wispforest.owo.registration.reflect.FieldRegistrationHandler
import net.fabricmc.api.ModInitializer
import net.minecraft.util.Identifier
import org.slf4j.LoggerFactory

object AdvAgri : ModInitializer {
    val LOGGER = LoggerFactory.getLogger("advagri")!!
    const val MOD_ID = "advagri"

    override fun onInitialize() {
        AdvAgriItemGroups.init()
        AdvAgriNaturalItems.init()
        AdvAgriNaturalBlocks.init()

        FieldRegistrationHandler.register(AdvAgriNaturalItems::class.java, MOD_ID, false)
        FieldRegistrationHandler.register(AdvAgriNaturalBlocks::class.java, MOD_ID, false)
    }

    fun identifier(path: String): Identifier = Identifier(MOD_ID, path)
}
