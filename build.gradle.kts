plugins {
    kotlin("js") version "1.4-M3"
}
group = "me.user"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://dl.bintray.com/kotlin/kotlin-eap")
    }
}
dependencies {
    implementation(kotlin("stdlib-js"))
    testImplementation(kotlin("test-js"))
    testImplementation(devNpm("istanbul-instrumenter-loader", "3.0.1"))
    testImplementation(devNpm("karma-coverage-istanbul-reporter", "3.0.3"))
}
kotlin {
    js {
        browser {
            binaries.executable()
        }
    }
}