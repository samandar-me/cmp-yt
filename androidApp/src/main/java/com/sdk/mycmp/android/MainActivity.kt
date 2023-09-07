package com.sdk.mycmp.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.platform.LocalContext
import com.sdk.mycmp.App
import com.sdk.mycmp.Finish

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App(
                finish = Finish(LocalContext.current)
            )
        }
    }
}
