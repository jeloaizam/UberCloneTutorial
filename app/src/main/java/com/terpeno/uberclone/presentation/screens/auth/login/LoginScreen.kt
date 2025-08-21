package com.terpeno.uberclone.presentation.screens.auth.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.terpeno.uberclone.R
import com.terpeno.uberclone.presentation.components.DefaultTextField
import com.terpeno.uberclone.presentation.navigation.screen.auth.AuthScreen

@Composable
fun LoginScreen(navHostController: NavHostController) {

    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    Scaffold (
        contentWindowInsets = WindowInsets.navigationBars
    ){ paddingValues ->
        Box(modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(Color(0xFF55EA05), Color(0xFF82CE07)),
                )
            )
            .padding(paddingValues)
        ){
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text="Login",
                    color= Color.White,
                    fontSize = 27.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.rotate(-90f)
                )
                Spacer(
                    modifier = Modifier.height(150.dp)
                )
                Text(
                    text="Register",
                    color= Color.White,
                    fontSize = 27.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .clickable{navHostController.navigate( route = AuthScreen.Register.route)}
                        .rotate(-90f)
                        .padding(bottom = 35.dp)
                )
                Spacer(
                    modifier = Modifier.height(250.dp)
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 60.dp, bottom = 35.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color(0xFF4D4D4D), Color(0xFF100F0F)),
                        ),
                        shape = RoundedCornerShape(

                            bottomStart = 35.dp
                        )
                    )
            ){
                Column (
                    modifier = Modifier
                        .statusBarsPadding()
                        .padding(start= 30.dp)
                ){
                    Spacer(
                        modifier = Modifier.height(20.dp)
                    )
                    Text(
                        text = "La buena!",
                        color = Color.White,
                        fontSize = 35.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Vamos a rodar o que?",
                        color = Color.White,
                        fontSize = 35.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Box(
                        modifier = Modifier.fillMaxWidth().padding(end = 25.dp)
                    ){
                        Image(
                            modifier = Modifier
                                .size(150.dp)
                                .align(Alignment.Center),
                            painter = painterResource(id = R.drawable.roller_skates_01_full),
                            contentDescription = ""
                        )
                    }
                    Spacer(
                        modifier = Modifier.height(20.dp)
                    )
                    Text(
                        text = "Login",
                        color = Color.White,
                        fontSize = 27.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(
                        modifier = Modifier.height(60.dp)
                    )
                    DefaultTextField(
                        modifier = Modifier,
                        value = email,
                        icon = Icons.Outlined.Email,
                        label ="Email",
                        onValueChange = {
                            email = it
                        },
                        keyboardType = KeyboardType.Email
                    )
                    Spacer(
                        modifier = Modifier.height(20.dp)
                    )
                    DefaultTextField(
                        modifier = Modifier,
                        value = password,
                        icon = Icons.Outlined.Lock,
                        label ="Password",
                        onValueChange = {
                            password = it
                        },
                        hideText = true
                    )
                    Spacer(
                        modifier = Modifier.weight(1f)
                    )
                    Box(
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Button(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .width(200.dp)
                                .height(60.dp)
                                ,
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(Color.White)
                        ) {
                            Text("INICIAR SESISÓN", fontSize = 18.sp, color = Color.Black)
                        }
                    }
                    Spacer(
                        modifier = Modifier.height(30.dp)
                    )
                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Spacer(
                            modifier = Modifier
                                .width(25.dp)
                                .height(1.dp)
                                .background(Color.White)
                        )
                        Text(
                            modifier = Modifier.padding(7.dp),
                            text="O",
                            color = Color.White,
                            fontSize = 17.sp
                        )
                        Spacer(
                            modifier = Modifier
                                .width(25.dp)
                                .height(1.dp)
                                .background(Color.White)
                        )
                    }
                    Spacer(
                        modifier = Modifier.height(30.dp)
                    )
                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ){
                        Text(
                            text="¿No tienes cuenta?  ",
                            color = Color.White,
                            fontSize = 17.sp
                        )
                        Text(
                            text="Registrate",
                            color = Color.White,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Bold
                        )

                    }
                    Spacer(
                        modifier = Modifier.height(30.dp)
                    )
                }

            }

        }

    }
}