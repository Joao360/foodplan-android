package com.joaograca.recipes.presentation.search

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import com.joaograca.recipes.presentation.search.component.SearchTextField

@Composable
fun SearchScreen(
    viewModel: SearchViewModel = hiltViewModel()
) {
    val state = viewModel.uiState.collectAsState().value


    SearchTextField(text = state.query, onValueChange = viewModel::onQueryChange)
}