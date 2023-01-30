package com.example.padsous.models

data class Plan(
    val id: Int,
    val name: String,
    val description: String,
    val link: String,
    val image: String,
    val nbTesters: Int,
    val logo: Int
)