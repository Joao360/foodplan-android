object Versions {
    const val compose = "1.0.1"
    const val androidXCore = "1.7.0"
    const val androidXActivity = "1.3.1"
    const val junit = "4.13.2"
    const val androidXLifecycle = "2.3.1"
    const val androidXTest = "1.1.3"
    const val espresso = "3.4.0"
    const val androidXAppCompat = "1.4.1"
    const val googleMaterial = "1.5.0"
}

object Libs {
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

    // Espresso
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val testExt = "androidx.test.ext:junit:${Versions.androidXTest}"

    // jUnit
    const val jUnit = "junit:junit:${Versions.junit}"

    // Google
    const val androidMaterial = "com.google.android.material:material:${Versions.googleMaterial}"
}