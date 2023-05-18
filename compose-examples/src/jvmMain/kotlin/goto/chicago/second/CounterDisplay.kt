package goto.chicago.second

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun CounterDisplay(value: Int) {
    Row {
        Text(
            text = "The counter value is $value"
        )
    }
    Rule()
}