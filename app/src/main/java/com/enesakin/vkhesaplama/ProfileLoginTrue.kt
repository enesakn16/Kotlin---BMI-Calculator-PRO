package com.enesakin.vkhesaplama

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.enesakin.vkhesaplama.ui.theme.VKİHesaplamaTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.enesakin.vkhesaplama.ui.theme.BlueGray

@Composable
fun ProfileLoginTrue(preferenceHelper: PreferenceHelper,navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Bir hesabınız yok mu?",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Button(
            onClick = { navController.navigate("register") }, // "Register" ekranına yönlendirme
            modifier = Modifier.padding(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = BlueGray,
                contentColor = Color.White)
        ) {
            Text("Kayıt Ol")
        }
        Button(
            onClick = { navController.navigate("login") }, // "Login" ekranına yönlendirme
            modifier = Modifier.padding(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = BlueGray,
                contentColor = Color.White)
        ) {
            Text("Giriş Yap")
        }
    }
}

@Preview
@Composable
fun ProfileTrueScreenPreview() {
    val navController = rememberNavController()
    val sharedPreferences = PreferenceHelper(LocalContext.current)
    VKİHesaplamaTheme {
        ProfileLoginTrue(preferenceHelper = sharedPreferences, navController = navController)
    }
}