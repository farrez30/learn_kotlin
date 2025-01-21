package com.company2.oop.app

import com.company2.oop.data.Employee
import com.company2.oop.data.Manager
import com.company2.oop.data.SuperManager
import com.company2.oop.data.VicePresident

fun main() {
    // Mengakses inheritance/behaviour parent
    val manager = Manager("Ikan");
    manager.sayHello("Bebek");

    val karyawan = Employee("Choki");
    karyawan.sayHello("Oreo")

    val vicePresident = VicePresident("Fish");
    vicePresident.sayHello("Trump")
    vicePresident.sayGoodbye("cs")

    val superManager = SuperManager("Obama");
    superManager.sayHello("Frog");

}