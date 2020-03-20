package com.example.tugas1

interface A{
    fun callMe(){
        println("dari inface A")
    }
}

interface B{
    fun callMe(){
        println("dari interface B")
    }
}

class C: A, B{
    override fun callMe(){
        super<A>.callMe()
        super<B>.callMe()
    }
}
fun main(args: Array<String>){
    val obj=C()

    obj.callMe()
    obj.callMe()
}