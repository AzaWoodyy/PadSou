package com.example.padsous.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.padsous.R


val Inter = FontFamily(
    Font(R.font.Inter_Thin, FontWeight.Thin),
    Font(R.font.Inter_ExtraLight, FontWeight.ExtraLight),
    Font(R.font.Inter_Light, FontWeight.Light),
    Font(R.font.Inter_ExtraBold, FontWeight.ExtraBold),
    Font(R.font.Inter_Regular),
    Font(R.font.Inter_Medium, FontWeight.Medium),
    Font(R.font.Inter_Semibold, FontWeight.SemiBold),
    Font(R.font.Inter_Bold, FontWeight.Bold),
    Font(R.font.Inter_Black, FontWeight.Black)
)

val IntegralCf = FontFamily(
    Font(R.font.Integralcf_heavy, FontWeight.Black),
    Font(R.font.Integralcf_extrabold, FontWeight.ExtraBold),
    Font(R.font.Integralcf_regular),
    Font(R.font.Integralcf_medium, FontWeight.Medium),
    Font(R.font.Integralcf_demibold, FontWeight.SemiBold),
    Font(R.font.Integralcf_bold, FontWeight.Bold),
)

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)