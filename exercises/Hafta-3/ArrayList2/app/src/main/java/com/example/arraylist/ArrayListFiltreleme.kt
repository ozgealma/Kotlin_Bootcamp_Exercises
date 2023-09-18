package com.example.arraylist

fun main(){

    val ogr1 = Ogrenci(1,"ahmet","4A")
    val ogr2 =Ogrenci(2,"mehmet","5B")
    val ogr3 = Ogrenci(3,"aslı","6C")
    val ogr4 = Ogrenci(4,"sıla","8A")
    val ogr5 = Ogrenci(8,"Zeynep","5B")

    val ogrenciArrayList = ArrayList<Ogrenci>()
    ogrenciArrayList.add(ogr1)
    ogrenciArrayList.add(ogr2)
    ogrenciArrayList.add(ogr3)
    ogrenciArrayList.add(ogr4)
    ogrenciArrayList.add(ogr5)

    //val sonucListe = ogrenciArrayList.filter { it.ogrenciNo >= 2 }

   // val sonucListe = ogrenciArrayList.filter { it.ogrenciAd.contains("e") } //ogrenciAd da belirtilen karaketr varsa ekranda gösterir

    val sonucListe = ogrenciArrayList.filter { it.ogrenciSinif == "5B" }

    for(sonucListeleme in sonucListe){
        println("**********************")
        println("Öğrenci No: ${sonucListeleme.ogrenciNo}")
        println("Öğrenci Ad : ${sonucListeleme.ogrenciAd}")
        println("Öğrenci Sınıf: ${sonucListeleme.ogrenciSinif}")
    }

}