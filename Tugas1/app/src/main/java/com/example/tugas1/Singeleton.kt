package com.example.tugas1

object Test{
    private var a: Int = 0
    var b: Int = 1

    fun halo(): Int{
        a = 12
        return a
    }
}

fun main(args: Array<String>){
    val hasil: Int

    hasil = Test.halo()

    println("b = ${Test.b}")
    println("Hasil = $hasil")
}