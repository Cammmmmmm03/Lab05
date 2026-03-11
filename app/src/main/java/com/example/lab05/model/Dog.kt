package com.example.lab05.model

import androidx.annotation.DrawableRes

data class Dog(
    val name: String,
    val age: Int,
    @DrawableRes val image: Int,
    val hobby: String
)