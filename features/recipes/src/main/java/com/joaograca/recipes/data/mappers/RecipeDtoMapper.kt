package com.joaograca.recipes.data.mappers

import com.joaograca.core.util.extensions.removeHtmlTags
import com.joaograca.recipes.data.remote.dto.IngredientDto
import com.joaograca.recipes.data.remote.dto.RecipeDto
import com.joaograca.recipes.domain.model.Difficulty
import com.joaograca.recipes.domain.model.Grams
import com.joaograca.recipes.domain.model.Kcal
import com.joaograca.recipes.domain.model.Minutes
import com.joaograca.recipes.domain.model.NutritionInfo
import com.joaograca.recipes.domain.model.Recipe

fun RecipeDto.toRecipe(): Recipe {
    return Recipe(
        id = id,
        title = title,
        summary = summary.removeHtmlTags(),
        imageUrl = image,
        difficulty = Difficulty.MEDIUM, // TODO
        nutritionInfo = NutritionInfo( // TODO
            calories = Kcal(1),
            carbs = Grams(1),
            fat = Grams(1),
            protein = Grams(1)
        ),
        readyIn = Minutes(readyInMinutes),
        ingredients = extendedIngredients.map(IngredientDto::toIngredient),
        servings = servings,
        steps = analyzedInstructions.map { it.toString() } // TODO
    )
}