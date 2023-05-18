package goto.chicago.second

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun HumanDisplay(human: Human) {
    println("HumanDisplay invoked")
    Row { Text(human.toString()) }
    Rule()
}