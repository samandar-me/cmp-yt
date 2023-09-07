import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.sdk.mycmp.App
import com.sdk.mycmp.Finish

fun main() {
    application {
        Window(
            title = "Desktop App",
            onCloseRequest = ::exitApplication
        ) {
            App(Finish(this@application))
        }
    }
}