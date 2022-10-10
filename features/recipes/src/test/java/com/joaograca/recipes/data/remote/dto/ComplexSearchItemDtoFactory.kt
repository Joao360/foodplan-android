package com.joaograca.recipes.data.remote.dto

import com.joaograca.core.util.nextString
import kotlin.random.Random

class ComplexSearchItemDtoFactory {
    companion object {
        fun create(): ComplexSearchItemDto {
            return ComplexSearchItemDto(
                id = Random.nextInt(10),
                title = Random.nextString(10),
                image = Random.nextString(10),
                imageType = Random.nextString(10)
            )
        }
    }
}