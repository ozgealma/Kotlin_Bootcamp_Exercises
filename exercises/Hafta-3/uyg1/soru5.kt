package com.example.uyg1

fun tekrarEdenleriBul(liste: List<Int>): HashSet<Int> {
    val set = HashSet<Int>()
    val tekrarEdenler = HashSet<Int>()

    for (eleman in liste) {
        if (!set.add(eleman)) {
            tekrarEdenler.add(eleman)
        }
    }
    return tekrarEdenler
}

fun main() {
    val liste = listOf(1, 2, 2, 3, 4, 4, 5)
    val tekrarEdenler = tekrarEdenleriBul(liste)
    println("Tekrar eden elemanlar: $tekrarEdenler")
}