package com.joaograca.recipes.data.remote.dto

object RecipeSearchDtoFactory {
    fun create(): RecipeSearchDto = RecipeSearchDto(
        id = 73420,
        image = "https://spoonacular.com/recipeImages/73420-312x231.jpg",
        imageType = "jpg",
        likes = 0,
        missedIngredientCount = 3,
        missedIngredients = listOf(IngredientDtoFactory.create()),
        title = "Apple Or Peach Strudel",
        unusedIngredients = emptyList(),
        usedIngredientCount = 1,
        usedIngredients = listOf(IngredientDtoFactory.createApples())
    )
}