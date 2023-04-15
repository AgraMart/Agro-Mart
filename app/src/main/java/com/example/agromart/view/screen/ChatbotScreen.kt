package com.example.agromart.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.agromart.R
import com.example.agromart.ui.theme.Dark_Green
import com.example.agromart.ui.theme.Green

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatbotScreen(modifier: Modifier, navHostController: NavHostController) {
    var senderMessage by remember {
        mutableStateOf("")
    }

    var map by remember {
        mutableStateOf(mutableMapOf<String, String>())
    }
    Scaffold(bottomBar = {
        Row(
            modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            TextField(
                value = senderMessage,
                onValueChange = {
                    senderMessage = it
                },
                modifier,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = Color.White,
                    unfocusedIndicatorColor = Color.White
                )
            )
            IconButton(onClick = {
                map["S"] = senderMessage
                senderMessage = ""
            }) {
                Icon(imageVector = Icons.Rounded.Send, contentDescription = null)
            }
        }
    }, topBar = {
        TopAppBar(
            title = {
                Text(
                    text = "Chatbot",
                    color = Color.Black,
                    style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
                )

            },
            navigationIcon = {
                IconButton(onClick = { navHostController.popBackStack() }) {
                    Icon(
                        imageVector = Icons.Rounded.ArrowBack,
                        contentDescription = null
                    )
                }
            })
    }) {
        Box {

            LazyColumn(modifier.padding(it)) {
                items(5) {

                        sendView("fvfgbdb")
                        recieveView("vfdbgbfvx")
                }
            }
        }
    }
}

@Composable
fun sendView(message: String) {
    Spacer(modifier = Modifier.height(20.dp))
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
        Card(
            shape = RoundedCornerShape(
                bottomEnd = 0.dp, topStart = 20.dp, topEnd = 20.dp, bottomStart = 20.dp
            ),
            modifier = Modifier.padding(end = 10.dp),
            colors = CardDefaults.cardColors(containerColor = Green, contentColor = Color.White)
        ) {
            Text(
                text = message, modifier = Modifier
                    .padding(20.dp)
            )
        }
    }
}

@Composable
fun recieveView(message: String) {
    Spacer(modifier = Modifier.height(20.dp))
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
        Card(
            shape = RoundedCornerShape(
                bottomEnd = 20.dp, topStart = 20.dp, topEnd = 20.dp, bottomStart = 0.dp
            ),
            modifier = Modifier.padding(start = 10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Dark_Green,
                contentColor = Color.White
            )
        ) {
            Text(
                text = message, modifier = Modifier
                    .padding(20.dp)
            )
        }
    }
}