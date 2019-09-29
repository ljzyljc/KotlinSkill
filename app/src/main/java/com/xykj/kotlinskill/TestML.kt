package com.xykj.kotlinskill

fun main(args:Array<String>){
    //println("hello world")

    val hello = Hello()
    hello.string = "world"
    println(hello.string)




}


class Hello{

    var string:String? = null
    get() {
        return field + "hello"
    }
    set(value) {
        field = value + "set"
    }

}