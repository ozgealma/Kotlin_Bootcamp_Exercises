package com.example.uyg2

interface Shape {
    fun alanHesapla(): Double
}

class Dikdortgen(val en: Double, val boy: Double) : Shape {
    override fun alanHesapla(): Double {
        return en * boy // Dikdörtgenin alanını hesaplamak için en ve boyu çarparız
    }
}

class Daire(val yaricap: Double) : Shape {
    override fun alanHesapla(): Double {
        return Math.PI * yaricap * yaricap // Dairenin alanını hesaplamak için π * yarıçap^2 formülünü kullanırız
    }
}

fun main() {
    val dikdortgen = Dikdortgen(5.0, 10.0)
    val daire = Daire(3.0)

    println("Dikdörtgenin Alani: ${dikdortgen.alanHesapla()}") // Çıktı: Dikdörtgenin Alanı: 50.0
    println("Dairenin Alani: ${daire.alanHesapla()}") // Çıktı: Dairenin Alanı: 28.27
}