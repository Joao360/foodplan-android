package com.joaograca.recipes.presentation.recipeDetails

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class RecipeDetailsViewModel @Inject constructor() : ViewModel() {

    private val _uiState = MutableStateFlow<RecipeDetailsUiState>(RecipeDetailsUiState.Loading)
    val uiState = _uiState.asStateFlow()
}