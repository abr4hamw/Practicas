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
fun SteelersView(navController: NavController){
    scafll(navController,"Steelers",Color.Black, "AFC",{ContentSteelersView(it)})
}

@Composable
fun ContentSteelersView(navController: NavController){

    Column (
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ){
        Space(80)

        R2(R.drawable.steelerss, "Pittsburgh")

        RC("Año: ", "1933")

        RC("División: ", "Norte")

        RC("Estadio: ", "Acrisure")

        Space(20)

        Ro("Touch Downs", 1)

        Ro("Franco Harris", 2)

        Ro("100", 2)
    }
}