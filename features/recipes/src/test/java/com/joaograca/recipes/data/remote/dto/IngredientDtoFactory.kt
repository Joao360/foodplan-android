package com.joaograca.recipes.data.remote.dto

object IngredientDtoFactory {
    fun create(): IngredientDto = IngredientDto(
        aisle = "Baking",
        amount = 1.0,
        extendedName = null,
        id = 18371,
        image = "https://spoonacular.com/cdn/ingredients_100x100/white-powder.jpg",
        meta = emptyList(),
        name = "baking powder",
        original = "1 tsp baking powder",
        originalName = "baking powder",
        unit = "tsp",
        unitLong = "teaspoon",
        unitShort = "tsp",
        measures = null
    )

    fun createApples(): IngredientDto = IngredientDto(
        aisle = "Produce",
        amount = 6.0,
        extendedName = null,
        id = 9003,
        image = "https://spoonacular.com/cdn/ingredients_100x100/white-powder.jpg",
        meta = emptyList(),
        name = "apples",
        original = "6 large baking apples",
        originalName = "baking apples",
        unit = "large",
        unitLong = "larges",
        unitShort = "large",
        measures = null
    )
}