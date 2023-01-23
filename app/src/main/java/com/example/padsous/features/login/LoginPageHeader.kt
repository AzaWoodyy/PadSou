package com.example.padsous.features.login

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.ui.theme.AlmostBlackCustom
import com.example.padsous.ui.theme.IntegralCf
import com.example.padsous.ui.theme.Inter

@Composable
fun LoginPageHeader() {
    Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(0.dp, 60.dp, 0.dp, 50.dp)
                .fillMaxWidth()) {

            Column(Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp)) {
                Text(
                    color = AlmostBlackCustom,
                    fontFamily = IntegralCf,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    text = "Te revoilà !\uD83D\uDD25"
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Column() {
                Text(
                    color = AlmostBlackCustom,
                    modifier = Modifier.padding(horizontal = 50.dp),
                    text = "Reviens vite pour profiter des bons plans",
                    fontFamily = Inter,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Center)
            }
    }



}