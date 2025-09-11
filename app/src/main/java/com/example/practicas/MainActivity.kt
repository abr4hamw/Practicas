package com.example.practicas

import android.os.Bundle
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
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
                placeholder = {Text("INCOMES", fontSize = 25.sp)},
                //keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
                onValueChange ={income=it}
            )
        }
        Spacer(modifier = Modifier.padding(20.dp))

        Row {
            OutlinedButton(onClick = {
                val inc = income.toInt()
                val issr = inc * 2;
                isr = issr.toString();
            },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
            ) {
                Spacer(modifier = Modifier.padding(2512.dp))
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
                placeholder = {Text("ISR", fontSize = 25.sp)}
            )
        }
        Spacer(modifier = Modifier.padding(20.dp))

        Row {
            OutlinedTextField(
                value = neto,
                onValueChange = {neto=it},
                readOnly = true,
                placeholder = {Text("NET", fontSize = 25.sp)}
            )
        }
    }
}