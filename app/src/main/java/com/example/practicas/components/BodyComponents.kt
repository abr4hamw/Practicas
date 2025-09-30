package com.example.practicas.components

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextView(texto: String){
    Text(
        texto,
        fontSize = 40.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
    )
}

@Composable
fun Space(espacio:Int){
    Spacer(modifier = Modifier.padding(espacio.dp))
}

@Composable
fun MainButton(name: String,backColor: Color, color: Color, onClick:()-> Unit){
    Button(onClick=onClick,
        colors = ButtonDefaults.buttonColors(
            contentColor = color,
            containerColor = backColor
        )){
        Text(name)
    }
}

@Composable
fun Imagenes(id: Int){
    Image(
        painter = painterResource(id),
        contentDescription = "",
        modifier = Modifier.size(width= 280.dp, height = 130.dp)
    )
}

@Composable
fun ImagenPrincipal(id: Int){
    Image(
        painter = painterResource(id),
        contentDescription = ""
    )
}

@Composable
fun TextB(texto: String){
    Text(
        texto,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Composable
fun TextNB(texto: String){
    Text(
        texto,
        fontSize = 30.sp,
        textAlign = TextAlign.Center
    )
}

@Composable
fun RC(t1: String, t2: String){
    Row (
        modifier = Modifier.padding(10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ){
        Column {
            TextB(t1)
        }
        Space(10)
        Column {
            TextNB(t2)
        }
    }
}

@Composable
fun Ro(t1: String, id: Int){
    Row (
        modifier = Modifier.padding(10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ){
        if(id == 1) TextB(t1) else TextNB(t1)
    }
}