package com.example.uyg2

interface Calisan {
    fun maasHesapla(): Double
}

class Mudur(val temelMaas: Double) : Calisan {
    override fun maasHesapla(): Double {
        // Örnek olarak, müdür için temel maaşa ek olarak yüzde 20 fazla verildiğini varsayalım
        return temelMaas + (temelMaas * 0.20)
    }
}

class Memur(val temelMaas: Double) : Calisan {
    override fun maasHesapla(): Double {
        // Örnek olarak, memur için sadece temel maaşın verildiğini varsayalım
        return temelMaas
    }
}

fun main() {
    val mudur = Mudur(5000.0)
    val memur = Memur(3000.0)

    println("Müdür Maasi: ${mudur.maasHesapla()}") // Çıktı: Müdür Maaşı: 6000.0
    println("Memur Maasi: ${memur.maasHesapla()}") // Çıktı: Memur Maaşı: 3000.0
}