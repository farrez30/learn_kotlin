package com.company2.oop.app

import com.company2.oop.data.Person

fun main() {
    val ayam = Person();
    ayam.firstName = "arie";

    val bebek = Person();
    bebek.firstName = "kaleo";

    val ikan = Person();
    ikan.firstName = "bakar";

    println(ayam)
    println(bebek)
    println(ikan)

    println(ayam.firstName)
    println(bebek.firstName)
    println(ikan.firstName)
    println(ikan.middleName)
    println(ikan.lastName)
}