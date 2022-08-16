object Dependencies {
    // Compose
    const val composeUi = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
    const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val composeUiTestJunit = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"

    // Android
    const val androidxCore = "androidx.core:core-ktx:${Versions.androidXCore}"
    const val androidXActivityCompose = "androidx.activity:activity-compose:${Versions.androidXActivity}"
    const val androidXLifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.androidXLifecycle}"
    const val androidXAppCompat = "androidx.appcompat:appcompat:${Versions.androidXAppCompat}"

    // Build
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    // Espresso
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val testExt = "androidx.test.ext:junit:${Versions.androidXTest}"

    // jUnit
    const val jUnit = "junit:junit:${Versions.junit}"

    // Google
    const val androidMaterial = "com.google.android.material:material:${Versions.googleMaterial}"

    // Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
}