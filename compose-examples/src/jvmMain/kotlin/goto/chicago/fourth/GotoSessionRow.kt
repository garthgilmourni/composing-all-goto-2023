package goto.chicago.fourth

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Header(headerText: String) {
    Text(
        text = "$headerText:",
        style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp, color = Color.Black),
        modifier = Modifier.width(100.dp)
    )
}

@Composable
fun Body(bodyText: String) {
    Text(
        text = bodyText,
        style = TextStyle(fontSize = 18.sp, color = Color.Black),
        modifier = Modifier.padding(bottom = 10.dp)
    )
}

@Composable
fun GotoSessionRow(session: GotoSession) {
    Card(
        modifier = Modifier
            .padding(bottom=10.dp)
            .fillMaxWidth(),
        backgroundColor = Color.White,
        shape = RoundedCornerShape(CornerSize(16.dp))
    ) {
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            Row {
                Header("Title")
                Body(session.talkTitle)
            }
            Row {
                Header("Speaker")
                Body(session.speaker)
            }
            Row {
                Header("Date")
                Body(session.date.dayOfWeek.toString())
            }
        }
    }
}