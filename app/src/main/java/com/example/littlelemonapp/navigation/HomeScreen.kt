package com.example.littlelemon


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.littlelemonapp.LowerPanel
import com.example.littlelemonapp.R
import com.example.littlelemonapp.TopAppBar
import com.example.littlelemonapp.UpperPanel
import com.example.littlelemonapp.model.DishRepository


@Composable
fun HomeScreen(navController: NavHostController) {
    /*TopAppBar()
    UpperPanel()
    LowerPanel(navController = navController, DishRepository.dishes)*/
    Column(modifier = Modifier.fillMaxHeight()) {
        TopAppBar()
        UpperPanel(navController = navController)
    }
}


/*@Composable
fun HomeScreen() {
    Column {
        Column(
            modifier = Modifier
                .background(Color(0xFF495E57))
                .padding(start = 12.dp, end = 12.dp, top = 16.dp, bottom = 16.dp)
        ) {
            Text(
                text = stringResource(id = R.string.title),
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFF4CE14)
            )
            Text(
                text = stringResource(id = R.string.location),
                fontSize = 24.sp,
                color = Color(0xFFEDEFEE)
            )
            Row(
                modifier = Modifier
                    .padding(top = 18.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.description),
                    color = Color(0xFFEDEFEE),
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(bottom = 28.dp)
                        .fillMaxWidth(0.6f)
                )
                Image(
                    painter = painterResource(id = R.drawable.upperpanelimage),
                    contentDescription = "Upper Panel Image",
                    modifier = Modifier.clip(RoundedCornerShape(20.dp))
                )
            }
            Button(
                onClick = {},
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFF4CE14))
            ) {
                Text(
                    text = stringResource(id = R.string.orderbuttontext),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF333333)
                )
            }
        }
        LowerPanel()
    }
}*/

/*@Composable
private fun LowerPanel() {
    Column {
        WeeklySpecialCard()
        MenuDish()
    }
}*/


/*
@Composable
fun WeeklySpecialCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = "Weekly Special",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(8.dp)
        )
    }
}
*/


/*
@Preview(showBackground = true)
@Composable
fun LowerPanelPreview() {
    LowerPanel()
}
*/
