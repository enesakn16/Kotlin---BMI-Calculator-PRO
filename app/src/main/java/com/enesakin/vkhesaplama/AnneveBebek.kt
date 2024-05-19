package com.enesakin.vkhesaplama

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun AnneveBebek(navController: NavController){
    Surface(modifier = Modifier
        .fillMaxSize()) {
        Text(text = "HELLO")

    }
}

@Preview
@Composable
fun AnneveBebekView(){
    val navController = rememberNavController()
    AnneveBebek(navController = navController)
}