package com.example.scopefunctions

fun main() {
    val person = Person()
    val bio: Int = with(person){
        println(name)
        println(age)

        //return lambda result
        age + 5
    }

    println(bio)

}

class Person(){
    var name: String = "Tuan Anh"
    var age: Int = 22
}