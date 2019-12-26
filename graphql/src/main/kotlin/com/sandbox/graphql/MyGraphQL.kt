package com.sandbox.graphql

import com.expediagroup.graphql.spring.operations.Query
import com.sandbox.domain.service.UserService
import com.sandbox.graphql.dto.UserDataDTO
import org.springframework.stereotype.Component

@Component
class MyGraphQL(val userService: UserService) : Query {
    fun firstQuery() = UserDataDTO.fromDomain(
        userService.getUser()
    )
}