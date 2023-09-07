package com.sdk.mycmp

import kotlinx.browser.window

actual class Finish {
    actual fun exit() {
        window.close()
    }
}
// DI
// Networking
// Database
