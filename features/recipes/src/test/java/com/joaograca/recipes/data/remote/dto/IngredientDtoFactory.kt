package com.joaograca.recipes.data.remote.dto

object IngredientDtoFactory {
    fun create(): IngredientDto = IngredientDto(
        aisle = "",
        amount = 1.0,
        extendedName = "",
        id = 1,
        image = "",
        meta = emptyList(),
        name = "",
        original = "",
        originalName = "",
        unit = "",
        unitLong = "",
        unitShort = "",
        measures = null
    )
}