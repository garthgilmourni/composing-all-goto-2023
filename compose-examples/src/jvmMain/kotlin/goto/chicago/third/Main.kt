package goto.chicago.third

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*

val state = WindowState(
    size = DpSize(500.dp, 300.dp),
    position = WindowPosition(100.dp, 100.dp)
)

const val title = "Third Example"
fun main() = singleWindowApplication(state = state, title = title) {
    MaterialTheme {
        val viewModel = remember { AppViewModel() }
        ThirdExample(viewModel)
    }
}
