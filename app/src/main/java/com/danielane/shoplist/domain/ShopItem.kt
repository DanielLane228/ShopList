package com.danielane.shoplist.domain

data class ShopItem(
    val id: Int,
    val name: String,
    val count: Int,
    val enabled: Boolean
)
