package com.example.padsous.features.addplan.content

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.ui.theme.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun PlanContent(pageState: PagerState, coroutineScope: CoroutineScope) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 50.dp)
    ) {
        Box(modifier = Modifier
            .padding(horizontal = 40.dp)
        )
        {
            Column() {
                Text(
                    color = AlmostBlackCustom,
                    fontFamily = IntegralCf,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    text = "Titre"
                )
                var titleText by remember { mutableStateOf(TextFieldValue("")) }
                OutlinedTextField(
                    value = titleText,
                    singleLine = true,
                    maxLines = 1,
                    colors = TextFieldDefaults.textFieldColors(
                        focusedIndicatorColor = Color.Transparent,
                        backgroundColor = Color.White,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        cursorColor = Color.Black,
                        textColor = AlmostBlackCustom,
                    ),
                    textStyle = TextStyle(
                        color = AlmostBlackCustom,
                        fontFamily = Inter,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .clip(RoundedCornerShape(20.dp)),
                    placeholder = {
                        Text(
                            "Abonnement 1 an Basic-Fit",
                            color = LightGreyCustom,
                            fontFamily = Inter,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    },
                    onValueChange = { newText ->
                        titleText = newText
                    }
                )
            }
        }
        Box(modifier = Modifier
            .padding(horizontal = 40.dp)
        )
        {
            Column() {
                Text(
                    color = AlmostBlackCustom,
                    fontFamily = IntegralCf,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    text = "Description"
                )
                var descText by remember { mutableStateOf(TextFieldValue("")) }
                OutlinedTextField(
                    value = descText,
                    colors = TextFieldDefaults.textFieldColors(
                        focusedIndicatorColor = Color.Transparent,
                        backgroundColor = Color.White,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        cursorColor = Color.Black,
                        textColor = AlmostBlackCustom,
                    ),
                    textStyle = TextStyle(
                        color = AlmostBlackCustom,
                        fontFamily = Inter,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .height(130.dp),
                    placeholder = {
                        Text(
                            "Ne soit pas trop bavard, on s’en fou, va à l’essentiel",
                            color = LightGreyCustom,
                            fontFamily = Inter,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    },
                    onValueChange = { newText ->
                        descText = newText
                    }
                )
            }
        }
        Box(modifier = Modifier
            .padding(horizontal = 40.dp)
        )
        {
            Column() {
                Text(
                    color = AlmostBlackCustom,
                    fontFamily = IntegralCf,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    text = "Lien"
                )
                var urlText by remember { mutableStateOf(TextFieldValue("")) }
                OutlinedTextField(
                    value = urlText,
                    singleLine = true,
                    maxLines = 1,
                    colors = TextFieldDefaults.textFieldColors(
                        focusedIndicatorColor = Color.Transparent,
                        backgroundColor = Color.White,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        cursorColor = Color.Black,
                        textColor = AlmostBlackCustom,
                    ),
                    textStyle = TextStyle(
                        color = AlmostBlackCustom,
                        fontFamily = Inter,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .clip(RoundedCornerShape(20.dp)),
                    placeholder = {
                        Text(
                            "www.lienverstonbonplan.com",
                            color = LightGreyCustom,
                            fontFamily = Inter,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    },
                    onValueChange = { newText ->
                        urlText = newText
                    }
                )
            }
        }
        Button(
            onClick = { coroutineScope.launch { pageState.animateScrollToPage(pageState.currentPage + 1)} },
            Modifier
                .width(300.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .height(60.dp),

            colors = ButtonDefaults.buttonColors(
                backgroundColor = BlueCustom,
                contentColor = Color.White
            )
        ) {
            Text(
                color = Color.White,
                fontFamily = IntegralCf,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                text = "SUIVANT"
            )
        }
    }
}