import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.example.padsous.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.ui.theme.AlmostBlackCustom
import com.example.padsous.ui.theme.Inter
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnBoardingContent() {
    val pagerState = rememberPagerState()
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .height(500.dp)
            .padding(0.dp, 40.dp, 0.dp, 0.dp)
            .fillMaxWidth()
    ) {
        HorizontalPagerIndicator(
            pagerState = pagerState,
            activeColor = Color.White,
            indicatorWidth = 25.dp,
            indicatorHeight = 5.dp,
            spacing = 6.dp,
            modifier = Modifier.padding(16.dp),
        )
        HorizontalPager(
            count = 3,
            state = pagerState,
            itemSpacing = 10.dp
        )
        { page ->
            Box(
                //center content
                modifier = Modifier
                    .width(250.dp)
                    .height(250.dp)
                    .clip(shape = RoundedCornerShape(25.dp))
                    .background(color = Color.White)
                    .padding(15.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.menus),
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    contentDescription = "menu1"
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
