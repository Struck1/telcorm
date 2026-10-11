plugins {
    id("telcocrm.spring-boot-service")
}

dependencies {
    implementation(project(":core:core-domain"))

    implementation("org.springframework.boot:spring-boot-starter-webmvc")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    testImplementation(libs.archunit.junit5)
}
