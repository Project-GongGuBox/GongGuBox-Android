package com.example.model.item

import com.example.model.address.Address

data class ItemCreateEntity(
        val name: String,
        val price: Int,
        val count: Int,
        val itemLink: String,
        val address: Address,
        val content: String,
        val groupId: Int
)