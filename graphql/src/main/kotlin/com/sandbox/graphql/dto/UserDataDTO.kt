package com.sandbox.graphql.dto

import com.sandbox.domain.UserData

class UserDataDTO(val name: String, val email: String?, val pass: String) {
    companion object {
        fun fromDomain(userData: UserData) = UserDataDTO(
            name = userData.name,
            email = null,
            pass = userData.password
        )
    }
}