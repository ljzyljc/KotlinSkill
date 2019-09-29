package com.xykj.kotlinskill

import com.xykj.kotlinskill.A.format
import kotlin.reflect.KClass

var age: Int = 18  //变量
var name: String = "Zhang Tao"
var name2: String? = null  //不可变的变量

fun main(args: Array<String>){
    //name = name2  不可赋值，因为name是不可为空的类型，而name2是可为空的类型。
//    name = name2!!  //!!表示强转为不为空的
    name2 = name

    println(ColorUtils.`in`)  //转义

    //function("")

    val age = 18
    val name = "Zhang Tao"

    //println("我叫%d,我今年%d岁",name ,age);





}


fun printLen(str: String):String{
    println("字符串是：$str")
    ColorUtils.setColor(str)
    Test.sayMessage("hello")
    return  str
}

//变量申明，函数声明，函数使用


//匿名内部类的写法

object Test {
    @JvmStatic
    fun sayMessage(msg: String){
        println(msg)
    }

}


fun testClass(clazz: Class<ColorUtils>){
    println(clazz.simpleName)
}

fun testClass(clazz: KClass<ColorUtils>){
    println(clazz.simpleName)
}

fun testTwo(){
    testClass(ColorUtils::class.java)
    testClass(ColorUtils::class)

}


fun function(str: String){
    val fmt1 = format(str)
    println(fmt1.length)

    val fmt3:String? = format(str)
}











































