import androidx.compose.material3.Text
import androidx.compose.ui.window.Window
import com.sdk.mycmp.App
import com.sdk.mycmp.Finish
import kotlinx.browser.window
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        Window(
            title = "Cmp App"
        ) {
            App(
                finish = Finish()
            )
        }
    }
}
