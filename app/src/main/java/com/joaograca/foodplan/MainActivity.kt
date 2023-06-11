package com.joaograca.foodplan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.joaograca.core_ui.theme.FoodPlanTheme
import com.joaograca.foodplan.navigation.Route
import com.joaograca.recipes.navigation.recipeNavigation
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodPlanTheme {
                window.statusBarColor = MaterialTheme.colors.primary.toArgb()

                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()

                val onClickGoBack: () -> Unit = { navController.popBackStack() }

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    scaffoldState = scaffoldState
                ) { paddingValues ->
                    NavHost(
                        modifier = Modifier.padding(paddingValues),
                        navController = navController,
                        startDestination = Route.SEARCH
                    ) {
                        recipeNavigation(
                            scaffoldState = scaffoldState,
                            navController = navController,
                            onClickGoBack = onClickGoBack
                        )
                    }
                }
            }
        }
    }
}
