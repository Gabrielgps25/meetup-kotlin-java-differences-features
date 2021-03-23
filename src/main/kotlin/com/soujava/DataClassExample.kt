package com.soujava

data class Person (var name: String, var age: Int)

fun main() {

    val person = Person("Gabriel", 26)
    print("Nome: ${person.name} e Idade: ${person.age}")
}