package com.example.ilkprojee

import java.util.Calendar


// fun fonsiyonAdi(parametre1: Tipi, parametre2: Tipi) :GeriDonusTipi{
// return geriDonusDegeri
// }
// İki tip fonksiyon vardır. Geriye Değer döndüren (Geriye Dönüş tipi belirtmemiz gerekir) ve geriye değer döndürmeyen (void)
// Fonksiyonlar kodun okunabilirliği artırır program daha düzenli ve modüler hale gelir
fun main() {
    //val sonuc = toplama(5,7)
// println("Toplama sonucu: $sonuc")
//yazdir("Kodlama")
//zamanTarihGoster()
//selamla("Ahmet")
//selamla("Mehmet","Merhaba") //isteğe bağlı değer belirme
     val rastgeleFonksiyon: () -> Int = ::rastgeleSayi
    val sayi = rastgeleFonksiyon()
    println("Rastgele sayı: $sayi")
}

fun toplama(sayi1: Int, sayi2: Int ) :Int {
    val toplam = sayi1 + sayi2
    return toplam
}
fun yazdir(metin: String) {
    println(metin)
}
fun zamanTarihGoster(){
    val simdikiZaman = Calendar.getInstance().time
    println("Şu anki zaman: $simdikiZaman")
}
fun selamla(isim: String, zaman: String = "Günaydın"){
    println("$zaman, $isim")
}
 fun rastgeleSayi():Int{
     return (1..100).random()
 }