package com.sandbox.graphql

import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class MyGraphQL : Query {

    fun firstQuery() = UserData(name = "Lucas", email = "lucas@email.com", pass = "123")
}

data class UserData(val name: String, val email: String, val pass: String)