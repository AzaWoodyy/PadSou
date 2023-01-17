package com.example.padsous.features.plandetail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.padsous.R

@Composable
fun Stars(nb: Int) {
    Row (
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .width(110.dp)
            ){
        for (i in 1..nb) {
            Image(
                painter = painterResource(id = R.drawable.yellowstar),
                modifier = Modifier.height(20.dp).width(20.dp),
                contentDescription = "img"
            )
        }
        for (i in 1..5 - nb) {
            Image(
                painter = painterResource(id = R.drawable.greystar),
                modifier = Modifier.height(20.dp).width(20.dp),
                contentDescription = "img"
            )
        }
    }
}