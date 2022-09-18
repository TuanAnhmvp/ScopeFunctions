package com.example.scopefunctions

fun main() {
    val name: String? = null

    val stringLength = name?.let {
        println(it.reversed())
        println(it.capitalize())
        //return lambda
        it.length
    }

    println(stringLength)

}