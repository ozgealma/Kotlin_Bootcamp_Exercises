package com.example.nesnetabanliprogramlama

fun main(){
    val hayvan = Hayvan() //Hayvan sınıfından nesne oluşturduk
    hayvan.sesCikar()

    val evcilHayvan = EvcilHayvan() //Evcil hayvan sınıfından nesne oluşturduk
    evcilHayvan.sesCikar()

    val kedi = Kedi() //Kedi sınıfından nesne oluşturduk
    kedi.sesCikar()

    val kopek = Kopek()
    kopek.sesCikar()
}