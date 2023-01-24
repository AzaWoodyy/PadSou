package com.example.padsous.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.padsous.features.homepage.RegisterPageForm
import com.example.padsous.features.homepage.RegisterPageHeader
import com.example.padsous.features.register.RegisterPageFooter
import com.example.padsous.ui.theme.MediumGreyCustom
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun RegisterPage(systemUiController: SystemUiController) {
    systemUiController.setSystemBarsColor(
        color = MediumGreyCustom
    )

    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
        .fillMaxSize()
        .background(color = MediumGreyCustom),)
    {
        RegisterPageHeader()
        RegisterPageForm()
        RegisterPageFooter()
    }




}