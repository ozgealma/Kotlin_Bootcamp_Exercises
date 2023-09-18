package com.example.uyg1

fun main() {
    val liste = listOf(1, 2, 3, 4, 5)
    println("Listedeki elemanlarin toplami: ${topla(liste)}")
}

fun topla(liste: List<Int>): Int {
    var toplam = 0
    for (eleman in liste) {
        toplam += eleman
    }
    return toplam
}