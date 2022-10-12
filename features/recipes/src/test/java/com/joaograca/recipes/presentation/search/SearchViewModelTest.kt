package com.joaograca.recipes.presentation.search

import com.joaograca.recipes.CoroutinesTestExtension
import com.joaograca.recipes.domain.model.RecipePreviewFactory
import com.joaograca.recipes.domain.use_case.SearchRecipe
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@OptIn(ExperimentalCoroutinesApi::class)
@ExtendWith(CoroutinesTestExtension::class)
internal class SearchViewModelTest {

    private val searchRecipe: SearchRecipe = mockk()

    private lateinit var viewModel: SearchViewModel

    @BeforeEach
    fun setUp() {
        viewModel = SearchViewModel(searchRecipe)
    }

    @Test
    fun `should emit is searching when calling onSearch`() = runTest {
        // Given
        assertNotEquals(
            RecipeListUiState.Loading::class,
            viewModel.uiState.value.recipeListUiState::class
        )
        coEvery { searchRecipe(any()) } coAnswers {
            delay(10L) // Delay used to avoid emitting the result at the same time as the loading
            Result.success(
                listOf(RecipePreviewFactory.create())
            )
        }

        // When
        viewModel.onSearch()

        // Then
        assertEquals(
            RecipeListUiState.Loading::class,
            viewModel.uiState.value.recipeListUiState::class
        )
    }

    @Test
    fun `should emit recipes when use case returns success`() = runTest {
        // Given
        val recipes = listOf(RecipePreviewFactory.create())
        coEvery { searchRecipe(any()) } returns
                Result.success(
                    recipes
                )

        // When
        viewModel.onSearch()
        advanceUntilIdle()

        // Then
        val recipesResult =
            (viewModel.uiState.value.recipeListUiState as RecipeListUiState.Recipes).list
        recipes.forEachIndexed { index, recipePreview ->
            assertEquals(recipePreview, recipesResult[index])
        }
    }

    @Test
    fun `should hide loading when use case returns success`() = runTest {
        // Given
        coEvery { searchRecipe(any()) } returns Result.success(emptyList())

        // When
        viewModel.onSearch()
        advanceUntilIdle()

        // Then
        assertNotEquals(
            RecipeListUiState.Loading::class,
            viewModel.uiState.value.recipeListUiState::class
        )
    }

    @Test
    fun `should hide loading when use case returns a failure`() = runTest {
        // Given
        coEvery { searchRecipe(any()) } returns Result.failure(Exception("Oh no!"))

        // When
        viewModel.onSearch()
        advanceUntilIdle()

        // Then
        assertNotEquals(
            RecipeListUiState.Loading::class,
            viewModel.uiState.value.recipeListUiState::class
        )
    }

    @Test
    fun `should update query when calling on query change`() {
        // Given
        val expectedQuery = "new query"
        assertNotEquals(expectedQuery, viewModel.uiState.value.query)

        // When
        viewModel.onQueryChange(expectedQuery)

        // Then
        assertEquals(expectedQuery, viewModel.uiState.value.query)
    }

    @Test
    fun `should set error message when search recipe returns a failure`() {
        // Given
        coEvery { searchRecipe(any()) } returns Result.failure(Exception("Oh no!"))

        // When
        viewModel.onSearch()

        // Then
        assertNotNull(viewModel.errorMessage.value)
    }

    @Test
    fun `should remove error message on error message shown`() {
        // Given
        coEvery { searchRecipe(any()) } returns Result.failure(Exception("Oh no!"))
        viewModel.onSearch()
        assertNotNull(viewModel.errorMessage.value)

        // When
        viewModel.onErrorMessageShown()

        // Then
        assertNull(viewModel.errorMessage.value)
    }
}