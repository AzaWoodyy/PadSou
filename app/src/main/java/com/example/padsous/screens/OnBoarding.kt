package com.example.padsous.screens

import OnBoardingContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.padsous.features.onboarding.OnBoardingFooter
import com.example.padsous.features.onboarding.OnBoardingHeader
import com.example.padsous.ui.theme.BlueCustom
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun OnBoarding(systemUiController: SystemUiController) {
    systemUiController.setSystemBarsColor(
        color = BlueCustom
    )

    Column(
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .background(color = BlueCustom)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
            OnBoardingHeader()
            OnBoardingContent()
            OnBoardingFooter()
    }
}