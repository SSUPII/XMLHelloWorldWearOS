plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.xmlhelloworldwearos"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.xmlhelloworldwearos"
        // Android Wear 1.4
        minSdk = 23
        // WearOS 5.1
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.play.services.wearable)
    implementation(libs.wear.tooling.preview)
    implementation(libs.core.splashscreen)
    implementation(libs.appcompat)
    implementation(libs.wear)
    implementation(libs.core.ktx)
}