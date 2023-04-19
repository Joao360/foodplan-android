package com.joaograca.recipes.data.mappers

import com.joaograca.recipes.data.remote.dto.RecipeSearchDtoFactory
import com.joaograca.recipes.domain.model.RecipePreview
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RecipeDtoMapperTest {
    @Test
    fun `toRecipe given a RecipeDto then returns domain`() {
        // Given
        val dto = RecipeSearchDtoFactory.create()
        val expected = with(dto) {
            RecipePreview(
                id = id,
                name = title,
                imageUrl = image
            )
        }

        // When
        val actual = dto.toRecipePreview()

        // Then
        assertEquals(expected, actual)
    }
}