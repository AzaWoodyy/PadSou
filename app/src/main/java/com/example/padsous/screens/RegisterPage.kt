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


@Composable
fun RegisterPage(navigateToHomePage: () -> Unit) {
    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .background(color = MediumGreyCustom),)
    {
       RegisterPageHeader()
        RegisterPageForm(navigateToHomePage = navigateToHomePage)
        RegisterPageFooter()
    }




}