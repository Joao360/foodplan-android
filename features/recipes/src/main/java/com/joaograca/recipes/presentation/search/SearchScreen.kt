package com.joaograca.recipes.presentation.search

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.joaograca.core_ui.LocalSpacing
import com.joaograca.recipes.presentation.search.component.SearchTextField

@Composable
fun SearchScreen(
    viewModel: SearchViewModel = hiltViewModel()
) {
    val state = viewModel.uiState.collectAsState().value
    val spacing = LocalSpacing.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = spacing.spaceMedium, vertical = spacing.spaceLarge)
    ) {
        SearchTextField(
            text = state.query,
            onValueChange = viewModel::onQueryChange,
            onSearch = viewModel::onSearch,
            modifier = Modifier.fillMaxWidth()
        )
    }
}