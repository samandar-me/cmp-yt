import org.jetbrains.compose.desktop.application.dsl.TargetFormat
plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}
kotlin {
    jvm {
        jvmToolchain(11)
        withJava()
    }
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":shared"))
                implementation(compose.desktop.common)
                implementation(compose.desktop.currentOs)
            }
        }
    }
}
compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "mycmp"
            packageName = "1.0.0"
        }
    }
}