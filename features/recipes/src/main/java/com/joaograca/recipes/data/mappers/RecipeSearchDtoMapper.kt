package com.joaograca.recipes.data.mappers

import com.joaograca.recipes.data.remote.dto.RecipeSearchDto
import com.joaograca.recipes.domain.model.RecipePreview

fun RecipeSearchDto.toRecipePreview(): RecipePreview {
    return RecipePreview(
        id = id,
        name = title,
        imageUrl = image
    )
}