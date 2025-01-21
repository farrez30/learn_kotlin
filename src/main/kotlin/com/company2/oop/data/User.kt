package com.company2.oop.data

// Properties di Constructor langsung
// Cuma bisa di primary constructor, tidak bisa di secondary constructor.
class User(var username: String, var password: String) {
    override fun toString(): String {
        return "User with username=$username"
    }
}