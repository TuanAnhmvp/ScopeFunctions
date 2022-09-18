package com.example.scopefunctions

class Persons {
    var name: String = ""
    var age: Int = 0

}

fun main(){
    //return context
    val person =Persons().apply {
        name = "Tuananh"
        age = 22
    }

    with(person){
        println(name)
        println(age)
    }

}