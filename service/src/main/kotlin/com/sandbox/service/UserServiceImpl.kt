package com.sandbox.service

import com.sandbox.domain.data.UserData
import com.sandbox.domain.persistence.UserDAO
import com.sandbox.domain.service.UserService
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(private val userDAO: UserDAO) : UserService {
    override fun saveUser(name: String, email: String, pass: String) = userDAO.save(UserData(null, name, pass))

    override fun searchUsersByName(name: String) = userDAO.findAllByName(name)

    override fun getUserById(id: UUID) = userDAO.findById(id)
}