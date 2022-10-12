package com.joaograca.recipes.presentation.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.joaograca.recipes.domain.use_case.SearchRecipe
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val searchRecipe: SearchRecipe
) : ViewModel() {

    private val _uiState = MutableStateFlow(SearchUiState())
    val uiState: StateFlow<SearchUiState> = _uiState

    fun onQueryChange(query: String) {
        _uiState.update { it.copy(query = query) }
    }

    fun onSearch() {
        viewModelScope.launch {
            _uiState.update { it.copy(recipeListUiState = RecipeListUiState.Loading) }
            val recipe = _uiState.value.query

            searchRecipe(recipe)
                .onSuccess { recipes ->
                    _uiState.update { it.copy(recipeListUiState = RecipeListUiState.Recipes(recipes)) }
                }
                .onFailure { throwable ->
                    Timber.e(throwable)
                    _uiState.update { it.copy(recipeListUiState = RecipeListUiState.Empty) }
                }
        }
    }
}