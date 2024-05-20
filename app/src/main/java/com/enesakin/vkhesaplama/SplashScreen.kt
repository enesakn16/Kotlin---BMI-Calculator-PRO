package com.enesakin.vkhesaplama

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.enesakin.vkhesaplama.ui.theme.Purple40

@Composable
fun SplashScreen(navController: NavController) {
Splash()
}

@Composable
fun Splash(){
    Box(
        modifier = Modifier
            .background(if (isSystemInDarkTheme()) Color.Black else Purple40)
            .fillMaxSize()
    ) {
        Icon(painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo Icon",
            tint = Color.White
        )
    }
}