package com.example.littlelemonapp.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TextButton
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemonapp.Dish
import com.example.littlelemonapp.R
import com.example.littlelemonapp.TopAppBar
import com.example.littlelemonapp.model.DishRepository
import com.example.littlelemonapp.ui.theme.LittleLemonAppTheme

@Composable
fun DishDetails(id: Int) {
    val dish = requireNotNull(DishRepository.getDish(id = id))
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier.padding(start = 10.dp, end = 10.dp)
    ) {
        TopAppBar()
        Image(
            painter = painterResource(id = dish.imageResource),
            contentDescription = "Dish Image",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Text(text = dish.name, fontSize = 26.sp, color = Color(0xFF495E57))
        Text(text = dish.description, color = Color(0xFF495E57))
        Counter()
        Button(
            onClick = {

            }, shape = RoundedCornerShape(5.dp), colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF4CE14),
                contentColor = Color(0xFF495E57)
            ), modifier = Modifier
                .fillMaxWidth()
                .align(CenterHorizontally)
        ) {
            Text(
                text = stringResource(id = R.string.add_for) + " $${dish.price}",
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun Counter() {
    var counter by remember {
        mutableIntStateOf(1)
    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextButton(
            onClick = {
                counter--
            },
            shape = RoundedCornerShape(5.dp),
            colors = androidx.compose.material.ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFF4CE14),
                contentColor = Color(0xFF495E57)
            )
        ) {
            Text(text = "−", style = MaterialTheme.typography.h5)
        }
        Text(
            text = counter.toString(),
            style = MaterialTheme.typography.h5,
            modifier = Modifier.padding(16.dp),
            color = Color(0xFF495E57)
        )
        TextButton(
            onClick = {
                counter++
            },
            shape = RoundedCornerShape(5.dp),
            colors = androidx.compose.material.ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFF4CE14),
                contentColor = Color(0xFF495E57)
            )
        ) {
            Text(text = "+", style = MaterialTheme.typography.h5)
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewDishDetails() {
    DishDetails(id = 1)
}