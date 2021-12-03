package com.danielane.shoplist.domain

interface ShopItemRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(itemId: Int): ShopItem

    fun getShopItemList(): List<ShopItem>
}