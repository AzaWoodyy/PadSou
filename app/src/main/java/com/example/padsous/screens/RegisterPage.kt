package com.example.padsous.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.padsous.features.homepage.RegisterPageForm
import com.example.padsous.features.homepage.RegisterPageHeader
import com.example.padsous.features.register.RegisterPageFooter
import com.example.padsous.ui.theme.MediumGreyCustom
import com.example.padsous.util.AuthentificationViewModel


@Composable
fun RegisterPage() {
    Column ( modifier = Modifier
        .fillMaxSize()
        .background(color = MediumGreyCustom),) {

        RegisterPageHeader()
        RegisterPageForm(viewModel = AuthentificationViewModel())
        RegisterPageFooter()
    }




}