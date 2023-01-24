package com.example.padsous.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import com.example.padsous.features.login.LoginPageFooter
import com.example.padsous.features.login.LoginPageForm
import com.example.padsous.features.login.LoginPageHeader
import com.example.padsous.ui.theme.MediumGreyCustom
import com.example.padsous.util.AuthentificationViewModel


@Composable
fun LoginPage() {
    Column(  modifier = Modifier
        .fillMaxSize()
        .background(color = MediumGreyCustom),) {
        LoginPageHeader()
        LoginPageForm(viewModel = AuthentificationViewModel())
        LoginPageFooter()
    }
}