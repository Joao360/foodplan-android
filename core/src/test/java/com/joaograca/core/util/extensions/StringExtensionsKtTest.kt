package com.joaograca.core.util.extensions

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class StringExtensionsKtTest {
    @Test
    fun `removeHtmlTags when there's one tag then remove it`() {
        // Given
        val str = "<a href=\"https://www.example.com\"> This is a link </a>"
        val expected = " This is a link "

        // When
        val actual = str.removeHtmlTags()

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun `removeHtmlTags when there's two tags then remove them`() {
        // Given
        val str = "<a href=\"https://www.example.com\">This is a link</a> and this <b>is bold</b>"
        val expected = "This is a link and this is bold"

        // When
        val actual = str.removeHtmlTags()

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun `removeHtmlTags when there's no tags then return expected`() {
        // Given
        val expected = "This is a link and this is bold"

        // When
        val actual = expected.removeHtmlTags()

        // Then
        assertEquals(expected, actual)
    }
}