package com.terpeno.uberclone.presentation.screens.auth.register.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.terpeno.uberclone.R
import com.terpeno.uberclone.presentation.components.DefaultButton
import com.terpeno.uberclone.presentation.components.DefaultOutlineTextField

@Composable
fun RegisterContent (navHostController: NavHostController, paddingValues: PaddingValues){
    var email by remember {
        mutableStateOf("")
    }
    var name by remember {
        mutableStateOf("")
    }
    var lastname by remember {
        mutableStateOf("")
    }
    var phone by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var confirmPassword by remember {
        mutableStateOf("")
    }
    Box(
        modifier= Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(Color(0xFF55EA05), Color(0xFF82CE07)),
                )
            )
            .padding(paddingValues)
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Spacer(modifier = Modifier.height(150.dp))
            Text(
                text="Login",
                color=Color.White,
                fontSize = 27.sp,
                modifier = Modifier
                    .rotate(degrees = 90f)
                    .padding(top=30.dp)
                    .clickable{navHostController.popBackStack()}

            )
            Spacer(modifier = Modifier.height(100.dp))
            Text(
                text="Register",
                color=Color.White,
                fontSize = 27.sp,
                modifier = Modifier
                    .rotate(degrees = 90f)
                    .padding(top=30.dp)

            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(start= 60.dp, bottom= 35.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color(0xFF4D4D4D), Color(0xFF100F0F)),
                    ),
                    shape = RoundedCornerShape(
                        bottomStart = 35.dp
                    )
                )
        ){
            Column(
                modifier = Modifier
                    .statusBarsPadding(),

                verticalArrangement = Arrangement.spacedBy(5.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ){
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp)
                ){
                    Image(
                        modifier = Modifier
                            .size(140.dp)
                            .align(Alignment.Center),
                        painter = painterResource(id = R.drawable.car_white),
                        contentDescription = null
                    )
                }
                Column (
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ){
                    DefaultOutlineTextField(
                        modifier = Modifier,
                        value = name,
                        label = "Nombre",
                        icon = Icons.Outlined.Person,
                        onValueChange = {
                            name = it
                        }
                    )

                    DefaultOutlineTextField(
                        modifier = Modifier,
                        value = lastname,
                        label = "Apellido",
                        icon = Icons.Outlined.Person,
                        onValueChange = {
                            lastname = it
                        }
                    )

                    DefaultOutlineTextField(
                        modifier = Modifier,
                        value = email,
                        label = "Email",
                        icon = Icons.Outlined.Email,
                        keyboardType = KeyboardType.Email,
                        onValueChange = {
                            email = it
                        }
                    )

                    DefaultOutlineTextField(
                        modifier = Modifier,
                        value = phone,
                        label = "Teléfono",
                        icon = Icons.Outlined.Phone,
                        keyboardType = KeyboardType.Number,
                        onValueChange = {
                            phone = it
                        }
                    )

                    DefaultOutlineTextField(
                        modifier = Modifier,
                        value = password,
                        label = "Password",
                        icon = Icons.Outlined.Lock,
                        hideText= true,
                        onValueChange = {
                            password = it
                        }
                    )

                    DefaultOutlineTextField(
                        modifier = Modifier,
                        value = confirmPassword,
                        label = "Confirm Password",
                        icon = Icons.Outlined.Lock,
                        hideText= true,
                        onValueChange = {
                            confirmPassword = it
                        }
                    )
                }
                Spacer(
                    modifier = Modifier.height(10.dp)
                )

                DefaultButton(
                    modifier = Modifier,
                    text = "Crear cuenta",
                    onClick = {},
                    color = Color.White,
                    textColor = Color.Black,

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
//                    Spacer(
//                        modifier = Modifier.height(30.dp)
//                    )
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ){
                    Text(
                        text="¿Ya tienes cuenta?  ",
                        color = Color.White,
                        fontSize = 17.sp
                    )
                    Text(
                        modifier = Modifier
                            .clickable{navHostController.popBackStack()},
                        text="Inicia Sesión",
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