package com.xykj.kotlinskill

sealed class SuperComand {
    object A : SuperComand()
    object B : SuperComand()
    object C : SuperComand()
    object D : SuperComand()
    class E (var id:Int): SuperComand()

}



