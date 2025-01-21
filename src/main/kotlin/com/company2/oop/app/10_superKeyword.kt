package com.company2.oop.app

import com.company2.oop.data.Rectangle

fun main() {
    val rectangle =  Rectangle()
    println("Corner ${rectangle.corner}");
    println("Parent Corner ${rectangle.parentCorner}")

    rectangle.printName()
}