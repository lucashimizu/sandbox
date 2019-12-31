package com.sandbox.graphql

import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class MyGraphQL(val userQuery: UserQuery) : Query {
    fun firstQuery() = userQuery
}