package com.example.padsous.features.plandetail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.ui.theme.*

@Composable
fun PlanDetailHeader(img: Int, title: String, subtitle: String) {
    val gradient = Brush.horizontalGradient(
        colors = listOf(AlmostBlackOpacityCustom, Color.Transparent),
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        )
        {
            Image(
                painter = painterResource(id = img),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(0.dp, 0.dp, 30.dp, 30.dp))
                    .fillMaxHeight(),
                contentDescription = "img"
            )
            Box(modifier = Modifier
                .matchParentSize()
                .clip(RoundedCornerShape(0.dp, 0.dp, 30.dp, 30.dp))
                .background(gradient))
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(16.dp)
                    .padding(start = 10.dp)
            ) {
                Text(
                    title,
                    color = Color.White,
                    fontFamily = IntegralCf,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.padding(top = 5.dp))
                Text(
                    subtitle,
                    color = Color.White,
                    fontFamily = Inter,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
            }

        }
    }
}