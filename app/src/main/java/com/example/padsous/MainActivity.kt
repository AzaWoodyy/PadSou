package com.example.padsous

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.padsous.features.navigation.BottomNavigationBar
import com.example.padsous.features.navigation.ScreensNavHost
import com.example.padsous.models.Screen

import com.example.padsous.ui.theme.PadSousTheme
import com.google.accompanist.pager.ExperimentalPagerApi

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

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@OptIn(ExperimentalPagerApi::class)
@Composable
fun Greeting() {

    val bottomBarPage = listOf(
        Screen.HomePageScreen.route,
    )
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    var isConnected by rememberSaveable {
        mutableStateOf(false)
    }
    println(currentDestination)
    Scaffold(

        bottomBar = {
            if (bottomBarPage.contains(currentDestination?.route)) {
                BottomNavigationBar(navController)
            }
        }
    ){
        ScreensNavHost(navController = navController)
    }

    /*HorizontalPager(count = 4)
    { page ->
        when (page) {
            0 -> OnBoarding()
            1 -> HomePage()
            2 -> PlanDetail(plan1)
            3 -> RegisterPage()
        }
    }*/

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PadSousTheme {
        Greeting()
    }
}