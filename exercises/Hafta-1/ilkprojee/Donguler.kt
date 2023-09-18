package com.example.ilkprojee

import java.util.Scanner

// Döngüler belirli bir işlemi bir veya daha fazla kez tekrarlanmasını istediğimiz durumlar için kullnaılır
// Döngü çeşitleri ------- For , While
// While verilen bir koşul doğru olduğu sürece çalışır
// For bellirli bir aralıkta dolaşmak için kullanılır. Özellikle diziler,listeler vb
fun main(){
    /*
    var i = 1
    while (i<=5){
        println("Sayı: $i")
        i++
    }

     */
    /*
    // while için örnek
    val scanner = Scanner(System.`in`)
    println("Çarpım tablosunu görmek istediğiniz sayıyı giriniz")
    val sayi = scanner.nextInt()

    var i = 1
    while (i  <= 10){
        val carpim = sayi * i
        println("$sayi x $i = $carpim")
        i++
    }
    scanner.close()

     */
    /*
    //For için örnek
    val baslangic = 1
    val bitis = 10

    for (i in baslangic..bitis){
        println("Sayı: $i")
    }


     */
    val scanner = Scanner(System.`in`)
    println("Faktöriyelini hesaplamak istediğimiz sayıyı giriniz")
    val sayi = scanner.nextInt()

    var faktoriyel = 1
    var hesaplama = "" // hesaplama deişkeni
    for (i in 1..sayi){
        faktoriyel *= i

        hesaplama += if (i == 1) "$i" else "x $i" //burası
    }
    println("$sayi! = $hesaplama =  $faktoriyel")
    scanner.close()
}