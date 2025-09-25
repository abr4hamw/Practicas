package com.example.practicas.onBoardViews

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.practicas.R
import com.example.practicas.data.PageData
import com.example.practicas.dataStore.StoreBoarding

@Composable
fun MainOnBoarding(navController: NavController, store: StoreBoarding){
    val items=ArrayList<PageData>()

    items.add(
        PageData(
            image= R.raw.xboxlogo,
            titulo="Primer Titulo",
            descripcion="Descripcion 1"
        )

    )

}