package com.example.practicas

import android.os.Bundle
import android.os.TestLooperManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicas.ui.theme.PracticasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticasTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Aver()
                }
            }
        }
    }
}

var res = 0.0f
@Composable
fun Aver(){
    var income by remember { mutableStateOf("") }
    var isr by remember { mutableStateOf("") }
    var neto by remember { mutableStateOf("") }

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Row {
            Image(
                painter = painterResource(id = R.drawable.sat),
                contentDescription = null,
            )
        }
        Spacer(modifier = Modifier.padding(20.dp))

        Row {
            OutlinedTextField(
                value = income,
                placeholder = {Text("INCOMES", fontSize = 25.sp, color = Color.White)},
                onValueChange ={income=it},
                textStyle = TextStyle(fontSize = 25.sp, color = Color.Green, textAlign = TextAlign.Center),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Black,
                    focusedContainerColor = Color.Black
                )
            )
        }
        Spacer(modifier = Modifier.padding(20.dp))

        Row {
            OutlinedButton(onClick = {
                limite(income)
                isr = res.toString()
                neto = (income.toFloat() - res).toString()
            },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
            ) {
                Spacer(modifier = Modifier.padding(25.dp))
                Image(
                    painter = painterResource(R.drawable.buton),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.padding(25.dp))
            }
        }
        Spacer(modifier = Modifier.padding(20.dp))

        Row {
            OutlinedTextField(
                value = isr,
                onValueChange = {isr=it},
                readOnly = true,
                placeholder = {Text("ISR", fontSize = 25.sp, color = Color.White)},
                textStyle = TextStyle(fontSize = 25.sp, color = Color.Red, textAlign = TextAlign.Center),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Black,
                    focusedContainerColor = Color.Black
                )
            )
        }
        Spacer(modifier = Modifier.padding(20.dp))

        Row {
            OutlinedTextField(
                value = neto,
                onValueChange = {neto=it},
                readOnly = true,
                placeholder = {Text("NET", fontSize = 25.sp, color = Color.White)},
                textStyle = TextStyle(fontSize = 25.sp, color = Color.Yellow, textAlign = TextAlign.Center),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Black,
                    focusedContainerColor = Color.Black
                )
            )
        }
    }
}

fun limite(income: String){
    var inc = income.toFloat()
    var Linf = 0.0f
    var por = 0.0f
    var cuo = 0.0f
    if(inc < 368.11) {
        Linf = 0.01f
        por = 0.0192f
        cuo = 0.0f
        calcular(inc,Linf,por,cuo)
    }
    else if (inc > 368.1 && inc < 3124.36){
        Linf = 368.11f
        por = 0.064f
        cuo = 7.05f
        calcular(inc,Linf,por,cuo)
    }
    else if (inc > 3124.35 && inc < 5490.76){
        Linf = 3124.36f
        por = 0.1088f
        cuo = 183.45f
        calcular(inc,Linf,por,cuo)
    }
    else if (inc > 5490.75 && inc < 6382.81){
        Linf = 5490.76f
        por = 0.16f
        cuo = 441.0f
        calcular(inc,Linf,por,cuo)
    }
    else if (inc > 6382.8 && inc < 7641.91){
        Linf = 6382.81f
        por = 0.1792f
        cuo = 583.65f
        calcular(inc,Linf,por,cuo)
    }
    else if (inc > 7641.9 && inc < 15412.81){
        Linf = 7641.91f
        por = 0.2136f
        cuo = 809.25f
        calcular(inc,Linf,por,cuo)
    }
    else if (inc > 15412.8 && inc < 24292.66){
        Linf = 15412.81f
        por = 0.2352f
        cuo = 2469.15f
        calcular(inc,Linf,por,cuo)
    }
    else if (inc > 24292.65 && inc < 46378.51){
        Linf = 24292.66f
        por = 0.30f
        cuo = 4557.75f
        calcular(inc,Linf,por,cuo)
    }
    else if (inc > 46378.5 && inc < 61838.11){
        Linf = 46378.51f
        por = 0.32f
        cuo = 11183.4f
        calcular(inc,Linf,por,cuo)
    }
    else if (inc > 61838.1 && inc < 185514.31){
        Linf = 61838.11f
        por = 0.34f
        cuo = 16130.55f
        calcular(inc,Linf,por,cuo)
    }
    else {//if(inc > 185514.3)
        Linf = 185514.31f
        por = 0.35f
        cuo = 58180.35f
        calcular(inc,Linf,por,cuo)
    }
}

fun calcular(income: Float, LIn: Float, Prc: Float, C: Float){
    res = ((income - LIn) * Prc) + C
}
