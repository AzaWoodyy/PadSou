package com.example.padsous.screens

import OnBoardingContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.padsous.features.onboarding.OnBoardingFooter
import com.example.padsous.features.onboarding.OnBoardingHeader
import com.example.padsous.features.onboarding.VideoPlayer
import com.example.padsous.ui.theme.BlueCustom
import com.google.accompanist.systemuicontroller.SystemUiController

@Composable
fun VideoPage(
    systemUiController: SystemUiController
) {
    systemUiController.setSystemBarsColor(
        color = Color.Black
    )
    VideoPlayer()
}