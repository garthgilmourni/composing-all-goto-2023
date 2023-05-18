package goto.chicago.fourth

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*

val state = WindowState(
    size = DpSize(700.dp, 600.dp),
    position = WindowPosition(300.dp, 300.dp)
)

const val title = "Fourth Example"

fun main() = singleWindowApplication(state = state, title = title) {
    val client = remember {
        WebSocketClient("0.0.0.0", 8080, "/goto/sessions")
    }
    MaterialTheme {
        FourthExample(client)
    }
}
