package goto.chicago.second

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp

class Person(val name: String, val age: Int) {
    override fun toString() = "$name aged $age"
}

class Human(var name: String, var age: Int) {
    override fun toString() = "$name aged $age"
}

@Composable
fun SecondExample(person: Person, human: Human) {
    val counter = remember {
        mutableStateOf(0)
    }

    Box(modifier = Modifier.padding(10.dp)) {
        Column {
            CounterDisplay(counter.value)
            PersonDisplay(person)
            HumanDisplay(human)
            CounterButton {
                counter.value = counter.value + 1
            }
        }
    }
}