package goto.chicago.second

import androidx.compose.material.MaterialTheme
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*

val state = WindowState(
    size = DpSize(250.dp, 300.dp),
    position = WindowPosition(300.dp, 300.dp)
)

const val title = "Second Example"

val person = Person("Jane Smith", 34)
val human = Human("Joe Bloggs", 35)

fun main() = singleWindowApplication(state = state, title = title) {
    MaterialTheme {
        SecondExample(person, human)
    }
}
