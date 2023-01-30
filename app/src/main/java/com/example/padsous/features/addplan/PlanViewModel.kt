package com.example.padsous.features.addplan

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.ViewModel

class PlanViewModel() : ViewModel() {
    var sharedPlanTitle by mutableStateOf("");
    var sharedPlanDescription by mutableStateOf("");
    var sharedPlanLink by mutableStateOf("");
    var swipable by mutableStateOf(false);
}