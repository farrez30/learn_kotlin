package basic

fun test(name: String, param: (String)->Unit): Unit = param(name);

fun main() {
    // Label
    loopI@ for(i in 1..3){
        loopJ@ for(j in 1..3){
            println("$i x $j = ${i * j}")
        }
    };

    println("---------------");

    // Break To label
    loopA@ for (a in 1..3){
        loopB@ for (b in 1..3){
            println("$a x $b = ${a * b}");
            if (b == 3){
                break@loopA
            }
        }
    }

    println("+++++++++++++++");

    // Continue To label
    loopE@ for (e in 1..4){
        loopF@ for (f in 1..4){
            println("$e x $f = ${e * f}");
            if(f == 2){
                continue@loopE
            }
        }
    }

    println("-=-=-=-==-")
    // Return To label
    test("ayam") testLabel@{
        if(it == ""){
            return@testLabel;
        } else {
            println("test..")
        }
    }

}