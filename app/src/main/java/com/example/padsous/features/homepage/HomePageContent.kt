import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.R
import com.example.padsous.ui.theme.AlmostBlackCustom
import com.example.padsous.ui.theme.IntegralCf
import com.example.padsous.ui.theme.Inter
import com.example.padsous.ui.theme.SalmonCustom
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
@OptIn(ExperimentalPagerApi::class)
@Composable
fun HomePageContent() {
    val pagerState = rememberPagerState()
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .height(500.dp)
            .padding(0.dp, 80.dp, 0.dp, 0.dp)
            .fillMaxWidth()
    ) {
        HorizontalPagerIndicator(
            pagerState = pagerState,
            indicatorWidth = 25.dp,
            indicatorHeight = 5.dp,
            spacing = 6.dp,
            modifier = Modifier.padding(16.dp),
        )
        HorizontalPager(count = 3, state = pagerState)
        { page ->
            Box(
                modifier = Modifier
                    .width(250.dp)
                    .height(250.dp)
                    .clip(shape = RoundedCornerShape(25.dp))
                    .background(color = Color.White)
                    .padding(15.dp)
            ) {
                Text(
                    color = AlmostBlackCustom,
                    fontFamily = Inter,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    text = "$page"
                )
            }
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .width(250.dp)
                .padding(5.dp, 15.dp, 5.dp, 0.dp)
        ) {
            Text(
                color = Color.White,
                fontFamily = Inter,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                text = "Accède aux 500 bons plans qu’on te propose chaque mois"
            )
        }

    }
}
