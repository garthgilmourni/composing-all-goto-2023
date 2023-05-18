package goto.chicago.second

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Rule() {
    Divider(
        color = Color.Black,
        thickness = 1.dp,
        modifier = Modifier.padding(bottom = 10.dp, top = 10.dp)
    )
}