package com.example.practicas.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.practicas.dataStore.StoreBoarding
import com.example.practicas.onBoardViews.MainOnBoarding
import com.example.practicas.view.DetailsView
import com.example.practicas.view.HomeView
import com.example.practicas.view.SplashScreen


@Composable
fun NavManager(){
    val navController = rememberNavController()
    val context = LocalContext.current
    val dataStore = StoreBoarding(context)
    val store: State<Boolean?> =
    dataStore.getStoreBoarding.collectAsState(initial = true)

    NavHost(navController = navController,
        startDestination = "Splash"){
        composable("Home"){
            HomeView(navController)
        }
        composable("Detail/{id}",arguments =
            listOf(navArgument("id")
            {type= NavType.IntType })){
            val id=it.arguments?.getInt("id")?:0
            DetailsView(navController,id)
        }
        composable("Splash"){
            SplashScreen(navController, store.value)
        }
        composable("OnBoarding"){
            MainOnBoarding(navController, dataStore)
        }

    }
}