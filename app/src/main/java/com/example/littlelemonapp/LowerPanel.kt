package com.example.littlelemonapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LowerPanel() {
    Column {
        WeeklySpecialCard()
        MenuDish()
    }

}

@Composable
fun WeeklySpecialCard() {
    Card(
        shape = RoundedCornerShape(0.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Weekly Special",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Composable
fun MenuDish() {
    Card(shape = RoundedCornerShape(0.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Column {
                Text(
                    text = "Greek Salad",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    text = "The famous greek salad of " +
                            "crispy lettuce, peppers, olives, " +
                            "our Chicago ...",
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(.75f)
                )
                Text(
                    text = "$12.99",
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                )
            }
            Image(
                painter = painterResource(id = R.drawable.upperpanelimage),
                contentDescription = "UpperPanelImage"
            )
        }

    }
    Divider(modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        color = Color.LightGray,
        thickness = 1.dp
    )
}


@Preview(showBackground = true)
@Composable
fun PreviewWeeklyCard() {
    WeeklySpecialCard()
}

@Preview(showBackground = true)
@Composable
fun PreviewMenuDish() {
    MenuDish()
}


@Preview(showBackground = true)
@Composable
fun PreviewLowerPanel() {
    LowerPanel()
}