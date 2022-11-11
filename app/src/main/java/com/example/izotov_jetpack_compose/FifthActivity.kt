package com.example.izotov_jetpack_compose

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.izotov_jetpack_compose.ui.theme.*

class FifthActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Izotov_Jetpack_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Green1
                ) {
                    Column (modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp)) {
                        ImageFor5()
                        TextFor5()
                        Row {
                            ButtonFor5()
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ButtonFor5() {
    val White1: Color = White
    androidx.compose.material.Button(
        onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
            backgroundColor = LightGreen, contentColor = DarkGreen
        ), modifier = Modifier
            .size(350.dp, 60.dp)
            .offset(x = 23.dp, y = (470).dp)
            .background(color = Green1), shape = RoundedCornerShape(15.dp)
    ) {
        Text(
            "Записать задачу",
            fontSize = 20.sp,
            color = White1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ImageFor5() {
    androidx.compose.foundation.Image(
        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.backbutton)),
        contentDescription = "аватар",
        modifier = Modifier
            .size(60.dp)
            .offset(x = (325).dp, y = (5).dp)
            .clickable(
                onClick = {
                }
            )
    )
}

@Preview(showBackground = true)
@Composable
fun TextFor5() {
    val White1: Color = White
    Text("Добавить задачу",
        fontSize = 30.sp,
        modifier = Modifier.offset(x=10.dp,y=(-50).dp),
        color = White1,
        fontWeight = FontWeight.Bold)
}
