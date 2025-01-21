package com.company2.oop.app

import com.company2.oop.data.SmartPhone

fun main() {
    val smartPhone = SmartPhone("Samsung S10", "Android");

    println(smartPhone.toString())
    println(smartPhone.hashCode())
}