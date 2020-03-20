package com.example.tugas1

fun main(args: Array<String>){
    val p = Person()
    p.nama = "viola"
    println("${p.nama}")
}

class Person{
    var nama:String = "defaultValue"
    get()=field
    set(value){
        field = value
    }
}