package com.example.uyg1

fun elemanlariEkle(hashSet1: HashSet<Int>, hashSet2: HashSet<Int>): HashSet<Int> {
    val yeniHashSet = HashSet<Int>(hashSet1)
    yeniHashSet.addAll(hashSet2)
    return yeniHashSet
}

fun main() {
    val hashSet1 = hashSetOf(1, 2, 3)
    val hashSet2 = hashSetOf(4, 5, 6)
    val birlesikHashSet = elemanlariEkle(hashSet1, hashSet2)
    println("Birlesik HashSet: $birlesikHashSet")
}