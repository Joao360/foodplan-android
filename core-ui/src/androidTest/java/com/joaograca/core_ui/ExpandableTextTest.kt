package com.joaograca.core_ui

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertCountEquals
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasClickAction
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.joaograca.core_ui.theme.FoodPlanTheme
import org.junit.Rule
import org.junit.Test

internal class ExpandableTextTest {

    companion object {
        const val TEXT =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    }

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun expandableText_whenIsCollapsed_thenButtonDisplayExpectedString() {
        // Given
        val initialIsExpanded = false

        // When
        composeTestRule.setContent {
            FoodPlanTheme {
                ExpandableText(text = TEXT, initialIsExpanded = initialIsExpanded)
            }
        }

        // Then
        composeTestRule.onNodeWithText(composeTestRule.activity.getString(R.string.read_more))
            .assertExists()
            .assertIsDisplayed()
    }

    @Test
    fun expandableText_whenIsExpanded_thenButtonDisplayExpectedString() {
        // Given
        val initialIsExpanded = true

        // When
        composeTestRule.setContent {
            FoodPlanTheme {
                ExpandableText(text = TEXT, initialIsExpanded = initialIsExpanded)
            }
        }

        // Then
        composeTestRule.onNodeWithText(composeTestRule.activity.getString(R.string.read_less))
            .assertExists()
            .assertIsDisplayed()
    }

    @Test
    fun expandableText_whenPressingButton_thenExpandsAndCollapsesText() {
        // Given
        val initialIsExpanded = false

        // When
        composeTestRule.setContent {
            FoodPlanTheme {
                ExpandableText(text = TEXT, initialIsExpanded = initialIsExpanded)
            }
        }

        // Then
        composeTestRule.onNodeWithText(composeTestRule.activity.getString(R.string.read_more))
            .assertExists()
            .assertIsDisplayed()
            .performClick()

        composeTestRule.onNodeWithText(composeTestRule.activity.getString(R.string.read_less))
            .assertExists()
            .assertIsDisplayed()
    }

    @Test
    fun expandableText_whenTextDoesntOverflow_thenButtonIsInvisible() {
        // Given

        // When
        composeTestRule.setContent {
            FoodPlanTheme {
                ExpandableText(text = "Small text")
            }
        }

        // Then
        composeTestRule.onAllNodes(hasClickAction())
            .assertCountEquals(0)
    }
}