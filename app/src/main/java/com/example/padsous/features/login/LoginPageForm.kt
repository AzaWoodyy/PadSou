package com.example.padsous.features.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.ui.theme.*
import com.example.padsous.util.AuthentificationViewModel

@Composable
fun LoginPageForm(viewModel: AuthentificationViewModel, navigateToLoginPage: () -> Unit) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .offset(y = -(105.dp))
    ) {

        val context = LocalContext.current
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .clip(RoundedCornerShape(20))
                .background(color = Color.White),
            value = email,
            maxLines = 1,
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                cursorColor = Color.Black,
                textColor = Color.Black
            ),
            placeholder = { Text(text = "Ton adresse e-mail",
                style = TextStyle(fontSize = 16.sp,
                    fontFamily = Inter,
                    color = GreyCustom
                )
            )
            },
            onValueChange = {
                email = it
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        )

            Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .clip(RoundedCornerShape(20))
                .background(color = Color.White),
            value = password,
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                cursorColor = Color.Black,
                textColor = Color.Black),
            maxLines = 1,
            singleLine = true,
            shape = RoundedCornerShape(20),
            placeholder = { Text(text = "Ton mot de passe",
                style = TextStyle(fontSize = 16.sp,
                    fontFamily = Inter,
                    color = GreyCustom)) },
            onValueChange = {
                password = it
            },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        )

        Spacer(modifier = Modifier.height(20.dp))

        Column(Modifier.padding(170.dp, 0.dp, 0.dp, 50.dp)) {
            Text( color = DarkGreyCustom,
                fontWeight = FontWeight.Bold,
                fontFamily = Inter,
                fontSize = 14.sp,
                textAlign = TextAlign.Right,
                text = "Mot de passe oublié ?",
            )
        }

        Box(modifier = Modifier.padding(horizontal = 20.dp)) {
            Button(
                onClick = {
                    viewModel.login(email, password, context = context, navigateToLoginPage)
                },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = DarkBlueCustom
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
            ) {
                Text(
                    text = "Se connecter".toUpperCase(),
                    color = Color.White,
                    fontFamily = IntegralCf,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }


    }
}