package com.example.padsous.features.addplan.content

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.ui.theme.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun PlanImage(pageState: PagerState) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(vertical = 40.dp)
            .fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .height(220.dp)
        ) {
            Text(
                color = AlmostBlackCustom,
                fontFamily = IntegralCf,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                text = "photo du bon plan"
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .height(175.dp)
                    .width(175.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(BlueCustom)
            )
            {
                Icon(
                    Icons.Default.Add,
                    tint = Color.White,
                    contentDescription = "add",
                    modifier = Modifier
                        .size(55.dp)
                )
            }
        }
        Button(
            onClick = { /*TODO*/ },
            Modifier
                .width(300.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .height(60.dp),

            colors = ButtonDefaults.buttonColors(
                backgroundColor = BlueCustom,
                contentColor = Color.White
            )
        ) {
            Text(
                color = Color.White,
                fontFamily = IntegralCf,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                text = "AJOUTER CE BON PLAN"
            )
        }
    }
}
