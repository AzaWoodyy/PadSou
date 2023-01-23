package com.example.padsous.features.addplan

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.ui.theme.IntegralCf
import com.example.padsous.ui.theme.Inter

@Composable
fun AddPlanHeader() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(20.dp, 55.dp, 120.dp, 0.dp)
            .height(120.dp)
            .fillMaxWidth()
    ) {
        Text(
            color = Color.White,
            fontFamily = IntegralCf,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            text = "AJOUTER"
        )
        Spacer(modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp))
        Text(
            color = Color.White,
            fontFamily = Inter,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            text = "Un bon plan pour en faire profiter les autres"
        )
    }
}