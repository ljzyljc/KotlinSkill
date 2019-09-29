package com.xykj.kotlinskill.testfanbianyi


fun main(args:Array<String>){

    var str:String = "linjc"

}

fun test(str:String){
    println(str)
}

class Test<T> where T :Callback,T:Runnable{
    fun add(t:T){
        t.run()
        t.callback()
    }

}

interface Callback{
    fun callback()
}




