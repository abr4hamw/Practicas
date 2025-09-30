package com.example.practicas.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.practicas.view.AFCView
import com.example.practicas.view.ChargersView
import com.example.practicas.view.HomeView
import com.example.practicas.view.KCView
import com.example.practicas.view.NFCView
import com.example.practicas.view.RavensView
import com.example.practicas.view.SplashEnd
import com.example.practicas.view.SplashInter
import com.example.practicas.view.SplashScreen
import com.example.practicas.view.SteelersView


@Composable
fun NavManager(){
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "Splash"){

        composable("Home"){
            HomeView(navController)
        }
        composable("Splash"){
            SplashScreen(navController)
        }
        composable ("AFC"){
            AFCView(navController)
        }
        composable ("NFC"){
            NFCView(navController)
        }
        composable ("SplIn/{id}",arguments =
            listOf(navArgument("id")
            {type= NavType.IntType })){
            val id=it.arguments?.getInt("id")?:0
            SplashInter(navController,id)
        }
        composable("SplEnd/{id}", arguments =
            listOf(navArgument("id")
            {type= NavType.IntType})) {
            val id=it.arguments?.getInt("id")?:0
            SplashEnd(navController,id)
        }
        composable ("Chargers"){
            ChargersView(navController)
        }
        composable ("Ravens"){
            RavensView(navController)
        }
        composable ("Steelers"){
            SteelersView(navController)
        }
        composable ("KC"){
            KCView(navController)
        }

    }
}