package com.joaograca.recipes.domain.use_case

import com.joaograca.recipes.domain.RecipeRepositoryFake
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@OptIn(ExperimentalCoroutinesApi::class)
internal class SearchRecipeTest {

    private lateinit var useCase: SearchRecipe
    private lateinit var repository: RecipeRepositoryFake

    @BeforeEach
    fun setUp() {
        repository = RecipeRepositoryFake()

        useCase = SearchRecipe(repository)
    }

    @Test
    fun `should return failure when query is blank`() = runTest {
        // Given
        val query = ""

        // When
        val result = useCase(query)

        // Then
        assertTrue(result.isFailure)
    }

    @Test
    fun `should return failure when repository returns failure`() = runTest {
        // Given
        val query = "tomato"
        repository.exception = Exception("Oh no!")

        // When
        val result = useCase(query)

        // Then
        assertTrue(result.isFailure)
    }

    @Test
    fun `should return success when query is valid`() = runTest {
        // Given
        val query = "tomato"

        // When
        val result = useCase(query)

        // Then
        assertTrue(result.isSuccess)
    }

    @Test
    fun `should return recipes when query is valid`() = runTest {
        // Given
        val query = "tomato"

        // When
        val result = useCase(query)

        // Then
        result.getOrThrow().forEachIndexed { index, recipePreview ->
            assertEquals(repository.recipes[index], recipePreview)
        }
    }

}