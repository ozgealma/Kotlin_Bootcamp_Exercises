package com.tamerthedark.alisveris.data

import java.io.Serializable

data class Product(
    val name: String,
    val price: String,
    val description: String,
) : Serializable
