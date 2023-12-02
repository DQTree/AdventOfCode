/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.6/samples
 * This project uses @Incubating APIs which are subject to change.
 */
plugins {
    id("org.jetbrains.kotlin.jvm") version "1.7.10"

    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:31.1-jre")
    implementation("com.github.nmorel.gwtjackson:gwt-jackson-guava:0.15.4")
}