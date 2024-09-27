plugins {
    kotlin("jvm") version "2.0.20"
}

group = "org.objpascalcommunity"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.eclipse.lsp4j:org.eclipse.lsp4j:0.23.1")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}