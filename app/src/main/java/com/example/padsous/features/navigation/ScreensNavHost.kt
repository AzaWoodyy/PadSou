package com.example.padsous.features.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
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

    val plan1: Plan = Plan(id = 1, name = "Abonnement 1 an", description = "2 mois offerts", image = "https://www.basic-fit.com/dw/image/v2/BDFP_PRD/on/demandware.static/-/Library-Sites-basic-fit-shared-library/default/dw77102969/1280x720_blog_make_fitness_a_basic.jpg", logo = R.drawable.sportimg, nbTesters = 25, link = "")
    val plan2: Plan = Plan(id = 2, name = "Le grand barathon", description = "1 verre acheté = 1 offert", image = "https://www.challenges.fr/assets/img/2022/10/06/cover-r4x3w1200-633eeafb54371-sir-winston2-romainricard-09.jpg", logo = R.drawable.barimg, nbTesters = 25, link = "")
    val plan3: Plan = Plan(id = 3, name = "Reduc Rbnb", description = "50% pendant 2 mois", image = "https://news.airbnb.com/wp-content/uploads/sites/4/2019/06/PJM020719Q202_Luxe_WanakaNZ_LivingRoom_0264-LightOn_R1.jpg", logo = R.drawable.hostelimg, nbTesters = 25, link = "")
    val plan4: Plan = Plan(id = 4, name = "Bon plan otacos", description = "1 tacos acheté 1 tacos offert", image = "https://www.gazettemoselle.fr/thumbs/1368%C3%971026/wp-content/uploads/2019/07/19-07-04-11-56-00.jpg", logo = R.drawable.kebabimg, nbTesters = 25, link = "")
    val plan5: Plan = Plan(id = 5, name = "Abonnement 1 an", description = "2 mois offerts", image = "https://www.basic-fit.com/dw/image/v2/BDFP_PRD/on/demandware.static/-/Library-Sites-basic-fit-shared-library/default/dw77102969/1280x720_blog_make_fitness_a_basic.jpg", logo = R.drawable.sportimg, nbTesters = 25, link = "")
    val plan6: Plan = Plan(id = 6, name = "Le grand barathon", description = "1 verre acheté = 1 offert", image = "https://www.challenges.fr/assets/img/2022/10/06/cover-r4x3w1200-633eeafb54371-sir-winston2-romainricard-09.jpg", logo = R.drawable.barimg, nbTesters = 25, link = "")
    val plan7: Plan = Plan(id = 7, name = "Reduc Rbnb", description = "50% pendant 2 mois", image = "https://news.airbnb.com/wp-content/uploads/sites/4/2019/06/PJM020719Q202_Luxe_WanakaNZ_LivingRoom_0264-LightOn_R1.jpg", logo = R.drawable.hostelimg, nbTesters = 25, link = "")
    val plan8: Plan = Plan(id = 8, name = "Bon plan otacos", description = "1 tacos acheté 1 tacos offert", image = "https://www.gazettemoselle.fr/thumbs/1368%C3%971026/wp-content/uploads/2019/07/19-07-04-11-56-00.jpg", logo = R.drawable.kebabimg, nbTesters = 25, link = "")
    val plans = listOf(plan1, plan2, plan3, plan4, plan5, plan6, plan7, plan8)
    NavHost(navController = navController, startDestination = startDestination ){

        composable(Screen.HomePageScreen.route) { HomePage(navController, systemUiController) }
        composable(Screen.RegisterScreen.route) { RegisterPage({ navController.navigate(Screen.HomePageScreen.route) }, { navController.navigate((Screen.LoginScreen.route)) }, systemUiController) }
        composable(Screen.OnBoardingScreen.route) { OnBoarding({ navController.navigate(Screen.LoginScreen.route) }, systemUiController) }
        composable(Screen.PlanDetailScreen.route+"/{planId}") { backStackEntry ->
            plans.find { it.id.toString() == backStackEntry.arguments?.getString("planId") }
                ?.let { PlanDetail(plan = it, systemUiController = systemUiController) }
        }
        composable(Screen.AddPlanScreen.route) { AddPlan(
            { navController.navigate(Screen.HomePageScreen.route){
                popUpTo(navController.graph.findStartDestination().id) {
                    saveState = true
                }
                launchSingleTop = true
                restoreState = true } },
            systemUiController = systemUiController,
            navController = navController) }
        composable(Screen.LoginScreen.route) { LoginPage({ navController.navigate(Screen.HomePageScreen.route) }, { navController.navigate(Screen.RegisterScreen.route) }, systemUiController = systemUiController)}
    }
}