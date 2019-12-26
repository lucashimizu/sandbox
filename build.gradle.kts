plugins {
    // Makes Kotlin to target the JVM
    // id("org.jetbrains.kotlin.jvm") version "1.3.50" apply false
    kotlin("jvm") version "1.3.50" apply false

    // Makes classes with certain Spring annotations to be open without the need for the open keyword
    // id("org.jetbrains.kotlin.plugin.spring") version "1.3.50" apply false
    kotlin("plugin.spring") version "1.3.50" apply false

    // Replacing the jar task with bootJar, which bundles all classpath dependencies into the jar
    id("org.springframework.boot") version "2.2.0.RELEASE" apply false
}

buildscript {
    dependencies {
        // Kotlin Standard Library with support for some of the JDK8 features
        classpath(kotlin("stdlib-jdk8", "1.3.61"))
        classpath(kotlin("reflect", "1.3.61"))
    }
}

subprojects {
    group = "com.sandbox"
    version = "1.0-SNAPSHOT"

    apply {
        plugin("org.jetbrains.kotlin.jvm")
        plugin("org.jetbrains.kotlin.plugin.spring")
    }

    repositories {
        mavenCentral()
    }
}