package com.example.model.item

import com.example.model.address.Address

data class ItemUpdateEntity(
        val id: Int,
        val name: String,
        val price: Int,
        val count: Int,
        val itemLink: String,
        val address: Address,
        val content: String,
        val itemStatus: ItemStatusClass,
        val groupId: Int
)
