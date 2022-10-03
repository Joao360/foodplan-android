plugins {
    id("com.android.application")
    kotlin("android")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
}

android {
    compileSdk = ProjectConfig.compileSdk

    defaultConfig {
        applicationId = "com.joaograca.foodplan"
        minSdk = ProjectConfig.minSdk
        targetSdk = ProjectConfig.targetSdk
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }
    packagingOptions {
        resources.excludes.add("/META-INF/{AL2.0,LGPL2.1}")
    }
}

dependencies {

    implementation(Dependencies.androidxCore)
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeMaterial)
    implementation(Dependencies.composeUiToolingPreview)
    implementation(Dependencies.navigation)
    implementation(Dependencies.androidXLifecycleRuntimeKtx)
    implementation(Dependencies.androidXActivityCompose)

    implementation(Dependencies.hilt)
    kapt(Dependencies.hiltCompiler)

    implementation(project(Modules.recipes))

    testImplementation(Dependencies.jUnit)

    androidTestImplementation(Dependencies.testExt)
    androidTestImplementation(Dependencies.espressoCore)
    androidTestImplementation(Dependencies.composeUiTestJunit)

    debugImplementation(Dependencies.composeUiTooling)
}

kapt {
    correctErrorTypes = true
}