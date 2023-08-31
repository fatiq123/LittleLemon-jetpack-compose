package com.example.littlelemonapp.model

import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

data class Dish (
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    @DrawableRes val imageResource: Int
)

@Composable
fun MCQ() {
    var visible by remember {
        mutableStateOf(true)
    }
    Column {
        AnimatedVisibility(visible = visible) {
            Text(text = "Hello, world!")
        }
        Button(onClick = { visible = !visible }) {
            Text("Button ")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MCQPreview() {
    MCQ()
}