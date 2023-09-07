package com.sdk.mycmp

import android.app.Activity
import android.content.Context

actual class Finish(
    private val context: Context
) {
    actual fun exit() {
        (context as Activity).finish()
    }
}