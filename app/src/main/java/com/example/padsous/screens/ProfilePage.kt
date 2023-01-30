package com.example.padsous.screens

import ProfileContent
import ProfileHeader
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.padsous.ui.theme.BlueCustom
import com.google.accompanist.systemuicontroller.SystemUiController

@Composable
fun ProfilePage(systemUiController: SystemUiController) {
    systemUiController.setSystemBarsColor(
        color = BlueCustom
    )
    systemUiController.setNavigationBarColor(
        color = Color.White,
        darkIcons = false
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(BlueCustom)
    ) {
        ProfileHeader()
        ProfileContent()
    }
}

