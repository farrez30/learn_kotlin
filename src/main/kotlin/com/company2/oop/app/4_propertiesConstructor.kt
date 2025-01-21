package com.company2.oop.app

import com.company2.oop.data.User

fun main() {
    val user1 = User("Dodi", "rahasia")
    val user2 = User("Mulyadi", "rahasia123")

    println(user1.username)
    println(user1.password)
    println("------")
    println(user2.username)
    println(user2.password)
}