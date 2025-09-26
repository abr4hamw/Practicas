package com.example.practicas.onBoardViews

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.datastore.dataStore
import androidx.navigation.NavController
import com.example.practicas.R
import com.example.practicas.data.PageData
import com.example.practicas.dataStore.StoreBoarding
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import com.google.accompanist.pager.PagerState

@OptIn(ExperimentalPagerApi::class,
    ExperimentalFoundationApi::class)
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

    items.add(
        PageData(
            image=R.raw.snakeladder,
            titulo="Segunda Imagen",
            descripcion = "Esta es la segunda descripcion"
        )
    )
    items.add(
        PageData(
            image=R.raw.ninja,
            titulo = "Tercera imagen",
            descripcion = "Esta es la tercera imagen de la descripcion"
        )
    )
    val pagerState  = rememberPagerState(
        pageCount=items.size,
        initialOffscreenLimit =2,
        infiniteLoop=false,
        initialPage=0
    )
    OnBoardingPager(
        item=items,pagerState = pagerState,modifier= Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White),
        navController, store
    )

}