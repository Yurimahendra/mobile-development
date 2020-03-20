package com.example.tugas1

fun main(args: Array<String>){
    val p1 = Authlog("Password Buruk")
}

open class Log {
    var data: String = ""
    var nomorData = 0
    constructor(_data: String){

    }
    constructor(_data: String, _nomorData: Int){
        data = _data
        nomorData = _nomorData
        println("$data: $nomorData kali")
    }
}

class AuthLog: Log {
    constructor(_data: String): this("dari Authlog -> " +_data, 10){

    }
    constructor(_data: String, _nomorData: Int): super(_data, _nomorData){

    }
}