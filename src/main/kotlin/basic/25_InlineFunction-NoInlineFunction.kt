package basic

//  Inline Function
inline fun hello(name: ()->String): String{
    return "Hello ${name()}"
};

// No Inline Function
inline fun hello2(firstName: ()->String,
                  noinline lastName: ()->String): String{
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    // Inline Function
    println(hello { "ayam" });
    println(hello { "bebek" });

    // No Inline Function
    println(hello2({"ikan"}, {"bakar"}))
}