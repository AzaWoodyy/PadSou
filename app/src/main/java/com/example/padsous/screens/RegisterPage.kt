package com.example.padsous.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import com.example.padsous.components.BoxWithConstraintsTouchable
import com.example.padsous.features.homepage.RegisterPageForm
import com.example.padsous.features.homepage.RegisterPageHeader
import com.example.padsous.features.register.RegisterPageFooter
import com.example.padsous.ui.theme.MediumGreyCustom
import com.example.padsous.util.AuthentificationViewModel
import com.google.accompanist.systemuicontroller.SystemUiController


@Composable
fun RegisterPage(
    navigateToHomePage: () -> Unit,
    navigateToLoginPage: () -> Unit,
    systemUiController: SystemUiController
) {
    systemUiController.setSystemBarsColor(
        color = MediumGreyCustom
    )
    val focusManager = LocalFocusManager.current

    BoxWithConstraintsTouchable(focusManager = focusManager) {
    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .background(color = MediumGreyCustom),)
    {
        RegisterPageHeader()
        RegisterPageForm(navigateToHomePage = navigateToHomePage, viewModel = AuthentificationViewModel())
        RegisterPageFooter(navigateToLoginPage)
        }
    }
}