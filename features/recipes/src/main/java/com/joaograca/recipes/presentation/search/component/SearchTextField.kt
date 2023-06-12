package com.joaograca.recipes.presentation.search.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joaograca.core_ui.LocalSpacing
import com.joaograca.core_ui.R

@Composable
fun SearchTextField(
    text: String,
    onValueChange: (String) -> Unit,
    onSearch: () -> Unit,
    modifier: Modifier = Modifier,
    placeholder: String
) {
    val spacing = LocalSpacing.current

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
            Text(text = placeholder)
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = stringResource(id = R.string.search)
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        modifier = modifier
            .clip(MaterialTheme.shapes.medium)
            .padding(spacing.spaceExtraSmall)
            .shadow(
                elevation = 2.dp,
                shape = MaterialTheme.shapes.medium
            )
            .background(MaterialTheme.colors.surface)
    )
}

@Preview
@Composable
fun SearchTextFieldPreview() {
    SearchTextField(
        text = "",
        onValueChange = {},
        onSearch = {},
        placeholder = "Search"
    )
}