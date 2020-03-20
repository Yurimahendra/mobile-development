package com.example.tugas1

class Lampu{
    private var isOn: Boolean = false

    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun displayLightStatus(lampu: String){
        if (isOn == true)
            println("$lampu lampu is On")
        else
            println("$lampu lampu is off")
    }
}

fun main(args: Array<String>){
    val 11 = Lampu()
    val 12 = Lampu()

    11.turnOn()
    12.turnOff
    11.displayLightStatus("11")
    12.displayLightStatus("12")
}