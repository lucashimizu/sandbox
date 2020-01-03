package com.sandbox.graphql

import com.sandbox.domain.service.UserService
import com.sandbox.graphql.dto.UserDataDTO
import org.slf4j.Logger
import org.springframework.stereotype.Service
import org.slf4j.LoggerFactory

@Service
class UserQuery(private val userService: UserService) {
    companion object {
        val log: Logger = LoggerFactory.getLogger(UserQuery::class.java)
    }

    fun user() : List<UserDataDTO> {
        log.info("Getting user")
        return UserDataDTO.fromDomain(userService.searchUsersByName("Lucas"))
    }

    fun metadata() : String {
        log.info("Getting metadata")
        return "Metadata"
    }
}