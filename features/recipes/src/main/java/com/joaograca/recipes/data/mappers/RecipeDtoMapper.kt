package com.joaograca.recipes.data.mappers

import com.joaograca.recipes.data.remote.dto.RecipeDto
import com.joaograca.recipes.domain.model.RecipePreview

object RecipeDtoMapper {
    fun toRecipePreview(dto: RecipeDto): RecipePreview {
        return RecipePreview(
            id = dto.id,
            name = dto.title,
            imageUrl = dto.image
        )
    }
}