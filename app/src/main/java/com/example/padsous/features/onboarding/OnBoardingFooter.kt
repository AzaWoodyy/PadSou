package com.example.padsous.features.onboarding

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.ui.theme.IntegralCf
import com.example.padsous.ui.theme.SalmonCustom

@Composable
fun OnBoardingFooter(onNavigateToLogin: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .offset(y = -(50).dp)
    ) {
        Button(
            onClick = onNavigateToLogin,
            Modifier
                .width(250.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .height(50.dp),

            colors = ButtonDefaults.buttonColors(
                backgroundColor = SalmonCustom,
                contentColor = Color.White
            )
        ) {
            Text(
                color = Color.White,
                fontFamily = IntegralCf,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                text = "C'EST PARTI !"
            )
        }
    }
}
