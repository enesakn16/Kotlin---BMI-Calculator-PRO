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
fun AnneveBebek(navController: NavController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Image'ın %25'ini kaplaması için weight kullanın
            Image(
                painter = painterResource(id = R.drawable.annevebebek),
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
                        text = "Anne ve Bebek Sağlığı",
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
                        text = "Hamilelik döneminde özellikle dikkat edilmesi gereken bazı besin öğeleri vardır. Bunlar arasında folik asit, demir, kalsiyum, protein ve omega-3 yağ asitleri gibi önemli besin maddeleri bulunmaktadır. Folik asit, nöral tüp defektleri riskini azaltmaya yardımcı olurken, demir anemi riskini azaltır. Kalsiyum, kemik ve diş sağlığı için önemlidir, protein ise bebeğin dokularının ve organlarının gelişimi için gereklidir. Omega-3 yağ asitleri ise bebeğin beyin ve göz gelişimine katkıda bulunur.\n" +
                                "\n" +
                                "Hamilelik döneminde sağlıklı bir diyet programı oluşturmak için aşağıdaki beslenme ilkelerine dikkat etmek önemlidir:\n" +
                                "\n" +
                                "Çeşitli besinler tüketin: Her öğünde farklı besin gruplarından yiyecekler seçmeye özen gösterin. Meyve, sebze, tam tahıllar, protein kaynakları ve sağlıklı yağlar içeren bir diyet benimseyin.\n" +
                                "\n" +
                                "Yeterli sıvı alımına dikkat edin: Bol miktarda su içmek, hamilelik sürecinde vücudunuzu hidrate etmek ve sindirim sisteminizin düzgün çalışmasını sağlamak için önemlidir.\n" +
                                "\n" +
                                "Yüksek lifli yiyecekler tüketin: Lifli yiyecekler, sindirim sisteminin düzenli çalışmasına yardımcı olur ve kabızlık riskini azaltır. Tam tahıllı ekmekler, sebzeler, meyveler ve baklagiller lif açısından zengin yiyeceklerdir.\n" +
                                "\n" +
                                "Günlük folik asit alımınızı artırın: Folik asit içeren yiyecekler tüketmek, nöral tüp defektleri riskini azaltır. Yeşil yapraklı sebzeler, fasulye, mercimek, portakal suyu ve tam tahıllı ekmekler folik asit kaynaklarıdır.\n" +
                                "\n" +
                                "Demir ve kalsiyum alımına dikkat edin: Hamilelik döneminde demir ve kalsiyum ihtiyacınız artar. Kırmızı et, tavuk, balık, koyu yeşil yapraklı sebzeler, süt ve süt ürünleri demir ve kalsiyum açısından zengin yiyeceklerdir.\n" +
                                "\n" +
                                "Zararlı maddelerden kaçının: Alkol, kafein ve sigara gibi zararlı maddelerden uzak durun. Bu maddeler bebeğinizin sağlığını olumsuz etkileyebilir.",
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
                        text = "Anne ve Bebek Sağlığı: Örnek Diyet",
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
                        text = "Kahvaltı: \n\n-Yulaf ezmesi\n -Fındık ezmesi \n -Taze meyve\n\n" +
                                "Ara Öğün: \n\n-Yoğurt veya meyve\n\n" +
                                "Öğle Yemeği:\n\n -Izgara tavuk \n-Bulgur pilavı\n -Sebzeli salata\n\n" +
                                "Ara Öğün:\n\n -Badem veya ceviz\n\n" +
                                "Akşam Yemeği:\n\n -Somon balığı \n-Kahverengi pirinç\n -Buharda sebzeler\n\n" +
                                "İkinci Akşam Yemeği:\n\n -Tam buğday ekmeği \n-Avokado ve hardal\n\n" +
                                "Bu diyet programı, anne ve bebek sağlığını desteklemek için " +
                                "çeşitli besinleri içerir. Ancak, hamilelik sürecinde her " +
                                "kadının bireysel beslenme ihtiyaçları farklı olduğu için, " +
                                "diyet programının doktor veya beslenme uzmanı tarafından " +
                                "kişiselleştirilmesi önemlidir.",
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
fun AnneveBebekView() {
    val navController = rememberNavController()
    AnneveBebek(navController = navController)
}