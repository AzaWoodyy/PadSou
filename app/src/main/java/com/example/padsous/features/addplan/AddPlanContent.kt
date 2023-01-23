package com.example.padsous.features.addplan

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.padsous.R
import com.example.padsous.features.addplan.content.PlanContent
import com.example.padsous.features.addplan.content.PlanImage
import com.example.padsous.features.homepage.content.SearchBar
import com.example.padsous.ui.theme.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun AddPlanContent() {
    val pagerState = rememberPagerState()
    val coroutineScope = rememberCoroutineScope()
    var swipable by remember { mutableStateOf(false) }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RoundedCornerShape(topEnd = 35.dp, topStart = 35.dp))
            .background(MediumGreyCustom)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        HorizontalPagerIndicator(
            pagerState = pagerState,
            activeColor = BlueCustom,
            inactiveColor = LightGreyCustom,
            indicatorWidth = 45.dp,
            indicatorHeight = 5.dp,
            spacing = 6.dp,
            modifier = Modifier.padding(16.dp),
        )
        HorizontalPager(
            count = 2,
            userScrollEnabled = swipable,
            state = pagerState
            )
        { page ->
            swipable = currentPage != 0
            when (page) {
                0 -> {
                    PlanContent(pagerState, coroutineScope)
                }
                1 -> {
                    PlanImage(pagerState)
                }
            }
        }
    }
}