package com.murerwa.composenavigation.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.murerwa.composenavigation.ui.navigation.Screen

@Composable
fun HomeScreen(
    navController: NavHostController
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier.clickable {
                navController.navigate(
                    route = Screen.Detail.passNameAndId(
                        id = 10,
                        name = "Hello"
                    )
                )
            },
            text = "Home Screen",
            fontWeight = FontWeight.Bold,
            fontSize = MaterialTheme.typography.h3.fontSize,
            color = MaterialTheme.colors.primary,
        )
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    HomeScreen(
        navController = rememberNavController()
    )
}