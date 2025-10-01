package com.example.practicas.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
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
import com.example.practicas.R


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView(navController: NavController){
    Scaffold{
        ContentHomeView(navController)
    }
}
@Composable
fun ContentHomeView(navController: NavController){
    val id=10;
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (modifier = Modifier.background(color = Color(0xFFD0202D))
            .padding(50.dp)
            .fillMaxWidth()){ }

        Row (modifier = Modifier.background(color = Color(0xFFD0202D))){
            val id = 1
            OutlinedButton(onClick = {
                navController.navigate("SplIn/${id}")//"AFC")
            }, shape = RectangleShape){
                Image(
                    painter = painterResource(id= R.drawable.afc),
                    contentDescription = ""
                )
            }
        }

        Row (
            modifier = Modifier.background(color = Color(0xFFD0202D))
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center){
            Image(
                painter = painterResource(id= R.drawable.flecha),
                contentDescription = ""
            )
        }

        Row (modifier = Modifier//.padding(5.dp)
            .background(color = Color.White)
            .fillMaxWidth()){
            Text(
                "Choose your Conference",
                fontSize = 40.sp,
                textAlign = TextAlign.Center,
                color = Color.Black,
                lineHeight = 50.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Row (
            modifier = Modifier.background(color = Color(0xFF12316A))
                .fillMaxWidth()
                .padding(5.dp),
            horizontalArrangement = Arrangement.Center){
            Image(
                painter = painterResource(id= R.drawable.flecha2),
                contentDescription = ""
            )
        }

        Row (modifier = Modifier.background(color = Color(0xFF12316A))
            .padding(10.dp)){
            val id = 2
            OutlinedButton(onClick = {
                navController.navigate("SplIn/${id}")//"NFC")
            }, shape = RectangleShape) {
                Image(
                    painter = painterResource(id= R.drawable.nfc),
                    contentDescription = ""
                )
            }
        }

        Row (modifier = Modifier.background(color = Color(0xFF12316A))
            .padding(55.dp)
            .fillMaxWidth()){ }
    }
}