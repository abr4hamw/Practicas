package com.example.practicas.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.practicas.R
import kotlinx.coroutines.delay

@Composable
fun SplashEnd(navController: NavController, id: Int) {
    LaunchedEffect(key1 = true) {
        delay(1200)
        val ruta = when{
            id == 1 -> "Chargers"
            id == 2 -> "Ravens"
            id == 3 -> "Steelers"
            id == 4 -> "KC"
            id == 5 -> "VKNGS"
            id == 6 -> "SF"
            id == 7 -> "GB"
            id == 8 -> "CowB"
            else -> "Chargers"
        }
        navController.navigate(ruta) {
            //popUpTo("Home")
            {
            }
        }
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.nflequipo))
        val progress by animateLottieCompositionAsState(composition = composition)

        LottieAnimation(
            composition = composition,
            progress = progress
        )
    }
}