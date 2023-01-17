package com.example.padsous.features.homepage.content

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import com.example.padsous.ui.theme.IntegralCf

@Composable
fun TypeIcon(text: String, color: Color, icon: Int) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .height(80.dp)
            .width(60.dp)
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .clip(RoundedCornerShape(5.dp))
                .fillMaxWidth()
                .background(color)
                .padding(start = 20.dp, end = 20.dp)
        ) {
            Image(
                painter = painterResource(id = icon),
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                contentDescription = "Icon"
            )
        }
        Spacer(modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp))
        Text(
            color = color,
            text = text,
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = IntegralCf
        )
    }
}

