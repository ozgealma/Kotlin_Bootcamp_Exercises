package com.example.arraylist

//ArrayList boyutları dinamik dizilerdi
//add()  diziye veri eklemek için kullanılır
fun main() {
    val liste = ArrayList<String>()//ArrayListleri tanımlamanın 1. yöntemi
    val liste2 : ArrayList<Int> = ArrayList<Int>()//ArrayList tanımlama 2. yöntem

    val meyveler = ArrayList<String>()
    meyveler.add("Çilek") // 0
    meyveler.add("Muz") //1
    meyveler.add("Elma") //2
    meyveler.add("Kivi")//3
    meyveler.add("Kiraz") //4
    println(meyveler.toString())

    val str = meyveler.get(2) //veriye erişme biçimi 1. yöntem
    println(str)

    val str1 = meyveler[4] //veriye erişme biçimi 2.yöntem
    println(str1)

    meyveler[2] = "Ananas" // var olan elemanın üzerine ekleme yapmak için kullanılır
    println(meyveler.toString())

    meyveler.add(3,"Karpuz") // Karpuz elemanını 3. endexse ekleyip diğer elemanları silmeden yanına kaydırıyor
    println(meyveler.toString())


}