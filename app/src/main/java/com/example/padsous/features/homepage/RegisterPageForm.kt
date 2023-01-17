package com.example.padsous.features.homepage

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import java.lang.reflect.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp


@Composable
fun RegisterPageForm() {
    Scaffold() {
        Column (
            // modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var text by remember { mutableStateOf(TextFieldValue("")) }
            OutlinedTextField(
                value = text,
                label = { Text(text = "Ton adresse e-mail") },
                onValueChange = {
                    text = it
                }
            )

            OutlinedTextField(
                value = text,
                label = { Text(text = "Ton mot de passe") },
                onValueChange = {
                    text = it
                }
            )



            OutlinedTextField(
                value = text,
                label = { Text(text = "Confirme ton mot de passe") },
                onValueChange = {
                    text = it
                }
            )

        }


    }
}
