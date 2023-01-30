package com.example.padsous.screens

import HomePageContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.components.BoxWithConstraintsTouchable
import androidx.navigation.NavController
import com.example.padsous.features.homepage.HomePageHeader
import com.example.padsous.ui.theme.BlueCustom
import com.example.padsous.ui.theme.IntegralCf
import com.example.padsous.ui.theme.SalmonCustom
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun HomePage(navController: NavController, systemUiController: SystemUiController) {
    val focusManager = LocalFocusManager.current
    systemUiController.setSystemBarsColor(
        color = BlueCustom
    )
    systemUiController.setNavigationBarColor(
        color = Color.White,
        darkIcons = false
    )
    BoxWithConstraintsTouchable(focusManager = focusManager) {
      Column(
          horizontalAlignment = Alignment.CenterHorizontally,
          modifier = Modifier
              .fillMaxWidth()
              .padding(bottom = 50.dp)
              .background(BlueCustom)
      ) {
          HomePageHeader()
          HomePageContent(navController)
          }
    }
}

