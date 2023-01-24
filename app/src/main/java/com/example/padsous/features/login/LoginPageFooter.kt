package com.example.padsous.features.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.features.navigation.NoRippleTheme
import com.example.padsous.ui.theme.DarkGreyCustom
import com.example.padsous.ui.theme.Inter

@Composable
fun LoginPageFooter(navigateToLoginRegister: () -> Unit) {
    Row  (horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom) {
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(top = 60.dp)
                .offset(y = -(30.dp))
                .fillMaxWidth()
        ) {
            Text(
                color = DarkGreyCustom,
                fontFamily = Inter,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,
                text = "Pas encore inscrit ?",
            )

            CompositionLocalProvider(LocalRippleTheme provides NoRippleTheme) {
                Text(
                    color = Color.Blue,
                    fontFamily = Inter,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    text = " Allez viens !",
                    modifier = Modifier.clickable { navigateToLoginRegister() }
                )
            }
        }
    }
}