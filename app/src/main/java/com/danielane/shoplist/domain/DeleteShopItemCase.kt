package com.danielane.shoplist.domain

class DeleteShopItemCase(private val shopItemRepository: ShopItemRepository) {

    fun deleteShopItem(shopItem: ShopItem){
        shopItemRepository.deleteShopItem(shopItem)
    }
}