package com.example.padsous.features.homepage

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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.ui.theme.*


@Composable
fun RegisterPageForm(navigateToHomePage: () -> Unit) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .offset(y = -(50.dp))
        ) {
            var text1 by remember { mutableStateOf(TextFieldValue("")) }
            var text2 by remember { mutableStateOf(TextFieldValue("")) }
            var text3 by remember { mutableStateOf(TextFieldValue("")) }


            //------------------------Inputs Email ---------------------

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .clip(RoundedCornerShape(20))
                    .background(color = Color.White),
                value = text1,
                maxLines = 1,
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
                    text1 = it
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
                value = text2,
                colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.White,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        cursorColor = Color.Black,
                        textColor = Color.Black),
                maxLines = 1,
                shape = RoundedCornerShape(20),
                placeholder = { Text(text = "Ton mot de passe",
                                     style = TextStyle(fontSize = 16.sp,
                                        fontFamily = Inter,
                                        color = GreyCustom)) },
                onValueChange = {
                    text2 = it
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
                value = text3,
                maxLines = 1,
                shape = RoundedCornerShape(20),
                placeholder = { Text(text = "Confirme ton mot de passe",
                                    style = TextStyle(fontSize = 16.sp,
                                        fontFamily = Inter,
                                        color = GreyCustom)) },
                onValueChange = {
                    text3 = it
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
                    onClick = navigateToHomePage,
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


