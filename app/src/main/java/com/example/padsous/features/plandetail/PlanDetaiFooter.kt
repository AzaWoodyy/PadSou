package com.example.padsous.features.plandetail

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
import com.example.padsous.api.addPlan
import com.example.padsous.models.Plan
import com.example.padsous.ui.theme.BlueCustom
import com.example.padsous.ui.theme.IntegralCf

@Composable
fun PlanDetailFooter(plan: Plan) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .offset(y = 150.dp)
    ) {
        Button(
            onClick = { addPlan(plan = plan) },
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
                text = "PROFITER DE L'OFFRE"
            )
        }
    }
}