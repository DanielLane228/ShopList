package com.danielane.shoplist.domain

class GetShopItemCase(private val shopItemRepository: ShopItemRepository) {

    fun getShopItem(itemId: Int): ShopItem{
        return shopItemRepository.getShopItem(itemId)
    }
}