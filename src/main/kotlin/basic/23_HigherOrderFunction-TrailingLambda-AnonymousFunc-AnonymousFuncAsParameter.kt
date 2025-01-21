package basic//// Still Lambda ////

// Higher Order Function
fun hello(value: String, pengubah: (String)->String): String {
    return "Hello ${pengubah(value)}"
}

fun main() {
    // Higher Order Function
    val pengubahAtas = {value: String -> value.uppercase()};
    println(hello("bebek", pengubahAtas));
    println(hello("ikan", ({ value: String -> value.uppercase()})));

    println("----------------");

    // Trailing Lambda
    val result = hello("kucing"){value: String -> value.uppercase()};
    println(result);
    println(hello("cacing"){ value: String -> value.uppercase()});

    println("++++++++++++++++")
    // Anonymous Function
    val anonymousUpper = fun(value: String): String {
        if(value.isBlank()){
            return "Ups"
        }
        return value.uppercase();
    }
    println(hello("gajah", anonymousUpper));

    // Anonymous Function As Parameter
    val result1 = hello("kambing", fun(value: String): String{
        if(value.isBlank()){
            return "Ups"
        }
        return value.uppercase();
    })
    println(result1);
}