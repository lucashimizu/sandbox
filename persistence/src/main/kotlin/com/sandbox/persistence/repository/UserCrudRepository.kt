package com.sandbox.persistence.repository

import com.sandbox.persistence.entity.Users
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface UserCrudRepository : CrudRepository<Users, UUID> {
    fun findAllByName(name: String) : List<Users>
}