package com.example.ilkprojee

//Aynı veri tipine sahip birden çok elemanı tutmak için kullanılır
// Aynı tipte elemanlar tutulur (Örn. Int deger tutacaksak tüm elemanlarımız Int olmalı
// val diziAdi: Array<Tip> = arrayOf(eleman1,eleman2, eleman3....) eleman1'in indexsi 0 ,eleman2'in indexsi 1 ,
//joinToString() fonksiyonu ile dizideki elemanları virgülle ayırarak birleştirme işlemi yapıyor
fun main(){
 //val isimler: Array<String> = arrayOf("Ali","Veli","Mehmet","Ayşe")
    // println("İsimler: ${isimler.joinToString()}") //Ekrana yazdırmak için 1. yöntem

   // print("İsimler:")
   // for (i in isimler.indices){ // ekrana yazırmak için 2. yöntem
    //    print(isimler[i])
    //    if (i<isimler.size-1){
    //        print(",")
     //   }
   // }

 //   val notlar: Array<Double> = arrayOf(85.5,90.0,78.5,95.3) dizi oluştururken 1. format yazım biçimi
  //  val notlar: DoubleArray = doubleArrayOf(85.5,90.0,78.5,95.3) dizi oluştururken 2. format yazım biçimi
   // println("Notlar: ${notlar.joinToString()}")

   // val yaslar: IntArray = intArrayOf(25,16,23,21)
  //  println("Yaşlar: ${yaslar.joinToString()}")
/*
    val sayilar: Array<Int> = arrayOf(1,2,3,4,5)
    for (sayi in sayilar){
        println(sayi)
    }

 */
/*
    val sayilar: Array<Int> = arrayOf(10,23,45,67)

    for (index in sayilar.indices){
        val deger = sayilar[index]

        println("$index . Indexteki değer: $deger")
    }


 */
    /*
    val toplamaIslemi: Array<Int> = arrayOf(1,5,6,8,9)
    var toplam = 0
    for (sayi in toplamaIslemi){
        toplam += sayi
        //println("Dizi elemanlarının toplamı: $toplam")
    }
    println("Dizi elemanlarının toplamı: $toplam")

     */
    /*
    val sayilar: Array<Int> = arrayOf(25,7,35,24,67,23,0)

    var enBuyuk = sayilar[0]
    var enKucuk = sayilar[0]

    for (sayi in sayilar){
        if (sayi < enKucuk){
            enKucuk = sayi
        }
       if (sayi > enBuyuk){
            enBuyuk = sayi
        }

    }
    println("En büyük değer: $enBuyuk")
    println("En küçük değer: $enKucuk")

     */
    /*
    //Dizimizdeki elemanları küçükten büyüğe doğru sıralar sort()
    val sayilar: Array<Int> = arrayOf(46,90,12,45,78,5,2)
    sayilar.sort()
    println("Sıralı dizi: ${sayilar.joinToString ()}")

     */
    //  Dizimizdeki elemanları büyükten küçüğe doğru sıralar sortDescending()
       val sayilar: Array<Int> = arrayOf(46,90,12,45,78,5,2)
       sayilar.sortDescending()
       println("Sıralı dizi: ${sayilar.joinToString ()}")
}