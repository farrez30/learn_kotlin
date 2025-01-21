package basic

fun main() {
    // number
    val age: Byte = 30
    val height: Int = 170
    val distance: Short = 2000
    val balance: Long = 100000000L
    println(age);
    println(height);
    println(distance);
    println(balance);

    // floating point number
    val value: Float = 98.98F
    val radius: Double = 23432423432.54345
    println("value: $value")
    println("radius: $radius")

    // literals
    val decimalLiteral: Int = 100
    val hexadecimalLiteral: Int = 0xFF
    val binaryLiteral: Int = 0b0001
    println("decimal literal: $decimalLiteral")
    println("hexa literal: $hexadecimalLiteral")
    println("binary literal: $binaryLiteral")

    // underscore in number
    val age2: Byte = 3_0
    val height2: Int = 1_7_0
    val distance2: Short = 2_000
    val balance2: Long = 100_000_000L
    println("age2: " + age2);
    println("height2: " + height2);
    println("distance2: " + distance2);
    println("balance2: " + balance2);

    // conversion
    val number: Int = 100;
    // vvv
    val toByte: Byte = number.toByte()
    val toShort: Short = number.toShort()
    val toInt: Int = number.toInt()
    val toLong: Long = number.toLong()
    val toFloat: Float = number.toFloat()

    println("toByte: $toByte");
    println("toShort: $toShort");
    println("toInt: $toInt");
    println("toLong: $toLong");
    println("toFloat: $toFloat");
}