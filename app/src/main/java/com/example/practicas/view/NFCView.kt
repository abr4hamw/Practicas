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
fun NFCView(navController: NavController){
    scafll(navController,"NFC",Color(0xFF12316A), "Home",{ContentNFCView(it)})
}

@Composable
fun ContentNFCView(navController: NavController){
    Column (verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()){

        Space(70)

        equipos(navController,5,Color(0xFF582A84),R.drawable.vk)

        equipos(navController,6,Color(0xFFC70100),R.drawable.sf)

        equipos(navController,7,Color(0xFF203933),R.drawable.gb)

        equipos(navController,8,Color(0xFFFFFFFF),R.drawable.cowb)

    }
}
