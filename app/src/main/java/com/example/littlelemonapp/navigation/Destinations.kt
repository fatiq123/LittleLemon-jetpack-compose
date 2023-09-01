package com.example.littlelemonapp.navigation

interface Destinations {
    val route: String
}

object Home: Destinations {
    override val route = "Home"
}

object Detail: Destinations {
    override val route: String = "Detail"
}
object DishDetails: Destinations {

    override val route = "Menu"
    const val argDishId = "dishId"
}
