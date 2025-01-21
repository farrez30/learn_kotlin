package basic

// Single Expression
fun double(a: Int): Int = a * 2;
fun hi(name: String): Unit = println("Hi $name");

// Varargs parameter
//// Tanpa Varargs
fun hitungTotal(values: Array<Int>): Int {
    var total = 0;

    for (value in values){
        total += value;
    }
    return total;
}
//// Dengan varargs
fun hitungTotal2(name: String, vararg values: Int): Int {
    var total = 0;
    for (value in values){
        total += value
    }
    return total;
}

// Extension Function
fun String.hello(): String {
    return "Hello $this"
}

// Infix Notation
/*
Harus sebagai function member (akan dibahas di OOP) atau function extension
Harus memiliki 1 parameter
Parameter tidak boleh varargs dan tidak boleh memiliki nilai default
*/
infix fun String.to(type:String): String {
    if(type == "UP"){
        return this.uppercase();
    } else {
        return this.lowercase();
    }
}



fun main() {
    // Single Expression
    println("Double: ${double(4)}");
    hi("Ikan");

    // Varargs parameter
    //// Tanpa Varargs
    val values = arrayOf(10,10,10,10)
    val result = hitungTotal(values)
    println(result)
    //// Dengan Varargs
    val result2 = hitungTotal2("Bintang",10,10,10,10,10,10,10)
    println(result2)

    // Extension Function
    val name: String = "Belalang";
    val hello: String = name.hello()
    println(hello);

    // Infix Notation
    val result3: String = "Hiu" to "UP"
    println(result3)

    //⚠️⚠️⚠️last ppt: 139 (function scope)
}