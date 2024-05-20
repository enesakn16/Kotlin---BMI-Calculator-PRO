package com.enesakin.vkhesaplama

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun KiloAlma(navController: NavController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Image'ın %25'ini kaplaması için weight kullanın
            Image(
                painter = painterResource(id = R.drawable.yemek),
                contentDescription = "Background Image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
            )
        }
        val myColor = Color(0xFF32357A)
        Surface(
            modifier = Modifier
                .padding(top = 260.dp)
                .clip(shape = RoundedCornerShape(topStartPercent = 10, topEndPercent = 10))
        ) {
            Image(
                painter = painterResource(id = R.drawable.background11), // Arka plan olarak kullanılacak resmin id'si
                contentDescription = "Background Image",
                contentScale = ContentScale.FillBounds, // Resmin boyutunu ayarlamak için
                modifier = Modifier.fillMaxSize() // Resmin boyutunu Surface ile aynı yapmak için
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
                    .padding(bottom = 150.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(bottomEndPercent = 10, bottomStartPercent = 10)),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.asd1),
                        contentDescription = "Background Image",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .width(80.dp)
                            .height(80.dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp, start = 0.dp, end = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Kilo Alma Diyeti",
                        textAlign = TextAlign.Center,
                        fontSize = 19.sp,
                        fontWeight = FontWeight.Bold,
                        color = myColor
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp, start = 10.dp, end = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Kilo alma amacıyla bir diyet programı oluştururken, sağlıklı ve dengeli bir şekilde kilo almayı hedeflemek önemlidir. Aşağıda, kilo alma sürecini desteklemek için önerilen bir diyet programı bulunmaktadır:\n" +
                                "\n" +
                                "Kahvaltı:\n" +
                                "\n" +
                                "-Yulaf ezmesi veya tam buğdaylı gevrekler\n" +
                                "-Badem, ceviz veya fındık içeren yoğurt\n" +
                                "-Taze veya dondurulmuş meyveler\n" +
                                "-Bir dilim tam buğday ekmeği üzerine doğal fındık ezmesi veya avokado\n\n" +
                                "Ara Öğün:\n" +
                                "\n" +
                                "-Bir avuç dolusu karışık kuruyemiş\n" +
                                "-Bir muz veya bir elma\n" +
                                "-Badem ezmesi ile dilimlenmiş elma veya muz\n\n" +
                                "Öğle Yemeği:\n" +
                                "\n" +
                                "-Izgara tavuk veya hindi göğsü\n" +
                                "-Kepekli pirinç veya tatlı patates\n" +
                                "-Fırınlanmış sebzeler veya yeşil salata\n" +
                                "-Zeytinyağı ve limon suyu ile soslanmış yeşil salata\n\n" +
                                "Ara Öğün:\n" +
                                "\n" +
                                "-Yoğurt veya yoğurtlu meyve smoothiesi\n" +
                                "-Bir dilim tam buğday ekmeği üzerine avokado veya fındık ezmesi\n\n" +
                                "Akşam Yemeği:\n" +
                                "\n" +
                                "-Izgara biftek veya somon\n" +
                                "-Kepekli makarna veya bulgur pilavı\n" +
                                "-Sebzeli çorba veya sebze yemeği\n" +
                                "-Haşlanmış yeşil fasulye veya ızgara sebzeler\n\n" +
                                "Akşam Ara Öğün:\n" +
                                "\n" +
                                "-Yoğurt veya yoğurtlu meyve smoothiesi\n" +
                                "-Bir dilim tam buğday ekmeği üzerine fındık ezmesi veya avokado\n\n" +
                                "Notlar:\n" +
                                "\n" +
                                "-Yüksek kalorili ancak besleyici gıdaları tercih edin. Bunlar arasında yağlı balıklar, fındık ezmesi, avokado ve zeytinyağı bulunur.\n" +
                                "-Öğünler arasında düzenli ara öğünler tüketmeye özen gösterin.\n" +
                                "R-afine şekerlerden ve işlenmiş gıdalardan kaçının. Sağlıklı yağ kaynaklarını (örneğin, zeytinyağı, fındık ve avokado) tercih edin.\n" +
                                "-Daha fazla kalori almak için büyük porsiyonlar ve kalorisi yüksek gıdaları tüketmek yerine, sağlıklı besinlerle dolu sık aralıklı öğünler tercih edin.\n" +
                                "-Egzersiz yaparak kilo alımını destekleyin. Direnç antrenmanları ve ağırlık kaldırma egzersizleri kas kütlesini artırabilir ve sağlıklı kilo alımını teşvik edebilir.",
                        textAlign = TextAlign.Start,
                        fontSize = 19.sp,
                        color = Color.Black
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun KiloAlmaView() {
    val navController = rememberNavController()
    KiloAlma(navController = navController)
}