import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "com.iamincendium"
version = "0.0.1-SNAPSHOT"

val javaVersion = JavaVersion.VERSION_1_8

buildscript {
    val kotlinVersion by extra {"1.2.40"}

    repositories {
        jcenter()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

repositories {
    jcenter()
}

plugins {
    kotlin("jvm") version "1.2.40"
    kotlin("plugin.allopen") version "1.2.40"
    kotlin("plugin.spring") version "1.2.40"
    java

    id("org.springframework.boot") version "2.0.1.RELEASE"
    id("io.spring.dependency-management") version "1.0.4.RELEASE"
}

java {
    sourceCompatibility = javaVersion
    targetCompatibility = javaVersion
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = javaVersion.toString()
        }
    }
}

dependencies {
    compile("org.springframework.boot:spring-boot-starter-thymeleaf")
    compile("org.springframework.boot:spring-boot-starter-web")
    compile("com.fasterxml.jackson.module:jackson-module-kotlin")
    compile("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    compile("org.jetbrains.kotlin:kotlin-reflect")
    testCompile("org.springframework.boot:spring-boot-starter-test")
}
