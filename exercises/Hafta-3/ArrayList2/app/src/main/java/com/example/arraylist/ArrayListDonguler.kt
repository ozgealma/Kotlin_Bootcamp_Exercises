package com.example.arraylist

fun main() {
    val meyveler = ArrayList<String>()

    meyveler.add("çilek")
    meyveler.add("muz")
    meyveler.add("elma")
    meyveler.add("kivi")

    for (meyve in meyveler){
        println("sonuç: $meyve")
    }

    for ((indeks,meyve) in meyveler.withIndex()){
        println(" $indeks. indeks $meyve")
    }
}