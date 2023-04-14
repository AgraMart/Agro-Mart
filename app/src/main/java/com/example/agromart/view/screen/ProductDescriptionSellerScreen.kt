package com.example.agromart.view.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.agromart.ui.theme.Dark_Green
import com.example.agromart.ui.theme.Green

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductDescriptionSellerScreen(modifier: Modifier, navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(title = { /*TODO*/ }, navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Rounded.ArrowBack, contentDescription = "Back")
            }
        })
    }) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .padding(it)
                .fillMaxSize()
        ) {
            Icon(
                imageVector = Icons.Rounded.Person,
                contentDescription = "Image",
                modifier
                    .clip(CircleShape)
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(com.example.agromart.ui.theme.Green, Dark_Green),
                        )
                    )
                    .padding(30.dp)
                    .size(60.dp),
                tint = Color.White
            )
            Text(text = "MFD")
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
    }
}