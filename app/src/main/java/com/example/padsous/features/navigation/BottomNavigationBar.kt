package com.example.padsous.features.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.*
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.navigation
import com.example.padsous.R
import com.example.padsous.models.Plan
import com.example.padsous.models.Screen
import com.example.padsous.screens.HomePage
import com.example.padsous.screens.OnBoarding
import com.example.padsous.screens.PlanDetail
import com.example.padsous.screens.RegisterPage
import com.example.padsous.ui.theme.*

object NoRippleTheme : RippleTheme {
    @Composable
    override fun defaultColor() = Color.Unspecified

    @Composable
    override fun rippleAlpha(): RippleAlpha = RippleAlpha(0.0f,0.0f,0.0f,0.0f)
}
@Composable
fun BottomNavigationBar(navController: NavHostController) {

    val navItems = listOf(
        Screen.HomePageScreen,
        Screen.AddPlanScreen,
        Screen.ProfileScreen,
    )
    BoxWithConstraints(modifier = Modifier.height(90.dp), contentAlignment = Alignment.BottomCenter) {

        val gradient = Brush.verticalGradient(
            .0f to Color(0x00000000),
            .7f to Color(0xA6828282),
            1f to Color(0x2E2D2D),
        )
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(topEnd = 15.dp, topStart = 15.dp))
                .fillMaxWidth()
                .padding(bottom = 43.dp)
                .height(40.dp)
                .background(gradient)
                .blur(50.dp)
        ) {}
        BottomNavigation(
            backgroundColor = Color.White,
            modifier = Modifier
                .clip(RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp))
                .height(70.dp)
        )
        {

            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentDestination = navBackStackEntry?.destination

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .clip(RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp))
                    .fillMaxWidth()
                    .padding(100.dp, 10.dp)
            )
            {
                CompositionLocalProvider(LocalRippleTheme provides NoRippleTheme) {
                    navItems.forEach { screen ->
                        var bottomBarIcon = R.drawable.home_icon
                        when (screen.route) {
                            Screen.HomePageScreen.route -> bottomBarIcon = R.drawable.home_icon
                            Screen.AddPlanScreen.route -> bottomBarIcon = R.drawable.add_icon
                            Screen.ProfileScreen.route -> bottomBarIcon = R.drawable.account_icon
                        }

                        BottomNavigationItem(
                            unselectedContentColor = LightSlateGreyCustom,
                            selectedContentColor = BlueCustom,
                            modifier = Modifier
                                .padding(5.dp, 0.dp)
                                .clip(RoundedCornerShape(5.dp))
                                .background(PaleGrayCustom),
                            icon = {
                                Icon(
                                    painterResource(id = bottomBarIcon),
                                    contentDescription = null,
                                    Modifier.width(28.dp)
                                )
                            },
                            selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                            onClick = {
                                navController.navigate(screen.route) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            }
                        )
                    }
                }
            }
        }
    }
}