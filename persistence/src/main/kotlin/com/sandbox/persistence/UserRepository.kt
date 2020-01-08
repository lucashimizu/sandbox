package com.sandbox.persistence

import com.sandbox.domain.data.UserData
import com.sandbox.domain.persistence.UserDAO
import com.sandbox.persistence.entity.Users
import com.sandbox.persistence.repository.UserCrudRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class UserRepository(private val crudRepository: UserCrudRepository) : UserDAO {
    override fun save(userData: UserData) =
        crudRepository.save(Users(name = userData.name, email = userData.email, pass = userData.password)).id

    override fun findAll() = crudRepository.findAll().map { it.toUserData() }

    override fun findById(id: UUID) = crudRepository.findByIdOrNull(id)?.toUserData()

    override fun findAllByName(name: String) = crudRepository.findByNameContaining(name).map { it.toUserData() }

    override fun findByName(name: String) = crudRepository.findAllByName(name).map { it.toUserData() }
}