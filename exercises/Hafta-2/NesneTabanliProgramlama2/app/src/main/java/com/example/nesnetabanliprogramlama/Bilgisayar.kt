package com.example.nesnetabanliprogramlama

class Bilgisayar(var renk:String,var hiz:Int, var  calisiyorMi:Boolean) {

    fun bilgiAl(){
        println("Renk : $renk")
        println("Hız : $hiz")
        println("Çalışıyormu : $calisiyorMi")
    }

    fun calisiyorMu(){
        calisiyorMi = true
        println("Calişıyor mu değerim $calisiyorMi")
    }

}