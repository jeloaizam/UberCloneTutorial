package com.terpeno.uberclone.presentation.navigation.graph.auth

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.terpeno.uberclone.presentation.navigation.Graph
import com.terpeno.uberclone.presentation.navigation.screen.auth.AuthScreen
import com.terpeno.uberclone.presentation.screens.auth.login.LoginScreen
import com.terpeno.uberclone.presentation.screens.auth.register.RegisterScreen


fun NavGraphBuilder.AuthNavGraph(navHostController: NavHostController) {
    navigation(
        route= Graph.AUTH,
        startDestination = AuthScreen.Login.route
    ){
        composable (route = AuthScreen.Login.route){ LoginScreen(navHostController) }
        composable (route = AuthScreen.Register.route){ RegisterScreen(navHostController) }
    }
}