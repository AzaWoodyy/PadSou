package com.example.padsous.screens

import HomePageContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.padsous.features.homepage.HomePageHeader
import com.example.padsous.ui.theme.BlueCustom

@Composable
fun HomePage(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .background(BlueCustom)
    ) {
        HomePageHeader()
        HomePageContent(navController)
    }
}

