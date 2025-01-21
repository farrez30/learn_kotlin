package com.company2.oop.app

import com.company2.oop.data.ExecutiveCustomer
import com.company2.oop.data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Ayam")
    println(premiumCustomer.name);

    val executiveCustomer = ExecutiveCustomer("Bebek", 10000000);
    println(executiveCustomer.name);
    println(executiveCustomer.balance);
}