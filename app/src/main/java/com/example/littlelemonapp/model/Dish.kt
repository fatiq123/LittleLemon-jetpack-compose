package com.example.littlelemonapp.model

import androidx.annotation.DrawableRes

data class Dish (
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    @DrawableRes val imageResource: Int
)