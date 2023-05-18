package goto.chicago.third

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import kotlin.random.Random

class AppViewModel {
    companion object {
        const val defaultFontSize = 16
        const val minimumFontSize = 10
        const val maximumFontSize = 50
        val sampleColors = listOf(Color.Black, Color.Blue, Color.Red, Color.Magenta)
        val defaultColor = sampleColors[0]
    }

    private var color by mutableStateOf(defaultColor)
    private var size by mutableStateOf(defaultFontSize)

    val style by derivedStateOf {
        TextStyle(color = color, fontSize = size.sp)
    }

    var content by mutableStateOf("Hello there...")

    fun increaseFont() {
        if (size < maximumFontSize)
            size += 2
    }

    fun decreaseFont() {
        if (size > minimumFontSize)
            size -= 2
    }

    fun switchColor() {
        val index = Random.nextInt(0, sampleColors.size)
        color = sampleColors[index]
    }
}