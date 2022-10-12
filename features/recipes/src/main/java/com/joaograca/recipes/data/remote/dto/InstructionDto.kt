package com.joaograca.recipes.data.remote.dto

data class InstructionDto(
    val name: String,
    val steps: List<StepDto>
)

data class StepDto(
    val number: Int,
    val step: String,
    val ingredients: List<ItemDto>,
    val equipment: List<ItemDto>,
    val length: LengthDto?
)

data class ItemDto(
    val id: Int,
    val name: String,
    val localizedName: String,
    val image: String
)

data class LengthDto(
    val number: Int,
    val unit: String
)