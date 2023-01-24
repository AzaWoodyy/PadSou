package com.example.padsous.features.homepage

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.ui.theme.*
import com.example.padsous.util.AuthentificationViewModel


@Composable
fun RegisterPageForm(viewModel: AuthentificationViewModel) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .offset(y = -(50.dp))
        ) {
            var email by remember { mutableStateOf("") }
            var password by remember { mutableStateOf("") }
            var confirmPassword by remember { mutableStateOf("") }

            val context = LocalContext.current



            //------------------------Inputs Email ---------------------

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
                                        color = GreyCustom))
                              },
                onValueChange = {
                    email = it
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            )

            Spacer(modifier = Modifier.height(15.dp))

            //------------------------Password Input ---------------------------

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

            Spacer(modifier = Modifier.height(15.dp))

            //------------------------Confirm Password Input ---------------------------

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .clip(RoundedCornerShape(20))
                    .background(color = Color.White),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    cursorColor = Color.Black,
                    textColor = Color.Black),
                value = confirmPassword,
                maxLines = 1,
                singleLine = true,
                shape = RoundedCornerShape(20),
                placeholder = { Text(text = "Confirme ton mot de passe",
                                    style = TextStyle(fontSize = 16.sp,
                                        fontFamily = Inter,
                                        color = GreyCustom)) },
                onValueChange = {
                    confirmPassword = it
                },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            )

            Spacer(modifier = Modifier.height(40.dp))

            //------------------------Text + button ---------------------------

            Column(Modifier.padding(25.dp, 30.dp, 0.dp, 10.dp)) {
                Text( color = DarkGreyCustom,
                    fontWeight = FontWeight.Bold,
                    fontFamily = Inter,
                    fontSize = 14.sp,
                    text = "En t’inscrivant, tu acceptes les Conditions générales d’utilisation de Padsou",
                )
            }
            Box(modifier = Modifier.padding(horizontal = 20.dp)) {
                Button(
                    onClick = {
                        if (password == confirmPassword) {
                            viewModel.register(email, password, context = context)
                        }
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = DarkBlueCustom
                    ),
                    shape = RoundedCornerShape(20.dp),
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


