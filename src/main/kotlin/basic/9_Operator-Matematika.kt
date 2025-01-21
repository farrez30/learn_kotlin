package basic

fun main(): Unit {
    val result1: Int = 10 / 3
    println(result1)

    val result2: Int = 10 + 10 / 2;
    println(result2)

    //////////////////////////////
    var total: Int = 0;
    println("total 1st: $total")

    val barang1: Int = 100;
    total += barang1;

    val barang2: Int = 200;
    total += barang2;

    val barang3: Int = 300;
    total += barang3;

    println("total 2nd: $total")

    total++
    total++
    total--
    println("total 3rd: $total")

    val suhu: Int = -5
    println("suhu: $suhu");

    val sehat: Boolean = true;
    println("sehat?: ${!sehat}")
}