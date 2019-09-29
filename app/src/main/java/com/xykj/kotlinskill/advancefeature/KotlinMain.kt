package com.xykj.kotlinskill.advancefeature

fun main(args: Array<String>) {
    val user = User(12, "name")

    val (age, name) = user

    println(age)
    println(name)

    val map = mapOf<String, String>("key" to "key","value" to "value")
    for ((k,v) in map){
        println("$k---$v")
    }
}