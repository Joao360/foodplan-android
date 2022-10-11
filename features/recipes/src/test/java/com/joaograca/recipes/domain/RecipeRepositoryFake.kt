package com.joaograca.recipes.domain

import com.joaograca.recipes.domain.model.Ingredient
import com.joaograca.recipes.domain.model.Recipe
import com.joaograca.recipes.domain.model.RecipePreview
import com.joaograca.recipes.domain.model.RecipePreviewFactory

class RecipeRepositoryFake : RecipeRepository {

    var recipes = listOf(
        RecipePreviewFactory.create(),
        RecipePreviewFactory.create()
    )

    var exception: Throwable? = null

    override suspend fun searchRecipe(keyword: String): Result<List<RecipePreview>> {
        return exception?.let { Result.failure(it) } ?: Result.success(recipes)
    }

    override suspend fun searchRecipeByIngredients(ingredients: List<Ingredient>): Result<List<RecipePreview>> {
        return exception?.let { Result.failure(it) } ?: Result.success(recipes)
    }

    override suspend fun createRecipe(recipe: Recipe): Result<Unit> {
        return exception?.let { Result.failure(it) } ?: Result.success(Unit)
    }
}