package com.joaograca.recipes.presentation.search

import com.joaograca.recipes.domain.model.RecipePreview

data class SearchUiState(
    val query: String = "",
    val isSearching: Boolean = false,
    val recipes: List<RecipePreview> = emptyList()
)