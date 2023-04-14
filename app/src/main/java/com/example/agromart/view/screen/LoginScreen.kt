package com.example.agromart.view.screen

import android.icu.text.CaseMap.Title
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.agromart.ui.theme.Green
import com.example.agromart.view.component.AgroMartTextField


@RequiresApi(Build.VERSION_CODES.Q)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val username = remember { mutableStateOf(TextFieldValue()) }
        val password = remember { mutableStateOf(TextFieldValue()) }
        var isdialog by remember { mutableStateOf(false) }

        Text(
            text = "Login", style = TextStyle(
                fontSize = 40.sp
            )
        )

        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            label = { Text(text = "Enter Phone Number") },
            value = username.value,
            onValueChange = { username.value = it })

        Spacer(modifier = Modifier.height(20.dp))
        /*TextField(
            label = { Text(text = "Enter OTP") },
            value = password.value,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            onValueChange = { password.value = it })*/

        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            Button(
                onClick = {
                    isdialog = true
                },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(text = "Get OTP")
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        if (isdialog) {
            AlertDialog(
                onDismissRequest = { /*TODO*/ },
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .align(CenterHorizontally)
                    .background(color = Color.White)
                    .padding(10.dp)
            ) {
                Column(modifier = Modifier.background(color = Color.White), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Enter the OTP",
                        modifier=Modifier
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(text = "OTP sent to your mobile no.")
                    Spacer(modifier = Modifier.height(20.dp))
                    AgroMartTextField()
                }


            }


        }
    }

    /*ClickableText(
        text = AnnotatedString("Forgot password?"),
        onClick = { },
        style = TextStyle(
            fontSize = 14.sp,
            fontFamily = androidx.compose.ui.text.font.FontFamily.Default
        )
    )*/
}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}