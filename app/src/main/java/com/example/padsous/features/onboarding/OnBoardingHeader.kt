package com.example.padsous.features.onboarding

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.ui.theme.IntegralCf
import com.example.padsous.ui.theme.SalmonCustom

@Composable
fun OnBoardingHeader() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(0.dp, 75.dp, 0.dp, 0.dp)
            .fillMaxWidth()
            ){
        Text(
            color = Color.White,
            fontFamily = IntegralCf,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            text = "PAS DE SOUS ?"
        )
        Spacer(modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp))
        Text(
            color = SalmonCustom,
            fontFamily = IntegralCf,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            text = "YA PADSOU."
        )
    }
}
