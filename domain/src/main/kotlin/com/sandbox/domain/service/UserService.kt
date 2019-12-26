package com.sandbox.domain.service

import com.sandbox.domain.data.UserData

interface UserService {
    fun getUser(): UserData
}