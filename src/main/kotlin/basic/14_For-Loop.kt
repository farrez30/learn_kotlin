package basic

fun main() {
    var array: Array<String> = arrayOf("Ayam", "Ikan", "Bebek", "Badak", "Elang", "Kumbang");

    // For Array
    var total = 0;
    for (name in array){
        println(name);
        total++;
    }

    println("Total Perulangan = $total");

    // For Range
    println("For Range 0-10:")
    for (value in 0..10){
        println(value)
    }

    println("For Range 50-0, step 5::")
    for (value in 50 downTo 0 step 5){
        println(value)
    }

    // For Loop campuran
    println("For Loop campuran:")
    val ukuranArray = array.size - 1
    for (i in 0..ukuranArray){
        println("Index $i = ${array[i]}")
    }
}