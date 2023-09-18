package com.example.ilkprojee

import java.lang.Exception


// Tek satır yorum kodları için kullnılır
/*Bİrden fazla satırlı yorumlar için
print kendinden sonra gelen texti yanına yazdırır
println kendinden sonra gelen texti yanına yazdırır

*/

//var(variable = değişken )
// val (value = sabit )

// Büyük harfle başlayamaz
// Rakamla başlayamaz
//Özel karakter içeremez
//Türkçe karakter içermemelidir
/*
\t - tab boşluk bırakmak için kullanılır
\n - bir alt satıra inmek için kullanılır
\" - çift tırnak
\' - tek tırnak
 */

fun main() {
    var integer:Float = 30.5f
    integer = 29.toFloat()
    println(integer)

    // + toplama işlemi
    // - çıkarma işlemi
    // * çarpma işlemi
    // / bilme işlemi
    // 	% mod işlemi

    //Dairenin alanını hesaplama Örneği
     val pi = 3.14
     var yariCap = 2.0
     var alan = pi * yariCap * yariCap

    println("Dairenin alanı $alan")

    // a = a + 3 kısaltması a+= 3
    // a = a - 3 kısaltması a-= 3
    // a = a * 3 kısaltması a*= 3
    // a = a / 3 kısaltması a/= 3

    var a = 10
    a+=  20
    println(a)

    // Tür Dönüşümü

    var i:Int = 42
    var d:Double = 42.45
    var z:Float = 42.89f

 //   var sonuc1: Int = d.toInt()
//    var sonuc2:Double = i.toDouble()
 //   var sonuc3:Int = z.toInt()
 //   println(sonuc1)
  //  println(sonuc2)
  //  println(sonuc3)




    //Sayısaldan metne dönüşüm
     var str1 = i.toString()
     var str2 = d.toString()
     var str3 = z.toString()
    var metin = "45"

    println(metin)

    //Metin Sayısal

    var yazi1 = "34"

    try {
        var x = yazi1.toInt()
        println(x)
    }catch (e:Exception){
        println("Dönüşümde hata var")

    }

}