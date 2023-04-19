package com.joaograca.recipes.data.remote.dto

object WinePairingDtoFactory {
    fun create(): WinePairingDto = WinePairingDto(
        pairedWines = listOf("chardonnay", "gruener veltliner", "sauvignon blanc"),
        pairingText = "Chardonnay, Gruener Veltliner, and Sauvignon Blanc are great choices for Pasta. Sauvignon Blanc and Gruner Veltliner both have herby notes that complement salads with enough acid to match tart vinaigrettes, while a Chardonnay can be a good pick for creamy salad dressings. The Buddha Kat Winery Chardonnay with a 4 out of 5 star rating seems like a good match. It costs about 25 dollars per bottle.",
        productMatches = listOf(ProductDtoFactory.create())
    )
}