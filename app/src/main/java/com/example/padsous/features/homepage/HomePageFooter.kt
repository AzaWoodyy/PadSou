package com.example.padsous.features.homepage

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.ui.theme.IntegralCf
import com.example.padsous.ui.theme.Inter
import com.example.padsous.ui.theme.SalmonCustom
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun HomePageFooter() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 0.dp, 0.dp, 20.dp)
    ) {
        Button(
            onClick = { /*TODO*/ },
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
                text = "C EST PARTI"
            )
        }
    }
}
