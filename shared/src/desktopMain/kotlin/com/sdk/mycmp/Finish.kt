package com.sdk.mycmp

import androidx.compose.ui.window.ApplicationScope

actual class Finish(
    private val applicationScope: ApplicationScope
) {
    actual fun exit() {
        applicationScope.exitApplication()
    }
}