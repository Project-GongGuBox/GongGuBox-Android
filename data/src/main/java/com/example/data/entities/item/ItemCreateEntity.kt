package com.example.data.entities.item

import com.example.data.entities.address.Address
import com.google.gson.annotations.SerializedName

data class ItemCreateEntity(
    @SerializedName("name") val itemName: String,
    @SerializedName("price") val itemPrice: Int,
    @SerializedName("count") val itemCount: Int,
    @SerializedName("itemLink") val itemLink: String,
    @SerializedName("address") val address: Address,
    @SerializedName("content") val itemContent: String,
    @SerializedName("groupId") val groupID: Int
)