package com.example.ilkprojee

//Karşılaştırma Operatörleri
// == Eşitir
// != Eşit Değildir
// > Büyüktür
// < Küçüktür
// >= Büyük Eşittir
// <= Küçük Eşittir

//Mantıksal Operatörler
// && And operatörü her iki koşul sağlanıyorsa true
// || OR İki koşuldan biri sağlanıyorsa true
// ! var olan durumu tersine çevirir
fun main(){

    var sayi1 = 60
    var sayi2 = 50

    var sayi3 = 70
    var sayi4 = 80

    println(sayi1 == sayi2)
    println(sayi1 != sayi2)
    println(sayi1 > sayi2)
    println(sayi1 >= sayi1)
    println(sayi1 < sayi2)
    println(sayi1 <= sayi2)

    println(sayi1>sayi2 || sayi3 > sayi4)
    println(sayi1>sayi2 && sayi3 > sayi4)



}