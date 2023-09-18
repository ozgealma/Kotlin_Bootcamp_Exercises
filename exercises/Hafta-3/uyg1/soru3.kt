package com.example.uyg1

fun birlestirVeSirala(l1: List<Int>, l2: List<Int>) = (l1 + l2).sorted()

fun main() {
    val l1 = listOf(5, 2, 8)
    val l2 = listOf(1, 6, 3)

    val s = birlestirVeSirala(l1, l2)
    println("Sonuç: $s")
}
