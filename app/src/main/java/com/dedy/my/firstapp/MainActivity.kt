package com.dedy.my.firstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dedy.my.firstapp.ui.theme.MyFirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter = painterResource(id = R.drawable.icons)
            val description = "Dedy playing in the snow"
            val title = "Dedy playing in the snow"
            Column(modifier = Modifier
//                .fillMaxSize()
                .background(Color.Transparent),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween) {
                Column() {
                    Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(.5f)
                                .padding(16.dp)
                        ) {
                            ImageCard(
                                painter = painter,
                                contentDescription = description,
                                title = title
                            )
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(16.dp)
                        ) {
                            ImageCard(
                                painter = painter,
                                contentDescription = description,
                                title = title
                            )
                        }
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(.5f)
                                .padding(16.dp)
                        ) {
                            ImageCard(
                                painter = painter,
                                contentDescription = description,
                                title = title
                            )
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(16.dp)
                        ) {
                            ImageCard(
                                painter = painter,
                                contentDescription = description,
                                title = title
                            )
                        }
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(.5f)
                                .padding(16.dp)
                        ) {
                            ImageCard(
                                painter = painter,
                                contentDescription = description,
                                title = title
                            )
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(16.dp)
                        ) {
                            ImageCard(
                                painter = painter,
                                contentDescription = description,
                                title = title
                            )
                        }
                    }


                }
            }
        }
    }
}
