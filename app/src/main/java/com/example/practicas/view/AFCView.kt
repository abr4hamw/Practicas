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
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.input.pointer.PointerEvent
import androidx.compose.ui.input.pointer.PointerEventType
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

        Row (modifier = Modifier.padding(30.dp)) {
            OutlinedButton(onClick = {
                val id = 1
                navController.navigate("SplEnd/${id}")
            }, shape = RectangleShape,
                modifier = Modifier.background(color = Color.Blue)) {
                Imagenes(R.drawable.chargers)
            }
        }

        Row (modifier = Modifier.padding(10.dp)) {
            OutlinedButton(onClick = {
                val id = 2
                navController.navigate("SplEnd/${id}")
            }, shape = RectangleShape,
                modifier = Modifier.background(color = Color.Magenta)) {
                Imagenes(R.drawable.ravens)
            }
        }

        Row (modifier = Modifier.padding(10.dp)) {
            OutlinedButton(onClick = {
                val id = 3
                navController.navigate("SplEnd/${id}")
            }, shape = RectangleShape,
                modifier = Modifier.background(color = Color.Black)) {
                Imagenes(R.drawable.steelers)
            }
        }

        Row (modifier = Modifier.padding(10.dp)) {
            OutlinedButton(onClick = {
                val id = 4
                navController.navigate("SplEnd/${id}")
            }, shape = RectangleShape,
                modifier = Modifier.background(color = Color.Red)){
                Imagenes(R.drawable.ck)
            }
        }
    }
}

