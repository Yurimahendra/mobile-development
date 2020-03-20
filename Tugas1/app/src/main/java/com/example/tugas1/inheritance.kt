package com.example.tugas1

open class Personal(umur: Int, nama: String){
    init {
        println("nama saya adalah $nama.")
        println("umur saya adalah $umur.")
    }
}

class GuruMatematika(umur: Int, nama: String): Personal(umur, nama){
    fun mengajar(){
        println("saya mengajar di kelas SD.")
    }
}

class PesepakBola(umur: Int, nama: String): Personal(umur, nama){
    fun bermain(){
        println("saya bermain untuk Persela.")
    }
}

fun main(args: Array<String>){
    val t1 = GuruMatematika(25,"Ridha")
    t1.mengajar()
    println()
    val f1 = PesepakBola(29, "Rafi")
    f1.bermain()
}