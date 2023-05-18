package goto.chicago.second

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun CounterButton(action: () -> Unit) {
    Row {
        Button(onClick = action ) {
            Text("Increment Counter")
        }
    }
}