package basic

fun main(){
    // String
    val firstName: String = "Ayam"
    val lastName: String = "Bebek"
    val fullName: String = "Ayam Bebek"
    val address: String = """
        Jalan Sesama,
        Provinsi Banten,
        Negara Indonesia
    """

    println(firstName)
    println(lastName)
    println(fullName)
    println(address)

    // String Trim Margin
    val address1: String = """
        |Jalan Sesama,
        |Provinsi Banten,
        |Negara Indonesia
    """.trimMargin(); // trim margin dengan pipe (default)

    val address2: String = """
        >Jalan Sesama,
        >Provinsi Banten,
        >Negara Indonesia
    """.trimMargin(">"); // trim margin custom (tentukan di string)

    val address3: String = """
        Jalan Sesama,
        Provinsi Banten,
        Negara Indonesia
    """.trimIndent() // trim indent (default shortcut multiline string """ """)

    println("address1: \n" + address1)
    println("address2: \n" + address2)
    println("address3: \n" + address3)

    // Menggabungkan string
    val fullName2: String = firstName + " " + lastName
    println("fullName2: " + fullName2);

    // String Template
    val fullName3: String = "$firstName $lastName"
    val desc: String = "total $fullName3 char = ${fullName3.length}"
    println("\n")
    println("fullname3: $fullName3 \n")
    println("desc: $desc")

    
}