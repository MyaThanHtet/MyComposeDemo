package com.example.mycompsedemo

import androidx.annotation.DrawableRes


data class BottomMenuContent(
    val title: String,
    @DrawableRes val iconId: Int
)