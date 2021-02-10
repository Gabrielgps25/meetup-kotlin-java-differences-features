package com.soujava

fun Any?.toString(): String {
    if (this == null) return "vazio"
    return toString()
}

fun String.masked (): String {

    val regex = ".[0-9]{3}.[0-9]{3}-[0-9]{2}".toRegex()

    return this.replace(regex, ".***.***-**")

}

    fun main(args: Array<String>) {
        var name: String? = "Gabriel"
        println(name.toString())

        name = null
        println(name.toString())

        val cpf: String = "234.543.457-92"
        println(cpf.masked())
    }