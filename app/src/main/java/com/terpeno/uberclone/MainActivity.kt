package com.terpeno.uberclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.terpeno.uberclone.presentation.navigation.graph.root.RootNavGraph
import com.terpeno.uberclone.presentation.screens.auth.login.LoginScreen
import com.terpeno.uberclone.ui.theme.UberCloneTheme

class MainActivity : ComponentActivity() {

    private lateinit var navHostController: NavHostController;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UberCloneTheme {
                Surface {
                    navHostController = rememberNavController()
                    RootNavGraph(navHostController)
                }
            }
        }
    }
}
