plugins {
    id("foodplan-android-app")
}

android {
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }
}

dependencies {
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeMaterial)

    // Preview support
    implementation(Dependencies.composeUiToolingPreview)
    debugImplementation(Dependencies.composeUiTooling)
}