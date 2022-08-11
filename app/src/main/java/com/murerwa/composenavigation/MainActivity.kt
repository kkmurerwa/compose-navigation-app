package com.murerwa.composenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.murerwa.composenavigation.ui.navigation.SetUpNavGraph
import com.murerwa.composenavigation.ui.theme.ComposeNavigationTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationTheme {

                navController = rememberNavController()

                SetUpNavGraph(navController = navController)

            }
        }
    }
}