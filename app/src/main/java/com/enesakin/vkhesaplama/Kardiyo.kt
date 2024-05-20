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
fun Kardiyo(navController: NavController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Image'ın %25'ini kaplaması için weight kullanın
            Image(
                painter = painterResource(id = R.drawable.kardiyovaskuler),
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
                        text = "Kardiyovasküler Sağlığı",
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
                        text = "Kardiyovasküler sağlık için bir diyet programı oluştururken, genel sağlıklı beslenme prensiplerini ve kalp dostu yiyecekleri içeren dengeli bir program hazırlamak önemlidir. Aşağıda örnek bir kardiyovasküler sağlık için diyet programı bulabilirsiniz:\n" +
                                "\n" +
                                "Kahvaltı:\n" +
                                "\n" +
                                "-Yulaf ezmesi veya tam buğdaylı gevrekler\n" +
                                "-Taze veya dondurulmuş meyveler (örneğin, muz veya çilek)\n" +
                                "-Az yağlı süt veya badem sütü\n" +
                                "-ir dilim tam buğday ekmeği üzerine avokado veya fındık ezmesi\n\n" +
                                "Ara Öğün:\n" +
                                "\n" +
                                "-Bir avuç dolusu karışık kuruyemiş\n" +
                                "-Bir meyve (elma, armut veya portakal gibi)\n" +
                                "-Yoğurt veya yoğurtlu meyve smoothiesi\n\n" +
                                "Öğle Yemeği:\n" +
                                "\n" +
                                "-Izgara tavuk veya somon\n" +
                                "-Bulgur pilavı veya kepekli pirinç\n" +
                                "-Fırınlanmış sebzeler (örneğin, kabak, patlıcan ve biber)\n" +
                                "-Yeşil salata (marul, roka, domates, salatalık vb.) ile zeytinyağlı sos\n\n" +
                                "Ara Öğün:\n" +
                                "\n" +
                                "-Havuç veya kereviz gibi çiğ sebzeler\n" +
                                "-Humus veya yoğurt bazlı dip soslar\n\n" +
                                "Akşam Yemeği:\n" +
                                "\n" +
                                "-Kırmızı et (az yağlı), hindi veya tofu\n" +
                                "-Kepekli makarna veya tam buğdaylı makarna\n" +
                                "-Sebzeli çorba veya sebze yemeği\n" +
                                "-Bulgur pilavı veya kinoa\n\n" +
                                "Akşam Ara Öğün:\n" +
                                "\n" +
                                "-Bir dilim tam buğday ekmeği üzerine avokado\n" +
                                "-Biraz az yağlı peynir ve salatalık dilimleri\n\n" +
                                "Notlar:\n" +
                                "\n" +
                                "-Bol miktarda taze meyve ve sebzeleri tüketmeye özen gösterin.\n" +
                                "-Rafine şekerlerden ve işlenmiş gıdalardan kaçının.\n" +
                                "-Trans yağ ve doymuş yağ içeriği yüksek olan yiyecekleri sınırlayın.\n" +
                                "-Kardiyovasküler sağlığı desteklemek için omega-3 yağ asitleri içeren somon gibi yağlı balıkları dahil edin.\n" +
                                "-Bol miktarda su içmeyi ihmal etmeyin.\n" +
                                "-Öğünler arasında dengeli bir şekilde tüketilen küçük ara öğünler kan şekeri seviyelerini dengeler ve tokluk hissini artırır.\n" +
                                "Bu sadece bir örnek diyet programıdır ve " +
                                "kişisel ihtiyaçlarınıza ve tercihlerinize göre " +
                                "özelleştirilebilir. Ancak, kardiyovasküler sağlığı " +
                                "desteklemek için lifli, düşük yağlı ve doğal olarak " +
                                "düşük sodyumlu yiyecekleri tercih etmek önemlidir. " +
                                "Ayrıca, dengeli bir diyetle birlikte düzenli egzersiz " +
                                "yapmak da kardiyovasküler sağlık için hayati öneme sahiptir.",
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
fun KardiyoView() {
    val navController = rememberNavController()
    Kardiyo(navController = navController)
}