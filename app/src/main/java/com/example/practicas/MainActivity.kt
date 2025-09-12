package com.example.practicas

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Label
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
import androidx.compose.ui.text.TextStyle
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
                    calculadora()
                }
            }
        }
    }
}

@Composable
fun calculadora(){
    var txto by remember { mutableStateOf("") }
    var res by remember { mutableStateOf("") }
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.padding(60.dp))
        Row {
            OutlinedTextField(
                value = txto,
                onValueChange = {txto=it},
                readOnly = true,
                placeholder = {Text("0.0", fontSize = 35.sp)},
                modifier = Modifier.fillMaxWidth().height(70.dp),
                textStyle = TextStyle( fontSize = 35.sp, textAlign = TextAlign.Right)
            )
        }
        Row {
            OutlinedTextField(
                value = res,
                onValueChange = {res=it},
                readOnly = true,
                placeholder = {Text("Thinking", fontSize = 35.sp)},
                modifier = Modifier.fillMaxWidth().height(70.dp),
                textStyle = TextStyle( fontSize = 35.sp, textAlign = TextAlign.Right)
            )
        }
        Spacer(modifier = Modifier.padding(30.dp))

        Row {
            Column {
                OutlinedButton( onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("7")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("8")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("9")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)){
                    diseño("/")
                }
            }
        }
        Spacer(modifier = Modifier.padding(5.dp))//

        Row {
            Column {
                OutlinedButton( onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("4")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("5")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("6")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)){
                    diseño("x")
                }
            }
        }
        Spacer(modifier = Modifier.padding(5.dp))//

        Row {
            Column {
                OutlinedButton( onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("1")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("2")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("3")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)){
                    diseño("-")
                }
            }
        }
        Spacer(modifier = Modifier.padding(5.dp))//

        Row {
            Column {
                OutlinedButton( onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("0")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño(".")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)){
                    diseño("D")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)){
                    diseño("+")
                }
            }
        }
        Spacer(modifier = Modifier.padding(5.dp))//

        Row {
            Column {
                OutlinedButton( onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Red)){
                    diseño("AC")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)
                ) {
                    diseño("=")
                }
            }
        }
    }
}

@Composable
fun diseño(numero: String){
    Text(
        text = numero,
        fontSize = 55.sp,
        color = Color.White
    )
}
