package com.example.padsous.screens

import HomePageContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.padsous.features.homepage.HomePageFooter
import com.example.padsous.features.homepage.HomePageHeader
import com.example.padsous.ui.theme.BlueCustom

@Composable
fun HomePage() {
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .background(color = BlueCustom)
            .fillMaxWidth()
            .padding(20.dp)
            .fillMaxHeight()
    ) {
            HomePageHeader()
            HomePageContent()
            HomePageFooter()
    }
}