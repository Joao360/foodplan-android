package com.joaograca.recipes.presentation.recipeDetails

import androidx.lifecycle.SavedStateHandle
import app.cash.turbine.test
import com.joaograca.core_testing.withDispatcher
import com.joaograca.recipes.CoroutinesTestExtension
import com.joaograca.recipes.domain.RecipeRepositoryFake
import com.joaograca.recipes.domain.model.RecipeFactory
import com.joaograca.recipes.navigation.recipeIdArg
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@OptIn(ExperimentalCoroutinesApi::class)
@ExtendWith(CoroutinesTestExtension::class)
internal class RecipeDetailsViewModelTest {

    // region Constants
    companion object {
        const val RECIPE_ID = 123
    }
    // endregion

    // region Helpers
    private val savedStateHandle = SavedStateHandle()
    private val repository = RecipeRepositoryFake()
    // endregion

    @Test
    fun `uiState should start as Loading`() = runTest {
        withDispatcher(StandardTestDispatcher(testScheduler)) {
            val viewModel = createViewModel()
            viewModel.uiState.test {
                val actual = awaitItem()

                // Then
                assertEquals(RecipeDetailsUiState.Loading, actual)
                cancelAndIgnoreRemainingEvents()
            }
        }
    }

    @Test
    fun `init when there's missing args then throw exception`() = runTest {
        // Then
        assertThrows(IllegalArgumentException::class.java) {
            // When
            createViewModelWithoutArgs()
        }
    }

    @Test
    fun `uiState when repository succeeds then value is Success`() = runTest {
        // Given
        uiStateSuccess()
        val expected = RecipeDetailsUiState.Success(
            repository.getRecipe(RECIPE_ID).getOrThrow()
        )

        // When
        val viewModel = createViewModel()

        // Then
        assertEquals(expected, viewModel.uiState.value)
    }

    @Test
    fun `uiState when repository fails then value is Error`() = runTest {
        // Given
        uiStateFailure()
        val expected = RecipeDetailsUiState.Error

        // When
        val viewModel = createViewModel()

        // Then
        assertEquals(expected, viewModel.uiState.value)
    }

    // region Helper functions
    private fun createViewModel(): RecipeDetailsViewModel {
        savedStateHandle[recipeIdArg] = RECIPE_ID

        return RecipeDetailsViewModel(
            savedStateHandle = savedStateHandle,
            recipeRepository = repository
        )
    }

    private fun createViewModelWithoutArgs(): RecipeDetailsViewModel {
        return RecipeDetailsViewModel(
            savedStateHandle = savedStateHandle,
            recipeRepository = repository
        )
    }

    private fun uiStateSuccess() {
        repository.recipes = listOf(
            RecipeFactory.create().copy(id = RECIPE_ID),
            RecipeFactory.create()
        )
    }

    private fun uiStateFailure() {
        repository.recipes = listOf(
            RecipeFactory.create().copy(id = 1),
            RecipeFactory.create().copy(id = 2)
        )
    }
    // endregion
}