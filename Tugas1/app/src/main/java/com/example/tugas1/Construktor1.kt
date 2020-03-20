package com.example.tugas1

fun main(args: Array<String>){
    val person1 = Person("viola", 15)
}

class Person(nama: String, umurPerson: Int){
    val namaDepan: String
    var umur: Int

    init {
        namaDepan = nama.capitalize()
        umur = umurPerson

        println("Nama depan = $namaDepan")
        println("Umur = $umur")
    }
}