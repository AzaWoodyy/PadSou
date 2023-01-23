package com.example.padsous.features.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.ui.theme.DarkGreyCustom
import com.example.padsous.ui.theme.Inter

@Composable
fun LoginPageFooter() {
    Row  (horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom) {
        Row(modifier = Modifier.padding(80.dp, 60.dp, 70.dp, 0.dp)) {
            Text(
                color = DarkGreyCustom,
                fontFamily = Inter,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,
                text = "Pas encore inscrit ?",
            )
            Text(
                color = Color.Blue,
                fontFamily = Inter,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,
                text = " Allez viens !"
            )
        }


    }
}