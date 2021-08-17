package com.jetbrains.handson.httpapi.models

import kotlinx.serialization.Serializable

val customerStorage = mutableListOf<Customer>()

@Serializable
data class Customer(
    var id: String,
    val firstName: String,
    val lastName: String,
    val email: String) {
}