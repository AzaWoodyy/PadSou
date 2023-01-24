package com.example.padsous.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.platform.LocalFocusManager
import com.example.padsous.components.BoxWithConstraintsTouchable
import com.example.padsous.features.login.LoginPageFooter
import com.example.padsous.features.login.LoginPageForm
import com.example.padsous.features.login.LoginPageHeader
import com.example.padsous.ui.theme.BlueCustom
import com.example.padsous.ui.theme.GreyCustom

import com.example.padsous.ui.theme.MediumGreyCustom
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun LoginPage(systemUiController: SystemUiController) {
    systemUiController.setSystemBarsColor(
        color = MediumGreyCustom
    )

    val focusManager = LocalFocusManager.current

    BoxWithConstraintsTouchable(focusManager = focusManager) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .background(color = MediumGreyCustom),
        ) {
            LoginPageHeader()
            LoginPageForm()
            LoginPageFooter()
        }
    }
}