package com.joaograca.recipes.data.remote.dto

data class RecipeDto(
    val id: Int,
    val image: String,
    val imageType: String,
    val likes: Int,
    val missedIngredientCount: Int,
    val missedIngredients: List<IngredientDto>,
    val title: String,
    val unusedIngredients: List<IngredientDto>,
    val usedIngredientCount: Int,
    val usedIngredients: List<IngredientDto>
)
