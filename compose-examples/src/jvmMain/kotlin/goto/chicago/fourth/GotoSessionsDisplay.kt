package goto.chicago.fourth

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GotoSessionsDisplay(gotoSessions: List<GotoSession>) {
    Row {
        LazyColumn(modifier = Modifier.height(400.dp)) {
            items(gotoSessions) { session ->
                GotoSessionRow(session)
            }
        }
    }
}