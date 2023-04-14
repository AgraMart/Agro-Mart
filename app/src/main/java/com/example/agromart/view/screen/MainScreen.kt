package com.example.agromart.view.screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.Warning
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.agromart.R
import com.example.agromart.ui.theme.Dark_Green
import com.example.agromart.ui.theme.Golden
import com.example.agromart.viewmodel.HomeViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    modifier: Modifier,
    navHostController: NavHostController,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val weather by viewModel.weather.collectAsState()
    LaunchedEffect(weather) {
        viewModel.fetchWeather(57f, 64f)
    }
    Scaffold(topBar = {
        TopAppBar(title = { }, navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.round_dashboard_24),
                    tint = com.example.agromart.ui.theme.Green,
                    contentDescription = null
                )
            }
        }, actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Rounded.Settings, tint = Color.LightGray, contentDescription = null)
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Rounded.Notifications, tint = Golden, contentDescription = null)
            }
        })
    }) {
        Box(contentAlignment = Alignment.Center) {
            Box(
                modifier = modifier
                    .clip(RoundedCornerShape(topEnd = 20.dp))
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(com.example.agromart.ui.theme.Green, Dark_Green),
                        )
                    )
                    .height(300.dp)
                    .width(170.dp)
                    .align(Alignment.BottomStart)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Temp",
                        style = MaterialTheme.typography.titleLarge.copy(color = Color.White)
                    )
                    Text(
                        text = weather.data.temperature.toInt().toString(),
                        style = MaterialTheme.typography.displayLarge.copy(color = Color.White)
                    )
                }
            }
            Box(
                modifier = modifier
                    .clip(RoundedCornerShape(topStart = 20.dp))
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(com.example.agromart.ui.theme.Green, Dark_Green),
                        )
                    )
                    .height(300.dp)
                    .width(170.dp)
                    .align(Alignment.BottomEnd)
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center
                ){
                    Text(
                        text = "Wind",
                        style = MaterialTheme.typography.titleLarge.copy(color = Color.White)
                    )
                    Text(
                        text = weather.data.windspeed.toInt().toString(),
                        style = MaterialTheme.typography.displayLarge.copy(color = Color.White)
                    )
                }
            }
            Canvas(modifier = modifier.fillMaxSize()) {
                val canvasWidth = size.width
                val canvasHeight = size.height
                drawLine(
                    start = Offset(x = canvasWidth / 2, y = (canvasHeight / 2).minus(240)),
                    end = Offset(x = canvasWidth / 2, y = canvasHeight),
                    brush = Brush.linearGradient(
                        colors = listOf(com.example.agromart.ui.theme.Green, Dark_Green),
                        tileMode = TileMode.Decal
                    ),
                    strokeWidth = 40F
                )
            }
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier
                    .padding(it)
                    .fillMaxSize()
                    .offset(0.dp, -180.dp),
                horizontalArrangement = Arrangement.Center,
                verticalArrangement = Arrangement.Center
            ) {
                item {
                    Card(
                        shape = RoundedCornerShape(topEnd = 60.dp, bottomStart = 60.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
                        modifier = modifier
                            .height(180.dp)
                            .padding(end = 1.dp, start = 20.dp, bottom = 1.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = modifier.fillMaxSize()
                        ) {
                            Image(
                                painterResource(id = R.drawable.wheat),
                                contentDescription = null,
                                modifier.size(100.dp)
                            )
                            Text(text = "My Farm", style = MaterialTheme.typography.titleMedium)
                        }
                    }
                }
                item {
                    Card(
                        shape = RoundedCornerShape(topStart = 60.dp, bottomEnd = 60.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        modifier = modifier
                            .height(180.dp)
                            .padding(end = 20.dp, start = 1.dp, bottom = 1.dp),
                        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = modifier.fillMaxSize()
                        ) {
                            Image(
                                Icons.Rounded.Warning,
                                contentDescription = null,
                                modifier.size(100.dp)
                            )
                            Text(text = "My Farm", style = MaterialTheme.typography.titleLarge)
                        }
                    }
                }
                item {
                    Card(
                        shape = RoundedCornerShape(bottomEnd = 60.dp, topStart = 60.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        modifier = modifier
                            .height(180.dp)
                            .padding(start = 20.dp, end = 1.dp, top = 1.dp),
                        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = modifier.fillMaxSize()
                        ) {
                            Icon(
                                Icons.Rounded.Warning,
                                contentDescription = null,
                                modifier.size(100.dp)
                            )
                            Text(text = "My Farm", style = MaterialTheme.typography.titleLarge)
                        }
                    }
                }
                item {
                    Card(
                        shape = RoundedCornerShape(topEnd = 60.dp, bottomStart = 60.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        modifier = modifier
                            .height(180.dp)
                            .padding(end = 20.dp, start = 1.dp, top = 1.dp),
                        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = modifier.fillMaxSize()
                        ) {
                            Icon(
                                Icons.Rounded.Warning,
                                contentDescription = null,
                                modifier.size(100.dp)
                            )
                            Text(text = "My Farm", style = MaterialTheme.typography.titleLarge)
                        }
                    }
                }
            }
            Box(
                modifier
                    .offset(y = (-150).dp)
                    .clip(CircleShape)
                    .background(Golden)
                    .size(50.dp)
            )
        }
    }
}