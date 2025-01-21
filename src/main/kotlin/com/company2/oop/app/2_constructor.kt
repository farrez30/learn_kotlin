package com.company2.oop.app

import com.company2.oop.data.Car

fun main() {
    val avanza = Car("Toyota");
    val almaz = Car("Wuling", "Almaz");

    println(avanza.brand);
    println(avanza.year);
    println("----------------")
    println(almaz.brand);
    println(almaz.year);
    almaz.year = 2001
    println(almaz.year);
}