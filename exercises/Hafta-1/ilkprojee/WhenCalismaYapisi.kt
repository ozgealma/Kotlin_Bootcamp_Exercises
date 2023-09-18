package com.example.ilkprojee

import java.util.Scanner


/*

 */
fun main(){
    /*
 val scanner = Scanner(System.`in`)
    println("Lütfen bir sayı giriniz")
    val deger = scanner.nextInt()
    sayiDegerlendir(deger)

     */

    val scanner = Scanner(System.`in`)
    println("Lütfen bir karakter giriniz")
    val karakter = scanner.next().first()
    karakterDegerlendir(karakter)
    scanner.close()
}

fun sayiDegerlendir(deger: Int){
    when(deger){
        1 -> println("Sayı 1'e eşittir")
        2,3 -> println("Sayı 2'ye veya 3' e eşittir")
        in 4..10 -> println("Sayı 4 ile 10 arasındadır")
        else -> println("Sayı hiç bir koşulu sağlamıyor")
    }

}

fun karakterDegerlendir(karakter: Char){
    when(karakter){
        'A','E','I','O','U' -> println("Vokal Harf")
        in 'a'..'z' -> println("Küçük harf")
        in '0'..'9' -> println("Sayı")
        else -> println("Özel karakter veya büyük harf")
    }
}