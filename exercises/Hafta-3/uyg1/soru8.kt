package com.example.uyg1

fun listeToSet(liste: List<Int>): Set<Int> {
    return liste.toSet()
}

fun main() {
    val liste = listOf(1, 2, 2, 3, 4, 4, 5)
    val set = listeToSet(liste)
    println("Listeden olusturulan Set: $set")
}