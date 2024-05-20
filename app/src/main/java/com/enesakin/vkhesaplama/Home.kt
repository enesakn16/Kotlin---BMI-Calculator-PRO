package com.enesakin.vkhesaplama

import android.util.Log
import android.view.ContextThemeWrapper
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.enesakin.vkhesaplama.ui.theme.VKİHesaplamaTheme

@Composable
fun Home(preferenceHelper: PreferenceHelper) {
    val myColor5 = Color(0xFFF5F5F5)
    var height by remember { mutableStateOf("") }
    var weight by remember { mutableStateOf("") }
    var idealWeight by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var bmi by remember { mutableStateOf<Float?>(null) }
    val showInfoText = gender.isEmpty() || height.isEmpty() || weight.isEmpty()

    fun isHeightValid(height: String): Boolean {
        val heightFloat = height.toFloatOrNull()
        return heightFloat != null && heightFloat > 0
    }

    fun isWeightValid(weight: String): Boolean {
        val weightFloat = weight.toFloatOrNull()
        return weightFloat != null && weightFloat > 0
    }

    fun saveDateTimeToDatabase() {
        val currentDateTimeMillis = System.currentTimeMillis()
        preferenceHelper.saveDateTime(currentDateTimeMillis)
        Log.d("MainScreen", "DateTime saved to database: $currentDateTimeMillis")
    }

    fun saveWeightToDatabase(weight: String) {
        if (weight.isNotEmpty()) {
            preferenceHelper.saveWeight(weight)
            Log.d("MainScreen", "Weight saved to database: $weight")
        } else {
            Log.d("MainScreen", "Weight is empty, cannot save to database")
        }
    }

    fun saveHeightToDatabase(height: String) {
        if (height.isNotEmpty()) {
            preferenceHelper.saveHeight(height)
            Log.d("MainScreen", "Height saved to database: $height")
        } else {
            Log.d("MainScreen", "Height is empty, cannot save to database")
        }
    }

    fun saveBmiToDatabase(bmi: Float?) {
        bmi?.let { bmiValue ->
            preferenceHelper.saveBMI(bmiValue.toString())
            Log.d("MainScreen", "BMI saved to database: $bmiValue")
        } ?: run {
            Log.d("MainScreen", "BMI is null, cannot save to database")
        }
    }

    fun saveIdealWeightToDatabase(idealWeight: String) {
        if (idealWeight.isNotEmpty()) {
            preferenceHelper.saveIdealWeight(idealWeight)
            Log.d("MainScreen", "Ideal weight saved to database: $idealWeight")
        } else {
            Log.d("MainScreen", "Ideal weight is empty, cannot save to database")
        }
    }
    Surface(color = myColor5, modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.back2), // Arka plan olarak kullanılacak resmin id'si
            contentDescription = "Background Image",
            contentScale = ContentScale.FillBounds, // Resmin boyutunu ayarlamak için
            modifier = Modifier.fillMaxSize() // Resmin boyutunu Surface ile aynı yapmak için
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 0.dp)
                .padding(top = 115.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(0.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 8.dp)
                ) {
                    SpecialText(string = "Boy")
                    Spacer(modifier = Modifier.padding(5.dp))
                    SpecialTextField(string = height) {
                        height = it
                    }
                }
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 8.dp)
                ) {
                    SpecialText(string = "Kilo")
                    Spacer(modifier = Modifier.padding(5.dp))
                    SpecialTextField1(string = weight) {
                        weight = it
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    GenderButton(
                        gender = "Kadın",
                        iconId = R.drawable.kadin1,
                        isSelected = gender == "Kadın",
                        onGenderSelected = { gender = "Kadın" },
                        modifier = Modifier
                            .weight(1f)
                            .padding(5.dp)
                            .fillMaxWidth()
                            .height(75.dp)
                    )
                    GenderButton(
                        gender = "Erkek",
                        iconId = R.drawable.adam1,
                        isSelected = gender == "Erkek",
                        onGenderSelected = { gender = "Erkek" },
                        modifier = Modifier
                            .weight(1f)
                            .padding(5.dp)
                            .fillMaxWidth()
                            .height(75.dp)
                    )
                }
            Spacer(modifier = Modifier.height(16.dp))
            SimpleButton(
                onClick = {
                    val isHeightValid = isHeightValid(height)
                    val isWeightValid = isWeightValid(weight)

                    if (gender.isEmpty() || !isHeightValid || !isWeightValid) {

                        val errorMessage = when {
                            height.isEmpty() && weight.isEmpty() && gender.isEmpty() -> "Boy ve kilo bilgilerinizi giriniz."
                            height.isEmpty() && weight.isEmpty() -> "Boy ve kilonuzu giriniz."
                            height.isEmpty() && gender.isEmpty() -> "Boy ve cinsiyet bilgilerinizi giriniz."
                            weight.isEmpty() && gender.isEmpty() -> "Kilo ve cinsiyet bilgilerinizi giriniz."
                            height.isEmpty() -> "Boyunuzu giriniz."
                            weight.isEmpty() -> "Kilonuzu giriniz."
                            gender.isEmpty() -> "Cinsiyetinizi seçiniz."
                            else -> ""
                        }
                        if (errorMessage.isNotEmpty()) {

                        }
                    } else {
                        val heightFloat = height.toFloatOrNull()
                        val weightFloat = weight.toFloatOrNull()
                        if (heightFloat != null && weightFloat != null) {
                            bmi = calculateBMI(heightFloat, weightFloat) // VKİ'yi hesapla
                            idealWeight = calculateIdealWeight(heightFloat, weightFloat, gender) // İdeal kiloyu hesapla
                            saveIdealWeightToDatabase(idealWeight)
                            saveBmiToDatabase(bmi)
                            saveHeightToDatabase(height)
                            saveWeightToDatabase(weight)
                            saveDateTimeToDatabase()
                        } else {
                            // Float'a dönüştürme başarısız olduğunda uyarı göster
                        }
                    }
                },
                modifier = Modifier.padding(top = 16.dp)
            )
            if (bmi != null) {
                Column(
                    modifier = Modifier.padding(vertical = 16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    androidx.compose.material3.Text(
                        text = "İdeal Kilonuz: $idealWeight kg",
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    androidx.compose.material3.Text(
                        text = "Vücut Kitle İndeksiniz: %.2f".format(bmi!!),
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif
                    )

                    // VKİ'ye göre çoğalan progress bar
                    Spacer(modifier = Modifier.height(16.dp))
                    CircularProgressIndicator(
                        progress = { bmi?.let { calculateProgress(it) } ?: 0f },
                        modifier = Modifier.size(48.dp),
                        color = bmi?.let { calculateProgressColor(it) } ?: Color.Transparent,
                        strokeWidth = 10.dp,
                    )
                    val classification = when {
                        bmi!! < 18.5 -> "Zayıf (Underweight)"
                        bmi!! < 24.9 -> "Normal (Normal weight)"
                        bmi!! < 29.9 -> "Fazla Kilolu (Overweight)"
                        bmi!! < 34.9 -> "Obez Sınıfı I"
                        bmi!! < 39.9 -> "Obez Sınıfı II"
                        else -> "Obez Sınıfı III"
                    }
                    androidx.compose.material3.Text(
                        text = "Sınıfınız: $classification",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        fontFamily = FontFamily.SansSerif,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    androidx.compose.material3.Text(
                        text = "Lütfen sınıfınıza uygun diyet listelerini incelemek için Diyet Listeleri sayfasını ziyaret ediniz.",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        fontFamily = FontFamily.SansSerif,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(vertical = 8.dp, horizontal = 10.dp)
                    )

                }

            }
        }
    }
}

@Preview
@Composable
fun NavBotSheetPreview1() {
    VKİHesaplamaTheme {
        val preferenceHelper = PreferenceHelper(context = ContextThemeWrapper(LocalContext.current, R.style.Theme_VKİHesaplama))
        NavBotSheet(preferenceHelper = preferenceHelper)
    }
}