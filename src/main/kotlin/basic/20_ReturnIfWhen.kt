package basic

// Return If
fun sayHello(name: String=""): String {
    return if(name ==""){
        "Hello Bro"
    } else {
        "Hello $name"
    }
}

// Return When
fun sayHello2(name:String=""): String {
    return when(name){
        "" -> "Hello Bro 2"
        else -> "Hello $name"
    }
}

fun main() {
    println(sayHello());
    println(sayHello("Ikan"))

    println(sayHello2());
    println(sayHello2("Bebek"));
}