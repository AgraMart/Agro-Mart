package com.example.agromart.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.RowScopeInstance.align
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.agromart.R
import com.example.agromart.ui.theme.Green


@Composable
fun BuyingScreen(modifier: Modifier, navHostController: NavHostController) {
    Column(
        modifier = Modifier.padding(20.dp).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.box),
            contentDescription = "Box",
            modifier = Modifier
                .height(130.dp)
                .padding(20.dp, 10.dp)
                .width(130.dp),
            alignment = Alignment.Center
        );

        Spacer(modifier = Modifier.height(10.dp));

        Text(
            text = "Product",
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        );

        Spacer(modifier = Modifier.height(30.dp));

        Text(
            text = "Product Description",
            fontSize = 15.sp,
            textAlign = TextAlign.Center
        );

        Spacer(modifier = Modifier.height(30.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(
                text = "Quantity",
                fontSize = 15.sp,
                textAlign = TextAlign.Left
            );
            Row(verticalAlignment = Alignment.CenterVertically) {
                var count by remember { mutableStateOf(500) }

                Image(
                    painter = painterResource(id = R.drawable.plus),
                    contentDescription = "plus",
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp)
                        .padding(2.dp, 2.dp)
                        .clickable { count++ }
                    //                    .align(alignment = Alignment.End),

                );

                Text(
                    text = "$count",
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center
                );

                Image(
                    painter = painterResource(id = R.drawable.minus),
                    contentDescription = "minus",
                    modifier = Modifier
                        .height(27.dp)
                        .width(27.dp)
                        .padding(2.dp, 2.dp)
                        .clickable { count--}
                    //                    .align(alignment = Alignment.End)

                );
            }
        }

        Spacer(modifier = Modifier.height(20.dp));

        Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {

            Text(
                text = "Price",
                fontSize = 15.sp,
                textAlign = TextAlign.Left
            );
            Text(text = "Total Price ")

        }

        Spacer(modifier = Modifier.height(40.dp));

        Button(
            onClick = {

            },
            shape = RoundedCornerShape(50.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Green)
        ) {
            Text( text = "Continue" )
        }

    }

}
