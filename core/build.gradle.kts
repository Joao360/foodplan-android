plugins {
    id("foodplan-android-library")
    id("de.mannodermaus.android-junit5")
}

dependencies {
    testImplementation(Dependencies.jUnitApi)
    testRuntimeOnly(Dependencies.jUnitEngine)
}