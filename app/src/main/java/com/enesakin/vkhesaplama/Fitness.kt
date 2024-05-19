package com.enesakin.vkhesaplama

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
fun FitnessPage(navController: NavController){
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Image'ın %25'ini kaplaması için weight kullanın
            Image(
                painter = painterResource(id = R.drawable.fitness2),
                contentDescription = "Background Image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
            )
        }
        val myColor = Color(0xFF32357A)
            Surface(modifier = Modifier
                .padding(top = 260.dp)
                .clip(shape = RoundedCornerShape(topStartPercent = 10, topEndPercent = 10))) {
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
                            text = "Temel Prensipler:\n\n" +
                                    "Kalori Fazlası: Günlük enerji ihtiyacının 500-700 kalori üzerine çıkmak.\n" +
                                    "\n" +
                                    "Protein: Kas kütlesini artırmak için yeterli protein alımı (vücut ağırlığının kilogramı başına 1.5-2 gram).\n" +
                                    "\n" +
                                    "Sağlıklı Yağlar: Sağlıklı yağ kaynaklarından gelen kalorileri artırmak.\n" +
                                    "Dengeli Karbonhidratlar: Kompleks karbonhidratlardan gelen enerjiyi artırmak.\n" +
                                    "\n" +
                                    "Tercih Edilmesi Gereken Yiyecekler:\n" +
                                    "\n" +
                                    "Protein Kaynakları: Tavuk, hindi, balık, yağsız kırmızı et, yumurta, süt ürünleri, baklagiller, tofu.\n" +
                                    "\n" +
                                    "Sağlıklı Yağlar: Avokado, zeytinyağı, fındık, badem, ceviz, chia tohumu, keten tohumu.\n" +
                                    "\n" +
                                    "Karbonhidratlar: Tam tahıllar, yulaf, esmer pirinç, tam buğday ekmeği, tatlı patates, meyveler.\n" +
                                    "\n" +
                                    "Kalori Yoğun Yiyecekler: Kuruyemişler, fıstık ezmesi, peynir, kurutulmuş meyveler.\n" +
                                    "\n" +
                                    "Örnek Günlük Yemek Planı:\n" +
                                    "\n" +
                                    "Kahvaltı:\n" +
                                    "\n" +
                                    "-3 büyük yumurta omleti (sebzelerle dolu)\n" +
                                    "-2 dilim tam buğday ekmeği\n" +
                                    "-1 avokado\n" +
                                    "-1 bardak tam yağlı süt\n" +
                                    "\n" +
                                    "Ara Öğün:\n" +
                                    "\n" +
                                    "-Bir avuç fındık ve kuru üzüm\n" +
                                    "-1 muz\n" +
                                    "\n" +
                                    "Öğle Yemeği:\n" +
                                    "\n" +
                                    "-200 gram tavuk göğsü\n" +
                                    "-1 su bardağı esmer pirinç\n" +
                                    "-Buharda pişirilmiş brokoli ve havuç\n" +
                                    "-1 yemek kaşığı zeytinyağı\n" +
                                    "\n" +
                                    "Ara Öğün:\n" +
                                    "\n" +
                                    "-Yoğurt ve granola\n" +
                                    "-Bir avuç badem\n" +
                                    "\n" +
                                    "Akşam Yemeği:\n" +
                                    "\n" +
                                    "-250 gram somon balığı\n" +
                                    "-1 tatlı patates\n" +
                                    "-Karışık yeşil salata (zeytinyağı soslu)\n" +
                                    "\n" +
                                    "Gece Öğünü:\n" +
                                    "\n" +
                                    "-1 kase tam yağlı yoğurt\n" +
                                    "-1 yemek kaşığı bal\n" +
                                    "-Bir avuç ceviz",
                            textAlign = TextAlign.Start,
                            fontSize = 19.sp,
                            color = Color.Black
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
                            text = "Temel Prensipler:\n\n" +
                                    "Kalori Açığı: Günlük enerji ihtiyacının 500-700 kalori altında kalmak.\n" +
                                    "\n" +
                                    "Protein: Kas kaybını önlemek için yeterli protein alımı (vücut ağırlığının kilogramı başına 1.2-1.5 gram).\n" +
                                    "\n" +
                                    "Sağlıklı Yağlar: Sağlıklı yağ kaynaklarından yeterli miktarda yağ almak.\n" +
                                    "\n" +
                                    "Dengeli Karbonhidratlar: Kompleks karbonhidratlardan gelen enerjiyi azaltmak.\n" +
                                    "\n" +
                                    "Tercih Edilmesi Gereken Yiyecekler:\n" +
                                    "\n" +
                                    "Protein Kaynakları: Yağsız etler, balık, tavuk, hindi, baklagiller, az yağlı süt ürünleri, tofu.\n" +
                                    "\n" +
                                    "Sağlıklı Yağlar: Avokado, zeytinyağı, fındık, badem, ceviz, chia tohumu, keten tohumu.\n" +
                                    "\n" +
                                    "Karbonhidratlar: Tam tahıllar, yulaf, esmer pirinç, tam buğday ekmeği, sebzeler, meyveler.\n" +
                                    "\n" +
                                    "Örnek Günlük Yemek Planı:\n" +
                                    "\n" +
                                    "Kahvaltı:\n" +
                                    "\n" +
                                    "-2 büyük yumurta beyazı omleti (sebzelerle dolu)\n" +
                                    "-1 dilim tam buğday ekmeği\n" +
                                    "-1/2 avokado\n" +
                                    "-1 bardak az yağlı süt\n" +
                                    "\n" +
                                    "Ara Öğün:\n" +
                                    "\n" +
                                    "-1 elma\n" +
                                    "-Bir avuç badem\n" +
                                    "\n" +
                                    "Öğle Yemeği:\n" +
                                    "\n" +
                                    "-150 gram ızgara tavuk göğsü\n" +
                                    "-Karışık yeşil salata (limon soslu)\n" +
                                    "-1/2 su bardağı esmer pirinç\n" +
                                    "\n" +
                                    "Ara Öğün:\n" +
                                    "\n" +
                                    "-Yoğurt ve taze meyve\n" +
                                    "\n" +
                                    "Akşam Yemeği:\n" +
                                    "\n" +
                                    "-200 gram ızgara somon balığı\n" +
                                    "-Buharda pişirilmiş brokoli ve karnabahar\n" +
                                    "-1 tatlı patates\n" +
                                    "\n" +
                                    "Gece Öğünü:\n" +
                                    "\n" +
                                    "-1 kase yoğurt\n" +
                                    "-Bir avuç ceviz",
                            textAlign = TextAlign.Start,
                            fontSize = 19.sp,
                            color = Color.Black
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 15.dp, start = 0.dp, end = 10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Mevcut Kiloyu Koruma Diyeti",
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
                            text = "Temel Prensipler:\n\n" +
                                    "Kalori Dengesi: Günlük enerji ihtiyacına denk gelen kalori almak.\n\n" +
                                    "Protein: Kas kütlesini korumak için yeterli protein alımı (vücut ağırlığının kilogramı başına 1-1.2 gram).\n\n" +
                                    "Sağlıklı Yağlar: Sağlıklı yağ kaynaklarından yeterli miktarda yağ almak.\n\n" +
                                    "Dengeli Karbonhidratlar: Kompleks karbonhidratlardan gelen enerjiyi dengeli bir şekilde almak.\n\n" +
                                    "Tercih Edilmesi Gereken Yiyecekler:\n\n" +
                                    "Protein Kaynakları: Tavuk, hindi, balık, yağsız kırmızı et, yumurta, süt ürünleri, baklagiller, tofu.\n\n" +
                                    "Sağlıklı Yağlar: Avokado, zeytinyağı, fındık, badem, ceviz, chia tohumu, keten tohumu.\n\n" +
                                    "Karbonhidratlar: Tam tahıllar, yulaf, esmer pirinç, tam buğday ekmeği, sebzeler, meyveler.\n\n" +
                                    "Örnek Günlük Yemek Planı:\n\n" +
                                    "Kahvaltı:\n" +
                                    "\n" +
                                    "-2 büyük yumurta omleti (sebzelerle dolu)\n" +
                                    "-1 dilim tam buğday ekmeği\n" +
                                    "-1/2 avokado\n" +
                                    "-1 bardak az yağlı süt\n\n" +
                                    "Ara Öğün:\n" +
                                    "\n" +
                                    "-1 muz\n" +
                                    "-Bir avuç fındık\n\n" +
                                    "Öğle Yemeği:\n" +
                                    "\n" +
                                    "-150 gram tavuk göğsü\n" +
                                    "-1 su bardağı esmer pirinç\n" +
                                    "-Buharda pişirilmiş brokoli ve havuç\n\n" +
                                    "Ara Öğün:\n" +
                                    "\n" +
                                    "-Yoğurt ve taze meyve\n\n" +
                                    "Akşam Yemeği:\n" +
                                    "\n" +
                                    "-200 gram ızgara somon balığı\n" +
                                    "-1 tatlı patates\n" +
                                    "-Karışık yeşil salata (zeytinyağı soslu)\n\n" +
                                    "Gece Öğünü:\n" +
                                    "\n" +
                                    "-1 kase yoğurt\n" +
                                    "-Bir avuç ceviz\n\n" +
                                    "Genel Diyet Tavsiyeleri\n" +
                                    "Su İçmek: Günlük olarak yeterli miktarda su tüketmek (ortalama 2-3 litre).\n\n" +
                                    "Düzenli Öğünler: Öğün atlamadan, düzenli olarak yemek yemek.\n\n" +
                                    "Sağlıklı Atıştırmalıklar: Sağlıklı ve düşük kalorili atıştırmalıkları tercih etmek.\n\n" +
                                    "Şeker ve İşlenmiş Gıdalardan Kaçınmak: Şekerli ve işlenmiş gıdaların tüketimini minimize etmek.\n\n" +
                                    "Dengeli Beslenme: Protein, yağ ve karbonhidratları dengeli bir şekilde tüketmek.\n\n" +
                                    "Bu diyet planları, kişisel sağlık durumu ve hedeflere göre özelleştirilebilir. Diyet planlarına başlamadan önce bir beslenme uzmanı veya doktor ile görüşmek her zaman önemlidir.",
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
fun FitnessView(){
    val navController = rememberNavController()
    FitnessPage(navController = navController)
}