package com.example.padsous.features.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.padsous.R
import com.example.padsous.models.Plan
import com.example.padsous.models.Screen
import com.example.padsous.screens.*
import com.google.accompanist.systemuicontroller.SystemUiController

@Composable
fun ScreensNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    systemUiController: SystemUiController,
    startDestination: String = Screen.OnBoardingScreen.route,
) {

    val plan1: Plan = Plan(id = 1, name = "Abonnement 1 an", description = "2 mois offerts", descImage = R.drawable.sportdesc, image = R.drawable.sportimg, nbTesters = 25)
    val plan2: Plan = Plan(id = 2, name = "Le grand barathon", description = "1 verre acheté = 1 offert", descImage = R.drawable.bardesc, image = R.drawable.barimg, nbTesters = 25)
    val plan3: Plan = Plan(id = 3, name = "Reduc Rbnb", description = "50% pendant 2 mois", descImage = R.drawable.hosteldesc, image = R.drawable.hostelimg, nbTesters = 25)
    val plan4: Plan = Plan(id = 4, name = "Bon plan otacos", description = "1 tacos acheté 1 tacos offert", descImage = R.drawable.kebabdesc, image = R.drawable.kebabimg, nbTesters = 25)
    val plan5: Plan = Plan(id = 5, name = "Abonnement 1 an", description = "2 mois offerts", descImage = R.drawable.sportdesc, image = R.drawable.sportimg, nbTesters = 25)
    val plan6: Plan = Plan(id = 6, name = "Le grand barathon", description = "1 verre acheté = 1 offert", descImage = R.drawable.bardesc, image = R.drawable.barimg, nbTesters = 25)
    val plan7: Plan = Plan(id = 7, name = "Reduc Rbnb", description = "50% pendant 2 mois", descImage = R.drawable.hosteldesc, image = R.drawable.hostelimg, nbTesters = 25)
    val plan8: Plan = Plan(id = 8, name = "Bon plan otacos", description = "1 tacos acheté 1 tacos offert", descImage = R.drawable.kebabdesc, image = R.drawable.kebabimg, nbTesters = 25)
    val plans = listOf(plan1, plan2, plan3, plan4, plan5, plan6, plan7, plan8)
    NavHost(navController = navController, startDestination = startDestination ){

        composable(Screen.HomePageScreen.route) { HomePage(navController, systemUiController) }
        composable(Screen.RegisterScreen.route) { RegisterPage({ navController.navigate(Screen.HomePageScreen.route) }, { navController.navigate((Screen.LoginScreen.route)) }, systemUiController) }
        composable(Screen.OnBoardingScreen.route) { OnBoarding({ navController.navigate(Screen.LoginScreen.route) }, { navController.navigate(Screen.VideoScreen.route) }, systemUiController) }
        composable(Screen.PlanDetailScreen.route+"/{planId}") { backStackEntry ->
            plans.find { it.id.toString() == backStackEntry.arguments?.getString("planId") }
                ?.let { PlanDetail(plan = it, systemUiController = systemUiController) }
        }
        composable(Screen.AddPlanScreen.route) { AddPlan(systemUiController) }
        composable(Screen.ProfileScreen.route) { ProfilePage(systemUiController) }
        composable(Screen.LoginScreen.route) { LoginPage({ navController.navigate(Screen.HomePageScreen.route) }, { navController.navigate(Screen.RegisterScreen.route) }, systemUiController = systemUiController)}
        composable(Screen.VideoScreen.route) { VideoPage(systemUiController) }
    }
}