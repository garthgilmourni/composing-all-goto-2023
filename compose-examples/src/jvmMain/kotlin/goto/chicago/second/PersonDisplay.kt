package goto.chicago.second

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun PersonDisplay(person: Person) {
    println("PersonDisplay invoked")
    Row { Text(person.toString()) }
    Rule()
}