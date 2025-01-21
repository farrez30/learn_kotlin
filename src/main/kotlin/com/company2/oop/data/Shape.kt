package com.company2.oop.data

open class Shape {
    open val corner: Int = -1;
    open fun printName(){
        println("This is Shape")
    }
};

class Rectangle: Shape() {
    override val corner: Int = 4;
    val parentCorner:Int = super.corner
    override fun printName() {
        println("This is rectangle")
        super.printName()
    }
}

class Triangle: Shape(){
    override val corner: Int = 3;
}