package com.example.tugas1

fun main(args: Array<String>){
    val p1 = Authlog("Password Buruk")
}

open class Log{
    var data: String = ""
    var nomorData = 0
    constructor(_data: String): this("dari authlog -> + $_data", 10){

    }
    constructor(_data: String, _nomorData: Int): super(_data, _nomorData){

    }
}