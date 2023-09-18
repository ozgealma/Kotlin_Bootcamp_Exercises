package com.example.arraylist
/*
**** Set(HashSet)
* ArrayList ile özelliklere sahiptir.
* Bazı farklılıkları vardır
* 1. farklılık Eklenen veriler düzensiz rastgele yerleşir
* 2.farklık aynı isimle iki veriyi kaydedemiyoruz
*
* setOf sadece verileri okuyabildiğimiz bir yapı
* mutableSetOf ve HashSet aynı anlama geliyor sadece isimleri farklı üzerinde değişiklik
yapabildiğimiz ve veri okuyabildiğimiz yapılar
* HashSet
 */


fun main() {

    val meyveler = setOf("çilek","muz","elma","kivi")
    val iller = mutableSetOf<String>("Bursa","İstanbul","Ankara","İzmir")
    val sayilar = HashSet<Int>()

    sayilar.add(10)
    sayilar.add(20)
    sayilar.add(30)

    println(sayilar.toString())

    sayilar.add(20)
    println(sayilar.toString())

    sayilar.add(25)
    println(sayilar.toString())

    //Diğer özellikler
    println(sayilar.elementAt(3)) //indeksini yazdığımız elemanı getirir

    println(sayilar.size) //boyut
    println(sayilar.count()) //boyut

    println(sayilar.isEmpty()) // listenin boş mu dolumu olduğunu kontrol eder

    println(sayilar.contains(19)) //Listenin içinde bu eleman var mı yok mu kontrolü Boolean değer döndürür

    for (s in sayilar){
        println(s)
    }

    for ((i,s)in sayilar.withIndex()){
        println("$i. -> $s")
    }

    sayilar.remove(10) //silmek istediğimiz değeri giriyoruz
    println(sayilar.toString())

    sayilar.clear() //Listenin tüm verilerini siler
    println(sayilar.toString())

}