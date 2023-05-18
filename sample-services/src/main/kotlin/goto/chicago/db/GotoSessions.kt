package goto.chicago.db

import goto.chicago.model.GotoSession
import kotlinx.datetime.LocalDate

object GotoSessions {
    fun buildSessions() = listOf(
        //Day 1
        GotoSession("Alex Castrounis", "Large Language Models: Friend, Foe, or Otherwise", LocalDate(2023, 5, 22)),
        GotoSession("Tim Berglund", "Introduction to Real-Time Analytics With Apache Pinot", LocalDate(2023, 5, 22)),
        GotoSession("Richard Feldman", "Calling Functions Across Languages", LocalDate(2023, 5, 22)),
        GotoSession("Sara Caldwell", "When It’s Time to Change, Then It’s Time To Change", LocalDate(2023, 5, 22)),
        GotoSession("Kasun Indrasiri", "Cloud Native Event Streaming With Kafka and Open Standards", LocalDate(2023, 5, 22)),
        GotoSession("Sam Bail", "Bridging the Gap", LocalDate(2023, 5, 22)),
        // Day 2
        GotoSession("Avdi Grimm", "REPLs All the Way Up: A Rubric for Better Feedback Loops", LocalDate(2023, 5, 23)),
        GotoSession("Fabio Pereira", "The Psychology of UX", LocalDate(2023, 5, 23)),
        GotoSession("Rosemary Wang", "Catching Commits to Secure Infrastructure as Code", LocalDate(2023, 5, 23)),
        GotoSession("Matt Stratton", "Zero Trust is For Networks, Not Your Teams", LocalDate(2023, 5, 23)),
        // Day 3
        GotoSession("Kelly Shortridge", "Practical Magic: the Resilience Potion and Security Chaos Engineering", LocalDate(2023, 5, 24)),
        GotoSession("Garth Gilmour", "Composing All The Things", LocalDate(2023, 5, 24)),
        GotoSession("Hillel Wayne", "Is Software Engineering Real Engineering?", LocalDate(2023, 5, 24)),
        GotoSession("Andrew Kelley", "How to Build Software From Source", LocalDate(2023, 5, 24)))
}