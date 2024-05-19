package com.enesakin.vkhesaplama

import android.preference.PreferenceActivity.Header
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.platform.LocalContext

import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DiyetListeleri(preferenceHelper: PreferenceHelper,navController: NavController) {
    Surface {
        Image(
            painter = painterResource(id = R.drawable.back2), // Arka plan olarak kullanılacak resmin id'si
            contentDescription = "Background Image",
            contentScale = ContentScale.FillBounds, // Resmin boyutunu ayarlamak için
            modifier = Modifier.fillMaxSize() // Resmin boyutunu Surface ile aynı yapmak için
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 75.dp)
        ) {
            Text(
                text = "En çok ziyaret edilenler",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(start = 16.dp, top = 30.dp)
            )
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
            ) {
                item { kardiyoBox1(navController)}
                item { metaBox1(navController)}
                item { fitnessBox1(navController)}
                item { kiloAlmaBox1(navController)}
                item { kiloVermeBox1(navController)}
                item { gutBox1(navController)}
                item { anneveBebekBox1(navController)}
            }
            val myColor = Color(0xFF32357A)
            HorizontalDivider(modifier = Modifier.padding(bottom = 10.dp))
            Text(
                text = "Diyet Listeleri ",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 15.dp, top = 15.dp)

            )

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 100.dp)
                    .background(color = myColor.copy(0.6f),
                        shape = RoundedCornerShape(topEndPercent = 3, topStartPercent = 3)
                    )
            ) {
                item { FitnessBox(navController)}
                item { KiloAlmaBox(navController)}
                item { KiloVermeBox(navController)}
                item { GutBox(navController)}
                item { AnneveBebekBox(navController)}
                item { MetaBox(navController)}
                item { KardiyoBox(navController)}
            }
        }
    }
}
@Composable
fun fitnessBox1(navController: NavController){
    BoxWithImageAndTextRow(
        imageResId = R.drawable.fitness,
        text ="Fitness",
        onClick = { navController.navigate("fitness") }
    )
}
@Composable
fun kiloAlmaBox1(navController: NavController){
    BoxWithImageAndTextRow(
        imageResId = R.drawable.kiloalma,
        text ="Kilo Alma",
        onClick = { navController.navigate("kiloalma") }
    )
}
@Composable
fun kiloVermeBox1(navController: NavController){
    BoxWithImageAndTextRow(
        imageResId = R.drawable.zayiflama,
        text ="Kilo Verme",
        onClick = { navController.navigate("kiloverme") }
    )
}
@Composable
fun gutBox1(navController: NavController){
    BoxWithImageAndTextRow(
        imageResId = R.drawable.gut,
        text ="GutBox",
        onClick = { navController.navigate("gut") }
    )
}
@Composable
fun anneveBebekBox1(navController: NavController){
    BoxWithImageAndTextRow(
        imageResId = R.drawable.annevebebek,
        text ="Anne ve Bebek Sağlığı",
        onClick = { navController.navigate("annevebebek") }
    )
}
@Composable
fun metaBox1(navController: NavController){
    BoxWithImageAndTextRow(
        imageResId = R.drawable.metabolik,
        text ="Metabolik Sendrom",
        onClick = { navController.navigate("meta") }
    )
}
@Composable
fun kardiyoBox1(navController: NavController) {
    BoxWithImageAndTextRow(
        imageResId = R.drawable.kardiyovaskuler,
        text = "Kardiyovasküler",
        onClick = { navController.navigate("kardiyo") }
    )
}

@Composable
fun BoxWithImageAndTextRow(imageResId: Int, text: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .size(150.dp, 150.dp)
            .padding(start = 8.dp, top = 20.dp, bottom = 35.dp, end = 8.dp)
            .clickable(onClick = onClick)
            .clip(shape = RoundedCornerShape(20.dp))
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(15.dp))
            )
            Text(
                text = text,
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter) // Yazıyı alt ortaya hizala
                    .height(30.dp)
                    .background(Color.Black.copy(alpha = 0.32f))
            )
        }
    }
}

@Composable
fun FitnessBox(navController: NavController) {
    BoxWithImageAndText(
        imageResId = R.drawable.fitness,
        text = "Fitness",
        onClick = { navController.navigate("fitness") }
    )
}

@Composable
fun KiloAlmaBox(navController: NavController) {
    BoxWithImageAndText(
        imageResId = R.drawable.kiloalma,
        text = "Kilo Alma",
        onClick = { navController.navigate("kiloalma") }
    )
}
@Composable
fun KiloVermeBox(navController: NavController) {
    BoxWithImageAndText(
        imageResId = R.drawable.zayiflama,
        text = "Kilo Verme",
        onClick = { navController.navigate("kiloverme") }
    )
}

@Composable
fun GutBox(navController: NavController) {
    BoxWithImageAndText(
        imageResId = R.drawable.gut,
        text = "Gut Sağlığı",
        onClick = { navController.navigate("gut") }
    )
}

@Composable
fun AnneveBebekBox(navController: NavController) {
    BoxWithImageAndText(
        imageResId = R.drawable.annevebebek,
        text = "Anne ve Bebek Sağlığı",
        onClick = { navController.navigate("annevebebek") }
    )
}

@Composable
fun MetaBox(navController: NavController) {
    BoxWithImageAndText(
        imageResId = R.drawable.metabolik,
        text = "Metabolik Sendrom",
        onClick = { navController.navigate("meta") }
    )
}

@Composable
fun KardiyoBox(navController: NavController) {
    BoxWithImageAndText(
        imageResId = R.drawable.kardiyovaskuler,
        text = "Kardiyovasküler",
        onClick = { navController.navigate("kardiyo") }
    )
}

@Composable
fun BoxWithImageAndText(imageResId: Int, text: String,onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(start = 8.dp, top = 10.dp, end = 8.dp, bottom = 12.dp)
            .clickable(onClick = onClick)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(10.dp))
        ) {
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Text(
                text = text,
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter) // Yazıyı alt ortaya hizala
                    .height(30.dp)
                    .background(Color.Black.copy(alpha = 0.32f))
            )
        }
    }

}


@Preview
@Composable
fun DiyetView() {
    val navController = rememberNavController()
    val context = LocalContext.current
    val preferenceHelper = PreferenceHelper(context.applicationContext)
    DiyetListeleri(preferenceHelper = preferenceHelper, navController = navController)
}