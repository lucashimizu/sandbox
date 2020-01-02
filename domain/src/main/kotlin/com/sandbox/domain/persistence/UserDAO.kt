package com.sandbox.domain.persistence

import com.sandbox.domain.data.UserData
import java.util.UUID

interface UserDAO {
    fun save(userData: UserData) : UUID
    fun findAll() : List<UserData>
    fun findById(id: UUID) : UserData?
    fun findByName(name: String) : List<UserData>
}