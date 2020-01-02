package com.sandbox.persistence.entity

import com.sandbox.domain.data.UserData
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Users(
    @Id
    val id: UUID = UUID.randomUUID(),

    @Column(nullable = false)
    var name: String = ""
) {
    fun toUserData() = UserData(id = this.id, name = this.name, password = "")
}