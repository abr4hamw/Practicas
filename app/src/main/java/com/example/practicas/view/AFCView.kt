package com.example.practicas.view

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.practicas.components.MainIconButton
import com.example.practicas.components.TitleBar
import com.example.practicas.R
import com.example.practicas.components.equipos

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AFCView(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("AFC") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Red
                )
                ,navigationIcon= {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.navigate("Home")
                    }
                }
            )
        }
    ){
        ContentAFCView(navController)
    }
}

@Composable
fun ContentAFCView(navController: NavController){
    Column (verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()){

        Row (
            modifier = Modifier//.background(color = Color.Red)
                .padding(70.dp)
                .fillMaxWidth())
        {}

        Row (modifier = Modifier.fillMaxWidth()
            .background(color = Color.Black),
            horizontalArrangement = Arrangement.Center){
            Text(
                "Teams",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }

        equipos(navController,1,Color.Blue,R.drawable.chargers)

        equipos(navController,2,Color.Magenta,R.drawable.ravens)

        equipos(navController,3,Color.Black,R.drawable.steelers)

        equipos(navController,4,Color.Red,R.drawable.ck)

    }
}

