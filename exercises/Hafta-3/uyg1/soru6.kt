package com.example.uyg1

fun elemanKontrol(hashSet: HashSet<Int>, eleman: Int): Boolean {
    return hashSet.contains(eleman)
    //   return eleman in hashSet
}

fun main() {
    val hashSet = hashSetOf(1, 2, 3, 4, 5)
    val eleman = 3
    val sonuc = elemanKontrol(hashSet, eleman)
    println("HashSet'in $eleman elemanini icerme durumu: $sonuc")
}