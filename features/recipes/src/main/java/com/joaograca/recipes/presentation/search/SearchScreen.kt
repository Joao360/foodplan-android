package com.joaograca.recipes.presentation.search

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.hilt.navigation.compose.hiltViewModel
import com.joaograca.core_ui.LocalSpacing
import com.joaograca.recipes.presentation.search.component.RecipeListItem
import com.joaograca.recipes.presentation.search.component.SearchTextField

@Composable
fun SearchScreen(
    viewModel: SearchViewModel = hiltViewModel()
) {
    val state = viewModel.uiState.collectAsState().value
    val spacing = LocalSpacing.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                start = spacing.spaceMedium,
                end = spacing.spaceMedium,
                top = spacing.spaceLarge
            )
    ) {
        SearchTextField(
            text = state.query,
            onValueChange = viewModel::onQueryChange,
            onSearch = viewModel::onSearch,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(spacing.spaceSmall))
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {
            items(state.recipes) { recipe ->
                RecipeListItem(recipe)
            }
        }
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        when {
            state.isSearching -> CircularProgressIndicator()
            state.recipes.isEmpty() -> {
                Text(
                    text = "Nothing to show", // TODO move to string resources
                    style = MaterialTheme.typography.body1,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}