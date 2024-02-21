package com.myAPI.myAPI

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity(name = "accounts")
data class Account(
    @Id @GeneratedValue
    var id: Long? = null,
    var name: String,
    val document: String,
    val phone: String
)