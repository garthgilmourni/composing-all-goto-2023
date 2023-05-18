package goto.chicago.plugins

import goto.chicago.db.GotoSessions.buildSessions
import io.ktor.serialization.kotlinx.*
import io.ktor.server.websocket.*
import java.time.Duration
import io.ktor.server.application.*
import io.ktor.server.routing.*
import io.ktor.websocket.*
import kotlinx.coroutines.delay
import kotlinx.datetime.LocalDate
import kotlinx.datetime.toLocalDate
import kotlinx.serialization.json.Json

val gotoSessions = buildSessions()

fun Application.configureSockets() {
    install(WebSockets) {
        contentConverter = KotlinxWebsocketSerializationConverter(Json)
        pingPeriod = Duration.ofSeconds(15)
        timeout = Duration.ofSeconds(15)
        maxFrameSize = Long.MAX_VALUE
        masking = false
    }
    routing {
        webSocket("/goto/sessions") { // websocketSession
            sendAllSessions()
        }
        webSocket("/goto/sessions/{day}") { // websocketSession
            val day = call.parameters["day"]
            val date = day!!.toLocalDate()

            sendSessionsOnDate(date)
        }
    }
}

private suspend fun DefaultWebSocketServerSession.sendSessionsOnDate(date: LocalDate) {
    gotoSessions.filter {
        it.date == date
    }.forEach {
        sendSerialized(it)
        delay(500)
    }
}

private suspend fun DefaultWebSocketServerSession.sendAllSessions() {
    for (gotoSession in gotoSessions) {
        sendSerialized(gotoSession)
        delay(500)
    }
}
