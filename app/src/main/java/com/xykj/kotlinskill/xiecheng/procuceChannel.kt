package com.xykj.kotlinskill.xiecheng

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.nio.channels.Channel

//fun main(args:Array<String>) = runBlocking{
//
//    val c = Channel<Int>(){
//        launch {
//            get(c)
//        }
//    }
//
//
//}
//
//
//suspend fun get(channel:Channel<Int>){
//    while (true){
//        println(channel.receive())
//    }
//}
//
//suspend fun set(channel:Channel<Int>){
//    while (true){
//        var i = 0
//        while (true){
//            channel.send(i++)
//        }
//    }
//}
