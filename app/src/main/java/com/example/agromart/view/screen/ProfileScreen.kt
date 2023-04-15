package com.example.agromart.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.agromart.R
import com.example.agromart.ui.theme.Green
import com.example.agromart.view.component.AgroMartTextField
import com.example.agromart.viewmodel.ProfileViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    modifier: Modifier,
    navHostController: NavHostController,
    viewModel: ProfileViewModel = hiltViewModel()
) {
    val userRequest by viewModel.userDetailRequest.collectAsState()
    Scaffold(topBar = {
        TopAppBar(
            title = {
                Text(
                    text = "Profile",
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
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(it),
        ) {
            AgroMartTextField(
                userRequest.name,
                modifier, placeHolderText = "Name"
            ) { viewModel.onUserRequestChanged(userRequest.copy(name = it)) }
            AgroMartTextField(
                userRequest.phone,
                modifier, placeHolderText = "Phone"
            ) { viewModel.onUserRequestChanged(userRequest.copy(phone = it)) }
            AgroMartTextField(
                userRequest.aadhar,
                modifier, placeHolderText = "Aadhar Number"
            ) { viewModel.onUserRequestChanged(userRequest.copy(aadhar = it)) }
            AgroMartTextField(
                userRequest.dob,
                modifier, placeHolderText = "DOB"
            ) { viewModel.onUserRequestChanged(userRequest.copy(dob = it)) }
            AgroMartTextField(
                userRequest.userType,
                modifier, placeHolderText = "UserType"
            ) { viewModel.onUserRequestChanged(userRequest.copy(userType = it)) }
            Button(
                onClick = { viewModel.editData() }, modifier = modifier
                    .fillMaxWidth()
                    .padding(20.dp), colors = ButtonDefaults.buttonColors(containerColor = Green)
            ) {
                Text(text = "Update Data")
            }
        }
    }
}