package com.example.ilkprojee

class DegiskenKapsami {

    var x = 50 //Global değer
    var y = 5

    fun topla(){
         var x = 40
         var z = x + y //Local
        println(z)
    }
    fun bolme(){
        var bol = x / y
        println(bol)
    }
}