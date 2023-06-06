package com.joaograca.recipes.data.mappers

import com.joaograca.recipes.data.remote.dto.ComplexSearchItemDtoFactory
import com.joaograca.recipes.domain.model.RecipePreview
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ComplexSearchItemDtoMapperTest {
    @Test
    fun `toRecipePreview given a dto then return domain`() {
        // Given
        val dto = ComplexSearchItemDtoFactory.create()
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