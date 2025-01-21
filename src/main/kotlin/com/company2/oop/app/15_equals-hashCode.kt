package com.company2.oop.app

import com.company2.oop.data.Company

fun main() {
    val company1 = Company("Ikan");
    val company2 = Company("Ikan");

    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company2)

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())
    

}