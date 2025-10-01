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
import com.example.practicas.components.Space
import com.example.practicas.components.equipos
import com.example.practicas.components.scafll

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AFCView(navController: NavController){
    scafll(navController,"AFC",Color(0xFFD0202D), "Home",{ContentAFCView(it)})
}

@Composable
fun ContentAFCView(navController: NavController){
    Column (verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()){

        Space(70)

        equipos(navController,1,Color(0xFF0972CE),R.drawable.chargers)

        equipos(navController,2,Color(0xFF2C2E81),R.drawable.ravens)

        equipos(navController,3,Color(0xFF141414),R.drawable.steelers)

        equipos(navController,4,Color(0xFFCF152D),R.drawable.ck)

    }
}

