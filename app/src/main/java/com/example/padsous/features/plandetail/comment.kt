package com.example.padsous.features.plandetail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.R
import com.example.padsous.ui.theme.AlmostBlackCustom
import com.example.padsous.ui.theme.IntegralCf
import com.example.padsous.ui.theme.Inter
import com.example.padsous.ui.theme.LightGreyCustom

@Composable
fun Comment() {
    Column(
        modifier = Modifier
            .width(300.dp)
            .clip(shape = RoundedCornerShape(15.dp))
            .background(Color.White)
            .padding(20.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.pfp1),
                modifier = Modifier
                    .width(30.dp)
                    .height(30.dp),
                contentDescription = "img"
            )
            Column(
                modifier = Modifier.padding(start = 10.dp)
            ) {
                Text(
                    text = "Proposé par",
                    color = LightGreyCustom,
                    fontFamily = Inter,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = "Killian74",
                    color = AlmostBlackCustom,
                    fontFamily = Inter,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Black
                )
            }
            Spacer(modifier = Modifier.padding(start = 30.dp))
            Stars(2)
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Chaque année, O’Tacos veut vous mettre bien. On sait que t’es étudiant et que c’est la galère, alors on t’a prévu des giga MAXI TACOS à des giga BAS PRIX. Ca se passe maintenant !",
            color = AlmostBlackCustom,
            fontFamily = Inter,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium
        )
    }
}