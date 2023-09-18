package com.example.ilkprojee

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.util.Calendar
import java.util.Scanner

// equals() bir nesnenin başka bir nesneyle eşit olup olmadığını kontrol eder
// ignoreCase Girilen parametreyle yapılan karşılaaştırmada büyük küçük harf farkını göz ardı etmek için kullanıyoruz

//@RequiresApi(Build.VERSION_CODES.O)


fun main() {
    val sayilar: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    for (sayi in sayilar) {
        println(sayi)
    }
}








/*
fun main(){

   val scanner = Scanner(System.`in`)

    println("Bir meyve adı giriniz")
     val meyve = scanner.nextLine()

    if (meyve.equals("elma", ignoreCase = false)){
        println("Evet, girdiğiniz kelime elmadır")
    }else{
        println("Girdiğiniz değer elma kelimesinden farklı bir kelimedir")
    }
}

 */