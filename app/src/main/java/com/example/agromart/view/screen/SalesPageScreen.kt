package com.example.agromart.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Create
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.agromart.R
import com.example.agromart.navigation.AgroMartScreen
import com.example.agromart.ui.theme.App_Gradient
import com.example.agromart.view.component.AgroItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SalesPageScreen(modifier: Modifier, navHostController: NavHostController) {
    Scaffold(topBar = {
        TopAppBar(
            title = {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.sales),
                        contentDescription = null,
                        modifier
                            .scale(2f)
                            .size(15.dp)
                    )
                    Spacer(modifier = modifier.width(20.dp))
                    Text(
                        text = "Sales Log",
                        color = Color.Black,
                        style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
                    )
                }
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
        LazyColumn(modifier.padding(it)) {
            items(5) {
                SalesPageCard { navHostController.navigate(AgroMartScreen.SALES_PAGE_CARD.name) }
            }
        }
    }
}

@Composable
fun SalesPageCard(onPlaceClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.sprout),
                contentDescription = null,
                modifier = Modifier
                    .scale(0.2f)
                    .size(150.dp)
            )
            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 20.dp)
                ) {
                    Text(
                        "Seed",
                        style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.SemiBold)
                    )
                }
                Row {
                    Column {
                        Text("Quantity")
                        Text("120")
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text("Price")
                        Text("120")
                    }
                }
            }
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp, 5.dp))

        {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically)
                {
                    Text("Customer Name : ")
                    Text("")
                }
                Row(verticalAlignment = Alignment.CenterVertically)
                {
                    Text("Date of Sale : ")
                    Text("")
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SalesPageScreenPreview(){
    SalesPageScreen(Modifier, rememberNavController())
}

