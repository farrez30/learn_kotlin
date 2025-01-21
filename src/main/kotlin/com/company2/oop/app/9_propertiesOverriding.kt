package com.company2.oop.app

import com.company2.oop.data.Rectangle
import com.company2.oop.data.Shape
import com.company2.oop.data.Triangle

fun main() {
    val shape = Shape();
    println(shape.corner);

    val rectangle = Rectangle();
    println(rectangle.corner);

    val triangle = Triangle();
    println(triangle.corner);
}