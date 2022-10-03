package com.joaograca.recipes.domain.use_case

import com.joaograca.recipes.domain.RecipeRepository
import com.joaograca.recipes.domain.exception.BlankQueryException
import com.joaograca.recipes.domain.model.RecipePreview
import javax.inject.Inject

class SearchRecipe @Inject constructor(
    private val repository: RecipeRepository
) {

    suspend operator fun invoke(query: String): Result<List<RecipePreview>> {
        if (query.isBlank()) {
            return Result.failure(BlankQueryException)
        }

        return repository.searchRecipe(query)
    }
}