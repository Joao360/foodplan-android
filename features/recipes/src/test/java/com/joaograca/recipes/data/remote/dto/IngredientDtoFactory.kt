package com.joaograca.recipes.data.remote.dto

import com.joaograca.core.util.nextString
import kotlin.random.Random

class IngredientDtoFactory {
    companion object {
        fun create(): IngredientDto {
            return IngredientDto(
                aisle = Random.nextString(Random.nextInt(5)),
                amount = Random.nextDouble(),
                extendedName = Random.nextString(Random.nextInt(10)),
                id = Random.nextInt(),
                image = Random.nextString(Random.nextInt(10)),
                meta = listOf(
                    Random.nextString(Random.nextInt(10)),
                    Random.nextString(Random.nextInt(10))
                ),
                name = Random.nextString(Random.nextInt(10)),
                original = Random.nextString(Random.nextInt(10)),
                originalName = Random.nextString(Random.nextInt(10)),
                unit = Random.nextString(Random.nextInt(5)),
                unitLong = Random.nextString(Random.nextInt(10)),
                unitShort = Random.nextString(Random.nextInt(5)),
                measures = null
            )
        }
    }
}