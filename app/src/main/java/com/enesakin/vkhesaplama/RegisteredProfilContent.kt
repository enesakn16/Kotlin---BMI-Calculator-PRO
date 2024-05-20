package com.enesakin.vkhesaplama

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun RegisteredProfileContent(navController: NavController, preferenceHelper: PreferenceHelper) {
    val isRegistered = preferenceHelper.isRegistered()

    if (isRegistered) {
        // Kullanıcı kayıtlıysa profil bilgilerini göster
        ContentOfPreviously(navController, preferenceHelper)
    } else {
        // Kullanıcı kayıtlı değilse kayıt olma butonunu göster
        ProfileLoginTrue(preferenceHelper, navController)
    }
}

@Composable
fun ContentOfPreviously(navController: NavController, preferenceHelper: PreferenceHelper) {
    val username = preferenceHelper.getAdSoyad()
    val email = preferenceHelper.getEmail()
    Surface {
        Image(
            painter = painterResource(id = R.drawable.back2), // Arka plan olarak kullanılacak resmin id'si
            contentDescription = "Background Image", contentScale = ContentScale.FillBounds, // Resmin boyutunu ayarlamak için
            modifier = Modifier.fillMaxSize() // Resmin boyutunu Surface ile aynı yapmak için
        )
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .background(color = Color(0xFF32357A)),
                contentAlignment = Alignment.TopCenter
            ) {
                val transparentColor = Color(0xFFC6E0F4).copy(alpha = 0.1f)
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .align(Alignment.BottomCenter), // Image'ı en altta hizalamak için align eklenmiştir
                    painter = painterResource(id = R.drawable.arc_3),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    colorFilter = ColorFilter.tint(transparentColor) // Resmin rengi beyaz olacak
                )
                Text(
                    modifier = Modifier.padding(top = 145.dp),
                    text = stringResource(id = R.string.profil),
                    style = MaterialTheme.typography.headlineLarge,
                    color = Color.White
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Image(
                painterResource(id = R.drawable.profilresmi),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 200.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 0.dp)
                    .height(55.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "$username", fontWeight = FontWeight.Bold, fontSize = 25.sp, color = Color.DarkGray
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 0.dp)
                    .height(55.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "$email", fontSize = 23.sp, color = Color.DarkGray
                )
            }
            Surface(
                modifier = Modifier, color = Color.Transparent
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                ) {
                    val myColor = Color(0xFF32357A)
                    Row {
                        androidx.compose.material3.Button(
                            onClick = { navController.navigate("profilelogintrue") },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 32.dp, end = 32.dp, top = 10.dp, bottom = 10.dp)
                                .height(55.dp),
                            colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                                containerColor = Color.White, // Arka plan rengini burada belirleyin
                                contentColor = Color.Black // İçerik rengini isteğe bağlı olarak belirleyebilirsiniz
                            ),
                            shape = RoundedCornerShape(15)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.baseline_logout_24),
                                contentDescription = "",
                                modifier = Modifier
                                    .padding(end = 5.dp)
                                    .height(35.dp)
                                    .width(35.dp)
                            )
                            Column(
                                modifier = Modifier
                                    .padding(start = 16.dp)
                                    .weight(1f)
                                    .clickable { navController.navigate("profilelogintrue") },
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.Start
                            ) {
                                Text(text = "Hesaptan Çık", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                    Row {
                        androidx.compose.material3.Button(
                            onClick = { navController.navigate("home") },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 32.dp, end = 32.dp, top = 10.dp, bottom = 10.dp)
                                .height(55.dp)
                                .clickable { navController.navigate("home") },
                            colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                                containerColor = myColor, // Arka plan rengini burada belirleyin
                                contentColor = Color.Black // İçerik rengini isteğe bağlı olarak belirleyebilirsiniz
                            ),
                            shape = RoundedCornerShape(15)
                        ) {
                            Text(
                                text = "Anasayfaya Geri Dön", color = Color.White, fontSize = 14.sp, fontWeight = FontWeight.Bold
                            )
                        }

                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun ProfilePreview() {
    val navController = rememberNavController()
    val preferenceHelper = PreferenceHelper(context = LocalContext.current.applicationContext)
    ContentOfPreviously(navController = navController, preferenceHelper = preferenceHelper)
}