package goto.chicago.fourth

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import kotlinx.coroutines.launch

@Composable
fun FourthExample(client: WebSocketClient) {
    val gotoSessions = remember { mutableStateOf(emptyList<GotoSession>()) }
    val scope = rememberCoroutineScope()

    val fetchSessionsByDate: (String) -> Unit = { date ->
        scope.launch {
            if (date.isBlank()) {
                client.fetchAllSessions(gotoSessions)
            } else {
                client.fetchSessionsByDate(gotoSessions, date)
            }
        }
    }

    LaunchedEffect(Unit) {
        client.fetchAllSessions(gotoSessions)
    }

    Box(modifier = Modifier.padding(20.dp)) {
        Column {
            TitleBar()
            FetchByDateButtons(fetchSessionsByDate)
            GotoSessionsDisplay(gotoSessions!!.value)
        }
    }
}