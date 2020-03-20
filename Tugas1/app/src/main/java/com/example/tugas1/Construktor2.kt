package com.example.tugas1

fun main(args: Array<String>){
    val p1 = Authlog("Password")
}

open class log{
    var data: String = ""
    var numberOfData = 0

    constructor(data1: String){

    }
    constructor(data1: String, numberOfData1: Int){
        data = data1
        numberOfData = numberOfData1
        println("$data: $numberOfData X")
    }
}

class Authlog: Log{
    constructor(data1: String): this("Dari Authlog ->" +data1, 10){

    }
    constructor(data1: String, numberOfData1: Int): super(data1, numberOfData1){

    }
}