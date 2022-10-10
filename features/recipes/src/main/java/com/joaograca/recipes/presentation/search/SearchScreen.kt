package com.joaograca.recipes.presentation.search

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.joaograca.core_ui.LocalSpacing
import com.joaograca.recipes.R
import com.joaograca.recipes.domain.model.RecipePreview
import com.joaograca.recipes.presentation.search.component.RecipeListItem
import com.joaograca.recipes.presentation.search.component.SearchTextField

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun SearchScreen(
    viewModel: SearchViewModel = hiltViewModel()
) {
    val state = viewModel.uiState.collectAsState().value
    val keyboardController = LocalSoftwareKeyboardController.current

    SearchScreenContent(state, viewModel::onQueryChange) {
        viewModel.onSearch()
        keyboardController?.hide()
    }
}

@Composable
private fun SearchScreenContent(
    state: SearchUiState,
    onValueChange: (String) -> Unit,
    onSearch: () -> Unit
) {
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
            onValueChange = onValueChange,
            onSearch = onSearch,
            modifier = Modifier.fillMaxWidth(),
            placeholder = stringResource(id = R.string.search_recipe_placeholder)
        )
        Spacer(modifier = Modifier.height(spacing.spaceSmall))
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 128.dp),
            modifier = Modifier
                .fillMaxSize()
        ) {
            items(state.recipes) { recipe ->
                RecipeListItem(
                    recipe = recipe,
                    modifier = Modifier.aspectRatio(1f)
                )
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
                    text = stringResource(id = R.string.no_recipes),
                    style = MaterialTheme.typography.body1,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    val state = SearchUiState(
        query = "Tomato",
        isSearching = false,
        recipes = listOf(
            RecipePreview(id = 1, name = "Tomato sauce", imageUrl = ""),
            RecipePreview(id = 1, name = "Neque porro quisquam ", imageUrl = ""),
            RecipePreview(id = 1, name = "Excepteur sint occaecat cupidatat", imageUrl = ""),
            RecipePreview(id = 1, name = "incididunt ", imageUrl = ""),
        )
    )

    SearchScreenContent(state = state, onSearch = {}, onValueChange = {})
}