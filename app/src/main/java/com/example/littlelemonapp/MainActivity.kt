package com.example.littlelemonapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.littlelemonapp.navigation.Detail
import com.example.littlelemonapp.navigation.HomeScreen
import com.example.littlelemonapp.navigation.DishDetails
import com.example.littlelemonapp.navigation.Home
import com.example.littlelemonapp.ui.theme.LittleLemonAppTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonAppTheme {
                val scaffoldState = rememberScaffoldState()

                Scaffold(
                   /* bottomBar = {
                        BottomAppBar(contentPadding = PaddingValues(horizontal = 100.dp),actions = {
                            IconButton(onClick = {

                            }) {
                                Icon(imageVector = Icons.Default.Home, contentDescription = "Home")
                            }
                            IconButton(onClick = {

                            }) {
                                Icon(
                                    imageVector = Icons.Default.Settings,
                                    contentDescription = "Settings"
                                )
                            }
                        })
                    }*/
                ) {
                    Box(modifier = Modifier.padding(it)){
                        App()
                    }

                }

            }
        }
    }
}


@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home.route) {
        composable(route = Home.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Detail.route) {
            MenuScreen(navController = navController)
        }
        composable(route = DishDetails.route + "/{${DishDetails.argDishId}}",
            arguments = listOf(
                navArgument(name = DishDetails.argDishId) {
                    type = NavType.IntType
                }
            )) {
            val id = requireNotNull(it.arguments?.getInt(DishDetails.argDishId)) {
                "Dish id is null"
            }
            DishDetails(id = id)
        }
    }
}



/*@Composable
fun MenuContent(paddingValues: PaddingValues) {
    Surface(modifier = Modifier.padding(paddingValues = paddingValues)) {
        val menuPadding = 8.dp
        val configuration = LocalConfiguration.current
        when (configuration.orientation) {
            ORIENTATION_LANDSCAPE -> {
                Column {
                    Row(modifier = Modifier.weight(0.5f)) {
                        Text(
                            "Appetizers",
                            modifier = Modifier
                                .weight(0.25f)
                                .fillMaxHeight()
                                .background(Purple80)
                                .padding(menuPadding)
                        )
                        Text(
                            "Salads",
                            modifier = Modifier
                                .weight(0.25f)
                                .fillMaxHeight()
                                .padding(menuPadding)
                        )
                    }
                    Row(modifier = Modifier.weight(0.5f)) {
                        Text(
                            "Drinks",
                            modifier = Modifier
                                .weight(0.25f)
                                .fillMaxHeight()
                                .background(Pink80)
                                .padding(menuPadding)
                        )
                        Text(
                            "Mains",
                            modifier = Modifier
                                .weight(0.25f)
                                .fillMaxHeight()
                                .background(PurpleGrey80)
                                .padding(menuPadding)
                        )
                    }
                }
            }

            else -> {
                Column {
                    Text(
                        "Appetizers",
                        modifier = Modifier
                            .weight(0.25f)
                            .background(Purple80)
                            .padding(menuPadding)
                            .fillMaxWidth()
                    )
                    Text(
                        "Salads",
                        modifier = Modifier
                            .weight(0.25f)
                            .padding(menuPadding)
                            .fillMaxWidth()
                    )
                    Text(
                        "Drinks",
                        modifier = Modifier
                            .weight(0.25f)
                            .background(Pink80)
                            .padding(menuPadding)
                            .fillMaxWidth()
                    )
                    Text(
                        "Mains",
                        modifier = Modifier
                            .weight(0.25f)
                            .background(PurpleGrey80)
                            .padding(menuPadding)
                            .fillMaxWidth()
                    )
                }
            }
        }
    }
}*/

