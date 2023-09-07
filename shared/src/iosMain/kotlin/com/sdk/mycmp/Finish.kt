package com.sdk.mycmp

actual class Finish {
    actual fun exit() {
        platform.posix.exit(0)
    }
}