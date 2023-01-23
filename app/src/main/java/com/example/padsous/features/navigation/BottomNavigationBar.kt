package com.example.padsous.features.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
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

@Composable
fun BottomNavigationBar(navController: NavHostController) {

    val navItems = listOf(
        Screen.HomePageScreen,
        Screen.PlanDetailScreen,
    )
    BottomNavigation {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination
        navItems.forEach { screen ->
            var bottomBarIcon = R.drawable.home_icon
            when(screen.route){
                Screen.HomePageScreen.route -> bottomBarIcon = R.drawable.home_icon
            }
            BottomNavigationItem(
                icon = { Icon(painterResource(id = bottomBarIcon), contentDescription = null, Modifier.width(24.dp)) },
                label = { Text(text = stringResource(id = screen.resourceId)) },
                selected = currentDestination?.hierarchy?.any {it.route == screen.route} == true,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.findStartDestination().id){
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