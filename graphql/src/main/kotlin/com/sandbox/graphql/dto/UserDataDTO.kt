package com.sandbox.graphql.dto

import com.sandbox.domain.data.UserData

class UserDataDTO(val id: String?, val name: String, val email: String?, val pass: String) {
    companion object {
        fun fromDomain(userData: UserData) = UserDataDTO(
            id = userData.id?.toString(),
            name = userData.name,
            email = null,
            pass = userData.password
        )

        fun fromDomain(userDataList: List<UserData>) = userDataList.map { fromDomain(it) }
    }
}