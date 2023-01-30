package com.example.padsous.api

import com.example.padsous.models.Plan
import com.google.firebase.firestore.FirebaseFirestore

fun addPlan(plan: Plan) {
    var db = FirebaseFirestore.getInstance()
    db.collection("plan").document().set(plan)
}