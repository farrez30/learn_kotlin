package basic

fun main(): Unit {
    val a: Int = 100;
    val b: Int = 200;

    val result: Boolean = a > b;
    println("a: $a, b: $b")
    println("a > b : $result")
    println("a < b : ${a < b}")
    println("a == b : ${a == b}")
    println("a != b : ${a != b}")

    println("a" < "b")
    println("a" == "b")
    println("a" != "b")
}