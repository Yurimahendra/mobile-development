package com.example.tugas1

data class User(val nama: String, val umur: Int, val jeniskelamin: String)

fun main(args: Array<String>){
    val ridho = User("ridho", 29, "pria")

    val w1 = User("Joni", 30, "pria")
    val w2 = w1.copy()
    val w3 = w1.copy(nama = "ananda")

    val w4 = User("putri", 40, "wedok")
    val (nama, umur, jeniskelamin) = w4


    println("Nama = ${ridho.nama}")
    println("Umur = ${ridho.umur}")

    println("w1 hashcode = ${w1.hashCode()}")
    println("w2 hascode = ${w2.hashCode()}")
    println("w3 hascode = ${w3.hashCode()}")

    println("nama = ${nama}")
    println("umur = ${umur}")
    println("Jenis Kelamin = ${jeniskelamin}")

    if (w1.equals(w2) == true)
        println("w1 sama dengan w2")
    else
        println("w1 tidak sama dengan w2")

    if (w1.equals(w3) == true)
        println("w1 sama dengan w3")
    else
        println("w1 tidak sama dengan w3")
}

