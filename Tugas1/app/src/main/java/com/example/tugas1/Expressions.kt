package com.example.tugas1

open class Person(){
    fun makan() = println("makan mi")
    fun ngomong() = println("bareng bareng")
    open fun doa()= println("lamak bana")
}

fun main(args: Array<String>){
    val muslim = object : Person(){
        override fun doa() = println("jangan lupa baca doa")
    }

    muslim.makan()
    muslim.ngomong()
    muslim.doa()
}