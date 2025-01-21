package basic

fun main() {

    // While Loop
    println("----------")
    println("While Loop:")
    var i: Int = 0;
    while (i < 10){
        println("While ke-$i")
        i++
    }

    // Do While Loop
    println("----------")
    println("Do While Loop:")
    var a: Int = 100;
    do {
        println("Do ke-$a");
        a++
    } while (a < 10)

    // Break (menghentikan loop)
    println("----------")
    println("Break the Loop:")
    var b: Int = 0;
    while (true){
        println("Break loop ke-$b");
        b++;
        if(b > 10){
            println("Loop di break")
            break;
        }
    }

    // Continue (melompati bagian yang ditentukan dan lanjut iterasi loop berikutnya)
    println("----------")
    println("Continue the Loop:");
    for (i in 1..10){
        if(i % 2 == 0){
            println("Genap-$i")
            continue
        }
        println("Ganjil-$i")
    }
}