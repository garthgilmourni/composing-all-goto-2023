package goto.chicago.first

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication

val state = WindowState(
    size = DpSize(200.dp, 150.dp),
    position = WindowPosition(300.dp, 300.dp)
)

const val title = "First Example"

fun main() = singleWindowApplication(state = state, title = title) {
    MaterialTheme {
        FirstExample()
    }
}

@Composable
fun FirstExample() {
    var counter by remember { mutableStateOf(0) }

    Column(modifier = Modifier.padding(20.dp)) {
        Row {
            Text(
                style = TextStyle(fontSize = 20.sp),
                text = "Counter is $counter"
            )
        }
        Row {
            Button(onClick = { counter++ }) {
                Text("Push Me")
            }
        }
    }
}