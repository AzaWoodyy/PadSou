import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import com.example.padsous.R
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.padsous.features.homepage.content.Card
import com.google.accompanist.flowlayout.FlowRow
import com.example.padsous.features.homepage.content.TypeIcon
import com.example.padsous.models.Plan
import com.example.padsous.models.Screen
import com.example.padsous.ui.theme.*
import com.google.accompanist.flowlayout.FlowCrossAxisAlignment
import com.google.accompanist.flowlayout.MainAxisAlignment

@Composable
fun DetailContent(navController: NavController) {
    val plan1: Plan = Plan(id = 1, name = "Abonnement 1 an", description = "2 mois offerts", image = "https://www.basic-fit.com/dw/image/v2/BDFP_PRD/on/demandware.static/-/Library-Sites-basic-fit-shared-library/default/dw77102969/1280x720_blog_make_fitness_a_basic.jpg", logo = R.drawable.sportimg, nbTesters = 25, link = "")
    val plan2: Plan = Plan(id = 2, name = "Le grand barathon", description = "1 verre acheté = 1 offert", image = "https://www.challenges.fr/assets/img/2022/10/06/cover-r4x3w1200-633eeafb54371-sir-winston2-romainricard-09.jpg", logo = R.drawable.barimg, nbTesters = 25, link = "")
    val plan3: Plan = Plan(id = 3, name = "Reduc Rbnb", description = "50% pendant 2 mois", image = "https://news.airbnb.com/wp-content/uploads/sites/4/2019/06/PJM020719Q202_Luxe_WanakaNZ_LivingRoom_0264-LightOn_R1.jpg", logo = R.drawable.hostelimg, nbTesters = 25, link = "")
    val plan4: Plan = Plan(id = 4, name = "Bon plan otacos", description = "1 tacos acheté 1 tacos offert", image = "https://www.gazettemoselle.fr/thumbs/1368%C3%971026/wp-content/uploads/2019/07/19-07-04-11-56-00.jpg", logo = R.drawable.kebabimg, nbTesters = 25, link = "")
    val plan5: Plan = Plan(id = 5, name = "Abonnement 1 an", description = "2 mois offerts", image = "https://www.basic-fit.com/dw/image/v2/BDFP_PRD/on/demandware.static/-/Library-Sites-basic-fit-shared-library/default/dw77102969/1280x720_blog_make_fitness_a_basic.jpg", logo = R.drawable.sportimg, nbTesters = 25, link = "")
    val plan6: Plan = Plan(id = 6, name = "Le grand barathon", description = "1 verre acheté = 1 offert", image = "https://www.challenges.fr/assets/img/2022/10/06/cover-r4x3w1200-633eeafb54371-sir-winston2-romainricard-09.jpg", logo = R.drawable.barimg, nbTesters = 25, link = "")
    val plan7: Plan = Plan(id = 7, name = "Reduc Rbnb", description = "50% pendant 2 mois", image = "https://news.airbnb.com/wp-content/uploads/sites/4/2019/06/PJM020719Q202_Luxe_WanakaNZ_LivingRoom_0264-LightOn_R1.jpg", logo = R.drawable.hostelimg, nbTesters = 25, link = "")
    val plan8: Plan = Plan(id = 8, name = "Bon plan otacos", description = "1 tacos acheté 1 tacos offert", image = "https://www.gazettemoselle.fr/thumbs/1368%C3%971026/wp-content/uploads/2019/07/19-07-04-11-56-00.jpg", logo = R.drawable.kebabimg, nbTesters = 25, link = "")
    val plans = listOf(plan1, plan2, plan3, plan4, plan5, plan6, plan7, plan8)

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,

        modifier = Modifier
            .clip(RoundedCornerShape(topEnd = 35.dp, topStart = 35.dp))
            .background(MediumGreyCustom)
            .verticalScroll(rememberScrollState())
            .fillMaxWidth()
            .fillMaxHeight()
    ){
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 35.dp)
                .padding(horizontal = 20.dp)
        ) {
            TypeIcon(text = "COURSES", color = DarkBlueCustom, icon = R.drawable.courses)
            TypeIcon(text = "SPORT", color = SalmonCustom, icon = R.drawable.sport)
            TypeIcon(text = "TRAINS", color = LightBlueCustom, icon = R.drawable.trains)
            TypeIcon(text = "SOIREES", color = LightPurpleCustom, icon = R.drawable.soirees)
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp)
                .padding(horizontal = 20.dp)
        ) {
            Text(text = "LES PLANS DU MOMENT", color = AlmostBlackCustom, fontSize = 14.sp, fontWeight = FontWeight.Bold, fontFamily = IntegralCf)
            Text(
                text = "Voir tout",
                color = PinkOrangeCustom,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = Inter
            )
        }
        FlowRow(
            crossAxisAlignment = FlowCrossAxisAlignment.Center,
            mainAxisAlignment = MainAxisAlignment.SpaceEvenly,
            crossAxisSpacing = 10.dp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, bottom = 35.dp)
        ) {
            for (plan in plans) {
                Card(plan = plan, navigateToDetail = {navController.navigate(Screen.PlanDetailScreen.route+"/"+plan.id)})
            }
        }
    }
}

