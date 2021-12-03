package com.danielane.shoplist.domain

class GetShopItemListCase(private val shopItemRepository: ShopItemRepository) {

    fun getShopItemList(): List<ShopItem>{
        return shopItemRepository.getShopItemList()
    }
}