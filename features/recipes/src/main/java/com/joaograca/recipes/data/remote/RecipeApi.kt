package com.joaograca.recipes.data.remote

import com.joaograca.recipes.BuildConfig
import com.joaograca.recipes.data.remote.dto.ComplexSearchDto
import com.joaograca.recipes.data.remote.dto.RecipeDto
import retrofit2.http.GET
import retrofit2.http.Query

interface RecipeApi {

    @GET("recipes/complexSearch?apiKey=${API_KEY}")
    suspend fun searchRecipe(
        @Query("query") keyword: String
    ): ComplexSearchDto

    @GET("recipes/findByIngredients?apiKey=${API_KEY}")
    suspend fun searchRecipeByIngredient(
        @Query("ingredients") ingredients: String
    ): List<RecipeDto>

    companion object {
        const val BASE_URL = "https://api.spoonacular.com/"
        const val API_KEY = BuildConfig.API_KEY
    }
}