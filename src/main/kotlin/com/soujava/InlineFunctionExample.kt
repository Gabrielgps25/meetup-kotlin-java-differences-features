package com.soujava

import java.time.Duration
import java.time. Instant

inline fun <T> measureTime (block: () -> T): Pair<T, Duration> {

    val markNow = Instant.now()
    val t = block()

    return Pair(t, Duration.between(markNow, Instant.now()))
}

fun main(args: Array<String>) {

    measureTime {

        println("Start sleep")
        Thread.sleep(200)
        println("End steep")

    }.also { (unit, duration) ->
        println("Duração: ${duration.toMillis()}")
    }
}
// Output
   // start sleep
   // End sleep
   // Duração: 202 Retorno: kotlin Unit