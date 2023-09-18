package com.example.arraylist
/*
******Map(HashMap)
* Key ve value yapısı ile çalışır
* key ile verilere erişiriz
* Key ve value farklı türlerde olabilir
* Mutable olmazsa map üzerinde değişiklikler yapılamaz
* mapOf sadece üzerinde veri okuma yapabiliriz
* mutableMapOf ve HashMap ikisi aynı özelliklere sahip sadece isimleri farklı. Hem okuma hemde düzenleme yapılabilir
 */
fun main() {

    val sayilar = mapOf<Int,String>(1 to "Bir",2 to "iki")

    val oranlar = mutableMapOf(1.5 to "Oran1",3.4 to "Oran2")

    val iller = HashMap<Int,String>()

    iller.put(16,"Bursa") //veri ekleme
    iller.put(34,"İstanbul")

    println(iller.toString())

    //Veri Güncelleme

    iller.put(16,"Ankara")
    println(iller.toString())

    //Veri Okuma

    println(iller.get(34))

    //Mapin boyutu

    println(iller.size)
    println(iller.count())

    println(iller.isEmpty())

    println(iller.containsKey(16))
    println(iller.containsValue("Bursa"))

    for ((anahtar,deger) in iller){
        println("$anahtar : $deger")
    }

    iller.remove(16) //silme
    println(iller.toString())

    iller.clear() //Hepsini silme işlemi
    println(iller.toString())

}