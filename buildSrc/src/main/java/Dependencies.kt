object Dependencies {
    // Compose
    const val composeUi = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
    const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val composeUiTestJunit = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"

    // Navigation
    const val navigation = "androidx.navigation:navigation-compose:${Versions.navigation}"

    // Android
    const val androidxCore = "androidx.core:core-ktx:${Versions.androidXCore}"
    const val androidXActivityCompose =
        "androidx.activity:activity-compose:${Versions.androidXActivity}"
    const val androidXLifecycleRuntimeKtx =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.androidXLifecycle}"
    const val androidXAppCompat = "androidx.appcompat:appcompat:${Versions.androidXAppCompat}"

    // Espresso
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val testExt = "androidx.test.ext:junit:${Versions.androidXTest}"

    // Hilt
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"

    // jUnit
    const val jUnit = "junit:junit:${Versions.junit}"

    // Google
    const val androidMaterial = "com.google.android.material:material:${Versions.googleMaterial}"

    // Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
}