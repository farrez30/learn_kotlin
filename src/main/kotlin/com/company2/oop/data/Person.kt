package com.company2.oop.data

class Person {
    // Tanpa Constructor
    var firstName: String = "";
    var middleName: String? = null;
    var lastName: String = "";

    // Function
    fun sayHello(name: String){
        // Pakai "this" untuk mengakses properties class saat ini, yang mungkin terhalang sama param function di dalam ini.
        // Tanpa "this." maka akan memanggil dari parameter function nya.
        println("Hello $name, my name is ${this.firstName}")
    };

    // Function Overloading:
    // Membuat function yang sama dalam Class itu boleh, asalkan parameter nya berbeda (jenis param atau jumlah param), bukan yang lain.
    fun sayHello(name: Int){
        println("Hello $name, my name is ${this.firstName}")
    };

    fun sayHello(firstName: String, lastName: String){
        // Menggunakan "this." untuk memanggil properties dari Class saat ini, bukan dari parameter function.
        // Tanpa "this." maka akan memanggil dari parameter function nya.
        println("Hello $firstName $lastName, my name is ${this.firstName}")
    };

    fun run(){
        println("I'm Run");
    };

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }
}