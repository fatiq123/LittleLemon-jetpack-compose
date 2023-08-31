package com.example.littlelemonapp.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TextButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.littlelemonapp.model.DishRepository

@Composable
fun DishDetails(id: Int) {
    val dish = requireNotNull(DishRepository.getDish(id = id))
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        // TODO here
    }
}

@Composable
fun Counter() {
    var counter by remember {
        mutableStateOf(1)
    }

    Row {
        TextButton(onClick = {
            counter--
        }) {
            Text(text = "-", style = MaterialTheme.typography.h2)
        }
        Text(
            text = counter.toString(),
            style = MaterialTheme.typography.h2,
            modifier = Modifier.padding(16.dp)
        )
        TextButton(onClick = {
            counter++
        }) {
            Text(text = "+", style = MaterialTheme.typography.h2)
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewDishDetails() {
    DishDetails(id = 1)
}