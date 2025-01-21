package basic//// Factorial ////

// Tanpa Recursive
fun factorialLoop(value: Int): Int {
    var result = 1;
    for (i in value downTo 1){
        result *= i;
    }
    return result
}

// Dengan Recursive
fun factorialLooprecursive(value: Int): Int {
    return when (value){
        1 -> 1
        else -> value * factorialLooprecursive(value - 1)
    }
}

// Dengan Tail Recursive (IF)
tailrec fun display(value: Int) {
    println(value)
    if(value > 0){
        display(value - 1)
    }
}

// Dengan Tail Recursive (WHEN)
tailrec fun factorialTail(value: Int, total: Int = 1): Int {
    return when (value){
        1 -> total
        else -> factorialTail(value - 1, total * value)
    }
}

fun main() {
    println(factorialLoop(10))
    println(factorialLooprecursive(10))

    println("---------------------")

    display(10);
    println("++++++")
    println(factorialTail(10))
}