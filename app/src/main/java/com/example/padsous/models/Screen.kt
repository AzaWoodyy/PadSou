package com.example.padsous.models

import androidx.annotation.StringRes
import com.example.padsous.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object HomePageScreen : Screen("homePage", R.string.homePage)
    object OnBoardingScreen : Screen("onBoarding", R.string.onBoarding)
    object PlanDetailScreen : Screen("planDetail", R.string.planDetail)
    object RegisterScreen : Screen("register", R.string.register)
    object AddPlanScreen : Screen("addPlan", R.string.addPlan)
    object ProfileScreen : Screen("profile", R.string.profile)
    object LoginScreen : Screen("login", R.string.login)
    object VideoScreen : Screen("video", R.string.video)
}
