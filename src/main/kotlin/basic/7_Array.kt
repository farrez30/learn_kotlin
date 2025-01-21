package basic

fun main(): Unit {
    // Array
    val members: Array<String> = arrayOf("Ayam", "Ikan", "Bebek")
    val values: Array<Int> = arrayOf(100, 95, 80)
    val balances: Array<Int> = arrayOf(10_000, 20_000, 30_000)
    println(members)

    // Operasi Array
    println("panjang array members: ${members.size}")
    println("panjang member ayam: ${members[0].length}")
    val ayam: String = members[0]
    val ikan: String = members.get(1)

    println("ayam: $ayam")
    println("ikan: $ikan")

    println("bebek: ${members.get(2)}")
    members.set(2, "Sayur")
    println("bebek: ${members.get(2)}")
}