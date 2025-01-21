package basic

fun main() {

    val finalExam = 'A';

    // When Expression
    println("Expression default:")
    when (finalExam){
        'A' -> println("Amazing");
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try again next year")
        else -> println("Ups")
    }

    // When Expression Multiple Option
    println("Expression Multiple Option:")
    when (finalExam){
        'A','B','C' -> println("PASS");
        else -> {
            println("Not Pass")
        }
    }

    // When expression In (di dalam../tidak di dalam..)
    println("Expression IN:")
    val passValues: Array<Char> = arrayOf('A', 'B', 'C');
    when (finalExam){
        in passValues -> println("PASS");
        !in passValues -> println("Try Again")
    }

    // When expression Is (apakah berjenis../tidak berjenis..)
    println("Expression IS:")
    val name: String = "Ayam"
    when(name){
        is String -> println("This is string");
        !is String -> println("This is not string")
    }

    // When sebagai pengganti If/Else (tanpa variable)
    println("Expression tanpa variable:")
    val examValue = 90;
    when {
        examValue > 80 -> println("Good Job");
        examValue > 60 -> println("Not Bad");
        else -> println("Try again next month")
    }
}