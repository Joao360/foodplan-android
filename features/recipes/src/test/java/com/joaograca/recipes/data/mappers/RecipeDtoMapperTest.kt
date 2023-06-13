package com.joaograca.recipes.data.mappers

import com.joaograca.core.util.extensions.removeHtmlTags
import com.joaograca.recipes.data.remote.dto.IngredientDto
import com.joaograca.recipes.data.remote.dto.RecipeDtoFactory
import com.joaograca.recipes.domain.model.Difficulty
import com.joaograca.recipes.domain.model.Grams
import com.joaograca.recipes.domain.model.Kcal
import com.joaograca.recipes.domain.model.Minutes
import com.joaograca.recipes.domain.model.NutritionInfo
import com.joaograca.recipes.domain.model.Recipe
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RecipeDtoMapperTest {
    @Test
    fun `toRecipe given a RecipeDto then returns domain`() {
        // Given
        val dto = RecipeDtoFactory.create()
        val expected = with(dto) {
            Recipe(
                id = id,
                title = title,
                summary = summary.removeHtmlTags(),
                imageUrl = image,
                difficulty = Difficulty.MEDIUM,
                nutritionInfo = NutritionInfo(
                    calories = Kcal(1),
                    carbs = Grams(1),
                    fat = Grams(1),
                    protein = Grams(1)
                ),
                readyIn = Minutes(readyInMinutes),
                ingredients = extendedIngredients.map(IngredientDto::toIngredient),
                servings = servings,
                steps = analyzedInstructions.map { it.toString() }
            )
        }

        // When
        val actual = dto.toRecipe()

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun `toRecipe when dto has HTML tags on summary then domain summary has no HTML tags`() {
        // Given
        val dto = RecipeDtoFactory.create()
            .copy(summary = "<a href=\"https://www.example.com\"> This is a link </a>")
        val expected = " This is a link "

        // When
        val actual = dto.toRecipe()

        // Then
        assertEquals(expected, actual.summary)
    }
}