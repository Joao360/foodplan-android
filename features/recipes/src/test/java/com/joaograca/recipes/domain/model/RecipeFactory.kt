package com.joaograca.recipes.domain.model

import com.joaograca.core.util.nextString
import kotlin.random.Random

class RecipeFactory {
    companion object {
        fun create(): Recipe {
            return Recipe(
                id = Random.nextInt(5),
                title = Random.nextString(5),
                summary = Random.nextString(5),
                imageUrl = Random.nextString(5),
                difficulty = Difficulty.values().random(),
                nutritionInfo = NutritionInfo(
                    calories = Kcal(Random.nextInt(5)),
                    carbs = Grams(Random.nextInt(5)),
                    fat = Grams(Random.nextInt(5)),
                    protein = Grams(Random.nextInt(5))
                ),
                readyIn = Minutes(Random.nextInt(5)),
                ingredients = listOf(
                    IngredientInfo(
                        Ingredient(Random.nextString(5)),
                        Random.nextDouble(),
                        Random.nextString(5)
                    )
                ),
                servings = Random.nextInt(5),
                steps = listOf(Random.nextString(5), Random.nextString(5))
            )
        }
    }
}