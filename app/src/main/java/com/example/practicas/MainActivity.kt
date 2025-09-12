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

var res = ""//by remember { mutableStateOf("") }
var txtoH = ""
var n1 = 0.0f
var n2 = 0.0f
var isOper = 0
var queOper = ""

var queOper2 = ""
var res1 = 0.0f

@Composable
fun calculadora(){
    var txto by remember { mutableStateOf("") }
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
                OutlinedButton( onClick = {
                    txto += "7";
                    txtoH += "7"
                },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("7")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {
                    txto += "8";
                    txtoH += "8"
                },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("8")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {
                    txto += "9";
                    txtoH += "9"
                },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("9")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {
                    isOper++
                    if(n1 == 0.0f) {
                        n1 = txto.toFloat();
                        queOper = "div"
                        txtoH = ""
                    }
                    else {
                        queOper2 = "div"
                        operacion(queOper)
                    }
                    txto += "/";
                },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)){
                    diseño("/")
                }
            }
        }
        Spacer(modifier = Modifier.padding(5.dp))//

        Row {
            Column {
                OutlinedButton( onClick = {
                    txto += "4";
                    txtoH += "4"
                },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("4")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {
                    txto += "5";
                    txtoH += "5"
                },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("5")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {
                    txto += "6";
                    txtoH += "6"
                },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("6")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {
                    isOper++
                    if(n1 == 0.0f) {
                        n1 = txto.toFloat();
                        queOper = "mul"
                        txtoH = ""
                    }
                    else {
                        queOper2 = "mul"
                        operacion(queOper)
                    }
                    txto += "x";
                },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)){
                    diseño("x")
                }
            }
        }
        Spacer(modifier = Modifier.padding(5.dp))//

        Row {
            Column {
                OutlinedButton( onClick = {
                    txto += "1";
                    txtoH += "1"
                },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("1")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {
                    txto += "2";
                    txtoH += "2"
                },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("2")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {
                    txto += "3";
                    txtoH += "3"
                },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("3")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {
                    isOper++
                    if(n1 == 0.0f) {
                        n1 = txto.toFloat();
                        queOper = "res"
                        txtoH = ""
                    }
                    else {
                        queOper2 = "res"
                        operacion(queOper)
                    }
                    txto += "-";
                },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)){
                    diseño("-")
                }
            }
        }
        Spacer(modifier = Modifier.padding(5.dp))//

        Row {
            Column {
                OutlinedButton( onClick = {
                    txto += "0";
                    txtoH += "0"
                },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño("0")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {
                    txto += ".";
                    txtoH += "."
                },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)){
                    diseño(".")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton( onClick = {
                    isOper++
                    if(n1 == 0.0f) {
                        n1 = txto.toFloat();
                        queOper = "sum"
                        txtoH = ""
                    }
                    else {
                        queOper2 = "sum"
                        operacion(queOper)
                    }
                    txto += "+";
                },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)){
                    diseño("+")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column {
                OutlinedButton(
                    onClick = {
                        n2 = txtoH.toFloat()
                        when(queOper){
                            "div" -> res1 = n1 / n2
                            "mul" -> res1 = n1 * n2
                            "res" -> res1 = n1-n2
                            "sum" -> res1 = n1+n2
                        }
                        res = res1.toString()
                        txto = "";
                        txtoH = ""
                        n1 = 0.0f
                        n2 = 0.0f
                        isOper = 0
                        queOper = ""
                        res1 = 0.0f
                        queOper2 = ""
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)
                ) {
                    diseño("=")
                }
            }
        }
        Spacer(modifier = Modifier.padding(5.dp))//

        Row {
            Column {
                OutlinedButton( onClick = {
                    txto = "";
                    txtoH = ""
                    n1 = 0.0f
                    n2 = 0.0f
                    isOper = 0
                    queOper = ""
                    res1 = 0.0f
                    res = ""
                    queOper2 = ""
                },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Red)){
                    diseño("AC")
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

fun operacion(tipo: String){
    /*if(isOper == 1){
        txtoH = ""
        queOper = tipo
        isOper ++
    }*/
    if (isOper == 2){
        n2 = txtoH.toFloat()
        txtoH = ""//////////////
        when(queOper){
            "div" -> res1 = n1 / n2
            "mul" -> res1 = n1 * n2
            "res" -> res1 = n1-n2
            "sum" -> res1 = n1+n2
        }
        n1 = res1
        res = res1.toString()
        isOper = 1
        queOper = queOper2
    }
}
