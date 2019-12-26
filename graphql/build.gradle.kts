dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile("com.expediagroup:graphql-kotlin-spring-server:1.4.2")

//    compile(project(":domain"))

    testCompile("junit:junit:4.+")
    testCompile("org.mockito:mockito-core:2.8.47")
    testCompile("com.nhaarman:mockito-kotlin:1.5.0")
}