package com.joaograca.recipes.data.mappers

import com.joaograca.recipes.data.remote.dto.RecipeDto
import com.joaograca.recipes.domain.model.RecipePreview

fun RecipeDto.toRecipePreview(): RecipePreview {
    return RecipePreview(
        id = id,
        name = title,
        imageUrl = image
    )
}