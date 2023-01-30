package com.example.padsous.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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

