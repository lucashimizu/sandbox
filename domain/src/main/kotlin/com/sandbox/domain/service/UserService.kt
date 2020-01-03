package com.sandbox.domain.service

import com.sandbox.domain.data.UserData
import java.util.UUID

interface UserService {
    fun saveUser(name: String, email: String, pass: String): UUID
    fun getUserById(id: UUID): UserData?
    fun searchUsersByName(name: String): List<UserData>
}