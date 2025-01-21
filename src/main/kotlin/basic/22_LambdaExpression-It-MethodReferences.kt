package basic//// Lambda ////

// Method References
fun contohToUpper(value: String): String = value.uppercase();

fun main() {
    // Lambda Expression
    val contohLambdaName: (String) -> String = { value: String ->
        value.uppercase();
    }

    println("Lambda Expression: ${contohLambdaName("ikan mini")}");

    // It
    val contohLambdaIt: (String) -> String = {
        it.uppercase();
    }

    println("Lambda It: ${contohLambdaIt("ayam mini")}");

    // Method References
    val contohLambdaMethodReferences: (String) -> String = ::contohToUpper
    println("Method References: ${contohLambdaMethodReferences("bebek mini")}")
}