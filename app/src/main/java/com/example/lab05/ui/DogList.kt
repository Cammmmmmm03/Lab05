package com.example.lab05.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.lab05.data.DataSource

@Composable
fun DogList(paddingValues: PaddingValues = PaddingValues()) {

    LazyColumn(contentPadding = paddingValues) {

        items(DataSource.dogs) { dog ->
            DogItem(dog = dog)
        }
    }
}