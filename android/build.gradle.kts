
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
            java.directories.add("src/main/kotlin")
        }
    }

    lint {
        disable += "InvalidPackage"
    }
}

dependencies {
}