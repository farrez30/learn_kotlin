package com.company2.oop.app

import com.company2.oop.data.Person

// Function Overloading:
// Membuat function yang sama dalam Class itu boleh, asalkan parameter nya berbeda (jenis param atau jumlah param), bukan yang lain.

fun main() {
    val bebek = Person();
    bebek.firstName = "Bebek";

    bebek.sayHello("Bakar");
    bebek.sayHello("Bebek", "Betawi");
}