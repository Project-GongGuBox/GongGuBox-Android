package com.example.model.item

import com.example.model.address.Address

/* TODO("Is that Right? Need to Check Attribute Naming") */
data class ItemEntity(
        val name: String,
        val price: Int,
        val count: Int,
        val itemLink: String,
        val address: Address,
        val content: String,
        val itemStatus: ItemStatusClass,
        val groupId: Int
)
