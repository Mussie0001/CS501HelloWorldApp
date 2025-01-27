package com.example.cs501helloworldapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.foundation.layout.Box // used for centering
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment // used for centering
import androidx.compose.ui.tooling.preview.Preview

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
    Scaffold { innerPadding ->
        //centering hello world with given padding
        Box(
            modifier = androidx.compose.ui.Modifier.fillMaxSize().padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Hello World!"
            )
        }
    }
}
// used to preview design visualization
@Preview(showBackground = true)
@Composable
fun HelloWorldPreview() {
    HelloWorldScreen()
}