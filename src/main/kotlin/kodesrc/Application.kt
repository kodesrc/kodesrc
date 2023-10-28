package kodesrc

import io.ktor.serialization.gson.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.initializeApp() {
    install(ContentNegotiation) {
        gson {
        }
    }
    configureRouting()
}
fun Application.configureRouting() {
    routing {
        get("/welcome-to-kodesrc") {
            call.respondText("Welcome to KodeSrc!")
        }
        get("/hello-world") {
            call.respondText("Hello World!")
        }
    }
}
