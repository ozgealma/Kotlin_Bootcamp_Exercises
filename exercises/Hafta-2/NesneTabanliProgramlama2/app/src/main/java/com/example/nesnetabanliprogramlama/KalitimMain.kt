package com.example.nesnetabanliprogramlama

//Kalıtım Bir özelliklerini başka sınıfa aktara bilir.
//Kalıtım sınıflar arası geçerli
//Eğer ben bir özelliğimi başka sınıfa aktaracaksam classın başına open getirmeliyim
//Özelliği hangi sınıftan alıyorsak o bizim için suppercalsstır
//Diğer altsınıflar subclass şeklinde tanımlanır
// Kalıtım ile birlikte gelen kavramımız Overrindg
fun main(){
    var topkapiSarayi = Saray(10,5)
    var bogazVilla = Villa(4,true)

    println(topkapiSarayi.pencereSayisi)
    println(topkapiSarayi.kuleSayisi)

    println(bogazVilla.pencereSayisi)
    println(bogazVilla.garajVarMi)
}