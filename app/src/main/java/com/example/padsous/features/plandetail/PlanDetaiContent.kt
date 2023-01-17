package com.example.padsous.features.plandetail

import androidx.compose.foundation.background
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
import com.example.padsous.models.Plan
import com.example.padsous.ui.theme.*

@Composable
fun PlanDetailContent(planId: Int, nbTesters: Int) {


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 40.dp)
    ) {
        Comment()
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "TESTÉE PAR $nbTesters GALERIENS",
            color = AlmostBlackCustom,
            fontFamily = IntegralCf,
            fontSize = 14.sp,
            fontWeight = FontWeight.Black
        )
    }
}