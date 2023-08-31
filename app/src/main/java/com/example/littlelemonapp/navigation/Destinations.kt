package com.example.littlelemonapp.navigation

import com.example.littlelemonapp.R

interface Destinations {
    val route: String
}

object Home: Destinations {
    override val route: String
        get() = "Home"
}

object DishDetails: Destinations {
    override val route: String
        get() = "Menu"

    const val argDishId = "dishId"
}
/*
interface Destinations {
    val route: String
    val icon: Int
    val title: String
}

object Home: Destinations {
    override val route: String
        get() = "Home"
    override val icon: Int
        get() = R.drawable.ic_home
    override val title: String
        get() = "Home"
}

object Menu: Destinations {
    override val route: String
        get() = "Menu"
    override val icon: Int
        get() = R.drawable.ic_menu
    override val title: String
        get() = "Menu"

}

object Location: Destinations {
    override val route: String
        get() = "Location"
    override val icon: Int
        get() = R.drawable.ic_location
    override val title: String
        get() = "Location"

}*/
