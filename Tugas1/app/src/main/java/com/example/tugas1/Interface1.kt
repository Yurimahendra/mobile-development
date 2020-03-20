package com.example.tugas1

interface Interfaceku{
    val prop: Int
        get() = 23
}

class ImplementasiInterface : Interfaceku{

}

fun main(args: Array<String>){
    val obj = ImplementasiInterface()
    println(obj.prop)
}