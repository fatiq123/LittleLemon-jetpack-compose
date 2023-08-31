package com.example.littlelemonapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.littlelemonapp.ui.theme.LittleLemonAppTheme


@Composable
fun MenuScreen(navController: NavController) {

    Column {
        UpperPanel2()
        LowerPanel2(onClick = navController.navigate(""))
    }

}

@Composable
private fun UpperPanel2() {
    Column(
        modifier = Modifier
            .background(Color(0xFF495E57))
            .fillMaxWidth()
            .padding(start = 12.dp, end = 12.dp, top = 16.dp, bottom = 16.dp)
    ) {
        Text(
            text = stringResource(id = R.string.title),
            fontSize = 40.sp,
            fontWeight = Bold,
            color = Color(0xFFF4CE14)
        )

    }
    Text(
        text = stringResource(id = R.string.order_for_takeaway),
        fontSize = 24.sp,
        fontWeight = Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        color = Color(0xFF495E57)
    )
}

@Composable
fun LowerPanel2(onClick: (detail: Dish) -> Unit) {
    Column {
        LazyRow {
            items(Categories) { category ->
                MenuCategory(category = category)
            }
        }
        Divider(
            modifier = Modifier.padding(8.dp),
            color = Color(0xFFF4CE14),
            thickness = 1.dp
        )
        LazyColumn {
            items(Dishes) { Dish ->
                MenuDish(Dish, detail = Dish,onClick = onClick)
            }
        }
    }
}

@Composable
fun MenuCategory(category: String) {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFF4CE14),
            contentColor = Color(0xFF495E57)
        ),
        shape = RoundedCornerShape(40),
        modifier = Modifier.padding(5.dp)
    ) {
        Text(
            text = category
        )
    }
}

@Composable
fun MenuDish(Dish: Dish, detail: Dish, onClick: (detail: Dish) -> Unit) {
    Card(
        shape = RoundedCornerShape(0.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        modifier = Modifier.clickable {
            onClick(detail)
        }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Column {
                Text(
                    text = Dish.name, fontSize = 18.sp, fontWeight = Bold, color = Color(0xFF495E57)
                )
                Text(
                    text = Dish.description,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(.75f)
                )
                Text(
                    text = Dish.price, color = Color.Gray, fontWeight = Bold
                )
            }
            Image(
                painter = painterResource(id = Dish.image),
                contentDescription = "",
            )
        }
    }
    Divider(
        modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        color = Color(0xFFF4CE14),
        thickness = 1.dp,
    )
}


val Categories = listOf(
    "Lunch",
    "Dessert",
    "A La Carte",
    "Mains",
    "Specials"
)

data class Dish(
    val name: String,
    val price: String,
    val description: String,
    val image: Int,
)

val Dishes = listOf(
    Dish(
        "Greek Salad",
        "$12.99",
        "The famous greek salad of crispy lettuce, peppers, olives and our Chicago...",
        R.drawable.greeksalad
    ),
    Dish(
        "Bruschetta",
        "$5.99",
        "Our Bruschetta is made from grilled bread that has been smeared with garlic...",
        R.drawable.bruschetta
    ),
    Dish(
        "Lemon Dessert",
        "$9.99",
        "This comes straight from grandma recipe book, every last ingredient has...",
        R.drawable.lemondessert
    ),
    Dish(
        "Greek Salad",
        "$12.99",
        "The famous greek salad of crispy lettuce, peppers, olives and our Chicago...",
        R.drawable.greeksalad
    ),
    Dish(
        "Bruschetta",
        "$5.99",
        "Our Brushetta is made from grilled bread that has been smeared with garlic...",
        R.drawable.bruschetta
    ),
    Dish(
        "Lemon Dessert",
        "$9.99",
        "This comes straight from grandma recipe book, every last ingredient has...",
        R.drawable.lemondessert
    ),
    Dish(
        "Greek Salad",
        "$12.99",
        "The famous greek salad of crispy lettuce, peppers, olives and our Chicago...",
        R.drawable.greeksalad
    ),
    Dish(
        "Bruschetta",
        "$5.99",
        "Our Brushetta is made from grilled bread that has been smeared with garlic...",
        R.drawable.bruschetta
    ),
    Dish(
        "Lemon Dessert",
        "$9.99",
        "This comes straight from grandma recipe book, every last ingredient has...",
        R.drawable.lemondessert
    )
)


@Preview(showSystemUi = true)
@Composable
fun PreviewMenuScreen() {
    LittleLemonAppTheme {
        MenuScreen()
    }
}