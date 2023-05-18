package goto.chicago.swing

import java.awt.FlowLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JTextField
import javax.swing.WindowConstants.EXIT_ON_CLOSE

fun main() {
    val frame = JFrame("A Swing UI")
    frame.defaultCloseOperation = EXIT_ON_CLOSE
    val button = JButton("Push Me")
    val textField = JTextField(10)

    button.addActionListener {
        textField.text = "Hello GOTO!"
    }
    frame.layout = FlowLayout()
    frame.add(button)
    frame.add(textField)
    frame.pack()
    frame.isVisible = true;
}