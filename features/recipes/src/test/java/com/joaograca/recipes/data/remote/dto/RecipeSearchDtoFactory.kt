package com.joaograca.recipes.data.remote.dto

object RecipeSearchDtoFactory {
    fun create(): RecipeSearchDto {
        return RecipeSearchDto(
            id = 1,
            image = "",
            imageType = "",
            likes = 1,
            missedIngredientCount = 1,
            missedIngredients = emptyList(),
            title = "",
            unusedIngredients = emptyList(),
            usedIngredientCount = 1,
            usedIngredients = emptyList()
        )
    }
}