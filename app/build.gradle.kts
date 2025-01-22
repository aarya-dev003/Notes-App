plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("androidx.navigation.safeargs.kotlin")
    kotlin("kapt")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
    id("kotlinx-serialization")
}
android {
    compileSdk = 34

    // Add the namespace property here
    namespace = "com.example.notes_app" // Replace this with your desired namespace

    defaultConfig {
        applicationId = "com.example.notes_app"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
        viewBinding = true
    }
}

dependencies {
//    implementation(project(":app"))
    implementation(kotlin("reflect"))
    implementation("androidx.core:core-ktx:1.6.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")

// Navigation Components

    implementation("androidx.navigation:navigation-fragment-ktx:2.3.5")
    implementation("androidx.navigation:navigation-ui-ktx:2.3.5")

// Architecture
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")

// Room
    implementation("androidx.room:room-runtime:2.3.0")
    ksp("androidx.room:room-compiler:2.3.0")
    implementation("androidx.room:room-ktx:2.3.0")

// Dagger - Hilt
    implementation("androidx.hilt:hilt-work:1.0.0")
    implementation("com.google.dagger:hilt-android:2.37")
    ksp("com.google.dagger:hilt-android-compiler:2.37")
    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
    ksp("androidx.hilt:hilt-compiler:1.0.0")
    implementation("androidx.hilt:hilt-navigation-fragment:1.2.0")

// Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.retrofit2:converter-scalars:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2")
    implementation("com.squareup.okhttp3:okhttp-urlconnection:4.9.0")

// Pagination
    implementation("androidx.paging:paging-runtime-ktx:3.1.0-alpha03")

// Data Store
    implementation("androidx.datastore:datastore-preferences:1.0.0-rc02")


    //swipe refresh layout
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
}

kapt {
    correctErrorTypes = true
}