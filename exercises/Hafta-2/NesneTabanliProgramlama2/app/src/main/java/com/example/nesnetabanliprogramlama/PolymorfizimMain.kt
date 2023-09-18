package com.example.nesnetabanliprogramlama

//PolyMorphism Çok biçimlilik anlamına gelir
//Kalıtımla birlikte gelen bir özellik
fun main() {
    val hayvan:Hayvan = Kopek() //Hayvan tipinde ama köpek sınıfının özelliklerini taşımakta
    hayvan.sesCikar()
}