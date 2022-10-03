package com.joaograca.recipes.presentation.search.component

import androidx.compose.material.TextField
import androidx.compose.runtime.Composable

@Composable
fun SearchTextField(
    text: String,
    onValueChange: (String) -> Unit
) {
    TextField(value = text, onValueChange = onValueChange)
}