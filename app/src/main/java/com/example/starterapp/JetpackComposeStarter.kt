package com.example.starterapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ProfileCard(name : String , age : Int, color: Color , modifier : Modifier = Modifier){
    println("My first program , hello world")
    Text("Hello  , from $name $age ${color.toString()} ",
        modifier = modifier.padding(16.dp),
        color = color
        );
}