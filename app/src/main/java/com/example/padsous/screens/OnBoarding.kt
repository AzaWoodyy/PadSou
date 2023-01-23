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

@Composable
fun OnBoarding(onNavigateToLogin: () -> Unit) {
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .background(color = BlueCustom)
            .fillMaxWidth()
            .padding(20.dp)
            .fillMaxHeight()
    ) {
            OnBoardingHeader()
            OnBoardingContent()
            OnBoardingFooter(onNavigateToLogin)
    }
}