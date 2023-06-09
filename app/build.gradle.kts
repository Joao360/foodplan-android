plugins {
    id("foodplan-android-app-compose")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
    id("de.mannodermaus.android-junit5")
}

android {

    defaultConfig {
        applicationId = "com.joaograca.foodplan"
        versionCode = ProjectConfig.versionCode
        versionName = ProjectConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    packagingOptions {
        resources.excludes.add("/META-INF/{AL2.0,LGPL2.1}")
    }
}

dependencies {

    implementation(Dependencies.androidXActivityCompose)
    implementation(Dependencies.androidxCore)
    implementation(Dependencies.androidXLifecycleRuntimeKtx)
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeMaterial)
    implementation(Dependencies.navigation)
    implementation(Dependencies.timber)

    // Compose preview
    implementation(Dependencies.composeUiToolingPreview)
    debugImplementation(Dependencies.composeUiTooling)

    // Dagger Hilt
    implementation(Dependencies.hilt)
    kapt(Dependencies.hiltCompiler)

    implementation(project(Modules.recipes))

    testImplementation(Dependencies.jUnitApi)
    testRuntimeOnly(Dependencies.jUnitEngine)

    androidTestImplementation(Dependencies.testExt)
    androidTestImplementation(Dependencies.espressoCore)
    androidTestImplementation(Dependencies.composeUiTestJunit)
}

kapt {
    correctErrorTypes = true
}