package com.terpeno.uberclone.presentation.screens.auth.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun RegisterScreen ( navHostController: NavHostController){
    Scaffold { paddingValues ->
        Box(
            modifier= Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color(0xFF55EA05), Color(0xFF82CE07)),
                    )
                )
                .padding(paddingValues)
        )
    }
}