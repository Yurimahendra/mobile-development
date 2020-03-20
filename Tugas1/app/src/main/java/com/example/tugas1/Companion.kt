package com.example.tugas1

class Companion {
    companion object{
        fun callMe() = println("saya dipanggil")
    }
}

fun main(args: Array<String>){
    Companion.callMe()
}