package com.sergiocrespotoubes.jetpackcomposearistides.ui.screen.section2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun Exercise1Screen() {
    Column {
        Box(
            Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .weight(1f)
        ) {
            Text(
                text = "Ejemplo 1",
                Modifier.align(Alignment.Center)
            )
        }
        Row(
            Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                Modifier
                    .background(Color.Red)
                    .fillMaxHeight()
                    .weight(1f)
            ) {
                Text(
                    text = "Ejemplo 2",
                    Modifier.align(Alignment.Center)
                )
            }
            Box(
                Modifier
                    .background(Color.Green)
                    .fillMaxHeight()
                    .weight(1f)
            ) {
                Text(
                    text = "Ejemplo 3",
                    Modifier.align(Alignment.Center)
                )
            }
        }
        Box(
            Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .weight(1f)
        ) {
            Text(
                text = "Ejemplo 4",
                Modifier.align(Alignment.BottomCenter)
            )
        }
    }
}