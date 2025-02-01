package app.revanced.patches.mcdonalds

import app.revanced.patcher.patch.bytecodePatch

@Suppress("unused")
val examplePatch = bytecodePatch(
    name = "Sign Without Password",
    description = "Be able to sign in Mc Donald's app only with email.",
) {
    compatibleWith("com.mcdo.mcdonalds"("4.10.0"))

    execute {
        // TODO("Not yet implemented")
    }
}
