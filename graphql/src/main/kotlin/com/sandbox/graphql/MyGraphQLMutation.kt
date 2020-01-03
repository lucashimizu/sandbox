package com.sandbox.graphql

import com.expediagroup.graphql.spring.operations.Mutation
import org.springframework.stereotype.Component

@Component
class MyGraphQLMutation(private val userMutation: UserMutation) : Mutation {
    fun userMutation() = userMutation
}