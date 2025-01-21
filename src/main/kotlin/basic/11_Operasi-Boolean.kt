package basic

fun main(): Unit {
    val nilaiUjian: Int = 80;
    val nilaiAbsen: Int = 80;
    val nilaiExtra: Int = 70;

    val lulusUjian = nilaiUjian > 75;
    val lulusAbsen = nilaiAbsen > 75;
    val lulusExtra = nilaiExtra > 75;

    val apakahLulus = lulusUjian && lulusAbsen || lulusExtra;
    val apakahLulus2 = (lulusUjian && lulusAbsen) && lulusExtra;

    println("apakah lulus: $apakahLulus")
    println("apakah lulus2: $apakahLulus2")
}