package com.joaograca.recipes.data.remote.dto

object WinePairingDtoFactory {
    fun create(): WinePairingDto = WinePairingDto(
        pairedWines = emptyList(),
        pairingText = "",
        productMatches = emptyList()
    )
}