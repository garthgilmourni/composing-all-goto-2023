package goto.chicago.third

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ThirdExample(viewModel: AppViewModel) {
    ScrollingBox {
        Column {
            Row(modifier = Modifier.padding(bottom = 20.dp)) {
                Text(text = viewModel.content, style = viewModel.style)
            }
            Row {
                TextField(value = viewModel.content, onValueChange = {
                    viewModel.content = it
                })
            }
            Row {
                ButtonPanel(viewModel)
            }
        }
    }
}

