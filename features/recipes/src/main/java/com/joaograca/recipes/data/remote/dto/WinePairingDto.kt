package com.joaograca.recipes.data.remote.dto

data class WinePairingDto(
    val pairedWines: List<String>,
    val pairingText: String,
    val productMatches: List<ProductDto>
)

data class ProductDto(
    val id: Int,
    val title: String,
    val description: String,
    val price: String,
    val imageUrl: String,
    val averageRating: Float,
    val ratingCount: Float,
    val score: Double,
    val link: String
)