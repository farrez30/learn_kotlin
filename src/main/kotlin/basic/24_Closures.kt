package basic// Closures //
/*
    - Closure adalah kemampuan sebuah function, lambda atau anonymous function berinteraksi dengan data-data disekitarnya dalam scope yang sama.
    - Harap gunakan fitur closure ini dengan bijak saat kita membuat aplikasi.
*/

fun main() {
    var counter: Int = 0;

    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment");
        counter++;
    }

    val anonymousIncrement = fun(){
        println("Anonymous Increment Function");
        counter++;
    }

    fun functionIncrement(){
        println("Function Increment");
        counter++;
    }

    println(counter)

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    //
    println(counter);
    //
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}