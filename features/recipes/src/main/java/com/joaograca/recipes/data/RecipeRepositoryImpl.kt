package com.joaograca.recipes.data

import com.joaograca.recipes.data.mappers.ComplexSearchItemDtoMapper
import com.joaograca.recipes.data.mappers.RecipeDtoMapper
import com.joaograca.recipes.data.remote.RecipeApi
import com.joaograca.recipes.domain.RecipeRepository
import com.joaograca.recipes.domain.model.Ingredient
import com.joaograca.recipes.domain.model.Recipe
import com.joaograca.recipes.domain.model.RecipePreview

class RecipeRepositoryImpl(
    private val recipeApi: RecipeApi
) : RecipeRepository {
    override suspend fun searchRecipe(keyword: String): Result<List<RecipePreview>> {
        return try {
            val dto = recipeApi.searchRecipe(keyword)
            val domain = dto.results.map(ComplexSearchItemDtoMapper::toRecipePreview)
            Result.success(domain)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    override suspend fun searchRecipeByIngredients(ingredients: List<Ingredient>): Result<List<RecipePreview>> {
        return try {
            val dto = recipeApi.searchRecipeByIngredient(
                ingredients.map(Ingredient::name).joinToString(separator = ",")
            )
            val domain = dto.map(RecipeDtoMapper::toRecipePreview)
            Result.success(domain)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    override suspend fun createRecipe(recipe: Recipe): Result<Unit> {
        TODO("Not yet implemented")
    }
}