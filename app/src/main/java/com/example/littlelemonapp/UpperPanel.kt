package com.example.littlelemonapp

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun UpperPanel(navController: NavController? = null) {
    val context = LocalContext.current.applicationContext
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFF495E57))
            .padding(start = 12.dp, end = 12.dp, top = 16.dp, bottom = 16.dp)
    )
    {
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
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Text(
                text = stringResource(id = R.string.description),
                color = Color(0xFFEDEFEE),
                style = androidx.compose.material.MaterialTheme.typography.body1,
                modifier = Modifier
                    .padding(top = 5.dp, bottom = 28.dp)
                    .fillMaxWidth(0.6f)
            )
            Image(
                painter = painterResource(id = R.drawable.upperpanelimage),
                contentDescription = "Upper Panel Image",
                modifier = Modifier.clip(
                    RoundedCornerShape(10.dp)
                )
            )
        }
        Button(
            onClick = {
                /*Toast.makeText(
                    context,
                    "Order received, thanks",
                    Toast.LENGTH_SHORT
                ).show()*/
                      navController?.navigate("detail")
            },
            shape = RoundedCornerShape(size = 5.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF4CE14),
                contentColor = Color(0xFF495E57)
            )
        ) {
            Text(
                text = stringResource(id = R.string.orderbuttontext),
                fontSize = 16.sp,
                color = Color(0xFF495E57)
            )
        }
    }
    Text(
        text = stringResource(id = R.string.weekly_special),
        textAlign = TextAlign.Center,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF495E57),
        modifier = Modifier.padding(8.dp)
    )
    /*Spacer(modifier = Modifier.height(5.dp))*/
    LowerPanel2()
}

@Preview(showSystemUi = true)
@Composable
fun PreviewUpperPanel() {
    Column(modifier = Modifier.fillMaxHeight()) {
        TopAppBar()
//        UpperPanel()
    }

}