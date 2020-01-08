package com.sandbox.domain.data

import java.util.UUID

data class UserData (
    val id: UUID?,
    val name: String,
    val password: String,
    val email: String
)