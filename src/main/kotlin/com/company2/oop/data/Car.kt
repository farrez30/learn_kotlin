package com.company2.oop.data

class Car(paramBrand: String = "", paramName: String, paramYear: Int = 2020) {

    // Initializer Block
    init {
        println("Mobil $paramBrand dibuat pada tahun $paramYear")
    }

    constructor(paramBrand1: String, paramName1: String): this(paramBrand1, paramName1, 2010){
        println("Secondary Constructor 1");
    };

    constructor(paramBrand2: String): this(paramBrand2, ""){
        println("Secondary Constructor 2");
    }

    var brand: String = paramBrand;
    var name: String = paramName;
    var year: Int = paramYear;
}