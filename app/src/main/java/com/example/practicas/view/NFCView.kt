package com.example.practicas.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.practicas.components.MainIconButton
import com.example.practicas.components.TitleBar
import com.example.practicas.R
import com.example.practicas.components.Imagenes

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NFCView(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("NFC") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Blue
                )
                ,navigationIcon= {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.navigate("Home")
                    }
                }
            )
        }
    ){
        ContentNFCView(navController)
    }
}

@Composable
fun ContentNFCView(navController: NavController){
    Column (verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()){

        Row (
            modifier = Modifier
                .padding(70.dp)
                .fillMaxWidth()) {}

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

        Row (modifier = Modifier.padding(30.dp)) {
            OutlinedButton(onClick = {
                val id = 5
                navController.navigate("SplEnd/${id}")
            }, shape = RectangleShape,
                modifier = Modifier.background(color = Color.Magenta)) {
                Imagenes(R.drawable.vk)
            }
        }

        Row (modifier = Modifier.padding(10.dp)) {
            OutlinedButton(onClick = {
                val id = 6
                navController.navigate("SplEnd/${id}")
            }, shape = RectangleShape,
                modifier = Modifier.background(color = Color.Red)) {
                Imagenes(R.drawable.sf)
            }
        }

        Row (modifier = Modifier.padding(10.dp)) {
            OutlinedButton(onClick = {
                val id = 7
                navController.navigate("SplEnd/${id}")
            }, shape = RectangleShape,
                modifier = Modifier.background(color = Color.Green)) {
                Imagenes(R.drawable.gb)
            }
        }

        Row (modifier = Modifier.padding(10.dp)) {
            OutlinedButton(onClick = {
                val id = 8
                navController.navigate("SplEnd/${id}")
            }, shape = RectangleShape,
                modifier = Modifier.background(color = Color.Blue)){
                Imagenes(R.drawable.cwb)
            }
        }
    }
}
