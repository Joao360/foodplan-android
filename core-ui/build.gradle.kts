plugins {
    id("foodplan-android-library-compose")
}

dependencies {
    implementation(Dependencies.composeRuntime)

    androidTestImplementation(Dependencies.composeUiTestJunit)
    androidTestImplementation(Dependencies.composeUiTestManifest)
}