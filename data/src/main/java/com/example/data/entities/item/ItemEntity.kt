package com.example.data.entities.item

import com.example.data.entities.address.Address
import com.example.util.ItemStatusClass
import com.google.gson.annotations.SerializedName

/* TODO("Is that Right? Need to Check Attribute Naming") */
data class ItemEntity(
    @SerializedName("name") val itemName: String,
    @SerializedName("price") val itemPrice: Int,
    @SerializedName("count") val itemCount: Int,
    @SerializedName("itemLink") val itemLink: String,
    @SerializedName("address") val address: Address,
    @SerializedName("content") val itemContent: String,
    @SerializedName("itemStatus") val itemStatus: ItemStatusClass,
    @SerializedName("groupId") val groupID: Int
)
