package goto.chicago

import goto.chicago.plugins.configureHTTP
import goto.chicago.plugins.configureRouting
import goto.chicago.plugins.configureSerialization
import goto.chicago.plugins.configureSockets
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(
        Netty,
        port = 8080,
        host = "0.0.0.0",
        module = Application::module
    ).start(wait = true)
}

fun Application.module() {
    configureHTTP()
    configureSockets()
    configureSerialization()
    configureRouting()
}
