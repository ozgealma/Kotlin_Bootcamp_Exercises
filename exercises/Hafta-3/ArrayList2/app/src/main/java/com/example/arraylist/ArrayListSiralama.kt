package com.example.arraylist

fun main() {
    val k1 = Kisiler(1,"Ahmet")
    val k2 = Kisiler(2,"Zeynep")
    val k3 = Kisiler(3,"Berna")
    val k4 = Kisiler(10,"Betül")
    val k5 = Kisiler (8,"Mehmet")
    val k6 = Kisiler (6,"Ayşe")

    val kisilerArrayList = ArrayList<Kisiler>()

    kisilerArrayList.add(k1)
    kisilerArrayList.add(k2)
    kisilerArrayList.add(k3)
    kisilerArrayList.add(k4)
    kisilerArrayList.add(k5)
    kisilerArrayList.add(k6)


    println("Sıralama Öncesi")

    for (k in kisilerArrayList){
        println("${k.kisiNo} - ${k.kisiAd}")
    }

    //Sıralama İşlemi
    println("Sayısal olarak küçükten büyüğe sıralama")

    val siralamaArrayList1 = kisilerArrayList.sortedWith(compareBy{ it.kisiNo })

    for (k in siralamaArrayList1){
        println("${k.kisiNo} - ${k.kisiAd}")
    }

    println("Sayısal olarak büyükten küçüğe sıralama")

    val siralamaArrayList2 = kisilerArrayList.sortedWith(compareByDescending { it.kisiNo })

    for (k in siralamaArrayList2){
        println("${k.kisiNo} - ${k.kisiAd}")
    }

    println("Harfsel olarak Büyükten Küçüğe sıralama")

    val siralamaArrayList3 = kisilerArrayList.sortedWith(compareByDescending { it.kisiAd })

    for (k in siralamaArrayList3){
        println("${k.kisiNo} - ${k.kisiAd}")
    }
}