package goto.chicago.fourth

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FetchByDateButtons(fetchAction: (String) -> Unit) {
    @Composable
    fun CustomButton(text: String, date: String) {
        Button(
            onClick = { fetchAction(date) },
            modifier = Modifier.padding(end = 10.dp),
            colors = buttonColors(backgroundColor = Color.White)
        ) {
            Text(
                text = text,
                style = TextStyle(fontSize = 18.sp)
            )
        }
    }

    Row(
        modifier = Modifier.padding(top = 20.dp, bottom = 20.dp)
    ) {
        CustomButton("All Days", "")
        CustomButton("Mon", "2023-05-22")
        CustomButton("Tues", "2023-05-23")
        CustomButton("Wed", "2023-05-24")
    }
}