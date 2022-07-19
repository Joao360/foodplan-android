package com.joaograca.recipes.domain

import com.joaograca.recipes.domain.model.Ingredient
import com.joaograca.recipes.domain.model.Recipe

interface RecipeRepository {

    suspend fun searchRecipe(keyword: String)

    suspend fun searchRecipeByIngredient(ingredient: Ingredient)

    suspend fun createRecipe(recipe: Recipe)
}