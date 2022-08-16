package com.joaograca.recipes.data.remote.dto

data class ComplexSearchDto(
    val offset: Int,
    val number: Int,
    val results: List<ComplexSearchItemDto>,
    val totalResults: Int
)
