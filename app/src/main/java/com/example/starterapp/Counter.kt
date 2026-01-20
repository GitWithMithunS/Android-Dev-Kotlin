package com.example.starterapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import org.intellij.lang.annotations.JdkConstants


@Composable
fun Counter(modifier: Modifier = Modifier) {

    //method 1
    val count = remember { mutableStateOf(0) }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(R.drawable.ic_launcher_background) , contentDescription = null)

        Text(text = "${count.value}")

        Button(onClick = { count.value++ }) {
            Text("Increment")
        }
    }

//
//    ///method-2
//    var count by remember {   mutableStateOf(0) }
//
//    Text("$count");
//
//    Button(onClick = {count++} ) {
//        Text("Incement")
//    }

}