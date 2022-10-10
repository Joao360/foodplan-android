package com.joaograca.recipes.data.mappers

import com.joaograca.recipes.data.remote.dto.RecipeDtoFactory
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RecipeDtoMapperTest {
    @Test
    fun `should map objects correctly`() {
        // Given
        val dto = RecipeDtoFactory.create()

        // When
        val result = dto.toRecipePreview()

        // Then
        assertEquals(result.id, dto.id)
        assertEquals(result.name, dto.title)
        assertEquals(result.imageUrl, dto.image)
    }
}