package com.company2.oop.data

// Membuat inheritance menggunakan "open" di depan class.
// Jika tidak ada "open", maka tidak bisa menjadi parent.
open class Employee(val name: String) {
    open fun sayHello(name: String): Unit {
        println("Hello $name, my name is ${this.name}")
    };
}

open class Manager(name: String) : Employee(name) {
    fun sayGoodbye(name: String) {
        println("Goodbye $name to ${this.name}");
    }

    // Tidak bisa menulis ulang/override function dari parent,
    // 1.)--> jika function di parent tidak ditulis "open" didepan function Parent nya,
    // 2.)--> dan "override" didepan function Child nya.
    // 3.)--> 📝Agar isi function bisa berbeda.
    // Jadi tidak hanya class, tapi function juga perlu "open" jika function di Parent ingin ditulis ulang di Child nya.
    override fun sayHello(name: String) {
        println("Hello $name, my name is Manager 🙏🏻 ${this.name}");
    }

    //⚠️->Jika ada "final" didepan override, maka semua child yang memanggil dari parent yang memiliki function hasil override diatas tidak bisa diakses. Karena by default function hasil override jadi bersifat "open".
//    final override fun sayHello(name: String){
//        println("Hello $name, my name is Manager 🙏🏻 ${this.name}");
//    }
};

class SuperManager(name: String) : Manager(name) {
    override fun sayHello(name: String) {
        println("Hello $name, my name is Super Manager 👑🙏🏻 ${this.name}")
    }
}

class VicePresident(name: String) : Manager(name) {
    override fun sayHello(name: String) {
        println("Hello $name, my name is Vice President 💰 ${this.name}");
    }

};