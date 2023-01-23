package com.example.padsous.models

import androidx.annotation.StringRes
import com.example.padsous.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object HomePageScreen : Screen("homePage", R.string.homePage)
    object OnBoardingScreen : Screen("onBoarding", R.string.onBoarding)
    object PlanDetailScreen : Screen("planDetail", R.string.planDetail)
    object RegisterScreen : Screen("register", R.string.register)
}
