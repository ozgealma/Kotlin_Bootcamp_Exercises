package com.example.uyg1

fun tersCevir(liste: List<Int>): List<Int> {
    return liste.reversed()
}

fun main() {
    val liste = listOf(1, 2, 3, 4, 5)
    val tersListe = tersCevir(liste)
    println("Ters cevrilmis liste: $tersListe")
}