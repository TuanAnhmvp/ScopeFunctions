package com.example.scopefunctions

fun main() {
    val person: Personss? = null
    val bio = person?.run{
        println(name)
        println(age)

        //return lambda result
        age + 5
    }

    println(bio)

}

class Personss(){
    var name: String = "Tuan Anh"
    var age: Int = 22
}