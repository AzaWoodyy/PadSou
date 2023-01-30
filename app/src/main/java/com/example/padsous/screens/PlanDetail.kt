package com.example.padsous.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.padsous.features.homepage.content.SearchBar
import com.example.padsous.features.plandetail.PlanDetailContent
import com.example.padsous.features.plandetail.PlanDetailFooter
import com.example.padsous.features.plandetail.PlanDetailHeader
import com.example.padsous.models.Plan
import com.example.padsous.ui.theme.AlmostBlackCustom
import com.example.padsous.ui.theme.MediumGreyCustom
import com.google.accompanist.systemuicontroller.SystemUiController

@Composable
fun PlanDetail(systemUiController: SystemUiController, plan: Plan) {
    systemUiController.setSystemBarsColor(
        color = AlmostBlackCustom
    )
    systemUiController.setNavigationBarColor(
        color = MediumGreyCustom,
        darkIcons = false
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(MediumGreyCustom)
    ) {
        PlanDetailHeader(plan.logo, plan.name, plan.description)
        PlanDetailContent(planId = plan.id, nbTesters = plan.nbTesters)
        PlanDetailFooter(plan)
    }
}