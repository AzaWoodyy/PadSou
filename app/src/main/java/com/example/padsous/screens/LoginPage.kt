package com.example.padsous.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import com.example.padsous.features.login.LoginPageFooter
import com.example.padsous.features.login.LoginPageForm
import com.example.padsous.features.login.LoginPageHeader
import com.example.padsous.ui.theme.MediumGreyCustom
import com.example.padsous.util.AuthentificationViewModel
import com.google.accompanist.systemuicontroller.SystemUiController


@Composable
fun LoginPage(
    navigateToLoginPage: () -> Unit,
    navigateToLoginRegister: () -> Unit,
    systemUiController: SystemUiController
) {
    systemUiController.setSystemBarsColor(
        color = MediumGreyCustom
    )

    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
        .fillMaxSize()
        .background(color = MediumGreyCustom),) {
        LoginPageHeader()
        LoginPageForm(viewModel = AuthentificationViewModel(), navigateToLoginPage)
        LoginPageFooter(navigateToLoginRegister)
    }
}