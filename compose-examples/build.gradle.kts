import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    id("org.jetbrains.compose")
}

group = "com.goto.chicago"
version = "1.0-SNAPSHOT"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
    jvm {
        jvmToolchain(11)
        withJava()
    }
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(compose.desktop.currentOs)
                implementation("io.ktor:ktor-client-core:${extra["ktor.version"]}")
                implementation("io.ktor:ktor-client-cio:${extra["ktor.version"]}")
                implementation("io.ktor:ktor-client-websockets:${extra["ktor.version"]}")
                implementation("io.ktor:ktor-client-content-negotiation:${extra["ktor.version"]}")
                implementation("io.ktor:ktor-serialization-kotlinx-json:${extra["ktor.version"]}")
                implementation("org.jetbrains.kotlinx:kotlinx-datetime:${extra["kotlinx_datetime_version"]}")
                implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable:${extra["kotlinx_immutable_collections_version"]}")
            }
        }
        val jvmTest by getting
    }
    jvmToolchain(11)
}

compose.desktop {
    application {
        mainClass = "goto.chicago.first.MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "goto-chicago-examples"
            packageVersion = "1.0.0"
        }
    }
}