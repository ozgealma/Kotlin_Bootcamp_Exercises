package com.example.arraylist

fun main() {
    val meyveler = ArrayList<String>()

    meyveler.add("çilek")
    meyveler.add("muz")
    meyveler.add("elma")
    meyveler.add("kivi")
    meyveler.add("karpuz")

    println(meyveler.isEmpty())// Dizimin boş mu dolumu olduğunu kontrol ediyor dizimi boş ise tru dolu ise false döndürür
    println(meyveler.count())//Dizi boyutunu verir
    println(meyveler.first())//Dizinin ilk elemanını getirir
    println(meyveler.last())//Dizinin son elemanını getirir
    println(meyveler.contains("elma")) //Dizinin içinde bu eleman var mı? Kontrolünü yapar
    println(meyveler.contains("portakal"))
    println(meyveler.max())//Harf sırasına göre sıralar ve sondaki elemanı getirir (ç türkçe karakter olduğu için sona alındı)
    println(meyveler.min())//Harf sırasına göre sıralar ve baştaki elemanı getirir

    meyveler.sort() //liste sıralama
    println(meyveler.toString())

    meyveler.reverse() //Listeyi çevirir
    println(meyveler.toString())

    meyveler.removeAt(3) //index numarasına göre silme işlemi
    println(meyveler.toString())

    meyveler.remove("kivi") //Listenin içindeki elemanı bulup silme işlemi yapar
    println(meyveler.toString())

    meyveler.clear() // tüm listeyi temizleme
    println(meyveler.toString())
}