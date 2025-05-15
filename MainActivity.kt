package com.example.battlecommand
//import android.graphics.Paint.Align
import com.example.battlecommand.ui.theme.BattleCommandTheme
import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
//import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
//import androidx.core.view.WindowCompat
import androidx.activity.compose.setContent
//import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.automirrored.outlined.HelpOutline
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.draw.scale
//import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.graphicsLayer


@Preview(showBackground = true)
@Composable
fun Home(){
    Box(
        modifier=Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    colors = listOf(Color(0xD5838080),Color(0xFF363535),Color(0xD5838080))
                )
            )
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top=40.dp,
                    bottom=40.dp
                ), //dp for margins and padding and sp for texts
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text="BATTLESHIPS\nARMADA",
                //style-parameter of text() materialTheme includes color,typography styles(predefined text styles), shapes,etc
                style=MaterialTheme.typography.headlineLarge,
                color=Color(0xFFFDFDFD),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Black,
                fontSize = 50.sp,
                fontFamily = FontFamily.Default,
                lineHeight = 60.sp
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier=Modifier
                    .size(400.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFEAE9E9))
            ){
                Box(
                    contentAlignment = Alignment.Center,
                    modifier=Modifier
                        .size(330.dp)
                        .clip(CircleShape)
                        .background(Color(0xD5D0CACA))
                ){
                    Box(
                        contentAlignment=Alignment.Center,
                        modifier=Modifier
                            .size(145.dp)
                            .clip(CircleShape)
                            .background(Color.White)
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier=Modifier
                                .size(130.dp)
                                .clip(CircleShape) //makes the composable - box - a circle
                                .background(Color(0xFFF85B00))
                        ){
                            Icon( //jst creates an icon - the visual alone
                                modifier=Modifier
                                    .scale(5.5f)
                                    .clickable{},
                                contentDescription = "Play",
                                imageVector = Icons.Default.PlayArrow,
                                tint=Color.White
                            )
                        }
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 20.dp,
                        end=20.dp
                    ),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Box(
                    contentAlignment=Alignment.Center,
                    modifier = Modifier
                        .size(105.dp)
                        .clip(CircleShape)
                        .background(Color(0xE1FAF6F6))
                ){
                    Box(
                        contentAlignment=Alignment.Center,
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .background(Color(0xFFF4D615))
                    ){
                        Icon(
                            modifier = Modifier
                                .scale(3f)
                                .clickable{},
                            contentDescription = "Settings",
                            imageVector = Icons.Outlined.Settings,
                            tint=Color(0xFF8B7A0C)
                        )
                    }
                }
                Box(
                    contentAlignment=Alignment.Center,
                    modifier = Modifier
                        .size(105.dp)
                        .clip(CircleShape)
                        .background(Color(0xE1FAF6F6))
                ){
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier=Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .background(Color(0xFFF4D615))
                    ){
                        Icon(
                            modifier=Modifier
                                .scale(5.7f)
                                .clickable {  },
                            contentDescription = "Help",
                            imageVector = Icons.AutoMirrored.Outlined.HelpOutline,
                            tint = Color(0xFF8B7A0C)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Game(
    //playerOne: Boolean,
    //deploy: Boolean,
    //changeMode: (Boolean), //true=defend and false=attack
    //mode: Boolean
){
    val playerOne=true
    var mode=true
    val deploy=false
    val bg= if (playerOne) Color(0xFF59CCBD) else Color(0xFF313131)
    val bgg=if(mode) Color.White else Color(0xFFFD6E6E)
    Box(
        modifier=Modifier
            .fillMaxSize()
            .background(bg)
            //.padding
    ){
        //timer
        Column(
            modifier=Modifier
                .fillMaxSize()
                .padding(
                    top=55.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Row{
                for (i in 0 until 6) {
                    Column {
                        for (j in 0 until 6) {
                            Box(
                                modifier = Modifier
                                    .size(55.dp)
                                    .padding(3.2.dp)
                                    .background(Color(0xFFD7D7D7))
                            )
                        }
                    }
                }
            }
            Row{
                for (i in 0 until 6) {
                    Column {
                        for (j in 0 until 6) {
                            Box(
                                modifier = Modifier
                                    .size(55.dp)
                                    .padding(3.2.dp)
                                    .background(Color(0xFFD7D7D7))
                            )
                        }
                    }
                }
            }
            Row(
                modifier=Modifier
                    .background(
                        color=bgg,
                        shape = RoundedCornerShape(
                            topStart = 13.dp,
                            topEnd = 13.dp
                        )
                    )
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier=Modifier
                        .width(100.dp)
                        .padding(
                            start=10.dp
                        )
                ){
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .background(color=Color.Black)
                            .size(25.dp)
                    )
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .background(color=Color.Black)
                            .size(25.dp)
                    )
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .background(color=Color.Black)
                            .size(25.dp)
                    )
                }
                Text(
                    text=if(mode)"DEFEND" else "ATTACK",
                    color=if(mode)Color.Black else Color.White,
                    style=MaterialTheme.typography.headlineLarge,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Default
                )
                Switch(
                    modifier = Modifier
                        .padding(
                            end=23.dp
                        )
                        .graphicsLayer(
                            scaleX = 1.4f,
                            scaleY = 1f
                        ),
                    checked = mode,
                    onCheckedChange = {
                        if(!deploy) mode=false
                    },
                    enabled = !deploy,
                    colors = SwitchColors(
                        checkedIconColor = Color.Red,
                        checkedTrackColor = Color(0xFF4F4F4F),
                        checkedThumbColor = Color.White,
                        checkedBorderColor = Color(0xFF4F4F4F),
                        uncheckedThumbColor = Color.White,
                        uncheckedTrackColor = Color(0xFFD16D6D),
                        uncheckedBorderColor = Color(0xFFD16D6D),
                        uncheckedIconColor = Color.DarkGray,
                        disabledCheckedIconColor = Color.Gray,
                        disabledCheckedThumbColor = Color.Gray,
                        disabledCheckedTrackColor = Color.Gray,
                        disabledCheckedBorderColor = Color.Gray,
                        disabledUncheckedIconColor = Color.Gray,
                        disabledUncheckedThumbColor = Color.Gray,
                        disabledUncheckedTrackColor = Color.Gray,
                        disabledUncheckedBorderColor = Color.Gray
                    )
                )
            }
        }
    }
}
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BattleCommandTheme{
                Game()
            }
        }
    }
}