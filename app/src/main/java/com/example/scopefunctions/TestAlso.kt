package com.example.scopefunctions

fun main(){
    //return context
    val numberList: MutableList<Int> = mutableListOf(1,2,3)

    numberList.also {
        println("the list elements are: $it")
        it.add(4)
        println("after: $it")

    }
}