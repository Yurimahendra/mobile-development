package com.example.tugas1

open class Personal(umur: Int, nama: String){

}

class PesepakBola(umur: Int, nama: String, klub: String): Personal(umur, nama){
    init {
        println("Pemain bola $nama umur $umur dan bermain untuk $klub")
    }

    fun bermain(){
        println("saya sedang bermain bola.")
    }
}

fun main(args: Array<String>){
    val f1 = PesepakBola(29, "rafi", "Persela")
}