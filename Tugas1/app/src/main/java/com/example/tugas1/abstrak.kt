package com.example.tugas1

abstract class Personal(nama: String) {
    var umur: Int = 40

    fun tampilkanSSN(ssn: Int){
        println("SSN saya adalah $ssn.")
    }
    abstract fun tampilkan(keterangan: String)
}

class Pengajar(nama: String): Personal(nama){
    override fun tampilkan(keterangan: String) {
        print(keterangan)
    }
}

fun main(args: Array<String>){
    val jek = Pengajar("Viola Ventika")
    jek.tampilkan("saya seorang pengajar matematika")
    jek.tampilkanSSN(23123)
}