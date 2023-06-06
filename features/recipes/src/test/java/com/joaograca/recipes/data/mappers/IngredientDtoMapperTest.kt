package com.joaograca.recipes.data.mappers

import com.joaograca.recipes.data.remote.dto.IngredientDtoFactory
import com.joaograca.recipes.domain.model.Ingredient
import com.joaograca.recipes.domain.model.IngredientInfo
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class IngredientDtoMapperTest {
    @Test
    fun testToIngredient() {
        // Given
        val ingredientDto = IngredientDtoFactory.create()
        val expected = with(ingredientDto) {
            IngredientInfo(
                ingredient = Ingredient(name),
                quantity = amount,
                unit = unit
            )
        }

        // When
        val actual = ingredientDto.toIngredient()

        // Then
        assertEquals(expected, actual)
    }
}