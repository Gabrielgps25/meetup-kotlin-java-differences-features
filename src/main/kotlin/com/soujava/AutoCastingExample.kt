package com.soujava

fun printValue(obj: Any) {
    if (obj is String)
        println(obj)
}

fun main(args: Array<String>){
    val person = "String Teste"
    printValue (person)
}