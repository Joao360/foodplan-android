package com.joaograca.recipes.presentation.search

import com.joaograca.recipes.domain.model.RecipePreview

data class SearchUiState(
    val query: String = "",
    val recipeListUiState: RecipeListUiState = RecipeListUiState.Empty
)

sealed interface RecipeListUiState {
    object Loading : RecipeListUiState

    data class Recipes(val list: List<RecipePreview>) : RecipeListUiState

    object Empty : RecipeListUiState
}