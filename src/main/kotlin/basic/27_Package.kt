package basic

// Hanya import salah satu function di folder util dalam com.company.belajar

import basic.com.company.belajar.util.sayHello

// Import semuanya dari folder util dalam com.company.belajar
import basic.com.company.belajar.util.*

fun main() {
    // Hasil Import - cara 1
    sayHello("Ayam")

    // Hasil Import - cara 2
    sayHello("Ikan")

    // Import dari semuanya
    sayHello("Bebek")
    sayGoodBye("Sayur")
}