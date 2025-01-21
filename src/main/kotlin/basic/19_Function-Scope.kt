package basic

fun satu(): Unit {
    //error❌
    // sayHello();
}

fun dua(): Unit {
    //error❌
    // sayHello();
}

fun main() {
    fun sayHello(): Unit {
        println("Hello guys")
    }
    sayHello();
}