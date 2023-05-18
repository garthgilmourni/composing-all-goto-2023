package goto.chicago.fourth

import androidx.compose.runtime.MutableState
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.websocket.*
import io.ktor.http.*
import io.ktor.serialization.*
import io.ktor.serialization.kotlinx.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.scan
import kotlinx.serialization.json.Json

class WebSocketClient(
    private val host: String,
    private val port: Int,
    private val basePath: String
) {
    private val client = HttpClient(CIO) {
        install(ContentNegotiation) {
            json()
        }
        install(WebSockets) {
            contentConverter = KotlinxWebsocketSerializationConverter(Json)
        }
    }

    suspend fun fetchAllSessions(state: MutableState<List<GotoSession>>) {
        fetchSessionsViaWebSocket(state, basePath)
    }

    suspend fun fetchSessionsByDate(state: MutableState<List<GotoSession>>, date: String) {
        fetchSessionsViaWebSocket(state, "$basePath/$date")
    }

    private suspend fun fetchSessionsViaWebSocket(state: MutableState<List<GotoSession>>, path: String) {
        client.webSocket(
            method = HttpMethod.Get,
            host = host,
            port = port,
            path = path
        ) {
            this.incoming
                .consumeAsFlow()
                .map {
                    converter!!.deserialize<GotoSession>(it)
                }
                .scan(emptyList<GotoSession>()) { list, session ->
                    list + session
                }
                .collect {
                    state.value = it
                }
        }
    }
}