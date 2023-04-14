package com.example.agromart.view.component

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.agromart.ui.theme.Green

@Composable
fun AgroMartTextField() {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = Color.Transparent,
            focusedContainerColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Black,
            focusedIndicatorColor = Green,
            cursorColor = Green
        )
    )
}