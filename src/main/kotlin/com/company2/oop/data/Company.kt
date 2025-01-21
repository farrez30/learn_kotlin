package com.company2.oop.data

class Company(val name: String) {

    // hashcode
    override fun hashCode(): Int {
        return name.hashCode();
    }

    // equals
    override fun equals(other: Any?): Boolean {
        return when (other){
            is Company -> other.name == this.name;
            else -> false
        }
    }
}