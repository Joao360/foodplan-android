package com.joaograca.recipes.presentation.search

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.joaograca.core_ui.LocalSpacing
import com.joaograca.core_ui.UiText
import com.joaograca.recipes.R
import com.joaograca.recipes.domain.model.RecipePreview
import com.joaograca.recipes.presentation.search.component.RecipeListItem
import com.joaograca.recipes.presentation.search.component.SearchTextField

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun SearchScreenRoute(
    viewModel: SearchViewModel = hiltViewModel()
) {
    val state by viewModel.uiState.collectAsState()
    val errorMessage by viewModel.errorMessage.collectAsState()
    val keyboardController = LocalSoftwareKeyboardController.current

    val onSearch: () -> Unit = {
        viewModel.onSearch()
        keyboardController?.hide()
    }

    SearchScreen(
        state = state,
        onValueChange = viewModel::onQueryChange,
        onSearch = onSearch,
        errorMessage = errorMessage,
        onErrorMessageShown = viewModel::onErrorMessageShown
    )
}

@Composable
private fun SearchScreen(
    state: SearchUiState,
    onValueChange: (String) -> Unit,
    onSearch: () -> Unit,
    errorMessage: UiText?,
    onErrorMessageShown: () -> Unit
) {
    val context = LocalContext.current
    val spacing = LocalSpacing.current
    val scaffoldState = rememberScaffoldState()

    LaunchedEffect(scaffoldState.snackbarHostState, errorMessage) {
        errorMessage?.let {
            scaffoldState.snackbarHostState.showSnackbar(it.asString(context))
            onErrorMessageShown()
        }
    }

    Scaffold(
        scaffoldState = scaffoldState,
        modifier = Modifier
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

        when (state.recipeListUiState) {
            RecipeListUiState.Empty -> {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = stringResource(id = R.string.no_recipes),
                        style = MaterialTheme.typography.body1,
                        textAlign = TextAlign.Center
                    )
                }
            }
            RecipeListUiState.Loading -> {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            }
            is RecipeListUiState.Recipes -> {
                LazyVerticalGrid(
                    columns = GridCells.Adaptive(minSize = 128.dp),
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    items(state.recipeListUiState.list) { recipe ->
                        RecipeListItem(
                            recipe = recipe,
                            modifier = Modifier.aspectRatio(1f)
                        )
                    }
                }
            }
        }

    }
}

@Preview
@Composable
fun SearchScreenWithData() {
    val recipeListUiState = RecipeListUiState.Recipes(
        list = listOf(
            RecipePreview(id = 1, name = "Tomato sauce", imageUrl = ""),
            RecipePreview(id = 1, name = "Neque porro quisquam ", imageUrl = ""),
            RecipePreview(id = 1, name = "Excepteur sint occaecat cupidatat", imageUrl = ""),
            RecipePreview(id = 1, name = "incididunt ", imageUrl = "")
        )
    )

    val state = SearchUiState(
        query = "Tomato",
        recipeListUiState = recipeListUiState
    )

    SearchScreen(
        state = state,
        onValueChange = {},
        onSearch = {},
        errorMessage = null,
        onErrorMessageShown = {}
    )
}

@Preview
@Composable
fun SearchScreenEmpty() {
    val state = SearchUiState(
        query = "Tomato",
        recipeListUiState = RecipeListUiState.Empty
    )

    SearchScreen(
        state = state,
        onValueChange = {},
        onSearch = {},
        errorMessage = null,
        onErrorMessageShown = {}
    )
}

@Preview
@Composable
fun SearchScreenLoading() {
    val state = SearchUiState(
        query = "Tomato",
        recipeListUiState = RecipeListUiState.Loading
    )

    SearchScreen(
        state = state,
        onValueChange = {},
        onSearch = {},
        errorMessage = null,
        onErrorMessageShown = {}
    )
}