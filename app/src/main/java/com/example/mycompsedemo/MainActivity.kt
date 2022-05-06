package com.example.mycompsedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.example.mycompsedemo.ui.HomeScreen
import com.example.mycompsedemo.ui.theme.MyCompseDemoTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCompseDemoTheme {
                HomeScreen()
            }

        }
    }
}

