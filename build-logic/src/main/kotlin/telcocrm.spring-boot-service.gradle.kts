plugins {
    id("telcocrm.java-conventions")
    id("org.springframework.boot")
}

dependencies {
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
