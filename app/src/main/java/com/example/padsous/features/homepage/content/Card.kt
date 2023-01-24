package com.example.padsous.features.homepage.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.models.Plan
import com.example.padsous.ui.theme.AlmostBlackCustom
import com.example.padsous.ui.theme.Inter

@Composable
fun Card(plan: Plan, navigateToDetail: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RoundedCornerShape(15.dp))
            .width(150.dp)
            .background(Color.White)
            .padding(10.dp),
    ) {
        Box(
            contentAlignment = Alignment.BottomCenter,
            modifier = Modifier.clickable { navigateToDetail() }
        )
        {
            Image(
                painter = painterResource(id = plan.descImage),
                modifier = Modifier
                    .height(90.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .width(145.dp)
                    .fillMaxHeight(),
                contentDescription = "descimg"
            )
            Image(
                painter = painterResource(id = plan.image),
                modifier = Modifier
                    .height(30.dp)
                    .offset(y = 12.dp)
                    .clip(RoundedCornerShape(30.dp))
                    .border(2.dp, Color.White, RoundedCornerShape(30.dp))
                    .width(30.dp)
                    .background(Color.White),
                contentDescription = "img"
            )
        }
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .padding(top = 15.dp, bottom = 5.dp)
                .padding(horizontal = 5.dp)
                .fillMaxWidth()
        )
        {
            Text(
                text = plan.name,
                color = AlmostBlackCustom,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                fontFamily = Inter
            )
            Text(
                text = plan.description,
                color = AlmostBlackCustom,
                fontWeight = FontWeight.Medium,
                fontSize = 10.sp,
                fontFamily = Inter
            )
        }
    }
}