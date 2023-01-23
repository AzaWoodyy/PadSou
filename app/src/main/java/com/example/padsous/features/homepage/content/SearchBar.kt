package com.example.padsous.features.homepage.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.R
import com.example.padsous.ui.theme.AlmostBlackCustom
import com.example.padsous.ui.theme.Inter
import com.example.padsous.ui.theme.LightGreyCustom

@Composable
fun SearchBar() {
    Box(modifier = Modifier.padding(bottom = 50.dp))
    {
        var text by remember { mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(
            value = text,
            maxLines = 1,
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                backgroundColor = Color.White,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                cursorColor = Color.Black,
                textColor = AlmostBlackCustom,
            ),
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.magnifyingglass),
                    contentDescription = "magnifyingglass",
                    modifier = Modifier
                        .width(18.dp)
                        .height(18.dp)
                )
            },
            textStyle = androidx.compose.ui.text.TextStyle(
                color = AlmostBlackCustom,
                fontFamily = Inter,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            ),
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp)),
            placeholder = {
                Text(
                    "Cherche un bon plan",
                    color = LightGreyCustom,
                    fontFamily = Inter,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
            },
            onValueChange = { newText ->
                text = newText
            }
        )
    }
}