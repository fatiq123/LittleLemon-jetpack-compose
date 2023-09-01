package com.example.littlelemonapp.navigation


import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.littlelemonapp.LowerPanel
import com.example.littlelemonapp.TopAppBar
import com.example.littlelemonapp.UpperPanel
import com.example.littlelemonapp.model.DishRepository


@Composable
fun HomeScreen(navController: NavHostController) {
    Column {
        TopAppBar()
        UpperPanel(navController = navController)
        LowerPanel(navController = navController, dishes = DishRepository.dishes)
    }
}
