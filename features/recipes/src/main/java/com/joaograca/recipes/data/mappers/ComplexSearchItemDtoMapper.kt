package com.joaograca.recipes.data.mappers

import com.joaograca.recipes.data.remote.dto.ComplexSearchItemDto
import com.joaograca.recipes.domain.model.RecipePreview

fun ComplexSearchItemDto.toRecipePreview(): RecipePreview {
    return RecipePreview(
        id = id,
        name = title,
        imageUrl = image
    )
}