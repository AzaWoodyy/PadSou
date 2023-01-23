package com.example.padsous

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.padsous.models.Plan
import com.example.padsous.screens.*

import com.example.padsous.ui.theme.PadSousTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PadSousTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Greeting() {
    val plan1: Plan = Plan(id = 8, name = "Bon plan otacos", description = "1 tacos acheté 1 tacos offert", descImage = R.drawable.kebabdesc, image = R.drawable.kebabimg, nbTesters = 12)

    HorizontalPager(count = 6)
    { page ->
        when (page) {
            0 -> OnBoarding()
            1 -> HomePage()
            2 -> PlanDetail(plan1)
            3 -> RegisterPage()
            4 -> LoginPage()
            5 -> AddPlan()
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PadSousTheme {
        Greeting()
    }
}