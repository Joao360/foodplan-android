package com.joaograca.core.util.extensions

fun String.removeHtmlTags(): String {
    val htmlTagPattern = "<.*?>".toRegex()
    return replace(htmlTagPattern, "")
}