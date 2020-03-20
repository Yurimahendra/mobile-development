package com.example.tugas1

class Outer{
    val a = "di luar nested class"
    inner class Inner{
        //val b = "Di dalam nested class"
        fun callMe() = a
    }
}

fun main(args: Array<String>){
    //pengaksesan anggota dari nested class
    val outer = Outer()
    println("Menggunakan objek outer: ${outer.Inner().callMe()}")

    //pembuatan objek dari nested class
    val inner = Outer().Inner()

    println("menggunakan objek inner: ${inner.callMe()}")
}