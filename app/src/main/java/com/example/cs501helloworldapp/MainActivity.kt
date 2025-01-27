package com.example.cs501helloworldapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button // used for button
import androidx.compose.material3.Scaffold
import androidx.compose.foundation.layout.Box // used for centering
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment // used for centering
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWorldScreen()
        }
    }
}


@Composable
fun HelloWorldScreen() {
    // state for showing hello world
    val showHelloWorld = remember { mutableStateOf(false) }
    Scaffold { innerPadding ->
        //centering hello world with given padding
        Box(
            modifier = androidx.compose.ui.Modifier.fillMaxSize().padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            Button(
                onClick = { showHelloWorld.value = true },
                modifier = androidx.compose.ui.Modifier
                    .align(Alignment.BottomCenter) // moved button to the bottom so it wouldn't overlap with the text
                    .padding(16.dp)
            ) { Text( text = "Click Me!")}
            if (showHelloWorld.value) {
                Text(
                    text = "Hello World!"
                )
            }
        }
    }
}
// used to preview design visualization
@Preview(showBackground = true)
@Composable
fun HelloWorldPreview() {
    HelloWorldScreen()
}