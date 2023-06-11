package com.joaograca.recipes.presentation.recipeDetails

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.joaograca.recipes.domain.RecipeRepository
import com.joaograca.recipes.navigation.RecipeDetailsArgs
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class RecipeDetailsViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val recipeRepository: RecipeRepository
) : ViewModel() {

    private val recipeId: Int = requireNotNull(savedStateHandle[RecipeDetailsArgs.recipeId])

    private val _uiState = MutableStateFlow<RecipeDetailsUiState>(RecipeDetailsUiState.Loading)
    val uiState = _uiState.asStateFlow()

    init {
        refreshRecipeDetails()
    }

    fun refreshRecipeDetails() {
        viewModelScope.launch {
            _uiState.value = RecipeDetailsUiState.Loading

            _uiState.value = recipeRepository.getRecipe(id = recipeId).fold(
                onSuccess = { RecipeDetailsUiState.Success(it) },
                onFailure = { RecipeDetailsUiState.Error }
            )
        }
    }
}