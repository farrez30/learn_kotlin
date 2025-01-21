package basic

// Normal Function
fun helloWorld(): Unit {
    println("Hello World")
    println("Brutha")
}

// Parameter
fun sayHello(firstName: String, lastName: String): Unit {
    println("Hello $firstName $lastName")
}

//Default Parameter
fun hello(firstName: String, lastName: String = ""): Unit {
    println("Halo $firstName $lastName")
}

// Named Argument
fun fullName(firstName: String, middleName: String, lastName: String): Unit {
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    // Normal Function
    helloWorld()
    // Parameter Function
    sayHello("Ayam", "Bebek")
    //Default Parameter
    hello("Ikan");
    hello("Ikan", "Bakar");
    // Named Argument
    fullName(firstName = "Madu", lastName = "Madura", middleName = "Khas")
}