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
fun KCView(navController: NavController){
    scafll(navController,"Chiefs",Color.Red, "AFC",{ContentKCView(it)})
}

@Composable
fun ContentKCView(navController: NavController){

    Column (
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ){
        Space(80)

        R2(R.drawable.chiefss, "Kansas City")

        RC("Año: ", "1960")

        RC("División: ", "Oeste")

        RC("Estadio: ", "Arrowhead ")

        Space(20)

        Ro("Touch Downs", 1)

        Ro("Priest holms", 2)

        Ro("83", 2)
    }
}