package com.joaograca.recipes.data.remote.dto

object ProductDtoFactory {
    fun create(): ProductDto = ProductDto(
        id = 469199,
        title = "Buddha Kat Winery Chardonnay",
        description = "We barrel ferment our Chardonnay and age it in a mix of Oak and Stainless. Giving this light bodied wine modest oak character, a delicate floral aroma, and a warming finish.",
        price = "\$25.0",
        imageUrl = "https://spoonacular.com/productImages/469199-312x231.jpg",
        averageRating = 0.8F,
        ratingCount = 1F,
        score = 0.55,
        link = "https://www.amazon.com/2015-Buddha-Kat-Winery-Chardonnay/dp/B00OSAVVM4?tag=spoonacular-20"
    )
}