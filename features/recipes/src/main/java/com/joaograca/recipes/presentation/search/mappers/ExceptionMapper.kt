package com.joaograca.recipes.presentation.search.mappers

import com.joaograca.core_ui.UiText
import com.joaograca.recipes.R
import com.joaograca.recipes.domain.exception.BlankQueryException

fun Throwable.toUiText(): UiText {
    return when (this) {
        BlankQueryException -> UiText.StringResource(R.string.blank_query_error)
        else -> UiText.StringResource(com.joaograca.core_ui.R.string.unknown_error)
    }
}