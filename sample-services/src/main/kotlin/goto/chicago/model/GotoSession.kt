package goto.chicago.model

import kotlinx.datetime.LocalDate
import kotlinx.serialization.Serializable

@Serializable
data class GotoSession(
    val speaker: String,
    val talkTitle: String,
    val date: LocalDate
)