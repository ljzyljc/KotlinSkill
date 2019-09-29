package com.xykj.kotlinskill

class Single private constructor(){

    companion object{
        fun get(): Single{
            return Holder.instance
        }

    }

    private object Holder{
        val instance = Single()
    }

}