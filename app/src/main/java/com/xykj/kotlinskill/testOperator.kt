package com.xykj.kotlinskill


fun main(args: Array<String>) {

    val a = arrayOf("4", "0", "6", "5", "9", "i", "f", "m")

    val indexArray = arrayOf(5, 3, 6, 8, 7, 9, 0, 2, 1)

    indexArray
            .filter {
                it < a.size
            }
            .map {
                a[it]
            }
            .reduce { s, s1 ->
                "$s$s1"
            }
            .also {
                println("密码是$it")
            }


}

val list = arrayListOf<Char>('a', 'b', 'c', 'd')
val a = list.map { it - 'a' }     //这里返回的是int集合，因为是unicode码减去unicode码
        .filter { it > 0 }  //这里返回的是大于0 的
        .find { it > 1 }    //这里返回的是第一个大于1的，还有findLast
