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

val previewRecipe = Recipe(
    id = 123,
    title = "Pasta with Garlic, Scallions, Cauliflower & Breadcrumbs",
    summary = "Pasta with Garlic, Scallions, Cauliflower & Breadcrumbs might be a good recipe to expand your main course repertoire.",
    imageUrl = null,
    difficulty = Difficulty.MEDIUM,
    nutritionInfo = NutritionInfo(
        calories = Kcal(1),
        carbs = Grams(1),
        fat = Grams(1),
        protein = Grams(1)
    ),
    readyIn = Minutes(2),
    ingredients = listOf(
        IngredientInfo(
            ingredient = Ingredient("Garlic"),
            quantity = 1.0,
            unit = "g"
        ),
        IngredientInfo(
            ingredient = Ingredient("Salt"),
            quantity = 10.0,
            unit = "g"
        )
    ),
    servings = 2,
    steps = listOf(
        "First step is very easy",
        "Second step is very hard",
    )
)
