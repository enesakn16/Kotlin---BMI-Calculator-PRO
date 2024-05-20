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
fun KiloVerme(navController: NavController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Image'ın %25'ini kaplaması için weight kullanın
            Image(
                painter = painterResource(id = R.drawable.hdkiloverme),
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
                        text = "Kilo Verme Diyeti",
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
                        text = "Kilo verme amacıyla bir diyet programı oluştururken, sağlıklı ve dengeli beslenmeye odaklanmak önemlidir. Aşağıda, kilo verme sürecini desteklemek için önerilen bir diyet programı bulunmaktadır:\n" +
                                "\n" +
                                "Kahvaltı:\n" +
                                "\n" +
                                "-Yulaf ezmesi veya tam buğdaylı gevrekler\n" +
                                "-Az yağlı süt veya badem sütü\n" +
                                "-Taze veya dondurulmuş meyveler\n" +
                                "-Bir dilim tam buğday ekmeği üzerine doğal fındık ezmesi veya avokado\n\n" +
                                "Ara Öğün:\n" +
                                "\n" +
                                "-Bir avuç dolusu karışık kuruyemiş\n" +
                                "-Bir muz veya bir elma\n" +
                                "-Tam buğday krakerleri veya bir dilim peynir\n\n" +
                                "Öğle Yemeği:\n" +
                                "\n" +
                                "-Izgara tavuk veya hindi göğsü\n" +
                                "-Kepekli pirinç veya tatlı patates\n" +
                                "-Fırınlanmış sebzeler veya yeşil salata (sos olarak zeytinyağı ve limon suyu tercih edin)\n\n" +
                                "Ara Öğün:\n" +
                                "\n" +
                                "-Yoğurt veya yoğurtlu meyve smoothiesi\n" +
                                "-Havuç ve salatalık gibi çiğ sebzeler\n\n" +
                                "Akşam Yemeği:\n" +
                                "\n" +
                                "-Izgara somon veya ızgara tavuk\n" +
                                "-Buğday makarna veya quinoa\n" +
                                "-Sebzeli çorba veya sebze yemeği\n" +
                                "-Haşlanmış brokoli veya ızgara sebzeler\n\n" +
                                "Akşam Ara Öğün:\n" +
                                "\n" +
                                "-Bir avuç dolusu badem veya ceviz\n" +
                                "-Bir dilim tam buğday ekmeği üzerine avokado veya fındık ezmesi\n\n" +
                                "Notlar:\n" +
                                "\n" +
                                "-Düşük kalorili ancak besleyici gıdaları tercih edin. Bunlar arasında yeşil yapraklı sebzeler, tam tahıllar, protein kaynakları (tavuk, balık, mercimek gibi), sağlıklı yağlar (zeytinyağı, avokado) ve meyveler bulunur.\n" +
                                "-Kilo kaybını hızlandırmak için işlenmiş gıdaları ve rafine şekerleri mümkün olduğunca azaltın veya bunlardan kaçının.\n" +
                                "-Öğünler arasında düzenli ara öğünler tüketmeye özen gösterin. Bu, açlık hissini kontrol etmeye ve atıştırmalık ihtiyacını azaltmaya yardımcı olabilir.\n" +
                                "-Su içmeyi ihmal etmeyin. Her öğünden önce bir bardak su içmek, tokluk hissini artırabilir ve aşırı yeme eğilimini azaltabilir.\n" +
                                "-Egzersiz yaparak kilo verme sürecini destekleyin. Düzenli egzersiz, metabolizmayı hızlandırabilir ve yağ yakımını artırabilir. Aerobik egzersizler, yürüyüş, koşu, bisiklet sürme gibi aktiviteleri deneyebilirsiniz.",
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
fun KiloVermeView() {
    val navController = rememberNavController()
    KiloVerme(navController = navController)
}