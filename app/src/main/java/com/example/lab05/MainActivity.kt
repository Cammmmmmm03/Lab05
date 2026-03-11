package com.example.lab05

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Scaffold
import com.example.lab05.ui.DogList
import com.example.lab05.ui.WoofTopAppBar
import com.example.lab05.ui.theme.Lab05Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContent {

            Lab05Theme {

                Scaffold(
                    topBar = { WoofTopAppBar() }
                ) { padding ->

                    DogList(padding)
                }
            }
        }
    }
}