package com.sandbox.service

import com.sandbox.domain.data.UserData
import com.sandbox.domain.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {
    override fun getUser() = UserData(
        name = "Lucas",
        password = "123"
    )
}