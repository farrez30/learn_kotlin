package basic

// Constant biasanya di set diluar function
const val APP = "Learn Kotlin";
const val VERSION = "0.0.1";
// //////////////////////////////////

fun main(){
    // Variable Mutable (bisa diubah)
    var firstName: String = "Ayam"
    var lastName: String = "Bebek"

    lastName = "Ikan" // Mengubah variable
    println(firstName)
    println(lastName)

    // Variable Immutable
    val lastName2: String = "Kucing"
    // lastName2 = "Kumbang" //<-- error jika mengubah variable

    // Nullable
    var firstName2: String? = "Naga"
    firstName2 = null

    //println(firstName2.length) //<-- error karena firstName bisa null
    println(firstName2?.length)

    // Variable Constant
    println("Welcome to $APP version $VERSION")

}