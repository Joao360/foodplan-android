package com.joaograca.recipes.data.remote.dto

import com.joaograca.core.util.nextString
import kotlin.random.Random

class RecipeDtoFactory {
    companion object {
        fun create(): RecipeDto {
            return RecipeDto(
                id = Random.nextInt(),
                image = Random.nextString(Random.nextInt(10)),
                imageType = Random.nextString(Random.nextInt(10)),
                likes = Random.nextInt(),
                missedIngredientCount = Random.nextInt(),
                missedIngredients = listOf(
                    IngredientDtoFactory.create(),
                    IngredientDtoFactory.create()
                ),
                title = Random.nextString(Random.nextInt(10)),
                unusedIngredients = listOf(
                    IngredientDtoFactory.create()
                ),
                usedIngredientCount = Random.nextInt(),
                usedIngredients = listOf(
                    IngredientDtoFactory.create()
                )
            )
        }
    }
}