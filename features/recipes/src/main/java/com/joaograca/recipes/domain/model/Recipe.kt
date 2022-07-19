package com.joaograca.recipes.domain.model

data class Recipe(
    val id: Int? = null,
    val title: String,
    val summary: String,
    val imageUrl: String?,
    val difficulty: Difficulty,
    val nutritionInfo: NutritionInfo,
    val readyIn: Minutes,
    val ingredients: List<IngredientInfo>,
    val servings: Int,
    val steps: List<String>
)
