package com.soujava

import java.time.Duration
import java.time. Instant

inline fun <T> measureTime (block: () -> T): Duration {

    val markNow = Instant.now()
    block()
    return Duration.between(markNow, Instant.now())
}

fun main() {

    measureTime {
        println("Start sleep")
        Thread.sleep(200)
        println("End steep")

    }.also { duration ->
        println("Duração: ${duration.toNanos()}")
    }
}
// Output
   // start sleep
   // End sleep
   // Duração: 200878000