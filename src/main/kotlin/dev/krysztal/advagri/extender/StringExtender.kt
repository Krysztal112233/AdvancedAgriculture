package dev.krysztal.advagri.extender

import dev.krysztal.advagri.AdvAgri
import net.minecraft.util.Identifier

fun String.toIdentifier(): Identifier =
    AdvAgri.identifier(this)
