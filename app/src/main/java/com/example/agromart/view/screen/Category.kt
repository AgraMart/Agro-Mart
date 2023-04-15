package com.example.agromart.view.screen

import android.widget.TextView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.agromart.R
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun Category(){
    Column(
        modifier = Modifier.padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Choose Category ...",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(0.dp, 10.dp)
        )

        Spacer(modifier = Modifier.height(50.dp));

        Row {

            Box(modifier = Modifier.height(80.dp).width(80.dp).padding(5.dp).background(Color.LightGray, shape = RoundedCornerShape(10.dp)).padding(0.dp, 5.dp)) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
//                    Image(
//                        painter = painterResource(id = R.drawable.seeds),
//                        contentDescription = "Seeds",
//                        modifier = Modifier
//                            .clip(CircleShape)
//                            .height(50.dp)
//                            .padding(20.dp, 1.dp)
//                            .width(50.dp),
//                        alignment = Alignment.Center
//                    );
                    Text(
                        text = "Seeds",
                        fontSize = 10.sp,
                        textAlign = TextAlign.Center
                    )
                }

            }

            Box (modifier = Modifier.height(80.dp).width(80.dp).padding(5.dp).background(Color.LightGray, shape = RoundedCornerShape(10.dp)).padding(5.dp, 0.dp)){

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
//                    Image(
//                        painter = painterResource(id = R.drawable.fertilizers),
//                        contentDescription = "Fertilizers",
//                        modifier = Modifier
//                            .clip(CircleShape)
//                            .height(50.dp)
//                            .padding(20.dp, 1.dp)
//                            .width(50.dp),
//                        alignment = Alignment.Center
//                    );
                    Text(
                        text = "Fertilizers",
                        fontSize = 10.sp,
                        textAlign = TextAlign.Center
                    )
                }

            }

        }

        Spacer(modifier = Modifier.height(40.dp));

        Row {

            Box(modifier = Modifier.height(80.dp).width(80.dp).padding(5.dp).background(Color.LightGray, shape = RoundedCornerShape(10.dp))) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
//                    Image(
//                        painter = painterResource(id = R.drawable.tools),
//                        contentDescription = "Tools",
//                        modifier = Modifier
//                            .clip(CircleShape)
//                            .height(50.dp)
//                            .padding(20.dp, 1.dp)
//                            .width(50.dp),
//                        alignment = Alignment.Center
//                    );
                    Text(
                        text = "Tools",
                        fontSize = 10.sp,
                        textAlign = TextAlign.Center
                    )
                }

            }

            Box(modifier = Modifier.height(80.dp).width(80.dp).padding(5.dp).background(Color.LightGray, shape = RoundedCornerShape(10.dp)).padding(5.dp, 0.dp)) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
//                    Image(
//                        painter = painterResource(id = R.drawable.gears),
//                        contentDescription = "Protective Gears",
//                        modifier = Modifier
//                            .clip(CircleShape)
//                            .height(50.dp)
//                            .padding(20.dp, 1.dp)
//                            .width(50.dp),
//                        alignment = Alignment.Center
//                    );
                    Text(
                        text = "Protective \n Gears",
                        fontSize = 10.sp,
                        textAlign = TextAlign.Center
                    )

                }
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun CategoryPreview(){
    Category()
}