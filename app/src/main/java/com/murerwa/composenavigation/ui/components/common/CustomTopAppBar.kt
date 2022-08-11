package com.murerwa.composenavigation.ui.components.common

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun CustomTopAppBar(
    title: String,
    isHomeScreen: Boolean = false,
    onBackClick: () -> Unit = {},
) {
    TopAppBar(
        title = { Text(
            text = title,
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium,
            color = Color.White,
        ) },
        navigationIcon = {
            IconButton(
                onClick = { onBackClick() }
            ) {
                if (isHomeScreen) {
                    Icon(Icons.Filled.Menu, "Home menu icon")
                } else {
                    Icon(Icons.Filled.ArrowBack, "Back arrow icon")
                }
            }
        }
    )
}

@Composable
@Preview(showBackground = true)
fun CustomTopAppBarPreview() {
    CustomTopAppBar(
        title = "Title",
        isHomeScreen = true,
    )
}