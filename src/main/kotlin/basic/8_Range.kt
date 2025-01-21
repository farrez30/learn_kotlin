package basic

fun main(): Unit {
    // Range
    val range = 1..1000 // 1..1000

    // Range terbalik
    val range2 = 1000 downTo 1 // 1000 downTo 1

    // Range dengan Step
    val range3 = 1..1000 step 2 // 1..1000 step 2
    val range4 = 1000 downTo 1 step 2 // 1000 downTo 1 step 2

    println("range count: ${range.count()}")
    println("range contains 500: ${range.contains(500)}")
    println("range contains 2000: ${range.contains(2000)}")
    println("range first: ${range.first}")
    println("range last: ${range.last}")
    println("range step: ${range.step}")

    println("")
    println("range2 count: ${range2.count()}")
    println("range2 contains 500: ${range2.contains(500)}")
    println("range2 contains 2000: ${range2.contains(2000)}")
    println("range2 first: ${range2.first}")
    println("range2 last: ${range2.last}")
    println("range2 step: ${range2.step}")

    println("")
    println("range3 count: ${range3.count()}")
    println("range3 contains 500: ${range3.contains(500)}")
    println("range3 contains 2000: ${range3.contains(2000)}")
    println("range3 first: ${range3.first}")
    println("range3 last: ${range3.last}")
    println("range3 step: ${range3.step}")

    println("")
    println("range4 count: ${range4.count()}")
    println("range4 contains 500: ${range4.contains(500)}")
    println("range4 contains 2000: ${range4.contains(2000)}")
    println("range4 first: ${range4.first}")
    println("range4 last: ${range4.last}")
    println("range4 step: ${range4.step}")
}