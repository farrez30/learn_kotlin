package com.company2.oop.app

import com.company2.oop.data.HandPhone
import com.company2.oop.data.Laptop

// is dan !is untuk melakukan pengecekan tipe data
fun printObject(any: Any){
    if(any is Laptop){
        // Smart Casts
        println("Laptop with name ${any.name}")
    } else if (any is HandPhone){
        println("Handphone with name ${any.name}")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any){
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is HandPhone -> println("Laptop with name ${any.name}")
        else -> println(any)
    }
}

// Unsafe Casts (menggunakan 'as'), rawan error
fun printString(any: Any){
    val value = any as String
    println(value)
}

// Safe nullable Casts
fun printStringSafe(any: Any){
    val value: String? = any as? String
    println(value)
}


fun main() {
    printString("Kucing");
//    printString(1); //Error

    println("-----------------");

    printStringSafe("Kucing");
    printStringSafe(1);

    println("-----------------");

    printObject("Ayam");
    printObject(1)
    printObject(Laptop("Acer"))
    printObject(HandPhone("Asus"))

    println("-------------------")

    printObjectWithWhen("Bebek");
    printObjectWithWhen(1)
    printObjectWithWhen(Laptop("Xiaomi"))
    printObjectWithWhen(HandPhone("Huawei"))
}