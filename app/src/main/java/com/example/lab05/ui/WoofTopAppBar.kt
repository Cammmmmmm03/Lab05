package com.example.lab05.ui

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WoofTopAppBar() {

    CenterAlignedTopAppBar(
        title = { Text(text = "Woof") }
    )
}