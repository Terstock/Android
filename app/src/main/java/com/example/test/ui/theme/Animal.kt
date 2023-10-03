package com.example.test.ui.theme

abstract class Animal (val name: String, var age: Int){
    val v1 = 54
    var v2 = 43

    init{
        age
    }

    abstract fun move(duration: Int): Boolean

    fun f1(){
        v2 = age
        name
        age
    }

    companion object{
        val v4 = "fdf"
        fun f3(){

        }
    }
}

