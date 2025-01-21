package com.company2.oop.app

import com.company2.oop.data.Person

fun main() {
    val ayam = Person();
    ayam.firstName = "Ayam";
    ayam.middleName = "bakar";
    ayam.lastName = "jakarta";

    ayam.sayHello("Ikan");
    ayam.run();

    val fullName = ayam.getFullName();
    println(fullName);
}