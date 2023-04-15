package com.example.agromart.view.screen

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CalendarToday
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.DatePicker
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.agromart.ui.theme.App_Gradient
import com.example.agromart.ui.theme.Green
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductDescriptionSellerScreenSecond(
    modifier: Modifier,
    navHostController: NavHostController
) {
    val datePickerState=rememberDatePickerState()
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
                        App_Gradient
                    )
                    .padding(30.dp)
                    .size(60.dp),
                tint = Color.White
            );
            Spacer(modifier = Modifier.height(15.dp));
            Text(
                text = "Product Description",
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(50.dp));
            OutlinedTextField(
                value = "",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Black,
                    focusedIndicatorColor = Green,
                    cursorColor = Green
                ),
                label = { Text("Product Name") }
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
                ),
                label = { Text("Quantity") }
            )
            var selectedDate by remember { mutableStateOf(LocalDate.now()) }
            OutlinedTextField(
                value = "",
                onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Black,
                    focusedIndicatorColor = Green,
                    cursorColor = Green
                ),
                label = { Text("MFD") },
                trailingIcon = {
                    IconButton(onClick = {
                        // Show the date picker dialog or open the calendar screen
                    }) {
                        Icon(
                            imageVector = Icons.Outlined.CalendarToday,
                            contentDescription = "Select a date"
                        )
                    }
                },
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
                ),
                label = { Text("Description") }
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
                ),
                label = { Text("Price (INR)") }
            )
        }
    }
}