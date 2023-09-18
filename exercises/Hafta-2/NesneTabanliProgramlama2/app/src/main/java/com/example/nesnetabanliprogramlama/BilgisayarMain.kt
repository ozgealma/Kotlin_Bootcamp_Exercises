package com.example.nesnetabanliprogramlama

//Nullable - Null Safety bir değişkenin null olmasını kontrol altına almak için kullanılır ?,!!
//? değer null ise çalıştırma
//!! her koşulda çalıştırır
//Primitif tipler  Int,String,Boolean
// lateinit var referans tiplerinde geçerli yani nesne olmalıdır
// trim() fonksiyonu metnin sağ ve solundaki boşlukları silmek için kullanılır
fun main(){
    lateinit var mac:Bilgisayar
    val metin = "      Merhaba!       "
    val temizlenmisMetin = metin.trim()

    println("Orjinal metin: '$metin'")
    println("Temizlenmiş metin: '$temizlenmisMetin'")
/*
    val mac = Bilgisayar("Kırmızı",10,false)
   mac.bilgiAl()

    mac.hiz = 30
     mac.bilgiAl()

    mac.calisiyorMu()

    val intel = Bilgisayar("Beyaz",5,true)
   // intel.renk = "Mavi"

    intel.bilgiAl()
    */
/*
    var str1:String? = null
    if (str1 != null){
        str1.trim()
    }

 */
}
