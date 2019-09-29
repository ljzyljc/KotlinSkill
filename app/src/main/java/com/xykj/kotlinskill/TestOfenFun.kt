package com.xykj.kotlinskill

data class User(var name: String)

fun main(args: Array<String>) {

    val user = User("Linjc")

    val letResult: String = user.let { "let::${it.javaClass}" }

    println(letResult)

    val runResult: String = user.run { "run::${this.javaClass}" }

    println(runResult)

    user.also {
        println("also::${it.javaClass}")
    }.apply {
        println("apply::${this.javaClass}")
    }.name


    //takeIf 的闭包返回一个判断结果，为false时，takeIf函数会返回空
    //takeUnless与takeIf 刚好相反，闭包的判断结果，为true时函数会返回空

    user.takeIf { it.name.length > 0 }?.also { println("${it.name}") } ?: println("姓名为空")
    user.takeUnless { it.name.length > 0 }?.also { println("姓名为空") }?: println("姓名为${user.name}")

    repeat(5){
        println(user.name)
        println(it)
    }

    //with比较特殊，不是以扩展方式的形式存在的，而是一个顶级函数

    with(user){
        this.name = "with"
    }

    user.apply { this.name = "with" }



}