package com.example.uyg1

fun tekSayilar(l: List<Int>) = l.filter { it % 2 != 0 }

fun main() {
    val ls = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println("Tek sayilar: ${tekSayilar(ls)}")
}