package com.xykj.kotlinskill.xiecheng

import android.view.View
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args:Array<String>) = runBlocking{
    val job = launch {
        repeat(1000){i ->
            println("挂起中$i ...")
            delay(500)
        }
    }


    val job2 = async {
        delay(500L)
        return@async "hello"

    }
    println("job2的输出"+job2.await())



    delay(1300L)
    println("主线程等待中")
    job.cancel()
    job.join()
    println("main:即将完成退出")



}

fun test1() = runBlocking{

    async() {  }

}


fun test2(){

//    launch{
//        val job = async{
//            "string"
//        }
//        println()
//
//    }

}















