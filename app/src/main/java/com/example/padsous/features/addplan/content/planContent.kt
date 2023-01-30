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
import kotlinx.coroutines.launch
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import com.example.padsous.features.addplan.PlanViewModel

@OptIn(ExperimentalPagerApi::class)
@Composable
fun PlanContent(
    pageState: PagerState,
    coroutineScope: CoroutineScope,
    viewModel: PlanViewModel
) {

    var titleText by remember { mutableStateOf(TextFieldValue("")) }
    var descText by remember { mutableStateOf(TextFieldValue("")) }
    var urlText by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 50.dp)
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
                        .clip(RoundedCornerShape(20.dp))
                        .fillMaxWidth(),
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
                        .height(130.dp)
                        .fillMaxWidth(),
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
                        .clip(RoundedCornerShape(20.dp))
                        .fillMaxWidth(),
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
            onClick = {
                viewModel.sharedPlanTitle = titleText.text;
                viewModel.sharedPlanDescription = descText.text;
                viewModel.sharedPlanLink = urlText.text;
                coroutineScope.launch { pageState.animateScrollToPage(pageState.currentPage + 1)}
              },
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