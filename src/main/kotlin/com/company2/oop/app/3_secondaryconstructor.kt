package com.company2.oop.app

import com.company2.oop.data.Address

fun main() {
 val address1 = Address("Jalan A", "Jakarta");
 val address2 = Address("Jalan B", "Jakarta", "Malaysia");

    println(address1.street)
    println(address1.country)
    println(address2.street)
    println(address2.country)
}