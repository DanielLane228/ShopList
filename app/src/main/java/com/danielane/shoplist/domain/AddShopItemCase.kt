package com.danielane.shoplist.domain

class AddShopItemCase(private val shopItemRepository: ShopItemRepository) {

    fun addShopItem(shopItem: ShopItem){
        shopItemRepository.addShopItem(shopItem)
    }
}