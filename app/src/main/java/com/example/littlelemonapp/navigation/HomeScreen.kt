package com.example.littlelemonapp.navigation

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.littlelemonapp.R

@Composable
fun HomeScreen(navController: NavController) {

    Button(
        onClick = { navController.navigate(Menu.route) },
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.buttonColors(contentColor = Color(0xFFF4CE14))
    ) {
        Text(
            text = stringResource(id = R.string.orderbuttontext),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF333333)
        )
    }

}