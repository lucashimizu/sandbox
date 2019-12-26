dependencies {
    compile(kotlin("stdlib-jdk8"))

    compile("org.springframework.boot:spring-boot-starter-web:2.2.0.RELEASE")
    {
        exclude("spring-boot-starter-tomcat")
    }
    compile("org.springframework.boot:spring-boot-starter-jetty:2.2.0.RELEASE")

//    compile(project(":domain"))

    testCompile("junit:junit:4.+")
    testCompile("org.mockito:mockito-core:2.8.47")
    testCompile("com.nhaarman:mockito-kotlin:1.5.0")
}