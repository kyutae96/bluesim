plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

afterEvaluate {
    publishing {
        publications {
            // Creates a Maven publication called "release".
            create<MavenPublication>("release") {
                // Applies the component for the release build variant.
                from(components.findByName("release"))

                // Customize attributes of the publication.
                groupId = "com.github.kyutae96"
                artifactId = "blusim" // 예: TestLibrary
                version = "1.0.0" // 예: 1.0.0
            }
            // Creates a Maven publication called "debug".
            create<MavenPublication>("debug") {
                // Applies the component for the debug build variant.
                from(components.findByName("debug"))

                // Customize attributes of the publication.
                groupId = "com.github.kyutae96" // 예: mmol93
                artifactId = "blusim" // 예: TestLibrary
                version = "1.0.0" // 예: 1.0.0
            }
        }
    }
}

android {
    namespace = "com.kyutae.bluesim"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

}
