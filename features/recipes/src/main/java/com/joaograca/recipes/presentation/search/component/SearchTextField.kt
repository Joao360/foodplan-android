package com.joaograca.recipes.presentation.search.component

import androidx.compose.foundation.background
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SearchTextField(
    text: String,
    onValueChange: (String) -> Unit,
    onSearch: () -> Unit,
    modifier: Modifier = Modifier
) {
    TextField(
        value = text,
        onValueChange = onValueChange,
        singleLine = true,
        keyboardActions = KeyboardActions(
            onSearch = {
                onSearch()
                defaultKeyboardAction(ImeAction.Search)
            }
        ),
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Search
        ),
        placeholder = {
            Text(text = "Search for any recipe")
        },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = null)
        },
        modifier = modifier
            .clip(MaterialTheme.shapes.medium)
            .shadow(
                elevation = 2.dp,
                shape = MaterialTheme.shapes.medium
            )
            .background(MaterialTheme.colors.surface),
    )
}

@Preview
@Composable
fun SearchTextFieldPreview() {
    SearchTextField(text = "", onValueChange = {}, onSearch = {})
}