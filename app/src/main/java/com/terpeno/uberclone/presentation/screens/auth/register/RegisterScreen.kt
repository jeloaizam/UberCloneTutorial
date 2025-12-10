package com.terpeno.uberclone.presentation.screens.auth.register

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.terpeno.uberclone.presentation.screens.auth.register.components.RegisterContent
import com.terpeno.uberclone.ui.theme.UberCloneTheme

@Composable
fun RegisterScreen ( navHostController: NavHostController){

    Scaffold { paddingValues ->
        RegisterContent(navHostController = navHostController, paddingValues= paddingValues)
    }
}

@Preview(showBackground=true, showSystemUi = true)
@Composable
fun RegisterPreview() {
    UberCloneTheme{
        RegisterScreen(rememberNavController())
    }
}
