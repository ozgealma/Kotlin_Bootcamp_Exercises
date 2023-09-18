package com.example.uyg2

import kotlin.concurrent.thread

fun main() {
    val numbers = arrayOf(10, 3, 5, 9, 2, 7, 8, 6)

    var maxNumber: Int? = null
    var minNumber: Int? = null

    // İlk thread en büyük sayıyı bulur
    val maxThread = thread {
        maxNumber = numbers.maxOrNull()
    }

    // İkinci thread en küçük sayıyı bulur
    val minThread = thread {
        minNumber = numbers.minOrNull()
    }

    // İki thread'in de tamamlanmasını bekler
    maxThread.join()
    minThread.join()

    println("En büyük sayi: $maxNumber")
    println("En küçük sayi: $minNumber")
}