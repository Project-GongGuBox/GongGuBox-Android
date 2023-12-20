package com.example.domain.repository

/**
 * Cart-Controller API function Repository
 */
interface CartControllerRepos {
    fun addItemToCart()

    fun updateItemCntInCart()

    fun clearCartItem()

    fun getCart()

    fun deleteItemInCart()
}