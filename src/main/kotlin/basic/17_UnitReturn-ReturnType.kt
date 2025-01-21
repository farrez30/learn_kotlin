package basic

// Unit return type
fun printHello(name: String): Unit {
    if (name == null){
        println("Hello bro")
    } else {
        println("Hello $name")
    }
}

// Function Return Type
fun sum(a: Int, b: Int): Int {
    val total = a + b;
    return total;
}

fun main() {
    printHello("Ayam")

    val result = sum(3,6);
    println("result: $result")
}