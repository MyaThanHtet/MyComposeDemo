package com.example.mycompsedemo.ui

import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*

@Composable
fun BottomAppBarScreen() {
    var isUserCutoutShape by remember { mutableStateOf(false) }
    var isFabDocked by remember { mutableStateOf(false) }
    var isFabPositionCenter by remember { mutableStateOf(false) }
    var cornerSize by remember { mutableStateOf(1) }

    Scaffold(
        isFloatingActionButtonDocked = isFabDocked,
        floatingActionButtonPosition = if (isFabPositionCenter) FabPosition.Center else FabPosition.End,
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
            ) {

                Icon(imageVector = Icons.Default.Add, contentDescription = "")
            }
        },

        ) {
    }


}
