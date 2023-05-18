package goto.chicago.third

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PaddedButton(text: String, action: () -> Unit) {
    Button(
        modifier = Modifier.padding(end = 10.dp),
        onClick = action
    ) {
        Text(text)
    }
}