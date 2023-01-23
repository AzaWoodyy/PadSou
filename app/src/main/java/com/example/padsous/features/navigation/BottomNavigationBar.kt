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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
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
import com.example.padsous.ui.theme.BlueCustom
import com.example.padsous.ui.theme.GreyCustom
import com.example.padsous.ui.theme.LightGreyCustom
private object NoRippleTheme : RippleTheme {
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
    )

        BottomNavigation(
            backgroundColor = Color.White,
            modifier = Modifier
                .clip(RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp))
                .height(70.dp)
        ) {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentDestination = navBackStackEntry?.destination

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(100.dp, 10.dp)
            ) {
            CompositionLocalProvider(LocalRippleTheme provides NoRippleTheme) {
                navItems.forEach { screen ->
                    var bottomBarIcon = R.drawable.home_icon
                    when (screen.route) {
                        Screen.HomePageScreen.route -> bottomBarIcon = R.drawable.home_icon
                        Screen.AddPlanScreen.route -> bottomBarIcon = R.drawable.add_icon
                    }

                    BottomNavigationItem(
                        unselectedContentColor = GreyCustom,
                        selectedContentColor = BlueCustom,
                        modifier = Modifier
                            .padding(15.dp,0.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .background(LightGreyCustom),
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