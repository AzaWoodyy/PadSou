package com.example.padsous.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.components.BoxWithConstraintsTouchable
import androidx.navigation.NavHostController
import com.example.padsous.features.addplan.AddPlanContent
import com.example.padsous.features.addplan.AddPlanHeader
import com.example.padsous.ui.theme.BlueCustom
import com.google.accompanist.systemuicontroller.SystemUiController

@Composable
fun AddPlan(
    navigateToHomePage: () -> Unit,
    systemUiController: SystemUiController,
    navController: NavHostController
) {
    systemUiController.setSystemBarsColor(
        color = BlueCustom
    )
    systemUiController.setNavigationBarColor(
        color = Color.White,
        darkIcons = false
    )
    val focusManager = LocalFocusManager.current

    BoxWithConstraintsTouchable(focusManager = focusManager) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(BlueCustom)
        ) {
            AddPlanHeader()
            AddPlanContent(navController, navigateToHomePage = navigateToHomePage)
        }
    }
}

