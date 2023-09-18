package com.example.uyg1

fun elemanlariCikar(set1: Set<Int>, set2: Set<Int>): Set<Int> {
    return set1.union(set2).subtract(set2)
}

fun main() {
    val set1 = setOf(1, 2, 3, 4, 5)
    val set2 = setOf(4, 5, 6)
    val sonuc = elemanlariCikar(set1, set2)
    println("Sonuc: $sonuc")
}
