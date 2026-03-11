package com.example.lab05.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.lab05.model.Dog

@Composable
fun DogItem(dog: Dog) {

    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {

        Column(modifier = Modifier.padding(16.dp)) {

            Row {

                Image(
                    painter = painterResource(dog.image),
                    contentDescription = dog.name,
                    modifier = Modifier.size(64.dp)
                )

                Spacer(modifier = Modifier.width(16.dp))

                Column(modifier = Modifier.weight(1f)) {

                    Text(text = dog.name)

                    Text(text = "${dog.age} years old")
                }

                Button(onClick = { expanded = !expanded }) {
                    Text("More")
                }
            }

            if (expanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text("About: ${dog.hobby}")
            }
        }
    }
}