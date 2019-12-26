package com.sandbox.graphql

import com.expediagroup.graphql.spring.operations.Query
import com.sandbox.domain.UserData
import com.sandbox.graphql.dto.UserDataDTO
import org.springframework.stereotype.Component

@Component
class MyGraphQL : Query {
    fun firstQuery() = UserDataDTO.fromDomain(
        UserData(
            name = "Lucas",
            password = "123"
        )
    )
}