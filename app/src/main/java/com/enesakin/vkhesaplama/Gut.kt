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
fun Gut(navController: NavController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.gut),
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
                painter = painterResource(id = R.drawable.background11),
                contentDescription = "Background Image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()
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
                        text = "Gut Sağlığı",
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
                        text = "Gut hastalığı, vücutta yüksek ürik asit seviyeleri " +
                                "nedeniyle ortaya çıkan bir rahatsızlıktır. Bu durum, " +
                                "genellikle ağrılı eklem iltihabına ve diğer semptomlara " +
                                "neden olabilir. Gut hastalığı olan kişiler için beslenme " +
                                "oldukça önemlidir, çünkü bazı yiyecekler belirtileri " +
                                "artırabilirken, diğerleri semptomları hafifletebilir. " +
                                "İşte gut hastalığı için önerilen bir diyet programı:\n" +
                                "\n" +
                                "Yüksek proteinli yiyecekler: Tavuk, hindi, balık gibi yağsız protein kaynakları tercih edilmelidir.\n\n" +
                                "Az yağlı süt ve süt ürünleri: Yağsız süt, yoğurt ve az yağlı peynir tüketilebilir.\n\n" +
                                "Tam tahıllı ürünler: Kepekli ekmek, kahverengi pirinç ve yulaf ezmesi gibi tam tahıllı ürünlerin tercih edilmesi önerilir.\n" +
                                "Sebzeler: Özellikle yeşil yapraklı sebzeler ve renkli sebzeler tüketilmelidir.\n\n" +
                                "Meyveler: Çilek, kiraz, ananas gibi antioksidan açısından zengin meyveler tercih edilmelidir.\n\n" +
                                "Sağlıklı yağlar: Zeytinyağı, avokado ve ceviz gibi sağlıklı yağlar kullanılabilir.\n\n" +
                                "Sıvı alımı: Bol miktarda su içmek önemlidir, çünkü su, vücuttaki ürik asit seviyelerini düşürebilir.\n\n" +
                                "Kafein ve alkolden kaçınma: Kafein ve alkol, gut ataklarını tetikleyebileceğinden sınırlanmalı veya mümkünse tamamen kaçınılmalıdır.\n" +
                                "Bu diyet programı, gut hastalığının semptomlarını azaltmaya yardımcı olabilir ve genel sağlık üzerinde olumlu etkiler sağlayabilir. Ancak, her bireyin ihtiyaçları farklı olduğundan, diyet programı bir doktor veya beslenme uzmanı tarafından kişiselleştirilmelidir.",
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
                        text = "Gut Sağlığı: Örnek Diyet",
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
                        text = "Gut hastalığı olan bir kişi için bir örnek diyet programı şu şekilde olabilir:\n" +
                                "\n" +
                                "Sabah:\n" +
                                "\n" +
                                "-Bir bardak su ile başlayın.\n" +
                                "-1 dilim kepekli ekmek üzerine az yağlı peynir ve domates dilimleri ile sandviç.\n" +
                                "-1 adet meyve (örneğin, çilek veya ananas).\n" +
                                "-Bir bardak yeşil çay.\n" +
                                "Ara öğün:\n" +
                                "\n" +
                                "-10 adet badem veya ceviz.\n\n" +
                                "Öğle:\n" +
                                "\n" +
                                "-Izgara tavuk salatası (marul, domates, salatalık, biber, soğan ve ızgara tavuk parçaları ile).\n" +
                                "-Yarım bardak kepekli pilav veya kahverengi pirinç.\n" +
                                "-Bir dilim tam tahıllı ekmek.\n" +
                                "-Bir bardak su veya limonata.\n\n" +
                                "Ara öğün:\n" +
                                "\n" +
                                "-Bir avuç karışık meyve (örneğin, çilek ve kivi).\n\n" +
                                "Akşam:\n" +
                                "\n" +
                                "-Izgara somon balığı.\n" +
                                "-Fırında sebzeler (patates, havuç, kabak ve brokoli).\n" +
                                "-Bir dilim tam tahıllı ekmek.\n" +
                                "-Bir bardak ıhlamur veya adaçayı.\n\n" +
                                "Ara öğün:\n" +
                                "\n" +
                                "-Biraz hafif yoğurt veya ayran.\n\n" +
                                "Gece:\n" +
                                "\n" +
                                "-1 bardak yağsız süt veya badem sütü.\n" +
                                "-Birkaç kavrulmuş tam buğday kraker ve az miktarda lor peyniri.\n" +
                                "Bu örnek diyet programı, gut hastalığı semptomlarını hafifletmeye ve" +
                                " genel sağlığı iyileştirmeye yardımcı olabilir. Ancak, herkesin " +
                                "vücut yapısı ve ihtiyaçları farklı olduğu için, bireysel " +
                                "ihtiyaçlar göz önünde bulundurularak bir sağlık uzmanı veya " +
                                "beslenme uzmanı tarafından kişiselleştirilmelidir.",
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
fun GutVermeView() {
    val navController = rememberNavController()
    Gut(navController = navController)
}