package com.example.tugas1

interface MyInterface {
    val test : Int
    fun hai() : String
    fun hello(){
        println("Hello semua ")
    }
}

class Interfaceloop: MyInterface{
    override val test: Int = 25
    override fun hai()= "hai semua"
}

fun main(args: Array<String>){
    val obj = Interfaceloop()
    println("test ${obj.test}")
    println("panggil hello:")

    obj.hello()

    println("Panggil dan print hai")
    println(obj.hai())
}