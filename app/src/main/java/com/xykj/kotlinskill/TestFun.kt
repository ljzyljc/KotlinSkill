package com.xykj.kotlinskill

import java.io.File
import java.nio.charset.Charset


//函数参数可以有默认值,有默认值可以大大减少重载函数参数的数量
fun print(name: String = "Linjc"): String? {
    println("$name")
    return name
}


fun File.readJackieText(charset: Charset = Charsets.UTF_8): String = readBytes().toString(charset)


fun main(args: Array<String>) {
    print()

    //扩展函数

    val file = File("app/app.iml")

    //file.readJackieText()

    println(file.readJackieText())

    ResourceUtils.isEmpty("dsjklfskdj")


}

//函数嵌套，用途：在某些条件下触发递归的函数，不希望被外部函数访问到的函数
fun function() {

    val str = "hello world"

    fun say(count: Int = 10) {
        println(str)
        if (count == 0){
            say(count - 1)
        }
    }
    say()


}

//扩展函数


//Lambda

//Lambda闭包声明

val echo = { name:String ->
    println(name)
}


















