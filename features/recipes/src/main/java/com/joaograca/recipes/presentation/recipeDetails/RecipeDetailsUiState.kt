package com.joaograca.recipes.presentation.recipeDetails

import com.joaograca.recipes.domain.model.Recipe

sealed interface RecipeDetailsUiState {
    
    object Loading : RecipeDetailsUiState

    data class Success(val recipe: Recipe) : RecipeDetailsUiState

    object Error : RecipeDetailsUiState
}