package com.example.tugas1

fun main(args: Array<String>){
    val cewe = Girl()
    cewe.umurAsli = 15
    cewe.umurPalsu = 15
    println("Cewe : UmurAsli = ${cewe.umurAsli}")
    println("Cewe : UmurPalsu" = ${cewe.umurPalsu})
    val siti = Girl()
    siti.umurAsli = 35
    siti.umurPalsu = 35
    println("siti : UmurAsli = ${siti.umurAsli}")
    println("siti : UmurPalsu = ${siti.umurPalsu}")
}

class Girl{
    var umurPalsu: Int = 0
    get() = field
    set(value){
        field = if (value < 18)
            18
        else if(value>= 18 && value<=30)
            value
        else
            value-3
    }
    var umurAsli: Int = 0
}