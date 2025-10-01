package com.example.practicas.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.practicas.R
import com.example.practicas.components.R2
import com.example.practicas.components.RC
import com.example.practicas.components.Ro
import com.example.practicas.components.Space
import com.example.practicas.components.scafll

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun GBView(navController: NavController){
    scafll(navController,"Green Bay",Color(0xFF203933), "NFC",{ContentGBView(it)})
}

@Composable
fun ContentGBView(navController: NavController){

    Column (
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ){
        Space(80)

        R2(R.drawable.gbs, "Wisconsin")

        RC("Año: ", "1919")

        RC("División: ", "Norte")

        RC("Estadio: ", "Lambeau Field")

        Space(20)

        Ro("Touch Downs", 1)

        Ro("Don Hutson", 2)

        Ro("105", 2)
    }
}