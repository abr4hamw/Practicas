package com.example.practicas.components

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun equipos(navController: NavController, id: Int, color: Color, imagen: Int){
    Row (modifier = Modifier.padding(20.dp)) {
        OutlinedButton(onClick = {
            val id = id
            navController.navigate("SplEnd/${id}")
        }, shape = RectangleShape,
            modifier = Modifier.background(color = color)) {
            Imagenes(imagen)
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun scafll(navController: NavController, nombre: String, color: Color,ruta: String, funci: @Composable (NavController) -> Unit){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar(nombre) },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = color
                )
                ,navigationIcon= {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.navigate(ruta)
                    }
                }
            )
        }
    ){
        funci(navController)
    }
}
@Composable
fun R2(id: Int, texto: String){
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ){
        ImagenPrincipal(id)
    }

    Row (
        modifier = Modifier.padding(40.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ){
        TextView(texto)
    }
}