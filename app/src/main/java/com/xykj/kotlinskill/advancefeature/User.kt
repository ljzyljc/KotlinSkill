package com.xykj.kotlinskill.advancefeature

class User(var age:Int,var name: String) {

    operator fun component1() = age

    operator fun component2() = name

}