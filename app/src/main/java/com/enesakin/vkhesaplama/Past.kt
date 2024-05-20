package com.enesakin.vkhesaplama

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import java.text.SimpleDateFormat
import java.util.Locale
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.enesakin.vkhesaplama.ui.theme.VKİHesaplamaTheme

@Composable
fun Past(preferenceHelper: PreferenceHelper) {
    val savedDataList = remember { mutableStateListOf<String>() }
    val dateTime = preferenceHelper.getDateTime()
    val weight = preferenceHelper.getWeight()
    val height = preferenceHelper.getHeight()
    val bmi = preferenceHelper.getBMI()
    val idealWeight = preferenceHelper.getIdealWeight()
    val savedDataText = buildString {
        appendLine("Son Kaydedilen Tarih: ${dateTime.let { SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.getDefault()).format(it) } ?: "Kaydedilmemiş"}")
        appendLine("Kilo: ${weight ?: "Kaydedilmemiş"}")
        appendLine("Boy: ${height ?: "Kaydedilmemiş"}")
        appendLine("Vücut Kitle İndeksi (VKİ): ${bmi ?: "Kaydedilmemiş"}")
        appendLine("Ideal Kilo: ${idealWeight ?: "Kaydedilmemiş"}")
    }
    savedDataList.add(savedDataText)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 0.dp, end = 0.dp, top = 0.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "")
        SavedDataView(preferenceHelper = preferenceHelper)
        Spacer(modifier = Modifier.height(10.dp)) // Boşluk eklemek için Spacer kullanılıyor
        if (savedDataList.isNotEmpty()) {
            Text(text = "Son kaydedilen veriyi burada görebilirsiniz.")
        }
    }
}
@Composable
fun SavedDataView(preferenceHelper: PreferenceHelper) {
    val dateTime = preferenceHelper.getDateTime()
    val weight = preferenceHelper.getWeight()
    val height = preferenceHelper.getHeight()
    val bmi = preferenceHelper.getBMI()
    val idealWeight = preferenceHelper.getIdealWeight()
    val myColor = Color(0xFF32357A)

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.back2), // Arka plan olarak kullanılacak resmin id'si
            contentDescription = "Background Image",
            contentScale = ContentScale.FillBounds, // Resmin boyutunu ayarlamak için
            modifier = Modifier.fillMaxSize() // Resmin boyutunu Surface ile aynı yapmak için
        )
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(color = myColor),
                contentAlignment = Alignment.TopCenter
            ) {
                val transparentColor = Color(0xFFC6E0F4).copy(alpha = 0.1f)
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(75.dp)
                        .align(Alignment.BottomCenter), // Image'ı en altta hizalamak için align eklenmiştir
                    painter = painterResource(id = R.drawable.arc_3),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    colorFilter = ColorFilter.tint(transparentColor) // Resmin rengi beyaz olacak
                )
                Text(
                    modifier = Modifier.padding(top = 145.dp),
                    text = stringResource(id = R.string.past),
                    style = MaterialTheme.typography.headlineLarge,
                    color = Color.White
                )
            }
        }
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(405.dp)
                .padding(top = 225.dp, bottom = 0.dp, start = 8.dp, end = 8.dp)
                .shadow(
                    elevation = 3.dp,
                    shape = RoundedCornerShape(13.dp),
                    clip = true
                )
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Son Kaydedilen Tarih: ${
                        dateTime.let {
                            SimpleDateFormat(
                                "dd-MM-yyyy HH:mm:ss",
                                Locale.getDefault()
                            ).format(it)
                        } ?: "Kaydedilmemiş"
                    }",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "Kilo: ${weight ?: "Kaydedilmemiş"}",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Text(
                    text = "Boy: ${height ?: "Kaydedilmemiş"}",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Text(
                    text = "Vücut Kitle İndeksi (VKİ): ${bmi ?: "Kaydedilmemiş"}",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Text(
                    text = "Ideal Kilo: ${idealWeight ?: "Kaydedilmemiş"}",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
            }
        }
    }
}
@Preview
@Composable
fun PastPreview() {
    VKİHesaplamaTheme {
        val preferenceHelper = PreferenceHelper(LocalContext.current)
        Past(preferenceHelper = preferenceHelper)
    }
}