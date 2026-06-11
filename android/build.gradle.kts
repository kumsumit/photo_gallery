import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("com.android.library")
}

group = "com.morbit.photogallery"
version = "1.0-SNAPSHOT"

repositories {
    google()
    mavenCentral()
}

android {
    namespace = "com.morbit.photogallery"
    compileSdk = 37

    defaultConfig {
        minSdk = 24
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    sourceSets {
        getByName("main") {
            java.srcDir("src/main/kotlin")
        }
    }

    lint {
        disable += "InvalidPackage"
    }
}

kotlin {
    compilerOptions {
        // Keep the Kotlin JVM target aligned with the Java compile options
        // above; otherwise AGP fails with an inconsistent JVM-target error.
        jvmTarget.set(JvmTarget.JVM_21)
    }
}

dependencies {
}
