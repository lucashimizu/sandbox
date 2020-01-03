package com.sandbox.graphql

import com.sandbox.domain.service.UserService
import com.sandbox.graphql.dto.UserDataDTO
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserMutation(private val userService: UserService) {
    fun addUser(userDataDTO: UserDataDTO) : String {
        return userService.saveUser(
            name = userDataDTO.name,
            email = userDataDTO.email?: "",
            pass = userDataDTO.pass
        ).toString()
    }
}