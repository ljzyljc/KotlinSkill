package com.xykj.kotlinskill


class ResourceUtils{

fun echo(name: String) {
    println("$name")
}

//伴生对象

companion object {
    fun isEmpty(str: String): Boolean {
        return "" == str
    }
}

}