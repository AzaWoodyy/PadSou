package com.example.padsous.features.homepage


import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.ui.theme.IntegralCf
import com.example.padsous.ui.theme.Inter
import com.example.padsous.ui.theme.AlmostBlackCustom


@Composable
fun RegisterPageHeader() {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(0.dp, 40.dp, 0.dp, 50.dp)
                .fillMaxWidth()
        ){
            Text(
                color = AlmostBlackCustom,
                fontFamily = IntegralCf,
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                text = "Bienvenue \uD83D\uDE0E"
            )

            Spacer(modifier = Modifier.height(10.dp))

            Column() {
                Text(
                    color = AlmostBlackCustom,
                    modifier = Modifier.padding(horizontal = 60.dp),
                    text = "Inscris-toi pour avoir les meilleurs plans étudiants !",
                    fontFamily = Inter,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
    }

