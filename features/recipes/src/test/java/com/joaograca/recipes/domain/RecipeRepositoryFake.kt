package com.joaograca.recipes.domain

import com.joaograca.recipes.domain.model.Ingredient
import com.joaograca.recipes.domain.model.Recipe
import com.joaograca.recipes.domain.model.RecipeFactory
import com.joaograca.recipes.domain.model.RecipePreview
import com.joaograca.recipes.domain.model.RecipePreviewFactory

class RecipeRepositoryFake : RecipeRepository {

    var recipePreviews = listOf(
        RecipePreviewFactory.create().copy(id = 1),
        RecipePreviewFactory.create().copy(id = 2)
    )

    var recipes = listOf(
        RecipeFactory.create().copy(id = 1),
        RecipeFactory.create().copy(id = 2)
    )

    var exception: Throwable? = null

    override suspend fun searchRecipe(keyword: String): Result<List<RecipePreview>> {
        return exception?.let { Result.failure(it) } ?: Result.success(recipePreviews)
    }

    override suspend fun searchRecipeByIngredients(ingredients: List<Ingredient>): Result<List<RecipePreview>> {
        return exception?.let { Result.failure(it) } ?: Result.success(recipePreviews)
    }

    override suspend fun createRecipe(recipe: Recipe): Result<Unit> {
        return exception?.let { Result.failure(it) } ?: Result.success(Unit)
    }

    override suspend fun getRecipe(id: Int): Result<Recipe> {
        val currentException = exception
        if (currentException != null) {
            return Result.failure(currentException)
        }

        return runCatching {
            recipes.first { it.id == id }
        }
    }
}